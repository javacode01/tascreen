//市场主体信息总览controller
indexApp.controller("scztxxzlCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    lxfbChart.resize();
	    cyfbChart.resize();
	    gmfbChart.resize();
	    gqxztslChart.resize();
	    ztzzqsChart.resize();
    });
	//初始化数据
	$scope.zslData = {qmsl:0,qnsl:0,tbzz:0};
	$scope.qxpmData = [];
	/*********************总数量************************/
    ChartService.setData('scztxxzl/getZtslData',function(data){
    	console.log("总数量："+JSON.stringify(data));
    	$scope.zslData.qmsl = data.result.qmsl;
    	$scope.zslData.qnsl = data.result.qnsl;
    	$scope.zslData.tbzz = data.result.tbzz;
    });
    /*********************各区县主体数量************************/
    var gqxztslChart = ChartService.init("gqxztsl",TaianMapUtil.getOption());
    ChartService.setData('scztxxzl/getGqxztslData',function(data){
    	console.log("各区县主体数量："+JSON.stringify(data));
    	$scope.qxpmData = data.result.slice(0,5);
    	gqxztslChart.setOption({
    		geo:{
    			layoutCenter: ['50%', '56%'],
	            layoutSize: '146%'
    		},
    		visualMap: {
    	    	show:false,
                min: 30000,
                max:100000,
                inRange: {
                	color: ['lightskyblue','yellow', 'orangered']
                }
            },
	        series: [{
	        	name:'主体数量',
	            data: data.result,
	            layoutCenter: ['50%', '55%'],
	            layoutSize: '146%',
	            itemStyle:{//定义图形样式
	            	normal: {
	                    label: {
	                        show: true,
	                        color:'#00E1FC',
	                        fontSize:16,//字体大小
	                		fontWeight:'bold',
	                        formatter:'{b}'
	                    }
	                }
	            }
	        }]
		});
    });
    /*********************主体增长趋势数据************************/
    var ztzzqsOption = {
    		color: ['#00E1FC'],
    		grid: {
    			top: '20%',
		        left: '5%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
    	    xAxis: {
    	        type: 'category',
    	        boundaryGap: false,
    	        data: [],
    	        axisLine:{//轴线设置
    	        	show:false,
	        		lineStyle:{
	        			color:'#013672',
	        		}
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
	        	}
    	    },
    	    yAxis: {
    	        type: 'value',
    	        axisLine:{//轴线设置
	        		show:false//不显示
	        	},
	        	axisTick:{//坐标轴刻度设置
	        		show:false//不显示
	        	},
	        	min:function(value) {
	        	    return value.min - 10000;
	        	},
	            axisLabel:{//坐标轴刻度标签
	            	show:false
	        	},
	        	splitLine:{//grid区域分割线
	        		show:false
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
	                        textStyle: {
	                            color: '#00E1FC',
	                            fontSize:16,//字体大小
		                		fontWeight:'bold'
	                        }
	                    }
	                }
	            },
    	        areaStyle: {
    	        	color:'rgba(3, 151, 156, 0.5)'
    	        }
    	    }]
    	};
    //初始化图表
    var ztzzqsChart = ChartService.init("ztzzqs",ztzzqsOption);
    ChartService.setData('scztxxzl/getZtzzqsData',function(data){
    	console.log("主体增长趋势："+JSON.stringify(data));
    	ztzzqsChart.setOption({
			xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /************************产业分布**************************/
    var scztfbCyfbOption = {
    		title:{
    			text:'产业分布',
    			textStyle:{
    				color:'#00E1FC',
    				fontWeight:'bold',
        			align:'left'
    			},
    			backgroundColor:'#013672'
    		},
			tooltip : {
				trigger : 'item',
				formatter : "<div style='width:100px;font-size:14px;text-align:center;'>{b}<br/>{c}<br/>{d}%</div>",
				position: ['33%', '36%'],
				backgroundColor:'transparent',
				textStyle:{
		        	color:'#00E1FC',
		        	fontSize:16,
		        	fontWeight:'bold'
		        }
			},
			series : [ {
				name : '户数',
				type : 'pie',
				radius : ['55%','60%'],
				center : ['50%','56%'],
				data : [],
				label:{
					show:false
				},
				itemStyle : {
					normal : {
						color : function(params) {
							return colorList[params.dataIndex];
						}
					}
				},
			}]
		};
    var cyfbChart = ChartService.init("cyfb",scztfbCyfbOption);
    ChartService.setData('scztxxzl/getCyfbData',function(data){
    	console.log("产业分布："+JSON.stringify(data));
    	cyfbChart.setOption({
			series:[{
				data:data.result
			}]
		});
    	var cyfbChartIndex = -1;
    	setInterval(function () {
    	     var dataLen = cyfbChart.getOption().series[0].data.length;
    	     // 取消之前高亮的图形
    	     cyfbChart.dispatchAction({
    	         type: 'downplay',
    	         seriesIndex: 0,
    	         dataIndex: cyfbChartIndex
    	     });
    	     cyfbChartIndex = (cyfbChartIndex + 1) % dataLen;
    	     // 高亮当前图形
    	     cyfbChart.dispatchAction({
    	         type: 'highlight',
    	         seriesIndex: 0,
    	         dataIndex: cyfbChartIndex
    	     });
    	     // 显示 tooltip
    	     cyfbChart.dispatchAction({
    	         type: 'showTip',
    	         seriesIndex: 0,
    	         dataIndex: cyfbChartIndex
    	     });
    	 }, 3000);
    });
    /************************类型分布**************************/
    var scztfbLxfbOption = {
    		title:{
    			text:'类型分布',
    			textStyle:{
    				color:'#00E1FC',
    				fontWeight:'bold',
        			align:'left'
    			},
    			backgroundColor:'#013672'
    		},
    		tooltip : {
				trigger : 'item',
				formatter : "<div style='width:100px;font-size:14px;text-align:center;'>{b}<br/>{c}<br/>{d}%</div>",
				position: ['33%', '36%'],
				backgroundColor:'transparent',
				textStyle:{
		        	color:'#00E1FC',
		        	fontSize:16,
		        	fontWeight:'bold'
		        }
			},
			series : [ {
				name : '户数',
				type : 'pie',
				radius : ['55%','60%'],
				center : ['50%','56%'],
				data : [],
				label:{
					show:false
				},
				itemStyle : {
					normal : {
						color : function(params) {
							return colorList[params.dataIndex];
						}
					}
				},
			}]
		};
	var lxfbChart = ChartService.init("lxfb",scztfbLxfbOption);
	ChartService.setData('scztxxzl/getLxfbData',function(data){
    	console.log("类型分布："+JSON.stringify(data));
    	lxfbChart.setOption({
			series:[{
				data:data.result
			}]
		});
    	var lxfbChartIndex = -1;
    	setInterval(function () {
    	     var dataLen = lxfbChart.getOption().series[0].data.length;
    	     // 取消之前高亮的图形
    	     lxfbChart.dispatchAction({
    	         type: 'downplay',
    	         seriesIndex: 0,
    	         dataIndex: lxfbChartIndex
    	     });
    	     lxfbChartIndex = (lxfbChartIndex + 1) % dataLen;
    	     // 高亮当前图形
    	     lxfbChart.dispatchAction({
    	         type: 'highlight',
    	         seriesIndex: 0,
    	         dataIndex: lxfbChartIndex
    	     });
    	     // 显示 tooltip
    	     lxfbChart.dispatchAction({
    	         type: 'showTip',
    	         seriesIndex: 0,
    	         dataIndex: lxfbChartIndex
    	     });
    	 }, 3000);
    });
	/************************规模分布**************************/
    var scztfbGmfbOption = {
    		title:{
    			text:'规模分布',
    			textStyle:{
    				color:'#00E1FC',
    				fontWeight:'bold',
        			align:'left'
    			},
    			backgroundColor:'#013672'
    		},
    		tooltip : {
				trigger : 'item',
				formatter : "<div style='width:126px;font-size:12px;text-align:center;'>{b}<br/>{c}<br/>{d}%</div>",
				position: ['29%', '36%'],
				backgroundColor:'transparent',
				textStyle:{
		        	color:'#00E1FC',
		        	fontSize:16,
		        	fontWeight:'bold'
		        }
			},
			series : [ {
				name : '户数',
				type : 'pie',
				radius : ['55%','60%'],
				center : ['50%','56%'],
				data : [],
				label:{
					show:false
				},
				itemStyle : {
					normal : {
						color : function(params) {
							return colorList[params.dataIndex];
						}
					}
				},
			}]
		};
	var gmfbChart = ChartService.init("gmfb",scztfbGmfbOption);
	ChartService.setData('scztxxzl/getGmfbData',function(data){
    	console.log("规模分布："+JSON.stringify(data));
    	gmfbChart.setOption({
			series:[{
				data:data.result
			}]
		});
    	var gmfbChartIndex = -1;
    	setInterval(function () {
    	     var dataLen = gmfbChart.getOption().series[0].data.length;
    	     // 取消之前高亮的图形
    	     gmfbChart.dispatchAction({
    	         type: 'downplay',
    	         seriesIndex: 0,
    	         dataIndex: gmfbChartIndex
    	     });
    	     gmfbChartIndex = (gmfbChartIndex + 1) % dataLen;
    	     // 高亮当前图形
    	     gmfbChart.dispatchAction({
    	         type: 'highlight',
    	         seriesIndex: 0,
    	         dataIndex: gmfbChartIndex
    	     });
    	     // 显示 tooltip
    	     gmfbChart.dispatchAction({
    	         type: 'showTip',
    	         seriesIndex: 0,
    	         dataIndex: gmfbChartIndex
    	     });
    	 }, 3000);
    });
}]);