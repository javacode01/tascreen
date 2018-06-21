//市场主体年龄结构分布controller
indexApp.controller("scztnljgfbCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    qynlzbZtlChart.resize();
	    qynlzbQylChart.resize();
	    qynlzbGtlChart.resize();
	    qynlzbNzlChart.resize();
	    csqyzzfxChart.resize();
    });
    /***********************长寿企业行业分析****************************/
	$scope.top0Data = [];
	$scope.top5Data = [];
	$scope.top10Data = [];
	$scope.top20Data = [];
	ChartService.setData('scztnljgfx/getCsqyhyfxData?type=type1',function(data){
    	console.log("长寿企业行业分析-5年以下："+JSON.stringify(data));
    	$scope.top0Data = data.result.slice(0,5);
    });
	ChartService.setData('scztnljgfx/getCsqyhyfxData?type=type2',function(data){
    	console.log("长寿企业行业分析-5-10年："+JSON.stringify(data));
    	$scope.top5Data = data.result.slice(0,5);
    });
	ChartService.setData('scztnljgfx/getCsqyhyfxData?type=type3',function(data){
    	console.log("长寿企业行业分析-10-20年："+JSON.stringify(data));
    	$scope.top10Data = data.result.slice(0,5);
    });
	ChartService.setData('scztnljgfx/getCsqyhyfxData?type=type4',function(data){
    	console.log("长寿企业行业分析-20年以上："+JSON.stringify(data));
    	$scope.top20Data = data.result.slice(0,5);
    });
	/**企业年龄占比饼图**/
	var qynlzbOption = {
			title : [{
				text : '个体',
				top :'30%',
				textStyle : {
					color:'#00E1FC'
				}
			}],
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} (占比：{d}% )"
			},
			series : [ {
				name : '户数',
				type : 'pie',
				radius : '70%',
				center : ['50%','60%'],
				data : [],
				label:{
					position:'inside',
					formatter:'{c}户'
				},
				itemStyle : {
					normal : {
						color : function(params) {
							return colorList[params.dataIndex];
						}
					}
				},
			} ]
		};
	var qynlzbZtlChart = ChartService.init("qynlzb_zt",qynlzbOption);
	var qynlzbQylChart = ChartService.init("qynlzb_qy",qynlzbOption);
	var qynlzbGtlChart = ChartService.init("qynlzb_gt",qynlzbOption);
	var qynlzbNzlChart = ChartService.init("qynlzb_nz",qynlzbOption);
	/*********************企业年龄占比************************/
    ChartService.setData('scztnljgfx/getQynlzbData',function(data){
    	console.log("主体年龄占比："+JSON.stringify(data));
    	qynlzbZtlChart.setOption({
    		title : [{
    			top :'20%',
				text : '总体',
			}],
			series:[{
				radius : ['60%','80%'],
				center : ['50%', '55%'],
				label:{
					position:'inside',
				},
				data:data.result.data
			}]
		});
    });
    ChartService.setData('scztnljgfx/getQynlzbData?entcat=qy',function(data){
    	console.log("企业年龄占比："+JSON.stringify(data));
    	qynlzbQylChart.setOption({
    		title : [{
				text : '企业',
			}],
			series:[{
				data:data.result.data
			}]
		});
    	qynlzbQylChart.dispatchAction({
        	type: 'pieSelect',
            // 可选，系列 index，可以是一个数组指定多个系列
            seriesIndex: 0,
            // 可选，系列名称，可以是一个数组指定多个系列
            dataIndex: 0
        });
    });
    ChartService.setData('scztnljgfx/getQynlzbData?entcat=nz',function(data){
    	console.log("农专年龄占比："+JSON.stringify(data));
    	qynlzbNzlChart.setOption({
    		title : [{
				text : '农专',
			}],
			series:[{
				data:data.result.data
			}]
		});
    	qynlzbNzlChart.dispatchAction({
        	type: 'pieSelect',
            // 可选，系列 index，可以是一个数组指定多个系列
            seriesIndex: 0,
            // 可选，系列名称，可以是一个数组指定多个系列
            dataIndex: 0
        });
    });
    ChartService.setData('scztnljgfx/getQynlzbData?entcat=gt',function(data){
    	console.log("个体年龄占比："+JSON.stringify(data));
    	qynlzbGtlChart.setOption({
    		legend : {
    			top:'0',
    			textStyle:{
    				color:'#00E1FC'
    			},
				data : data.result.xdate
			},
			title : [{
				text : '个体',
			}],
			series:[{
				data:data.result.data
			}]
		});
    	qynlzbGtlChart.dispatchAction({
        	type: 'pieSelect',
            // 可选，系列 index，可以是一个数组指定多个系列
            seriesIndex: 0,
            // 可选，系列名称，可以是一个数组指定多个系列
            dataIndex: 0
        });
    });
    /************************长寿企业追踪分析*****************************/
    var csqyzzfxOption = {
    		color:colorList,
    	    tooltip: {
    	        trigger: 'axis'
    	    },
    	    legend: {
    	    	top:'10',
    	    	left:'15',
    	    	textStyle:{
    				color:'#00E1FC',
    				fontSize:14,//字体大小
		        	fontWeight:'bold'
    			}
    	    },
    	    grid: {
    	        left: '3%',
    	        right: '4%',
    	        bottom: '3%',
    	        containLabel: true
    	    },
    	    xAxis: {
    	        type: 'category',
    	        boundaryGap: false,
    	        axisLine:{//轴线设置
	        		lineStyle:{
	        			color:'#00E1FC'
	        		}
	        	},
	        	axisTick:{//坐标轴刻度设置
	        		show:false//不显示
	        	},
    	        axisLabel:{//坐标轴刻度标签
            		color:'#00E1FC',//文字的颜色
            		fontFamily:'Microsoft YaHei',//微软雅黑
            		fontSize:14,//字体大小
		        	fontWeight:'bold',
            		textShadowColor:'#000000',
            		textShadowBlur:2,
            		textShadowOffsetX:5,
            		textShadowOffsetY:5
            	},
    	        data: []
    	    },
    	    yAxis: {
    	        type: 'value',
    	        axisLine:{//轴线设置
	        		show:false//不显示
	        	},
	        	axisTick:{//坐标轴刻度设置
	        		show:false//不显示
	        	},
	            axisLabel:{//坐标轴刻度标签
	        		color:'#00E1FC',//文字的颜色
	        		fontFamily:'Microsoft YaHei',//微软雅黑
	        		fontSize:14,//字体大小
		        	fontWeight:'bold',
	        		textShadowColor:'#000000',
	        		textShadowBlur:2,
	        		textShadowOffsetX:5,
	        		textShadowOffsetY:5
	        	},
	        	splitLine:{//grid区域分割线
	        		lineStyle:{
	        			color:'#00E1FC'
	        		}
	        	}
    	    },
    	    series: [
    	        {
    	            type:'line',
    	            data:[]
    	        },
    	        {
    	            type:'line',
    	            data:[]
    	        },
    	        {
    	            type:'line',
    	            data:[]
    	        },
    	        {
    	            type:'line',
    	            data:[]
    	        }
    	    ]
    	};
    var csqyzzfxChart = ChartService.init("csqyzzfx",csqyzzfxOption);
    ChartService.setData('scztnljgfx/getCsqyzzfxData',function(data){
    	console.log("长寿企业追踪分析："+JSON.stringify(data));
    	csqyzzfxChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	        	name:'5年以下',
	            data: data.result.y_value1
	        },{
	        	name:'5-10年',
	            data: data.result.y_value2
	        },{
	        	name:'10-20年',
	            data: data.result.y_value3
	        },{
	        	name:'20年以上',
	            data: data.result.y_value4
	        }]
		});
    });
}]);