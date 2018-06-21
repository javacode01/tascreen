//首页模块
var indexApp = angular.module("indexApp",['ngRoute','ngAnimate']);
/************配置路由****************/
indexApp.config(['$routeProvider', function($routeProvider){
    $routeProvider
    .when('/',{//导航页
    	templateUrl:basepath+'toMain',
    	controller:'mainCtrl'
    	})
    .when('/gsywssjk',{//工商业务实时监控
    	templateUrl:basepath+'toGsywssjk',
    	controller:'gsywssjkCtrl'
    	})
    .when('/scztxxzl',{//市场主体信息总览
    	templateUrl:basepath+'toScztxxzl',
    	controller:'scztxxzlCtrl'
    	})
    .when('/scztfzfx',{//市场主体发展分析
    	templateUrl:basepath+'toScztfzfx',
    	controller:'scztfzfxCtrl'
    	})
    .when('/scztzsfx',{//市场主体走势分析
    	templateUrl:basepath+'toScztzsfx',
    	controller:'scztzsfxCtrl'
    	})
    .when('/scztfzfbt',{//市场主体发展分布图
    	templateUrl:basepath+'toScztfzfbt',
    	controller:'scztfzfbtCtrl'
    	})
    .when('/scztnljgfb',{//市场主体年龄结构分布
    	templateUrl:basepath+'toScztnljgfb',
    	controller:'scztnljgfbCtrl'
    	})
    .when('/scztzjlyfx',{//市场主体资金来源（国内）分析
    	templateUrl:basepath+'toScztzjlyfx',
    	controller:'scztzjlyfxCtrl'
    	})
    .when('/scztzjlyjwfx',{//市场主体资金来源（境外）分析
    	templateUrl:basepath+'toScztzjlyjwfx',
    	controller:'scztzjlyjwfxCtrl'
    	})
    .when('/scztryhlfx',{//市场主体人员活力分析
    	templateUrl:basepath+'toScztryhlfx',
    	controller:'scztryhlfxCtrl'
    	})
    .when('/scztnbzj',{//市场主体年报总结
    	templateUrl:basepath+'toScztnbzj',
    	controller:'scztnbzjCtrl'
    	})
    .when('/zfbasjfx',{//执法办案数据分析
    	templateUrl:basepath+'toZfbasjfx',
    	controller:'zfbasjfxCtrl'
    	})
    .when('/xbwqrdgz',{//消保维权热点关注
    	templateUrl:basepath+'toXbwqrdgz',
    	controller:'xbwqrdgzCtrl'
    	})
    .when('/fwfzztfx',{//服务发展专题分析
    	templateUrl:basepath+'toFwfzztfx',
    	controller:'fwfzztfxCtrl'
    	})
    .when('/qxfgdjfx',{//非公党建分析
    	templateUrl:basepath+'toQxfgdjfx',
    	controller:'qxfgdjfxCtrl'
    	})
    .when('/sxjjfzfx',{//四新经济发展分析
    	templateUrl:basepath+'toSxjjfzfx',
    	controller:'sxjjfzfxCtrl'
    	})
    .otherwise({redirectTo:'/'});//其他
}]);
/**统一设置统计图的操作方法**/
indexApp.factory('ChartService',['$http',function($http){
	var chart = {};
	//初始化图表
	chart.init = function(id,option){
		var tempEcharts = echarts.init(document.getElementById(id));
		tempEcharts.setOption(option);
		return tempEcharts;
	};
	//获取chart的值并通过回调函数赋值
	chart.setData = function(url,successCallback1){
		$http({
	        method: 'GET',
	        url: basepath+url
	    }).then(function successCallback(response) {
	    		if('SUCCESS_0001'==response.data.code){
	    			successCallback1(response.data);
	    		}else{
	    			console.log(url+"获取数据失败:"+JSON.stringify(response));
	    		}
	        }, function errorCallback(response) {
	            // 请求失败执行代码
	        	console.log(url+"获取数据失败:"+JSON.stringify(response));
	    });
	}
	return chart;
}]);
//首页Controller
indexApp.controller("indexCtrl",['$scope','$location','$interval',function($scope,$location,$interval){
	$scope.pages = ['/gsywssjk','/scztxxzl','/scztfzfx','/scztzsfx','/scztfzfbt','/scztnljgfb','/scztzjlyfx','/scztzjlyjwfx','/scztryhlfx','/scztnbzj','/zfbasjfx','/xbwqrdgz','/fwfzztfx','/qxfgdjfx','/sxjjfzfx'];
	$scope.curr_page = '';//初始化
	//页面跳转
	$scope.forwardTo = function(path){
		if("/"==path){
			$scope.stop();
		}
		var curr_index = '';
		var next_index = '';
		angular.forEach($scope.pages,function(data,index){
			if($scope.curr_page==data){
				curr_index = index;
			}
			if(path==data){
				next_index = index;
			}
		});
		if(next_index>=curr_index){
			$scope.pageClass = 'page-right';
		}else{
			$scope.pageClass = 'page-left';
		}
		$location.path(path);
		$scope.curr_page = path;
	}
	//上一页
	$scope.previousTo = function(){
		//获取上一页path
		var curr_index = '';
		angular.forEach($scope.pages,function(data,index){
			if($scope.curr_page==data){
				curr_index = index;
			}
		});
		if(curr_index!==''){
			if(curr_index>0){
				$scope.forwardTo($scope.pages[curr_index-1]);
			}else{
				$scope.forwardTo($scope.pages[$scope.pages.length-1]);
			}
		}
	}
	//下一页
	$scope.nextTo = function(){
		//获取下一页path
		var curr_index = '';
		angular.forEach($scope.pages,function(data,index){
			if($scope.curr_page==data){
				curr_index = index;
			}
		});
		if(curr_index!==''){
			if((curr_index+1)<$scope.pages.length){
				$scope.forwardTo($scope.pages[curr_index+1]);
			}else{
				$scope.forwardTo($scope.pages[0]);
			}
		}
	}
	//定时器
	$scope.interval_page = '';
	//开始播放
	$scope.play = function(){
		$('#play').hide();
		$('#stop').show();
		console.log("启动自动播放");
		$scope.interval_page = $interval(function(){
			console.log("自动播放切换"+(new Date()).toLocaleTimeString());
			$scope.nextTo();
		},30*1000);
	}
	//停止播放
	$scope.stop = function(){
		$('#play').show();
		$('#stop').hide();
		console.log("关闭自动播放");
		$interval.cancel($scope.interval_page);
	}
	
}]);