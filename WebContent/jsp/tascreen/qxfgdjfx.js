//区县非公党建分析controller
indexApp.controller("qxfgdjfxCtrl",['$scope','ChartService','$window','$interval',function($scope,ChartService,$window,$interval){
	//年度
	$scope.nd = (new Date()).getFullYear()-1;
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    qsdzzjszlDwChart.resize();
	    qsdzzjszlDzzChart.resize();
	    qsdzzjszlDzbChart.resize();
	    qsdzzjszlDyChart.resize();
	    gqxdzzjszlChart.resize();
	    dzzzzqsChart.resize();
	    dyrszzqsChart.resize();
    });
    /************************全市党组织建设情况总览**************************/
    var pieColor = ['#0699EF','#FF6C0D'];
    var qsdzzjszlOption = {
			tooltip : {
				trigger : 'item',
				formatter : "<div style='width:80px;margin:auto;padding:auto;text-align:center;'>{b}<br/>{c}<br/>{d}%</div>",
				position: ['21%', '36%'],
				backgroundColor:'transparent',
				textStyle:{
		        	color:'#00E1FC',
		        	fontSize:16,
		        	fontWeight:'bold'
		        }
			},
			series : [ {
				name : '党组织情况',
				type : 'pie',
				radius : ['80%','90%'],
				center : ['50%','50%'],
				data : [],
				label:{
					show:false
				},
				itemStyle : {
					normal : {
						color : function(params) {
							return pieColor[params.dataIndex];
						}
					}
				},
			}]
		};
    var qsdzzjszlDwChart = ChartService.init("qsdzzjszl_dw",qsdzzjszlOption);
    var qsdzzjszlDzzChart = ChartService.init("qsdzzjszl_dzz",qsdzzjszlOption);
    var qsdzzjszlDzbChart = ChartService.init("qsdzzjszl_dzb",qsdzzjszlOption);
    var qsdzzjszlDyChart = ChartService.init("qsdzzjszl_dy",qsdzzjszlOption);
    ChartService.setData('qxfgdjfx/getQsdzzjszlData',function(data){
    	console.log("全市党组织建设情况总览："+JSON.stringify(data));
    	qsdzzjszlDwChart.setOption({
			series:[{
				data:[{name:"私营党委",value:data.result.qy.DW},{name:"个体党委",value:data.result.gt.DW}]
			}]
		});
    	var qsdzzjszlDwChartIndex = -1;
    	setInterval(function () {
    	     var dataLen = qsdzzjszlDwChart.getOption().series[0].data.length;
    	     qsdzzjszlDwChartIndex = (qsdzzjszlDwChartIndex + 1) % dataLen;
    	     // 显示 tooltip
    	     qsdzzjszlDwChart.dispatchAction({
    	         type: 'showTip',
    	         seriesIndex: 0,
    	         dataIndex: qsdzzjszlDwChartIndex
    	     });
    	 }, 3000);
    	qsdzzjszlDzzChart.setOption({
			series:[{
				data:[{name:"私营党总支",value:data.result.qy.DZZ},{name:"个体党总支",value:data.result.gt.DZZ}]
			}]
		});
    	var qsdzzjszlDzzChartIndex = -1;
    	setInterval(function () {
    	     var dataLen = qsdzzjszlDzzChart.getOption().series[0].data.length;
    	     qsdzzjszlDzzChartIndex = (qsdzzjszlDzzChartIndex + 1) % dataLen;
    	     // 显示 tooltip
    	     qsdzzjszlDzzChart.dispatchAction({
    	         type: 'showTip',
    	         seriesIndex: 0,
    	         dataIndex: qsdzzjszlDzzChartIndex
    	     });
    	 }, 3000);
    	qsdzzjszlDzbChart.setOption({
			series:[{
				data:[{name:"私营党支部",value:data.result.qy.DZB},{name:"个体党支部",value:data.result.gt.DZB}]
			}]
		});
    	var qsdzzjszlDzbChartIndex = -1;
    	setInterval(function () {
    	     var dataLen = qsdzzjszlDzbChart.getOption().series[0].data.length;
    	     qsdzzjszlDzbChartIndex = (qsdzzjszlDzbChartIndex + 1) % dataLen;
    	     // 显示 tooltip
    	     qsdzzjszlDzbChart.dispatchAction({
    	         type: 'showTip',
    	         seriesIndex: 0,
    	         dataIndex: qsdzzjszlDzbChartIndex
    	     });
    	 }, 3000);
    	qsdzzjszlDyChart.setOption({
			series:[{
				data:[{name:"私营党员",value:data.result.qy.DYRS},{name:"个体党员",value:data.result.gt.DYRS}]
			}]
		});
    	var qsdzzjszlDyChartIndex = -1;
    	setInterval(function () {
    	     var dataLen = qsdzzjszlDyChart.getOption().series[0].data.length;
    	     qsdzzjszlDyChartIndex = (qsdzzjszlDyChartIndex + 1) % dataLen;
    	     // 显示 tooltip
    	     qsdzzjszlDyChart.dispatchAction({
    	         type: 'showTip',
    	         seriesIndex: 0,
    	         dataIndex: qsdzzjszlDyChartIndex
    	     });
    	 }, 3000);
    });
    /***************************各区县党组织建设情况总览****************************/
    var gqxdzzjszlOption = {
    		title: {
            	show:false,
            },
            tooltip: {
                trigger: 'axis',
                axisPointer: {
                    type: 'cross',
                    crossStyle: {
                        color: '#999'
                    }
                }
            },
            grid:{
            	top:'10%',
            	left: '5%',
    	        right: '4%',
    	        bottom: '3%',
    	        containLabel: true
            },
    	    xAxis: [{
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
    	            data: [],
    	        }],
    	    yAxis: [{
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
    	        }],
    	    series: [
    	        {
    	            name:'党委',
    	            type:'bar',
    	            itemStyle:{//定义图形样式
    	            	normal: {
    	            		color:'#00BF64',
    		            	barBorderRadius: 5,
    		            	shadowBlur:10,
    		            	shadowColor:'#000000',
    		            	shadowOffsetX:6,
    		            	shadowOffsetY:6
    	                }
    	            },
    	            data:[]
    	        },
    	        {
    	            name:'党总支',
    	            type:'bar',
    	            itemStyle:{//定义图形样式
    	            	normal: {
    	            		color:'#0699EF',
    		            	barBorderRadius: 5,
    		            	shadowBlur:10,
    		            	shadowColor:'#000000',
    		            	shadowOffsetX:6,
    		            	shadowOffsetY:6
    	                }
    	            },
    	            data:[]
    	        },
    	        {
    	            name:'党支部',
    	            type:'bar',
    	            itemStyle:{//定义图形样式
    	            	normal: {
    	            		color:'#FF6C0D',
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
    var gqxdzzjszlChart = ChartService.init("gqxdzzjszl",gqxdzzjszlOption);
    ChartService.setData('qxfgdjfx/getGqxdzzjszlData',function(data){
    	console.log("各区县党组织建设情况总览："+JSON.stringify(data));
    	gqxdzzjszlChart.setOption({
    		xAxis: [{
	            data: data.result.list,
	        }],
			series:[{
	            data:data.result.list1
	        },
	        {
	            data:data.result.list2
	        },
	        {
	            data:data.result.list3
	        }]
		});
    });
    /***********************区县党组织排行榜***************************/
    $scope.dzzphbData = [];
    ChartService.setData('qxfgdjfx/getQxdzzphbData',function(data){
    	console.log("区县党组织排行榜TOP5："+JSON.stringify(data));
    	var seq = 1;
    	angular.forEach(data.result,function(data,index){
    		data.seq = seq;
    		seq++;
    	});
    	$scope.dzzphbData = data.result.slice(0,5);
    	var temp = 1;
    	$interval(function () {
    		debugger;
	   	    if(temp*5<=data.result.length){
	   	    	$scope.dzzphbData = data.result.slice((temp-1)*5,temp*5);
	   	    	temp++;
	   	    }else if((temp-1)*5<data.result.length&&temp*5>data.result.length){
	   	    	$scope.dzzphbData = data.result.slice((temp-1)*5,data.result.length);
	   	    	temp = 1;
	   	    }else{
	   	    	$scope.dzzphbData = data.result;
	   	    	temp = 1;
	   	    }
	   	 }, 6000);
    });
    /***********************区县党员人数排行榜***************************/
    $scope.dyrsphbData = [];
    ChartService.setData('qxfgdjfx/getQxdyrsphbData',function(data){
    	console.log("区县党员人数排行榜TOP5："+JSON.stringify(data));
    	var seq = 1;
    	angular.forEach(data.result,function(data,index){
    		data.seq = seq;
    		seq++;
    	});
    	$scope.dyrsphbData = data.result.slice(0,5);
    	var temp = 1;
    	$interval(function () {
	   	    if(temp*5<=data.result.length){
	   	    	$scope.dyrsphbData = data.result.slice((temp-1)*5,temp*5);
	   	    	temp++;
	   	    }else if((temp-1)*5<data.result.length&&temp*5>data.result.length){
	   	    	$scope.dyrsphbData = data.result.slice((temp-1)*5,data.result.length);
	   	    	temp = 1;
	   	    }else{
	   	    	$scope.dyrsphbData = data.result;
	   	    	temp = 1;
	   	    }
	   	 }, 6000);
    });
    /************************党组织增长趋势**************************/
    var dzzzzqsOption = {
    		color: ['#00E1FC'],
    		grid: {
    			top:'10%',
		        left: '1%',
		        right: '1%',
		        bottom: '3%',
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
    var dzzzzqsChart = ChartService.init("dzzzzqs",dzzzzqsOption);
    ChartService.setData('qxfgdjfx/getDzzzzqsData',function(data){
    	console.log("党组织增长趋势："+JSON.stringify(data));
    	dzzzzqsChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /************************党员人数增长趋势**************************/
    var dyrszzqsOption = {
    		color: ['#00E1FC'],
    		grid: {
    			top:'15%',
		        left: '1%',
		        right: '1%',
		        bottom: '3%',
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
    var dyrszzqsChart = ChartService.init("dyrszzqs",dyrszzqsOption);
    ChartService.setData('qxfgdjfx/getDyrszzqsData',function(data){
    	console.log("党员人数增长趋势："+JSON.stringify(data));
    	dyrszzqsChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
}]);