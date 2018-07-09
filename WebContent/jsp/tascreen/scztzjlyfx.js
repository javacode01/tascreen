//市场主体资金来源（国内）分析controller
indexApp.controller("scztzjlyfxCtrl",['$scope','ChartService','$window','$interval',function($scope,ChartService,$window,$interval){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    lrtaszjqkChart.resize();
	    tzjephChart.resize();
    });
	/********************中国地图******************/
	var lrtaszjqkChart = ChartService.init("lrtaszjqk",ChinaMapUtil.getInitOption());
    ChartService.setData('scztzjlyfx/getTzjephAllData',function(data){
    	console.log("投资金额排行地图数据："+JSON.stringify(data));
    	ChinaMapUtil.setData(data.result);
    	lrtaszjqkChart.setOption(ChinaMapUtil.getOption());
    });
	/************************投资金额排行**************************/
	var tzjephOption = {
			color:colorList,
			title:{
				text:'单位：万元',
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
		        		fontSize:16,//字体大小
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
		            name:'金额',
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
    var tzjephChart = ChartService.init("tzjeph",tzjephOption);
    ChartService.setData('scztzjlyfx/getTzjephData',function(data){
    	console.log("投资金额排行："+JSON.stringify(data));
    	tzjephChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
	//加载表格数据
    ChartService.setData('scztzjlyfx/getTzjephTableData',function(data){
    	console.log("投资金额排行表格数据："+JSON.stringify(data));
    	$scope.tzjephTableData1 = data.result.result1;
    	$scope.tzjephTableData2 = data.result.result2;
    });
    //启动定时任务，切换显示金额和数量
    $scope.title = "金额";
    var type = 'je';
    $scope.timer = $interval(function(){
    	var url1 = '';
    	var url2 = '';
    	var title = '';
    	if('je'==type){
    		type = 'sl';
    		title = "数量";
    		tzjephOption.title.text = '单位：户';
    		tzjephOption.series[0].name = '户数';
    		url1 = 'scztzjlyfx/getTzjephhsData';
    		url2 = 'scztzjlyfx/getTzjephhsTableData';
    	}else{
    		type = 'je';
    		title = "金额";
    		tzjephOption.title.text = '单位：万元';
    		tzjephOption.series[0].name = '金额';
    		url1 = 'scztzjlyfx/getTzjephData';
    		url2 = 'scztzjlyfx/getTzjephTableData';
    	}
    	ChartService.setData(url1,function(data){
    		tzjephChart.clear();
    		tzjephOption.xAxis[0].data = data.result.x_value;
    		tzjephOption.series[0].data = data.result.y_value;
    		tzjephChart.setOption(tzjephOption);
        });
    	ChartService.setData(url2,function(data){
    		$scope.title = title;
    		$scope.tzjephTableData1 = data.result.result1;
        	$scope.tzjephTableData2 = data.result.result2;
        });
    },10000);
    //当DOM结构发生变化时，会执行on方法，监听路由切换时间。当DOM结构发生变化时，会执行 on方法
    $scope.$on('destroy',function(){
    	debugger;
    	console.log("页面切换，注销定时任务");
    	$interval.cancel($scope.timer);
	});
}]);