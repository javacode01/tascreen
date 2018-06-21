/**
 * 初始化的方法
 * 
 * @returns
 */
function init() {
	initTree();
	initTable();
}

/**
 * 初始化树结构
 * @returns
 */
function initTree(){
	$('#tree').treeview({
		data : getTree(),
		backColor:'#fff',//设置所有列表树节点的背景颜色。
		borderColor:'#fff',//设置列表树容器的边框颜色，如果不想要边框可以设置showBorder属性为false。
		checkedIcon:'glyphicon glyphicon-check',//设置处于checked状态的复选框图标。
		collapseIcon:'glyphicon glyphicon-minus',//设置列表树可收缩节点的图标。
		color:'#555',//设置列表树所有节点的前景色。
		expandIcon:'glyphicon glyphicon-plus',//设置列表树可展开节点的图标。
		highlightSelected:true,//当选择节点时是否高亮显示。
		onhoverColor:'#F5F5F5',//设置列表树的节点在用户鼠标滑过时的背景颜色。
		levels:0,//Default: 2 设置继承树默认展开的级别。
		showBorder:false,//是否在节点上显示边框。
		onNodeExpanded:function(event,data){
			var param = data.id
			if(data.nodes.length<=0){
				$.ajax({
					type:"post",
					async:false,
					url:basepath+"sys/organ/getOrganNodes",
					dataType:'json',
					data: {organCode:param},
					success:function(result){
						if(undefined!=result&&null!=result){
							for(var i=0;i<result.length;i++){
								var temp = result[i];
								$("#tree").treeview("addNode",[data.nodeId,{node:temp,silent:true}]);
							}
						}
					}
				});
			}
		},
		onNodeSelected:function(event,data){
			$('#show_organCode').html(data.data.organCode);
			$('#show_organName').html(data.data.organName);
			$('#show_organLevel').html(SysUtil.formatDicItem(data.data.organLevel,ORGANLEVEL));
			$('#show_iconUrl').removeClass();
			$('#show_iconUrl').addClass(data.data.iconUrl);
			$('#show_organType').html(SysUtil.formatDicItem(data.data.organType,ORGANTYPE));
			$('#show_seq').html(data.data.seq);
			$('#table').bootstrapTable('refresh');
		}
	});
}

/**
 * 初始化表格
 * @returns
 */
function initTable(){
	$('#table').bootstrapTable({
		url:basepath+"sys/organ/listOrgans",
//        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        queryParams: function(params){
        	return getParam(params);
        },									//传递参数（*）
        clickToSelect: true,                //是否启用点击选中行
        uniqueId: "organId",                     //每一行的唯一标识，一般为主键列
        columns: [{
            field: 'iconUrl',
            title: '图标',
            formatter:toShowIcon
        }, {
            field: 'organCode',
            title: '机构编码'
        }, {
            field: 'organName',
            title: '机构名称'
        }, {
            field: 'organLevel',
            title: '机构级别',
            formatter:function(value,row,index){
            	return SysUtil.formatDicItem(value,ORGANLEVEL);
            }
        }, {
            field: 'organType',
            title: '机构类型',
            formatter:function(value,row,index){
            	return SysUtil.formatDicItem(value,ORGANTYPE);
            }
        }]
	});
}

function getParam(params){
	var selected = $("#tree").treeview('getSelected');
	if(selected.length<1){
		return false;
	}
	var filter = new HashMap();
	filter.put("parentCode@=",selected[0].data.organCode);
	$.extend(params,{filter:filter.getJSON()});
	return params;
}

function toShowIcon(value,row,index){
	return '<span class="'+value+'"></span>';
}

/**
 * 初始化功能树
 * @returns
 */
function getTree(){
	//根节点
	var root = [{
		  id:"root",
		  text: "组织结构",
		  icon: "glyphicon glyphicon-stop",
		  selectedIcon: "glyphicon glyphicon-stop",
		  state: {
		    expanded: false
		  },
		  nodes:[],
		  data:{
			  organCode:"root",
			  organName:"根节点",
			  organLevel:"1",
			  iconUrl:"glyphicon glyphicon-stop",
			  seq:""
		  }}];
	return root;
}

/**
 * 编辑功能
 * @returns
 */
function edit(){
	var selected = $("#tree").treeview('getSelected');
	if(selected.length<1){
		bootbox.alert({ 
			  size: "small",
			  title: "提示框",
			  message: "请先选择一个节点操作"
			});
		return false;
	}
	if('root'==selected[0].data.organCode){
		bootbox.alert({ 
			  size: "small",
			  title: "提示框",
			  message: "根节点不能编辑"
			});
		return false;
	}
	$("#organModal").load(basepath+"sys/organ/toEditOrgan",{
		organCode:selected[0].data.organCode,
		handle:'edit'
	},function(){
		$("#organModal").modal({backdrop: 'static', keyboard: false});
	});
}

/**
 * 新增下级功能
 * @returns
 */
function add(){
	var selected = $("#tree").treeview('getSelected');
	if(selected.length<1){
		bootbox.alert({ 
			  size: "small",
			  title: "提示框",
			  message: "请先选择一个节点操作"
			});
		return false;
	}
	$("#organModal").load(basepath+"sys/organ/toEditOrgan",{
		organCode:selected[0].data.organCode,
		handle:'add'
	},function(){
		$("#organModal").modal({backdrop: 'static', keyboard: false});
	});
}

/**
 * 删除功能及其子功能
 * @returns
 */
function remove(){
	var selected = $("#tree").treeview('getSelected');
	if(selected.length<1){
		bootbox.alert({ 
			  size: "small",
			  title: "提示框",
			  message: "请在左侧树中选择要删除的机构"
			});
		return false;
	}
	if('root'==selected[0].id){
		bootbox.alert({ 
			  size: "small",
			  title: "提示框",
			  message: "根节点不能删除"
			});
		return false;
	}
	bootbox.confirm({
		title:"确认框",
	    message: "是否确认删除当前选中的机构及其下级机构？",
	    buttons: {
	        confirm: {
	            label: '确定',
	            className: 'btn-danger'
	        },
	        cancel: {
	            label: '取消',
	            className: 'btn-success'
	        }
	    },
	    callback: function (result) {
	       if(result){
	    	   //提交
	    	   $.ajax({
	    		   url:basepath+'sys/organ/deleteOrgan',
	    		   type:'post',
	    		   data:{organId:selected[0].data.organId},
	    		   success:function(result){
	    			   if(result.code=='success'){
	    				   bootbox.alert({ 
	    						  size: "small",
	    						  title: "提示框",
	    						  message: "删除成功"
	    						});
	    				   var selected = $("#tree").treeview('getSelected');
	    				   var parentNode = $('#tree').treeview('getParent', selected[0].nodeId);
	    				   $("#tree").treeview("deleteNode", [selected[0].nodeId, { silent: true }]);
	    				   $('#tree').treeview('selectNode', [parentNode.nodeId]);
	    			   }else{
	    				   bootbox.alert({ 
	    						  size: "small",
	    						  title: "警告框",
	    						  message: result.data
	    						});
	    			   }
	    		  },
	    		  error:function(error){
	    			  bootbox.alert({ 
						  size: "small",
						  title: "警告框",
						  message: error
						});
	    		  }
	    	   });
	       }
	    }
	});
}