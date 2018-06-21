//市场主体资金来源分析controller
indexApp.controller("scztzsfxCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    scztclzsChart.resize();
	    qyclzsChart.resize();
	    gtclzsChart.resize();
	    nzclzsChart.resize();
	    scztzjzsChart.resize();
	    qyzjzsChart.resize();
	    gtzjzsChart.resize();
	    nzzjzsChart.resize();
    });
    $scope.scztclData = [];
	/******************初始化统计图配置-存量****************************/
	var scztzsOption = {
    		color:colorList,
    		title:{
    			textStyle:{
    				color:'#FF9D00',
    				fontSize:'20'
    			},
    			left:'center',
    			top:'6%'
    		},
    		grid: {
    			left: '3%',
		        right: '2%',
		        bottom: '5%',
		        containLabel: true
		    },
    		xAxis: {
    			axisLine:{//轴线设置
    				show:false,
	        		lineStyle:{
	        			color:'#00E1FC',
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
    	        	show:false,
    	        	lineStyle:{
	        			color:'#00E1FC'
	        		}
	        	},
	        	axisTick:{//坐标轴刻度设置
	        		show:false//不显示
	        	},
    	        axisLabel:{//坐标轴刻度标签
    	        	show:false,
            		color:'#FFFF05',//文字的颜色
            		fontFamily:'Microsoft YaHei',//微软雅黑
            		fontSize:12,//字体大小
            		textShadowColor:'#000000',
            		textShadowBlur:2,
            		textShadowOffsetX:5,
            		textShadowOffsetY:5
            	},
	        	splitLine:{//grid区域分割线
	        		show:false,
	        		lineStyle:{
	        			color:'#00E1FC',
	        		}
	        	}
    	    },
    	    series: [{
    	        data: [],
    	        type: 'line',
    	        itemStyle:{//定义图形样式
	            	normal: {
	                    label: {
	                        show: true,
	                        position: 'top',
	                        formatter:'{c}户',
	                        fontSize:14,//字体大小
	                		fontWeight:'bold'
	                    }
	                }
	            }
    	    }]
    	};
    //初始化图表
    var scztclzsChart = ChartService.init("scztclzs",scztzsOption);
    ChartService.setData('scztzsfx/getScztzsfxData?type=cl',function(data){
    	console.log("市场主体户数走势："+JSON.stringify(data));
    	$scope.scztclData = data.result.list2;
    	scztclzsChart.setOption({
    		color:'#78F033',
    		title:{
    			text:'近5年市场主体存量户数走势'
    		},
    		xAxis: {
				data: data.result.list1
			},
	        series: [{
	            data: data.result.list2,
	            areaStyle:{
	            	color:{
	            		type: 'linear',
	            	    x: 0,
	            	    y: 0,
	            	    x2: 0,
	            	    y2: 1,
	            	    colorStops: [{
	            	        offset: 0, color: '#78F033' // 0% 处的颜色
	            	    }, {
	            	        offset: 1, color: '#001C86' // 100% 处的颜色
	            	    }],
	            	    globalCoord: false // 缺省为 false
	            	}
	            }
	        }]
		});
    });
    var qyclzsChart = ChartService.init("qyclzs",scztzsOption);
    ChartService.setData('scztzsfx/getScztzsfxData?type=cl&entcat=qy',function(data){
    	console.log("企业户数走势："+JSON.stringify(data));
    	qyclzsChart.setOption({
    		color:'#F033D7',
    		title:{
    			text:'近5年企业存量户数走势'
    		},
    		xAxis: {
				data: data.result.list1
			},
	        series: [{
	            data: data.result.list2,
	            areaStyle:{
	            	color:{
	            		type: 'linear',
	            	    x: 0,
	            	    y: 0,
	            	    x2: 0,
	            	    y2: 1,
	            	    colorStops: [{
	            	        offset: 0, color: '#F033D7' // 0% 处的颜色
	            	    }, {
	            	        offset: 1, color: '#001C86' // 100% 处的颜色
	            	    }],
	            	    globalCoord: false // 缺省为 false
	            	}
	            }
	        }]
		});
    });
    var gtclzsChart = ChartService.init("gtclzs",scztzsOption);
    ChartService.setData('scztzsfx/getScztzsfxData?type=cl&entcat=gt',function(data){
    	console.log("个体户数走势："+JSON.stringify(data));
    	gtclzsChart.setOption({
    		color:'#F033D7',
    		title:{
    			text:'近5年个体存量户数走势'
    		},
    		xAxis: {
				data: data.result.list1
			},
	        series: [{
	            data: data.result.list2,
	            areaStyle:{
	            	color:{
	            		type: 'linear',
	            	    x: 0,
	            	    y: 0,
	            	    x2: 0,
	            	    y2: 1,
	            	    colorStops: [{
	            	        offset: 0, color: '#F033D7' // 0% 处的颜色
	            	    }, {
	            	        offset: 1, color: '#001C86' // 100% 处的颜色
	            	    }],
	            	    globalCoord: false // 缺省为 false
	            	}
	            }
	        }]
		});
    });
    var nzclzsChart = ChartService.init("nzclzs",scztzsOption);
    ChartService.setData('scztzsfx/getScztzsfxData?type=cl&entcat=nz',function(data){
    	console.log("农专户数走势："+JSON.stringify(data));
    	nzclzsChart.setOption({
    		color:'#F033D7',
    		title:{
    			text:'近5年农专存量户数走势'
    		},
    		xAxis: {
				data: data.result.list1
			},
	        series: [{
	            data: data.result.list2,
	            areaStyle:{
	            	color:{
	            		type: 'linear',
	            	    x: 0,
	            	    y: 0,
	            	    x2: 0,
	            	    y2: 1,
	            	    colorStops: [{
	            	        offset: 0, color: '#F033D7' // 0% 处的颜色
	            	    }, {
	            	        offset: 1, color: '#001C86' // 100% 处的颜色
	            	    }],
	            	    globalCoord: false // 缺省为 false
	            	}
	            }
	        }]
		});
    });
    /******************初始化统计图配置-资金****************************/
	var scztzsZjOption = {
    		color:colorList,
    		title:{
    			textStyle:{
    				color:'#FF9D00',
    				fontSize:'20'
    			},
    			left:'center',
    			top:'6%'
    		},
    		grid: {
    			left: '3%',
		        right: '2%',
		        bottom: '5%',
		        containLabel: true
		    },
    		xAxis: {
    			axisLine:{//轴线设置
    				show:false,
	        		lineStyle:{
	        			color:'#00E1FC',
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
    	        	show:false,
    	        	lineStyle:{
	        			color:'#00E1FC'
	        		}
	        	},
	        	axisTick:{//坐标轴刻度设置
	        		show:false//不显示
	        	},
    	        axisLabel:{//坐标轴刻度标签
    	        	show:false,
            		color:'#FFFF05',//文字的颜色
            		fontFamily:'Microsoft YaHei',//微软雅黑
            		fontSize:12,//字体大小
            		textShadowColor:'#000000',
            		textShadowBlur:2,
            		textShadowOffsetX:5,
            		textShadowOffsetY:5
            	},
	        	splitLine:{//grid区域分割线
	        		show:false,
	        		lineStyle:{
	        			color:'#00E1FC',
	        		}
	        	}
    	    },
    	    series: [{
    	        data: [],
    	        type: 'line',
    	        itemStyle:{//定义图形样式
	            	normal: {
	                    label: {
	                        show: true,
	                        position: 'top',
	                        formatter:'{c}万元',
	                        fontSize:14,//字体大小
	                		fontWeight:'bold'
	                    }
	                }
	            }
    	    }]
    	};
    //初始化图表
    var scztzjzsChart = ChartService.init("scztzjzs",scztzsZjOption);
    ChartService.setData('scztzsfx/getScztzsfxData?type=zj',function(data){
    	console.log("市场主体资金走势："+JSON.stringify(data));
    	scztzjzsChart.setOption({
    		color:'#78F033',
    		title:{
    			text:'近5年市场主体资金走势'
    		},
    		xAxis: {
				data: data.result.list1
			},
	        series: [{
	            data: data.result.list2,
	            areaStyle:{
	            	color:{
	            		type: 'linear',
	            	    x: 0,
	            	    y: 0,
	            	    x2: 0,
	            	    y2: 1,
	            	    colorStops: [{
	            	        offset: 0, color: '#78F033' // 0% 处的颜色
	            	    }, {
	            	        offset: 1, color: '#004AB6' // 100% 处的颜色
	            	    }],
	            	    globalCoord: false // 缺省为 false
	            	}
	            }
	        }]
		});
    });
    var qyzjzsChart = ChartService.init("qyzjzs",scztzsZjOption);
    ChartService.setData('scztzsfx/getScztzsfxData?type=zj&entcat=qy',function(data){
    	console.log("企业资金走势："+JSON.stringify(data));
    	qyzjzsChart.setOption({
    		color:'#00E1FC',
    		title:{
    			text:'近5年企业资金走势'
    		},
    		xAxis: {
				data: data.result.list1
			},
	        series: [{
	            data: data.result.list2,
	            areaStyle:{
	            	color:{
	            		type: 'linear',
	            	    x: 0,
	            	    y: 0,
	            	    x2: 0,
	            	    y2: 1,
	            	    colorStops: [{
	            	        offset: 0, color: '#00E1FC' // 0% 处的颜色
	            	    }, {
	            	        offset: 1, color: '#003DA9' // 100% 处的颜色
	            	    }],
	            	    globalCoord: false // 缺省为 false
	            	}
	            }
	        }]
		});
    });
    var gtzjzsChart = ChartService.init("gtzjzs",scztzsZjOption);
    ChartService.setData('scztzsfx/getScztzsfxData?type=zj&entcat=gt',function(data){
    	console.log("个体资金走势："+JSON.stringify(data));
    	gtzjzsChart.setOption({
    		color:'#00E1FC',
    		title:{
    			text:'近5年个体资金走势'
    		},
    		xAxis: {
				data: data.result.list1
			},
	        series: [{
	            data: data.result.list2,
	            areaStyle:{
	            	color:{
	            		type: 'linear',
	            	    x: 0,
	            	    y: 0,
	            	    x2: 0,
	            	    y2: 1,
	            	    colorStops: [{
	            	        offset: 0, color: '#00E1FC' // 0% 处的颜色
	            	    }, {
	            	        offset: 1, color: '#0039A4' // 100% 处的颜色
	            	    }],
	            	    globalCoord: false // 缺省为 false
	            	}
	            }
	        }]
		});
    });
    var nzzjzsChart = ChartService.init("nzzjzs",scztzsZjOption);
    ChartService.setData('scztzsfx/getScztzsfxData?type=zj&entcat=nz',function(data){
    	console.log("农专资金走势："+JSON.stringify(data));
    	nzzjzsChart.setOption({
    		color:'#00E1FC',
    		title:{
    			text:'近5年农专资金走势'
    		},
    		xAxis: {
				data: data.result.list1
			},
	        series: [{
	            data: data.result.list2,
	            areaStyle:{
	            	color:{
	            		type: 'linear',
	            	    x: 0,
	            	    y: 0,
	            	    x2: 0,
	            	    y2: 1,
	            	    colorStops: [{
	            	        offset: 0, color: '#00E1FC' // 0% 处的颜色
	            	    }, {
	            	        offset: 1, color: '#001F8D' // 100% 处的颜色
	            	    }],
	            	    globalCoord: false // 缺省为 false
	            	}
	            }
	        }]
		});
    });
}]);