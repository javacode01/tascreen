<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
.scztxxzl-title {
	width:100%;
	padding-left:10px;
	height:30px;
	color:#00E1FC;
	font-size:16px;
	font-weight:bold;
	text-align: left;
	background-color: #013672;
	line-height: 30px;
	margin-bottom: 15px;
}
.zl_div {
	position:absolute;
	width:15%;
	text-align: center;
	border:2px solid #013672;
	padding-bottom:15px;
}
.font-span {
	color:#9FEF7D;
	font-size:16px;
	font-weight: bold;
}
.pie-div{
	height:32%;
	width:100%;
	margin:1% 0;
	border:2px solid #013672;
}
.scztxxzl-page-table {
	color:#00E1FC;
	text-align: center;
}
.scztxxzl-page-table>tbody>tr>td, .scztxxzl-page-table>tbody>tr>th, .scztxxzl-page-table>tfoot>tr>td, .scztxxzl-page-table>tfoot>tr>th, .scztxxzl-page-table>thead>tr>td, .scztxxzl-page-table>thead>tr>th {
    padding: 5px;
    line-height: 1.42857143;
    vertical-align: middle;
    border-top: none;
}
.tbjt_div {
	position:absolute;
	top:50%;
	right:15%;
	width:25px;
	height:25px;
	animation:tbjt_show 1000ms infinite;
	background: url(resource/img/scztxxzl/tbjt.png) no-repeat;
	background-size: 100% 100%;
}
@keyframes tbjt_show {
    from    { transform:translateY(60%);}
    to      { transform: translateY(0);}
}
-->
</style>
<div class="container-fluid" style="height:100%;min-height:768px;color:#00E1FC;">
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			市场主体信息总览
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="height:100%;padding-bottom:20px;">
		<!-- 左侧主要区域 -->
		<div class="col-lg-9" style="position:relative;height:100%;padding-right:0px;">
			<div class="zl_div" style="top:5%;left:15px;">
				<div class="scztxxzl-title font-style">期末数量</div>
				<font class="font-span">{{zslData.qmsl}}</font>户
			</div>
			<div class="zl_div" style="top:5%;left:20%;">
				<div class="scztxxzl-title font-style">同比增长</div>
				<font class="font-span">{{zslData.tbzz}}</font>%
				<div class="tbjt_div"></div>
			</div>
			<div class="zl_div" style="top:20%;left:15px;">
				<div class="scztxxzl-title font-style">去年同期</div>
				<font class="font-span">{{zslData.qnsl}}</font>户
			</div>
			<div style="position: absolute;right:20px;width:29%;top:5%;">
				<table class="table scztxxzl-page-table font-style">
					<tbody>
						<tr>
							<td style="width:20%;">排名</td>
							<td style="width:40%;">区县</td>
							<td style="width:40%;">主体数量</td>
				      	</tr>
				      	<tr ng-repeat="data in qxpmData">
							<td>{{$index+1}}</td>
							<td>{{data.name}}</td>
							<td>{{data.value}}</td>
				      	</tr>
					</tbody>
				</table>
			</div>
			<!-- 泰安地图 -->
			<div id="gqxztsl" style="width:100%;height:80%;"></div>
			<!-- 折线图 -->
			<div id="ztzzqs" style="width:100%;height:20%;"></div>
		</div>
		<!-- 右侧饼状图区域 -->
		<div class="col-lg-3" style="height:100%;padding-left:0px;padding-top:2%;">
			<div class="pie-div" id="cyfb"></div>
			<div class="pie-div" id="lxfb"></div>
			<div class="pie-div" id="gmfb"></div>
		</div>
	</div>
</div>