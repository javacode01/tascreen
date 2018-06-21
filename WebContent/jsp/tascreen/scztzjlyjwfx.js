//市场主体资金来源（境外）分析controller
indexApp.controller("scztzjlyjwfxCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    wlzjqkChart.resize();
	    jwtzphChart.resize();
    });
	/********************世界地图******************/
	var wlzjqkChart = ChartService.init("wlzjqk",WorldMapUtil.getInitOption());
    ChartService.setData('scztzjlyjwfx/getJwtzphAllData',function(data){
    	console.log("投资金额排行境外地图数据："+JSON.stringify(data));
    	WorldMapUtil.setData(data.result);
    	wlzjqkChart.setOption(WorldMapUtil.getOption());
    });
	/************************投资金额排行**************************/
	var jwtzphOption = {
			color:colorList,
			title:{
				text:'单位：万美元',
				top:'5%',
				right:'5%',
				textStyle:{
					color:'#00E1FC'
				}
			},
    		tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		    	left: '1%',
		        right: '1%',
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
		        		show:false//不显示
		        	},
		        	splitLine:{//grid区域分割线
		        		show:false//不显示
		        	}
		        }
		    ],
		    series : [
		        {
		            name:'数量',
		            type:'bar',
		            itemStyle:{//定义图形样式
		            	normal: {
		            		color:function(params){
			            		return colorList[params.dataIndex];
			            	},
			            	barBorderRadius: [5, 5, 0, 0],
			            	shadowBlur:10,
			            	shadowColor:'#000000',
			            	shadowOffsetX:6,
			            	shadowOffsetY:6,
		                    label: {
		                        show: true,
		                        position: 'top',
		                        textStyle: {
		                            color: function(params){
					            		return colorList[params.dataIndex];
					            	}
		                        }
		                    }
		                }
		            },
		            barWidth:'50%',
		            data:[]
		        }
		    ]
    	};
    //初始化图表
    var jwtzphChart = ChartService.init("jwtzph",jwtzphOption);
    ChartService.setData('scztzjlyjwfx/getJwtzphData',function(data){
    	console.log("投资金额排行："+JSON.stringify(data));
    	jwtzphChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
	//加载表格数据
    ChartService.setData('scztzjlyjwfx/getJwtzphTableData',function(data){
    	console.log("投资金额排行表格数据："+JSON.stringify(data));
    	$scope.jwtzphTableData1 = data.result.result1;
    	$scope.jwtzphTableData2 = data.result.result2;
    });
}]);