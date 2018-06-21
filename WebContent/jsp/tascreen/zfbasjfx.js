//执法办案数据分析controller
indexApp.controller("zfbasjfxCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	//执法办案年度
	$scope.zfband = (new Date()).getFullYear();
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    ajlxfxChart.resize();
	    ajqsfxChart.resize();
    });
	//数据初始化
	$scope.gqxzfsjfxData = [];
	/************************案件类型分析**************************/
	var ajlxfxOption = {
    		tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		    	top:'10%',
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		            axisLine:{//轴线设置
		            	show:false,
		        		lineStyle:{
		        			color:'#00E1FC',
		        		}
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            data : [],
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
		    series : [
		        {
		            name:'件数',
		            type:'bar',
		            barWidth: '36%',
		            itemStyle:{//定义图形样式
		            	normal: {
			            	barBorderRadius: [5, 5, 0, 0],
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
		                        formatter:'{c}件',
		                        textStyle: {
		                            color: function(params){
		        	            		return colorList[params.dataIndex];
		        	            	},
		        	            	fontSize:14,//字体大小
		    		        		fontWeight:'bold'
		                        }
		                    }
		                }
		            },
		            data:[]
		        }
		    ]
    	};
    //初始化图表
    var ajlxfxChart = ChartService.init("ajlxfx",ajlxfxOption);
    ChartService.setData('zfbasjfx/getAjlxfxData',function(data){
    	console.log("案件类型分析："+JSON.stringify(data));
    	ajlxfxChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /************************案件趋势分析**************************/
    var ajqsfxOption = {
    		color: ['#00E1FC'],
    		grid: {
    			top:'10%',
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
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
	                        formatter:'{c}件',
	                        textStyle: {
	                            color: '#FF760E',
	                            fontSize:14,//字体大小
	    		        		fontWeight:'bold'
	                        }
	                    }
	                }
	            },
    	        areaStyle: {
    	        	color:'rgba(6, 153, 239, 0.5)'
    	        }
    	    }]
    	};
    //初始化图表
    var ajqsfxChart = ChartService.init("ajqsfx",ajqsfxOption);
    ChartService.setData('zfbasjfx/getAjqsfxData',function(data){
    	console.log("案件趋势分析："+JSON.stringify(data));
    	ajqsfxChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /*************************各区县执法数据分析***************************/
    ChartService.setData('zfbasjfx/getGqxzfsjfxData',function(data){
    	console.log("各区县执法数据分析："+JSON.stringify(data));
    	$scope.gqxzfsjfxData = data.result;
    });
    /*************************年度数据***********************/
    $scope.ndData = {};
    ChartService.setData('zfbasjfx/getNdData',function(data){
    	console.log("年度："+JSON.stringify(data));
    	$scope.ndData = data.result;
    });
}]);