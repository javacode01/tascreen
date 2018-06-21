//服务发展专题分析controller
indexApp.controller("fwfzztfxCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    qsczmsbsjfxMapChart.resize();
	    szqysjfxChart.resize();
	    zcsbqsfxChart.resize();
    });
	/******************泰安地图************************/
    var qsczmsbsjfxMapOption = {
    		tooltip : {
    		        trigger: 'item'
    	    },
    	    visualMap: {
    	    	show:false,
                min: 0,
                max:5000,
                text:['高','低'],
                realtime: false,
                calculable: true,
                inRange: {
                	color: ['lightskyblue','yellow', 'orangered']
                },
    			textStyle:{
    				color:'#FFFFFF'
    			}
            },
    	    series: [{
    	    	name:'商标数量',
    	        type: 'map',
    	        map: 'taian',
    	        label:{
            		normal:{
            			show:true,
            			textStyle:{
            				color:'#FFFFFF'
            			}
            		}
    	        },
    	        layoutCenter: ['50%', '50%'],
	            layoutSize: '119%',
    	        data:[]
    	    }]
    	};
	var qsczmsbsjfxMapChart = ChartService.init("qsczmsbsjfx_map",qsczmsbsjfxMapOption);
	/**************************全市驰著名商标柱状图*********************/
	var qsczmsbsjfxBarOption = {
	        title: {
	        	show:false,
	        },
	        grid:{
	        	top:'20%',
	        	left: '3%',
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
	        		fontSize:12,//字体大小
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
	            name: '数量',
	            type: 'bar',
	            data: [],
	            itemStyle:{//定义图形样式
	            	normal: {
	            		color:function(params){
		            		return colorList[params.dataIndex];
		            	},
		            	shadowBlur:10,
		            	shadowColor:'#000000',
		            	shadowOffsetX:6,
		            	shadowOffsetY:6,
	                    label: {
	                        show: true,
	                        position: 'top',
	                        formatter:'{c}',
	                        textStyle: {
	                            color: function(params){
	        	            		return colorList[params.dataIndex];
	        	            	}
	                        }
	                    }
	                }
	            },
	            barWidth:'50%'
	        }]
	    };
	//初始化图表
	var qsczmsbsjfxBarChart = ChartService.init("qsczmsbsjfx_bar",qsczmsbsjfxBarOption);
	ChartService.setData('fwfzztfx/getGqxzcsbData',function(data){
    	console.log("各区县注册商标："+JSON.stringify(data));
    	qsczmsbsjfxMapChart.setOption({
    		series:{
    			data:data.result.mapData
    		}
    	});
    	qsczmsbsjfxBarChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
	/************************守重企业数据分析**************************/
	var szqysjfxOption = {
			color:colorList,
    		tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		    	top:'29%',
		        left: '5%',
		        right: '6%',
		        bottom: '16%',
		        containLabel: true
		    },
		    xAxis : [
		        {
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
		        }
		    ],
		    yAxis : [
		        {
		        	type: 'category',
		        	name:'单位/户',
		        	axisLine:{//轴线设置
		        		show:false,//不显示
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
		        		fontSize:12,//字体大小
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5,
		        		formatter: function (value, index) {
		        			var img = '';
//		        			if(value=="市级"){
//		        				img = '<img alt="" src="resource/img/gsywssjk/tubiao1.png" style="width:16px;height:16px;margin-left:20px;">';
//		        			}else if(value=='省级'){
//		        				img = '<img alt="" src="resource/img/gsywssjk/tubiao1.png" style="width:16px;height:16px;margin-left:20px;">';
//		        			}else if(value=='国家级'){
//		        				img = '<img alt="" src="resource/img/gsywssjk/tubiao1.png" style="width:16px;height:16px;margin-left:20px;">';
//		        			}
		        			return img+value;
			            }
		        	},
		            data: []
		        }
		    ],
		    series : [
		        {
		            name:'数量',
		            type:'bar',
		            barWidth:'20',
		            itemStyle:{//定义图形样式
		            	normal: {
			            	barBorderRadius: [10, 10, 10, 10],
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
		                        formatter:'{c}',
		                        textStyle: {
		                            color: function(params){
		        	            		return colorList[params.dataIndex];
		        	            	}
		                        }
		                    }
		                }
		            },
		            data:[]
		        }
		    ]
    	};
    //初始化图表
    var szqysjfxChart = ChartService.init("szqysjfx",szqysjfxOption);
    ChartService.setData('fwfzztfx/getSzqysjfxData',function(data){
    	console.log("守重企业数据分析："+JSON.stringify(data));
    	szqysjfxChart.setOption({
    		yAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /************************注册商标趋势分析**************************/
    var zcsbqsfxOption = {
    		color:colorList,
    		grid: {
    			top:'29%',
		        left: '5%',
		        right: '10%',
		        bottom: '16%',
		        containLabel: true
		    },
    		xAxis: {
    			axisLine:{//轴线设置
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
            		fontSize:12,//字体大小
            		textShadowColor:'#000000',
            		textShadowBlur:2,
            		textShadowOffsetX:5,
            		textShadowOffsetY:5
            	},
    	        data: []
    	    },
    	    yAxis: {
    	        type: 'value',
    	        name:'数量/个',
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
            		fontSize:12,//字体大小
            		textShadowColor:'#000000',
            		textShadowBlur:2,
            		textShadowOffsetX:5,
            		textShadowOffsetY:5
            	},
	        	splitLine:{//grid区域分割线
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
	                        formatter:'{c}',
	                        textStyle: {
	                            color: '#FF760E'
	                        }
	                    }
	                }
	            }
    	    }]
    	};
    //初始化图表
    var zcsbqsfxChart = ChartService.init("zcsbqsfx",zcsbqsfxOption);
    ChartService.setData('fwfzztfx/getZcsbqsfxData',function(data){
    	console.log("注册商标趋势分析："+JSON.stringify(data));
    	zcsbqsfxChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /************************助企融资-股权出质**************************/
    $scope.zqrzGqczData = [0,0,0];
    ChartService.setData('fwfzztfx/getZqrzGqczData',function(data){
    	console.log("助企融资-股权出质："+JSON.stringify(data));
    	$scope.zqrzGqczData = data.result.y_value;
    });
    /************************助企融资-动产抵押**************************/
    $scope.zqrzDcdyData = [0,0,0];
    ChartService.setData('fwfzztfx/getZqrzDcdyData',function(data){
    	console.log("助企融资-动产抵押："+JSON.stringify(data));
    	$scope.zqrzDcdyData = data.result.y_value;
    });
    /************************助企融资-商标权质押**************************/
    $scope.zqrzSbqzyData = [0,0];
    ChartService.setData('fwfzztfx/getZqrzSbqzyData',function(data){
    	console.log("助企融资-商标权质押："+JSON.stringify(data));
    	$scope.zqrzSbqzyData = data.result.y_value;
    });
}]);