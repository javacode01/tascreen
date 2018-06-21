//消保维权热点关注controller
indexApp.controller("xbwqrdgzCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    jbwtfxChart.resize();
    });
    /********************投诉问题分析*******************/
    $scope.tswtfxSpData = {};
    $scope.tswtfxFwData = {};
    ChartService.setData('xfwqrdgz/getTswtfxData?type=sp',function(data){
    	console.log("投诉问题分析-商品："+JSON.stringify(data));
    	$scope.tswtfxSpData = data.result;
    });
    ChartService.setData('xfwqrdgz/getTswtfxData?type=fw',function(data){
    	console.log("投诉问题分析-服务："+JSON.stringify(data));
    	$scope.tswtfxFwData = data.result;
    });
    /**************************各区投诉举报分析***************************/
    $scope.gqxtsjbTsData = [];
    $scope.gqxtsjbJbData = [];
    ChartService.setData('xfwqrdgz/getGqtsjbfxData',function(data){
    	console.log("各区投诉举报分析："+JSON.stringify(data));
    	$scope.gqxtsjbTsData = data.result.ts_data;
    	$scope.gqxtsjbJbData = data.result.jb_data;
    });
    /***************************举报问题分析*************************/
    var jbwtfxOption = {
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
		        		fontSize:12,//字体大小
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
		            name:'主体数量',
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
		                        formatter:'{c}户',
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
    var jbwtfxChart = ChartService.init("jbwtfx",jbwtfxOption);
    ChartService.setData('xfwqrdgz/getJbwtfxData',function(data){
    	console.log("举报问题分析："+JSON.stringify(data));
    	jbwtfxChart.setOption({
    		xAxis: {
                data: data.result.x_data
            },
	        series: [{
	            data: data.result.y_data
	        }]
		});
    });
    $scope.jbwtfxZt = {};
    ChartService.setData('xfwqrdgz/getJbwtfxZtData',function(data){
    	console.log("举报问题总体分析："+JSON.stringify(data));
    	$scope.jbwtfxZt = data.result;
    });
    $scope.xfwqzlData = {};
	/*********************年度************************/
    ChartService.setData('xfwqrdgz/getXfwqzlData',function(data){
    	console.log("消费维权总览："+JSON.stringify(data));
    	$scope.xfwqzlData = data.result;
    });
}]);