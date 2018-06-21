//四新经济发展分析controller
indexApp.controller("sxjjfzfxCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    dqfbChart.resize();
	    zzqsChart.resize();
    });
    /***************************地区分布****************************/
    var dqfbOption = {
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
            legend: {
    	    	top:'10',
    	    	left:'15',
    	    	textStyle:{
    				color:'#00E1FC',
    				fontSize:14,//字体大小
		        	fontWeight:'bold'
    			}
    	    },
            grid:{
            	top:'15%',
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
    	            data: ['市直','景区','泰山区','岱岳区','高新区','新泰市','肥城市','宁阳县','东平县'],
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
    	            name:'新技术企业',
    	            type:'bar',
    	            itemStyle:{//定义图形样式
    	            	normal: {
    	            		color:'#910790',
    		            	barBorderRadius: 5,
    		            	shadowBlur:10,
    		            	shadowColor:'#000000',
    		            	shadowOffsetX:6,
    		            	shadowOffsetY:6
    	                }
    	            },
    	            data:[100,150,200,250,100,150,300,190,200]
    	        },
    	        {
    	            name:'新产业企业',
    	            type:'bar',
    	            itemStyle:{//定义图形样式
    	            	normal: {
    	            		color:'#1DD07C',
    		            	barBorderRadius: 5,
    		            	shadowBlur:10,
    		            	shadowColor:'#000000',
    		            	shadowOffsetX:6,
    		            	shadowOffsetY:6
    	                }
    	            },
    	            data:[50,90,100,200,150,50,90,200,150]
    	        },
    	        {
    	            name:'新业态企业',
    	            type:'bar',
    	            itemStyle:{//定义图形样式
    	            	normal: {
    	            		color:'#FF9000',
    		            	barBorderRadius: 5,
    		            	shadowBlur:10,
    		            	shadowColor:'#000000',
    		            	shadowOffsetX:6,
    		            	shadowOffsetY:6,
    	                    label: {
    	                        show: false,
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
    	            data:[500,300,200,400,600,100,400,500,600]
    	        },
    	        {
    	            name:'新模式企业',
    	            type:'bar',
    	            itemStyle:{//定义图形样式
    	            	normal: {
    	            		color:'#56FF00',
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
    	            data:[300,350,290,400,350,500,450,300,200]
    	        }
    	    ]
    };
    var dqfbChart = ChartService.init("dqfb",dqfbOption);
    /************************增长趋势*****************************/
    var zzqsOption = {
    		color:colorList,
    	    tooltip: {
    	        trigger: 'axis'
    	    },
    	    legend: {
    	    	top:'10',
    	    	left:'15',
    	    	textStyle:{
    				color:'#00E1FC',
    				fontSize:14,//字体大小
		        	fontWeight:'bold'
    			}
    	    },
    	    grid: {
    	        left: '3%',
    	        right: '4%',
    	        bottom: '3%',
    	        containLabel: true
    	    },
    	    xAxis: {
    	        type: 'category',
    	        boundaryGap: false,
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
            		fontSize:14,//字体大小
		        	fontWeight:'bold',
            		textShadowColor:'#000000',
            		textShadowBlur:2,
            		textShadowOffsetX:5,
            		textShadowOffsetY:5
            	},
    	        data: [2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018]
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
	        			color:'#00E1FC'
	        		}
	        	}
    	    },
    	    series: [
    	        {	
    	        	name:'新技术企业',
    	            type:'line',
    	            data:[50,60,70,80,90,100,110,120,130,140,150]
    	        },
    	        {
    	        	name:'新业态企业',
    	            type:'line',
    	            data:[50,70,90,100,120,150,170,190,210,230,250]
    	        },
    	        {
    	        	name:'新产业企业',
    	            type:'line',
    	            data:[60,80,120,140,160,180,200,220,240,260,280]
    	        },
    	        {
    	        	name:'新模式企业',
    	            type:'line',
    	            data:[60,90,130,150,180,210,240,260,280,300,330]
    	        }
    	    ]
    	};
    var zzqsChart = ChartService.init("zzqs",zzqsOption);
}]);