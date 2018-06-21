//市场主体发展分析controller
indexApp.controller("scztfzfxCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	//年报年度
	$scope.nd = (new Date()).getFullYear();
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    qmztfzqsZtslChart.resize();
	    qmztfzqsZczjChart.resize();
	    zttbzzQyChart.resize();
	    zttbzzGtChart.resize();
	    zttbzzNzChart.resize();
    });
	/*******************期末主体发展**********************/
	var qmztfzqsOption = {
			tooltip: {
		        trigger: 'axis',
		        axisPointer: {
		            type: 'shadow'
		        }
		    },
			legend: {
					top:'30',
					textStyle:{
			    		color:'#00E1FC',
			    		fontSize:14,
			        	fontWeight:'bold'
			    	}
	    	 	},
	    	grid: {
			        left: '3%',
			        right: '4%',
			        bottom: '3%',
			        containLabel: true
			    },
		    xAxis : [
		        {
		            type : 'category',
		            axisLine:{//轴线设置
		            	lineStyle:{
		            		color:'#00E1FC',
		            	}
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel:{
		            	interval:0,
		            	color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,
			        	fontWeight:'bold',
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5
		            },
		            data : []
		        }
		    ],
		    yAxis : [
		        {	
		            type : 'value',
		            name:'数量/户',
		            min:0,
		    		max:600000,
		            nameTextStyle:{
		            	color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,
			        	fontWeight:'bold',
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5
		            },
		            min: 0,
		            axisLine:{//轴线设置
		            	lineStyle:{
		            		color:'#00E1FC'
		            	}
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel: {
		            	color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,
			        	fontWeight:'bold',
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5
		            },
		            splitLine:{//grid区域分割线
		        		show:false//不显示
		        	}
		        },
		        {
		            type: 'value',
		            name: '增长率/%',
		            min:0,
		    		max:30,
		            nameTextStyle:{
		            	color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,
			        	fontWeight:'bold',
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5
		            },
		            min: 0,
		            max: 100,
		            interval: 15,
		            axisLine:{//轴线设置
		            	lineStyle:{
		            		color:'#00E1FC',
		            		fontSize:14,
				        	fontWeight:'bold',
		            	}
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel: {
		            	color:'#00E1FC',//文字的颜色
		                formatter: '{value} %',
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,
			        	fontWeight:'bold',
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5
		            },
		            splitLine:{//grid区域分割线
		        		show:false//不显示
		        	}
		        }
		    ],
		    series: [{
					    name:'期末主体数量',
					    type:'bar',
					    barWidth: 10,
					    barGap:0.1,
					    yAxisIndex: 0,
					    data:[],
					    itemStyle:{//定义图形样式
			            	normal: {
			            		barBorderRadius: 5,
			                    color: new echarts.graphic.LinearGradient(
			                        0, 0, 0, 1,
			                        [
			                            {offset: 0, color: '#14c8d4'},
			                            {offset: 1, color: '#43eec6'}
			                        ]
			                    ),
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
			        	            	},
			        	            	fontSize:14,
			    			        	fontWeight:'bold',
			                        }
			                    }
			                }
			            }
					},
					{
			            name:'主体数量同比增长率',
			            type:'line',
			            smooth: true,
			            showAllSymbol: true,
			            symbol: 'emptyCircle',
			            symbolSize: 15,
			            yAxisIndex: 1,
			            itemStyle : {
							normal : {
								color : '#09FFFF',
								label: {
			                        show: true,
			                        position: 'top',
			                        formatter:'{c}%',
			                        textStyle: {
			                            color: '#00E1FC',
			                            fontSize:14,
			    			        	fontWeight:'bold',
			                        }
			                    }
							}		  
						},
			            data:[]
			        }
		    ],
		    color:colorList
		};
	var qmztfzqsZtslChart = ChartService.init("qmztfzqs_ztsl",qmztfzqsOption);
	ChartService.setData('scztfzfx/getQmztfzqsData?type=type1',function(data){
    	console.log("期末主体发展-主体数量："+JSON.stringify(data));
    	var tempOption = {
				xAxis:[{
		            data : data.result.list1
		    	}],
		    	yAxis:[{
		    		name:'数量/户',
		    		min:0,
		    		max:600000
		    	},{
		    		min:0,
		    		max:30
		    	}],
		    	series:[{
		    		name:'期末主体数量',
				    data:data.result.list2
				},
				{
					name:'主体数量同比增长率',
				    data:data.result.list3
				}]
    		};
    	qmztfzqsZtslChart.setOption(tempOption);
    });
	var qmztfzqsZczjChart = ChartService.init("qmztfzqs_zczj",qmztfzqsOption);
	ChartService.setData('scztfzfx/getQmztfzqsData?type=type2',function(data){
    	console.log("期末主体发展-注册资金："+JSON.stringify(data));
    	var tempOption = {
				xAxis:[{
		            data : data.result.list1
		    	}],
		    	yAxis:[{
		    		name:'资金/亿元',
		    		min:0,
		    		max:10000
		    	},{
		    		min:0,
		    		max:35
		    	}],
		    	series:[{
		    		name:'期末注册资金',
				    data:data.result.list2
				},
				{
					name:'注册资金同比增长率',
				    data:data.result.list3
				}]
    		};
    	qmztfzqsZczjChart.setOption(tempOption);
    });
	/**************************主体同比增长排行榜****************************/
	var zttbzzOption = {
			color:colorList,
			title:{
    			textStyle:{
    				color:'#00E1FC',
    				fontWeight:'bold'
    			},
    			top:'30'
    		},
    		tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		        left: '10%',
		        right: '10%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		            data : [],
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
		            	interval: 0,//标签设置为全部显示
		        		color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,
			        	fontWeight:'bold',
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5
		        	}
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value',
		            axisLine:{//轴线设置
		        		show:false//不显示
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel:{//坐标轴刻度标签
		            	show:false,
		        		color:'#00E1FC',//文字的颜色
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
		        }
		    ],
		    series : [
		        {
		            name:'数量',
		            type:'bar',
		            barWidth:'100%',
		            itemStyle:{//定义图形样式
		            	normal: {
			            	color:function(params){
			            		return colorList[params.dataIndex];
			            	},
			            	fontSize:14,
				        	fontWeight:'bold',
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
		        	            	},
		        	            	fontSize:14,
		    			        	fontWeight:'bold',
		                        }
		                    }
		                }
		            },
		            data:[]
		        }
		    ]
    	};
    //初始化图表
    var zttbzzQyChart = ChartService.init("zttbzz_qy",zttbzzOption);
    ChartService.setData('scztfzfx/getZttbzzData?entcat=qy',function(data){
    	console.log("主体同比增长排行榜-企业："+JSON.stringify(data));
    	zttbzzQyChart.setOption({
    		title:{
    			text:'企业',
    		},
    		yAxis:{
	    		min:600
	    	},
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    //初始化图表
    var zttbzzGtChart = ChartService.init("zttbzz_gt",zttbzzOption);
    ChartService.setData('scztfzfx/getZttbzzData?entcat=gt',function(data){
    	console.log("主体同比增长排行榜-个体："+JSON.stringify(data));
    	zttbzzGtChart.setOption({
    		title:{
    			text:'个体',
    		},
    		yAxis:{
	    		min:2000
	    	},
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    //初始化图表
    var zttbzzNzChart = ChartService.init("zttbzz_nz",zttbzzOption);
    ChartService.setData('scztfzfx/getZttbzzData?entcat=nz',function(data){
    	console.log("主体同比增长排行榜-农专："+JSON.stringify(data));
    	zttbzzNzChart.setOption({
    		title:{
    			text:'农专',
    		},
    		xAxis: {
				data: data.result.x_value
			},
			yAxis:{
	    		min:30
	    	},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /********************主体类别发展分析************************/
    $scope.ztlbfzfxQyData = {};
    ChartService.setData('scztfzfx/getZtlbfzfxData?entcat=qy',function(data){
    	console.log("主体类别发展分析-企业："+JSON.stringify(data));
    	$scope.ztlbfzfxQyData = data.result;
    });
    $scope.ztlbfzfxGtData = {};
    ChartService.setData('scztfzfx/getZtlbfzfxData?entcat=gt',function(data){
    	console.log("主体类别发展分析-个体："+JSON.stringify(data));
    	$scope.ztlbfzfxGtData = data.result;
    });
    $scope.ztlbfzfxNzData = {};
    ChartService.setData('scztfzfx/getZtlbfzfxData?entcat=nz',function(data){
    	console.log("主体类别发展分析-农专："+JSON.stringify(data));
    	$scope.ztlbfzfxNzData = data.result;
    });
    /************************行业同比增长量TOP5**********************/
    $scope.hytbzzlData = {};
    ChartService.setData('scztfzfx/getHytbzzlData',function(data){
    	console.log("行业同比增长量："+JSON.stringify(data));
    	$scope.hytbzzlData = data.result;
    });
}]);