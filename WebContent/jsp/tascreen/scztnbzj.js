//市场主体年报总结controller
indexApp.controller("scztnbzjCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	//年报年度
	$scope.nbnd = (new Date()).getFullYear()-1;
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    gxqnbqkChart.resize();
	    ndnseChart.resize();
	    ndlreChart.resize();
    });
	//初始化数据
	$scope.ndqsnbqkData = {qyyb:'0',qywb:'0',gtyb:'0',gtwb:'0',nhyb:'0',nhwb:'0'};
	/****************各辖区年报情况*****************/
	var gxqnbqkOption = {
			legend: {
				top:'0',
				textStyle:{
		    		color:'#00E1FC'
		    	},
	    	    data: ['应报量','已报量','年报率']
	    	 	},
			tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        },
		        formatter:function(params, ticket, callback){
		        	return  params[0].name+'<br/>'
		        	+params[0].seriesName+':'+params[0].value+'户<br/>'
        			+params[1].seriesName+':'+params[1].value+'户<br/>'
        			+params[2].seriesName+':'+params[2].value+'%<br/>'
        			;
		        }
		    },
		    grid:{
		    	left:'10%',
		    	right:'10%',	
		    	bottom:'10%'
		    },
		    xAxis : [
		        {
		            type : 'category',
		            axisLine:{//轴线设置
		            	lineStyle:{
		            		color:'#00E1FC'
		            	}
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel:{
		            	interval:0,
		            	color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,//字体大小
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
		            nameTextStyle:{
		            	color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,//字体大小
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
		        		fontSize:14,//字体大小
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
		            name: '年报率/%',
		            nameTextStyle:{
		            	color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,//字体大小
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
		            		fontSize:14,//字体大小
			        		fontWeight:'bold'
		            	}
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel: {
		            	color:'#00E1FC',//文字的颜色
		                formatter: '{value} %',
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,//字体大小
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
					    name:'应报量',
					    type:'bar',
					    barGap:0.1,
					    yAxisIndex: 0,
					    data:[],
					    itemStyle : {
							normal : {
								color : '#31A2DF'
								}		  
						},
						label:{ normal: {
				           show:false,
				           position:'top',
				           formatter: '{c}'
				         }}
					},
					{
					    name:'已报量',
					    type:'bar',
					    barGap:0.1,
					    yAxisIndex: 0,
					    data:[],
					    itemStyle : {
							normal : {
								color : '#2DC07A'
								}		  
						},
						label:{ normal: {
					           show:false,
					           position:'top',
					           formatter: '{c}'
					         }}
					},
					{
			            name:'年报率',
			            type:'line',
			            yAxisIndex: 1,
			            itemStyle : {
							normal : {
								color : '#FEB828'
							}		  
						},
			            data:[]
			        }
		    ],
		    color:colorList
		};
	var gxqnbqkChart = ChartService.init("gxqnbqk",gxqnbqkOption);
	ChartService.setData('scztnbzj/getGxqnbqkData',function(data){
    	console.log("各辖区年报情况："+JSON.stringify(data));
    	gxqnbqkChart.setOption({
    		xAxis:[{
		            data : data.result.list1
		    	}],
		  	series:[{
			    name:'应报量',
			    type:'bar',
			    data:data.result.list3
			},
			{
			    name:'已报量',
			    type:'bar',
			    data:data.result.list2
			},
			{
	            name:'年报率',
	            type:'line',
	            data:data.result.list4
	        }]
		});
    });
	/***************************年度全市年报情况****************************/
	ChartService.setData('scztnbzj/getNdqsnbqkData',function(data){
    	console.log("年度全市年报情况："+JSON.stringify(data));
    	$scope.ndqsnbqkData = data.result;
    });
	/***************************年度纳税额top5*************************/
	var ndnseOption = {
    		tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		    	top:'6%',
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		            data : [],
		            axisLine:{//轴线设置
		        		show:false//不显示
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel:{//坐标轴刻度标签
		            	interval: 0,//标签设置为全部显示
		        		color:'#00E1FC',//文字的颜色
		        		fontFamily:'Microsoft YaHei',//微软雅黑
		        		fontSize:14,//字体大小
		        		fontWeight:'bold',
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5,
		        		formatter:function(params){
		                	//粘贴以下function内未注释的代码
		                	var newParamsName = "";// 最终拼接成的字符串
		                    var paramsNameNumber = params.length;// 实际标签的个数
		                    var provideNumber = 4;// 每行能显示的字的个数
		                    var rowNumber = Math.ceil(paramsNameNumber / provideNumber);// 换行的话，需要显示几行，向上取整
		                    /**
		                     * 判断标签的个数是否大于规定的个数， 如果大于，则进行换行处理 如果不大于，即等于或小于，就返回原标签
		                     */
		                    // 条件等同于rowNumber>1
		                    if (paramsNameNumber > provideNumber) {
		                        /** 循环每一行,p表示行 */
		                        for (var p = 0; p < rowNumber; p++) {
		                            var tempStr = "";// 表示每一次截取的字符串
		                            var start = p * provideNumber;// 开始截取的位置
		                            var end = start + provideNumber;// 结束截取的位置
		                            // 此处特殊处理最后一行的索引值
		                            if (p == rowNumber - 1) {
		                                // 最后一次不换行
		                                tempStr = params.substring(start, paramsNameNumber);
		                            } else {
		                                // 每一次拼接字符串并换行
		                                tempStr = params.substring(start, end) + "\n";
		                            }
		                            newParamsName += tempStr;// 最终拼成的字符串
		                        }

		                    } else {
		                        // 将旧标签的值赋给新标签
		                        newParamsName = params;
		                    }
		                    //将最终的字符串返回
		                    return newParamsName
		                }
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
		    color: ['#00BF64'],
		    series : [
		        {
		            name:'纳税额',
		            type:'pictorialBar',
		            barCategoryGap: '-130%',
		            symbol: 'path://M0,10 L10,10 C5.5,10 5.5,5 5,0 C4.5,5 4.5,10 0,10 z',
		            itemStyle:{//定义图形样式
		            	normal: {
		            		opacity: 1,
		                    label: {
		                        show: true,
		                        position: 'top',
		                        formatter:'{c}亿元',
		                        fontSize:14,//字体大小
				        		fontWeight:'bold',
		                    }
		                },
		                emphasis: {
		                    opacity: 1
		                }
		            },
		            data:[],
		            z: 10
		        }
		    ]
    	};
    //初始化图表
    var ndnseChart = ChartService.init("ndnse",ndnseOption);
    ChartService.setData('scztnbzj/getNdnseData',function(data){
    	console.log("年度纳税额TOP5："+JSON.stringify(data));
    	ndnseChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
	/***************************年度利润额top5*************************/
    var ndlreOption = {
    		tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		    	top:'15%',
		        left: '3%',
		        right: '4%',
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
		        		fontSize:14,//字体大小
		        		fontWeight:'bold',
		        		textShadowColor:'#000000',
		        		textShadowBlur:2,
		        		textShadowOffsetX:5,
		        		textShadowOffsetY:5,
		        		formatter:function(params){
		                	//粘贴以下function内未注释的代码
		                	var newParamsName = "";// 最终拼接成的字符串
		                    var paramsNameNumber = params.length;// 实际标签的个数
		                    var provideNumber = 4;// 每行能显示的字的个数
		                    var rowNumber = Math.ceil(paramsNameNumber / provideNumber);// 换行的话，需要显示几行，向上取整
		                    /**
		                     * 判断标签的个数是否大于规定的个数， 如果大于，则进行换行处理 如果不大于，即等于或小于，就返回原标签
		                     */
		                    // 条件等同于rowNumber>1
		                    if (paramsNameNumber > provideNumber) {
		                        /** 循环每一行,p表示行 */
		                        for (var p = 0; p < rowNumber; p++) {
		                            var tempStr = "";// 表示每一次截取的字符串
		                            var start = p * provideNumber;// 开始截取的位置
		                            var end = start + provideNumber;// 结束截取的位置
		                            // 此处特殊处理最后一行的索引值
		                            if (p == rowNumber - 1) {
		                                // 最后一次不换行
		                                tempStr = params.substring(start, paramsNameNumber);
		                            } else {
		                                // 每一次拼接字符串并换行
		                                tempStr = params.substring(start, end) + "\n";
		                            }
		                            newParamsName += tempStr;// 最终拼成的字符串
		                        }

		                    } else {
		                        // 将旧标签的值赋给新标签
		                        newParamsName = params;
		                    }
		                    //将最终的字符串返回
		                    return newParamsName
		                }
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
		        		fontSize:14,//字体大小
		        		fontWeight:'bold',
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
		    color: ['#06A8FF'],
		    series : [
		        {
		            name:'利润额',
		            type:'pictorialBar',
		            barCategoryGap: '-130%',
		            symbol: 'path://M0,10 L10,10 C5.5,10 5.5,5 5,0 C4.5,5 4.5,10 0,10 z',
		            itemStyle:{//定义图形样式
		            	normal: {
		            		opacity: 1,
		                    label: {
		                        show: true,
		                        position: 'top',
		                        formatter:'{c}亿元',
		                        fontSize:14,//字体大小
				        		fontWeight:'bold'
		                    }
		                },
		                emphasis: {
		                    opacity: 1
		                }
		            },
		            data:[],
		            z: 10
		        }
		    ]
    	};
    //初始化图表
    var ndlreChart = ChartService.init("ndlre",ndlreOption);
    ChartService.setData('scztnbzj/getNdlreData',function(data){
    	console.log("年度利润额TOP5："+JSON.stringify(data));
    	ndlreChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /*********************党组织建设情况***********************/
    $scope.dzzjsqkQyData = {};
    $scope.dzzjsqkGtData = {};
    ChartService.setData('scztnbzj/getDzzjsqkData',function(data){
    	console.log("党组织建设情况："+JSON.stringify(data));
    	$scope.dzzjsqkQyData = data.result.qydj;
    	$scope.dzzjsqkGtData = data.result.gtdj;
    });
}]);