//工商业务实时监控controller
indexApp.controller("gsywssjkCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    djphbChart.resize();
	    zfbaqkChart.resize();
    });
	/*********************今日登记排行榜************************/
    // 指定今日登记排行榜配置项
    var djphbOption = {
        title: {
        	show:false,
        },
        grid:{
        	top:'20%',
        	left: '5%',
	        right: '4%',
	        bottom: '3%',
	        containLabel: true
        },
        xAxis: {
        	axisLine:{//轴线设置
        		show:false//不显示
        	},
        	axisTick:{//坐标轴刻度设置
        		show:false//不显示
        	},
        	axisLabel:{//坐标轴刻度标签
        		rotate:40,//旋转角度
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
        	axisLine:{//轴线设置
        		show:false//不显示
        	},
        	axisTick:{//坐标轴刻度设置
        		show:false//不显示
        	},
        	axisLabel:{//坐标轴刻度标签
        		show:false//不显示
        	},
        	splitLine:{//grid区域分割线
        		show:false//不显示
        	}
        },
        series: [{
            name: '销量',
            type: 'bar',
            data: [],
            itemStyle:{//定义图形样式
            	normal: {
            		color: new echarts.graphic.LinearGradient(
                        0, 0, 0, 1,
                        [
                            {offset: 0, color: '#83bff6'},
                            {offset: 0.5, color: '#188df0'},
                            {offset: 1, color: '#188df0'}
                        ]
                    ),
	            	barBorderRadius: 5,
	            	shadowBlur:10,
	            	shadowColor:'#000000',
	            	shadowOffsetX:6,
	            	shadowOffsetY:6,
                    label: {
                        show: true,
                        position: 'top',
                        formatter:'{c}',
                        textStyle: {
                            color: '#00E1FC',
                            fontSize:16,//字体大小
	                		fontWeight:'bold'
                        }
                    }
                }
            },
            barWidth:'10'
        }]
    };
    //初始化图表
    var djphbChart = ChartService.init("djphb",djphbOption);
    //获取并设置值
    ChartService.setData('gsywss/getDjphbData',function(data){
    	console.log("今日登记排行榜："+JSON.stringify(data));
    	djphbChart.setOption({
			xAxis: {
				data: data.result.x
			},
	        series: [{
	            data: data.result.y
	        }]
		});
    });
    /*********************名称预核准************************/
    $scope.mchzData = [{nametypeName:'冠国家名',now:'0',before:'0',src:'resource/img/gsywssjk/guojia.png'},{nametypeName:'冠省名',now:'0',before:'0',src:'resource/img/gsywssjk/sheng.png'},{nametypeName:'冠市名',now:'0',before:'0',src:'resource/img/gsywssjk/shi.png'},{nametypeName:'冠区县名',now:'0',before:'0',src:'resource/img/gsywssjk/xian.png'}];
    ChartService.setData('gsywss/getMcyhzData',function(data){
    	console.log("名称预核准："+JSON.stringify(data));
    	$scope.mchzData = data.result;
    	angular.forEach($scope.mchzData,function(data,index){
    		if(data.nametypeName=='冠国家名'){
    			data.src = basepath+'resource/img/gsywssjk/guojia.png';
    		}else if(data.nametypeName=='冠省名'){
    			data.src = basepath+'resource/img/gsywssjk/sheng.png';
    		}else if(data.nametypeName=='冠市名'){
    			data.src = basepath+'resource/img/gsywssjk/shi.png';
    		}else if(data.nametypeName=='冠区县名'){
    			data.src = basepath+'resource/img/gsywssjk/xian.png';
    		}else{
    			data.src = '';
    		}
    	});
    });
    /*********************设立登记************************/
    $scope.sldjData = [{entcatName:'企业',now:'0',before:'0',src:'resource/img/gsywssjk/qy.png'},{entcatName:'农专',now:'0',before:'0',src:'resource/img/gsywssjk/nz.png'},{entcatName:'个体',now:'0',before:'0',src:'resource/img/gsywssjk/gt.png'}];
    ChartService.setData('gsywss/getSldjData',function(data){
    	console.log("设立登记："+JSON.stringify(data));
    	$scope.sldjData = data.result;
    	angular.forEach($scope.sldjData,function(data,index){
    		if(data.entcatName=='个体'){
    			data.src = basepath+'resource/img/gsywssjk/gt.png';
    		}else if(data.entcatName=='农专'){
    			data.src = basepath+'resource/img/gsywssjk/nz.png';
    		}else if(data.entcatName=='企业'){
    			data.src = basepath+'resource/img/gsywssjk/qy.png';
    		}else{
    			data.src = '';
    		}
    	});
    });
    /*********************其他登记************************/
    $scope.qtdjData = [{entcatName:'企业',bgnow:'0',bgbefore:'0',banow:'0',babefore:'0',zxnow:'0',zxbefore:'0',src:'resource/img/gsywssjk/qy.png'},{entcatName:'农专',bgnow:'0',bgbefore:'0',banow:'0',babefore:'0',zxnow:'0',zxbefore:'0',src:'resource/img/gsywssjk/nz.png'},{entcatName:'个体',bgnow:'0',bgbefore:'0',banow:'0',babefore:'0',zxnow:'0',zxbefore:'0',src:'resource/img/gsywssjk/gt.png'}];
    ChartService.setData('gsywss/getQtdjData',function(data){
    	console.log("其他登记："+JSON.stringify(data));
    	$scope.qtdjData = data.result;
    	angular.forEach($scope.qtdjData,function(data,index){
    		if(data.entcatName=='个体'){
    			data.src = basepath+'resource/img/gsywssjk/gt.png';
    		}else if(data.entcatName=='农专'){
    			data.src = basepath+'resource/img/gsywssjk/nz.png';
    		}else if(data.entcatName=='企业'){
    			data.src = basepath+'resource/img/gsywssjk/qy.png';
    		}else{
    			data.src = '';
    		}
    	});
    });
    /*********************年报监控************************/
    $scope.nbjkData = [{entname:'企业',yb:'0',zs:'0',nbl:'0',src:'resource/img/gsywssjk/qy.png'},{entname:'农专',yb:'0',zs:'0',nbl:'0',src:'resource/img/gsywssjk/nz.png'},{entname:'个体',yb:'0',zs:'0',nbl:'0',src:'resource/img/gsywssjk/gt.png'}];
    ChartService.setData('gsywss/getNbjkData',function(data){
    	console.log("年报监控："+JSON.stringify(data));
    	$scope.nbjkData = data.result;
    	angular.forEach($scope.nbjkData,function(data,index){
    		if(data.entname=='个体'){
    			data.src = basepath+'resource/img/gsywssjk/gt.png';
    		}else if(data.entname=='农专'){
    			data.src = basepath+'resource/img/gsywssjk/nz.png';
    		}else if(data.entname=='企业'){
    			data.src = basepath+'resource/img/gsywssjk/qy.png';
    		}else{
    			data.src = '';
    		}
    	});
    });
    /*********************执法办案情况************************/
    // 指定执法办案情况配置项
    var zfbaqkOption = {
        title: {
            show:false
        },
        grid:{
        	top:'15%',
        	left: '5%',
	        right: '10%',
	        bottom: '5%',
	        containLabel: true
        },
        xAxis: {
        	type: 'value',
        	axisLine:{//轴线设置
        		show:false//不显示
        	},
        	axisTick:{//坐标轴刻度设置
        		show:false//不显示
        	},
        	splitLine:{//grid区域分割线
        		show:false//不显示
        	},
        	axisLabel:{
        		show:false
        	}
        },
        yAxis: {
        	type: 'category',
        	axisLine:{//轴线设置
        		show:false//不显示
        	},
        	axisTick:{//坐标轴刻度设置
        		show:false//不显示
        	},
        	axisLabel:{//坐标轴刻度标签
        		color:'#00E1FC',//文字的颜色
        		fontFamily:'Microsoft YaHei',//微软雅黑
        		fontSize:16,//字体大小
        		fontWeight:'bold',
        		textShadowColor:'#000000',
        		textShadowBlur:2,
        		textShadowOffsetX:5,
        		textShadowOffsetY:5
        	},
            data: ['罚款（万元）','本年度结案','本年度立案']
        },
        series: [{
            name: '销量',
            type: 'bar',
            data: [],
            itemStyle:{//定义图形样式
            	normal: {
	            	barBorderRadius: 5,
	            	color:function(params){
	            		return colorList[params.dataIndex];
	            	},
	            	shadowBlur:10,
	            	shadowColor:'#000000',
	            	shadowOffsetX:6,
	            	shadowOffsetY:6,
                    label: {
                        show: true,
                        position: 'right',
                        fontSize:16,//字体大小
                		fontWeight:'bold',
                        formatter:function(params){
                        	if(params.dataIndex==0){
                        		return params.data+"万元";
                        	}else{
                        		return params.data+"件";
                        	}
                        },
                        textStyle: {
                            color: function(params){
        	            		return colorList[params.dataIndex];
        	            	}
                        }
                    }
                }
            },
            barWidth:'10'
        }]
    };
    //初始化图表
    var zfbaqkChart = ChartService.init("zfbaqk",zfbaqkOption);
    //获取并设置值
    ChartService.setData('gsywss/getZfbaqkData',function(data){
    	console.log("执法办案情况："+JSON.stringify(data));
    	zfbaqkChart.setOption({
	        series: [{
	            data: data.result
	        }]
		});
    });
    /*********************消保维权************************/
    $scope.xbwqData = [{infotypeName:'咨询',jrdj:'0',zrdj:'0',jrbj:'0',zrbj:'0',src:'resource/img/gsywssjk/zx.png'},{infotypeName:'投诉',jrdj:'0',zrdj:'0',jrbj:'0',zrbj:'0',src:'resource/img/gsywssjk/ts.png'},{infotypeName:'举报',jrdj:'0',zrdj:'0',jrbj:'0',zrbj:'0',src:'resource/img/gsywssjk/jb.png'},{infotypeName:'其他',jrdj:'0',zrdj:'0',jrbj:'0',zrbj:'0',src:'resource/img/gsywssjk/qt.png'}];
    ChartService.setData('gsywss/getXbwqData',function(data){
    	console.log("消保维权："+JSON.stringify(data));
    	$scope.xbwqData = data.result;
    	angular.forEach($scope.xbwqData,function(data,index){
    		if(data.infotypeName=='咨询'){
    			data.src = basepath+'resource/img/gsywssjk/zx.png';
    		}else if(data.infotypeName=='投诉'){
    			data.src = basepath+'resource/img/gsywssjk/ts.png';
    		}else if(data.infotypeName=='举报'){
    			data.src = basepath+'resource/img/gsywssjk/jb.png';
    		}else if(data.infotypeName=='其他'){
    			data.src = basepath+'resource/img/gsywssjk/qt.png';
    		}else{
    			data.src = '';
    		}
    	});
    });
}]);