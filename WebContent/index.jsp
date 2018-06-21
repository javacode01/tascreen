<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/" var="basepath"></c:url>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>泰安大屏</title>
    <link rel="stylesheet" href="${basepath}resource/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${basepath}resource/bower_components/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" href="${basepath}resource/css/tascreen.css">
    <style type="text/css">
	    /* ANIMATIONS
		============================================================================= */
		
		/* slide out from the left */
		@keyframes slideOutLeft {
		    to      { transform: translateX(-100%); }
		}
		
		/* entering animations --------------------------------------- */
		/* slide in from the right */
		@keyframes slideInRight {
		    from    { transform:translateX(100%); }
		    to      { transform: translateX(0); }
		}
		
		/* slide in from the left */
		@keyframes slideInLeft {
		    from    { transform:translateX(-100%); }
		    to      { transform: translateX(0%); }
		}
		
		/* slide in from the bottom */
		@keyframes slideInUp {
		    from    { transform:translateY(100%); }
		    to      { transform: translateY(0); }
		}
		/* slide in from the top */
		@keyframes slideInDown {
		    from    { transform:translateY(-100%); }
		    to      { transform: translateY(0); }
		}
		/* page style -------------------------*/
		.page {
			position:absolute;
			top:0px;
			left:0px;
			right:0px;
			bottom:0px;
			z-index:90;
			background:url(${basepath}resource/img/index_bg2.png) no-repeat;
			background-size: 100% 100%;
			overflow-x:hidden;
			overflow-y:auto;
		}
		/* page specific animations ------------------------ */
		.page-right.ng-enter { animation:slideInRight 0.5s both ease-in;}
		.page-left.ng-enter { animation:slideInLeft 0.5s both ease-in;}
		.page-down.ng-enter { animation:slideInDown 0.5s both ease-in;}
		.page.ng-leave { z-index:-1;animation:0.5s both ease-in; }
		
		/**定义宽度高度，隐藏滚动条**/
		html,body{
			width:100%;
		  	height:100%;
			overflow-x:hidden;
		}
		.page-main {
			background:url(${basepath}resource/img/main/main_bg.png) no-repeat;
			background-size: 100% 100%;
			z-index:100;
		}
		.page-zjly {
			background:url(${basepath}resource/img/index_bg2.png) no-repeat;
			background-size: 100% 100%;
			z-index:90;
		}
    </style>
    <script type="text/javascript">
    	var basepath = "${basepath}";
    	var first_load = true;
    	//var colorList = ['#00468C','#389BB7','#009ACD','#4169E1','#6495ED','#87CEFA','#AFEEEE','#4682B4','#1E90FF','#00BFFF','#87CEEB','#87CEFA','#B0E0E6','#00CED1','#48D1CC','#40E0D0','#66CDAA','#1E90FF','#4169E1','#00BFFF'];
    	var colorList = ['#00BF64','#0699EF','#FF6C0D','#FEB828','#038A8E','#FF1400','#FEEC2F','#CD05D3','#09FFFF','#990066','#FFCC00','#CC0033','#FFCC33','#333399','#FF0033','#666699','#FFFF00','#006699','#FFFF33','#009999','#CC3366','#CCCC00','#FF9933','#663399','#336699','#CC3333','#FFCCCC','#99CC00','#003399','#FF6600'];
    	//var colorList = ['#FFCC99','#FFFF99','#99CC99','#CCFFCC','#FFCC99','#CCFF99','#CCCCCC','##CCCC00','#999966','#FFFFCC','#CCCC33','#336699','#CCCC33','#999999','#CCFFFF','#00CC00','#0066CC','#99CCCC','#99CC33','#FF9900','#FFCC00','#99CC33','#CCCCFF','#663300'];
    </script>
  </head>
  <body ng-app="indexApp" ng-controller="indexCtrl">
  	<div class="left-main">
  		<img width="30px" height="30px" src="${basepath}resource/img/main.png" ng-click="forwardTo('/')">
  	</div>
  	<div class="right-main">
  		<img id="play" width="15px" height="20px" src="${basepath}resource/img/play.png" ng-click="play()">
  		<img id="stop" width="20px" height="20px" src="${basepath}resource/img/stop.png" ng-click="stop()" style="display:none;">
  		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  		<img width="30px" height="30px" src="${basepath}resource/img/main.png" ng-click="forwardTo('/')">
  	</div>
  	<div class="left-forward">
  		<button type="button" class="btn btn-default cus-button-forward" ng-click="previousTo()"><img width="50px" height="50px" src="${basepath}resource/img/previous.png"></button>
  	</div>
  	<div class="right-forward">
  		<button type="button" class="btn btn-default cus-button-forward" ng-click="nextTo()"><img width="50px" height="50px" src="${basepath}resource/img/next.png"></button>
  	</div>
  	<div class="bottom-navigation">
  		<button type="button" class="btn btn-default cus-button-navigation"  ng-repeat="page in pages" ng-click="forwardTo(page)" ng-class="{'cus-button-navigation-selected':page==curr_page}"></button>
  	</div>
    <div class="page {{pageClass}} {{customPageClass}}" ng-view>
    </div>
	<script src="${basepath}resource/bower_components/jquery/dist/jquery.min.js"></script>
	<script src="${basepath}resource/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="${basepath}resource/bower_components/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
	<script src="${basepath}resource/bower_components/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script src="${basepath}resource/js/angular.min.js"></script>
	<script src="${basepath}resource/js/angular-route.min.js"></script>
	<script src="${basepath}resource/js/angular-animate.min.js"></script>
	<script src="${basepath}resource/js/echarts.js"></script>
	<script src="${basepath}resource/js/china.js"></script>
	<script src="${basepath}resource/js/taian.js"></script>
	<script src="${basepath}resource/js/world.js"></script>
	<script src="${basepath}index.js"></script>
	<script src="${basepath}jsp/tascreen/chinamap.js"></script>
	<script src="${basepath}jsp/tascreen/taianmap.js"></script>
	<script src="${basepath}jsp/tascreen/worldmap.js"></script>
	<script src="${basepath}jsp/tascreen/main.js"></script>
	<script src="${basepath}jsp/tascreen/gsywssjk.js"></script>
	<script src="${basepath}jsp/tascreen/scztxxzl.js"></script>
	<script src="${basepath}jsp/tascreen/scztfzfx.js"></script>
	<script src="${basepath}jsp/tascreen/scztzsfx.js"></script>
	<script src="${basepath}jsp/tascreen/scztfzfbt.js"></script>
	<script src="${basepath}jsp/tascreen/scztnljgfb.js"></script>
	<script src="${basepath}jsp/tascreen/scztzjlyfx.js"></script>
	<script src="${basepath}jsp/tascreen/scztzjlyjwfx.js"></script>
	<script src="${basepath}jsp/tascreen/scztryhlfx.js"></script>
	<script src="${basepath}jsp/tascreen/scztnbzj.js"></script>
	<script src="${basepath}jsp/tascreen/zfbasjfx.js"></script>
	<script src="${basepath}jsp/tascreen/xbwqrdgz.js"></script>
	<script src="${basepath}jsp/tascreen/fwfzztfx.js"></script>
	<script src="${basepath}jsp/tascreen/qxfgdjfx.js"></script>
	<script src="${basepath}jsp/tascreen/sxjjfzfx.js"></script>
  </body>
</html>