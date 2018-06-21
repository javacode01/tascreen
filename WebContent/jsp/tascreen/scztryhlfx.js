//市场主体人员活力分析controller
indexApp.controller("scztryhlfxCtrl",['$scope','ChartService','$window',function($scope,ChartService,$window){
	var w = angular.element($window);
    w.bind('resize', function(){
	    console.log("捕获屏幕大小改变时间============="+new Date());
	    qyjmbrdqfbChart.resize();
	    qyjmbrxbfbChart.resize();
	    qyjnlfbChart.resize();
	    qyjxlfbChart.resize();
	    mbrqyjxbnlzlChart.resize();
    });
	$scope.man = '-';
	$scope.woman = '-';
	var qyjmbrxbfbOption = {
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c}"
			},
			series : [ {
				name : '户数',
				type : 'pie',
				radius : '60%',
				center : ['50%','50%'],
				data : [],
				itemStyle : {
					normal : {
						color : function(params) {
							var colorList = ['#1D9FF2','#00DDF2'];
							return colorList[params.dataIndex];
						}
					}
				},
				label:{
					position:'inside',
					formatter:function(params){
						return params.data.name+"\n每百人"+params.value+"人";
					},
					fontSize:16,//字体大小
	        		fontWeight:'bold'
				}
			} ]
		};
	var qyjmbrxbfbChart = ChartService.init("qyjmbrxbfb",qyjmbrxbfbOption);
	ChartService.setData('scztryhlfx/getQyjmbrxbfbData',function(data){
    	console.log("企业家每百人性别分布："+JSON.stringify(data));
    	$scope.man = data.result[0].value;
    	$scope.woman = data.result[1].value;
    	qyjmbrxbfbChart.setOption({
			series:[{
				data:data.result
			}]
		});
    	qyjmbrxbfbChart.dispatchAction({
        	type: 'pieSelect',
            // 可选，系列 index，可以是一个数组指定多个系列
            seriesIndex: 0,
            // 可选，系列名称，可以是一个数组指定多个系列
            dataIndex: 0
        });
    });
	/*********************************企业家每百人地区分布*********************************/
	var maxData = 30;
	var spirit = 'image://resource/img/scztryhlfx/man.png';
	var qyjmbrdqfbOption = {
    		tooltip : {
		    },
		    grid: {
		    	top:'10%',
		        left: '5%',
		        right: '10%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis : {
		            max:maxData,
		            splitLine: {
		            	show: false
		            },
		            axisLine:{//轴线设置
		            	show:false
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel:{//坐标轴刻度标签
		            	show:false
		        	}
		    },
		    yAxis : {
		        	inverse: true,
		            axisLine:{//轴线设置
		        		show:false//不显示
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
		        	},
		        	data:[]
		    },
		    series : [
		        {
		            name:'人数',
		            type:'pictorialBar',
		            symbol: spirit,
		            symbolRepeat: 'fixed',
		            symbolMargin: '20%',
		            symbolClip: true,
		            symbolBoundingData: maxData,
		            data:[],
		            z: 10
		        }, {
		            type: 'pictorialBar',
		            itemStyle: {
		                normal: {
		                    opacity: 0.2
		                }
		            },
		            label: {
		                normal: {
		                    show: true,
		                    formatter: function (params) {
		                        return params.value+'人';
		                    },
		                    position: 'right',
		                    offset: [10, 0],
		                    textStyle: {
		                        color: '#00E1FC',
		                        fontSize:16,//字体大小
				        		fontWeight:'bold'
		                    }
		                }
		            },
		            animationDuration: 0,
		            symbolRepeat: 'fixed',
		            symbolMargin: '20%',
		            symbol: spirit,
		            symbolBoundingData: maxData,
		            data: [],
		            z: 5
		        }]
    	};
    //初始化图表
    var qyjmbrdqfbChart = ChartService.init("qyjmbrdqfb",qyjmbrdqfbOption);
    ChartService.setData('scztryhlfx/getQyjmbrdqfbData',function(data){
    	console.log("企业家每百人地区分布："+JSON.stringify(data));
    	qyjmbrdqfbChart.setOption({
    		yAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        },{
	            data: data.result.y_value
	        }]
		});
    });
    /******************企业家年龄分布**********************/
    var qyjnlfbOption = {
    		color:'#1D9FF2',
    		tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		        	type: 'none'        // 默认为直线，可选为：'line' | 'shadow'
		        },
		        formatter: function (params) {
		            return params[0].name + ': ' + params[0].value+'人';
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
		            axisLine:{//轴线设置
		            	show:false
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            data : [],
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
		        }
		    ],
		    yAxis : [
		        {
		            axisLine:{//轴线设置
		        		show:false//不显示
		        	},
		        	axisTick:{//坐标轴刻度设置
		        		show:false//不显示
		        	},
		            axisLabel:{//坐标轴刻度标签
		            	show:false
		        	},
		        	splitLine:{//grid区域分割线
		        		show:false
		        	}
		        }
		    ],
		    series : [
		        {
		            name:'人数',
		            type:'pictorialBar',
		            barCategoryGap: '-130%',
		            symbol: 'path://M0,10 L10,10 C5.5,10 5.5,5 5,0 C4.5,5 4.5,10 0,10 z',
		            itemStyle:{//定义图形样式
		            	normal: {
		            		normal: {
		                        opacity: 0.5
		                    },
		                    emphasis: {
		                        opacity: 1
		                    },
		                    label: {
		                        show: true,
		                        position: 'top',
		                        formatter:'{c}人',
		                        fontSize:16,//字体大小
				        		fontWeight:'bold'
		                    }
		                }
		            },
		            data:[]
		        }
		    ]
    	};
    //初始化图表
    var qyjnlfbChart = ChartService.init("qyjnlfb",qyjnlfbOption);
    ChartService.setData('scztryhlfx/getQyjnlfbData',function(data){
    	console.log("企业家年龄分布："+JSON.stringify(data));
    	qyjnlfbChart.setOption({
    		xAxis: {
				data: data.result.x_value
			},
	        series: [{
	            data: data.result.y_value
	        }]
		});
    });
    /************************企业家学历分布*************************/
    var qyjxlfbOption = {
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} (占比：{d}% )"
			},
			legend: {
		        type: 'scroll',
		        orient: 'vertical',
		        left: 'right',
		        top: '5%',
		        textStyle:{
		        	color:function(params){
	            		return colorList[params.dataIndex];
	            	}
		        }
		    },
			series : [ {
				name : '人',
				type : 'pie',
				radius : ['50','60%'],
				center : ['46%','50%'],
				data : [],
				label:{
					formatter:function(params){
						return params.data.name+"\n"+params.value+"人";
					}
				},
				itemStyle : {
					normal : {
						color : function(params) {
							return colorList[params.dataIndex];
						}
					}
				},
			} ]
		};
	var qyjxlfbChart = ChartService.init("qyjxlfb",qyjxlfbOption);
	ChartService.setData('scztryhlfx/getQyjxlfbData',function(data){
    	console.log("企业家学历分布："+JSON.stringify(data));
    	qyjxlfbChart.setOption({
			series:[{
				data:data.result
			}]
		});
    });
	/************************每百人企业家性别、年龄总览**********************/
	var mbrqyjxbnlzlOption = {
			color:['#0699EF','#FF6C0D'],
		    tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    legend: {
		    	left:'left',
		    	textStyle:{
		    		color:'#00E1FC',
		    		fontSize:16,
		    		fontWeight:'blod'
		    	},
		        data: ['男', '女']
		    },
		    grid: {
		    	top:'10%',
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis:  {
		        axisLine:{//轴线设置
		        	show:false,
	        	},
	        	axisTick:{//坐标轴刻度设置
	        		show:false//不显示
	        	},
	        	splitLine:{//grid区域分割线
	        		show:false,
	        	},
		        axisLabel:{//坐标轴刻度标签
		        	show:false,
	        	}
		    },
		    yAxis: {
		        axisLine:{//轴线设置
	        		show:false//不显示
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
	        	},
	        	axisPointer: {
	                label: {
	                    show: true,
	                    margin: 30
	                }
	            },
		        data: []
		    },
		    series: [
		        {
		            name: '男',
		            type: 'pictorialBar',
		            label: {
		                normal: {
		                    show: true,
		                    position: 'right',
		                    fontSize:16,//字体大小
			        		fontWeight:'bold'
		                }
		            },
		            symbolRepeat: true,
		            symbolSize: ['90%', '100%'],
		            barCategoryGap: '10%',
		            data: []
		        },
		        {
		            name: '女',
		            type: 'pictorialBar',
		            barGap: '10%',
		            label: {
		                normal: {
		                    show: true,
		                    position: 'right',
		                    fontSize:16,//字体大小
			        		fontWeight:'bold'
		                }
		            },
		            symbolRepeat: true,
		            symbolSize: ['90%', '100%'],
		            data: []
		        }
		    ]
		};
	var mbrqyjxbnlzlChart = ChartService.init("mbrqyjxbnlzl",mbrqyjxbnlzlOption);
	var pathSymbols = {
		    man: 'image://resource/img/scztryhlfx/min_man.png',
		    woman: 'image://resource/img/scztryhlfx/min_woman.png'
		};
	ChartService.setData('scztryhlfx/getMbrqyjxbnlzlData',function(data){
    	console.log("每百人企业家性别、年龄总览："+JSON.stringify(data));
    	var manList = new Array();
    	var womanList = new Array();
    	angular.forEach(data.result.m_value,function(data,index){
    		var temp = {};
    		temp.value = data
    		temp.symbol = pathSymbols.man;
    		manList.push(temp);
    	});
    	angular.forEach(data.result.f_value,function(data,index){
    		var temp = {};
    		temp.value = data
    		temp.symbol = pathSymbols.woman;
    		womanList.push(temp);
    	});
    	mbrqyjxbnlzlChart.setOption({
    		yAxis:{
    			data:data.result.y_value
    		},
	        series: [{
	            data: manList
	        },{
	            data: womanList
	        }]
		});
    });
}]);