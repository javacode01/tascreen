<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
.scztzsfx-div {
	height:100%;
	display:inline-block;
	margin:0px;
	padding:0px;
	vertical-align: top;
	position:relative;
	padding-top:1%;
}
.scztzsfx-line {
	width:5%;
	background-color:#66FFFF;
	margin:auto;
}
.scztzsfx-circular {
	width:100%;
	height:5%;
	color:#0497EC;
	background-color:#66FFFF;
	border-radius: 50%;
	text-align: center;
	margin:auto;
	padding-top:5%;
	font-size:16px;
	font-weight: bold;
}
.scztzsfx-circular1 {
	width:20%;
	padding-bottom: 20%;
	background-color:#66FFFF;
	border-radius: 50%;
	margin:auto;
}
.scztzsfx-circular1-label-left {
	position:absolute;
	height:6%;
	width:100%;
	padding:0 0 0 10%;
	color:#FF9D00;
	font-size:18px;
	font-weight: bold;
	text-align: left;
}
.scztzsfx-circular1-label-right {
	position:absolute;
	height:6%;
	width:100%;
	padding:0 10% 0 0;
	color:#FF9D00;
	font-size:18px;
	font-weight: bold;
	text-align: right;
}
.scztzsfx-circular-label {
	position:absolute;
	height:5%;
	width:80%;
	margin-left:10%;
	padding:4% 0;
	color:#00E1FC;
	font-size:16px;
	text-align: center;
	border:1px solid #99CCFF;
}
-->
</style>
<div class="container-fluid" style="height:100%;min-height:768px;min-width:1366px;padding:0px 20px;">
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			市场主体走势分析
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="page-content" style="height:100%;width:100%">
		<div class="scztzsfx-div" style="width:36%;">
			<div id="scztclzs" style="height:25%;width:100%;"></div>
			<div id="qyclzs" style="height:25%;width:100%;"></div>
			<div id="gtclzs" style="height:25%;width:100%;"></div>
			<div id="nzclzs" style="height:25%;width:100%;"></div>
		</div
		><div class="scztzsfx-div" style="width:10%;">
			<div class="scztzsfx-circular1-label-left" style="top:10%;">
				<font style="font-size:14px;">2018年6月</font>
				<div style="width:100%;height:0px;border-bottom: 1px solid #00E1FC;margin:5px 0px;"></div>
				六十二证合一
			</div>
			<div class="scztzsfx-circular1-label-left" style="top:31%;">
				<font style="font-size:14px;">2017年3月</font>
				<div style="width:100%;height:0px;border-bottom: 1px solid #00E1FC;margin:5px 0px;"></div>
				简易注销改革
			</div>
			<div class="scztzsfx-circular1-label-left" style="top:51%;">
				<font style="font-size:14px;">2016年10月</font>
				<div style="width:100%;height:0px;border-bottom: 1px solid #00E1FC;margin:5px 0px;"></div>
				五证合一
			</div>
			<div class="scztzsfx-circular1-label-left" style="top:66%;">
				<font style="font-size:14px;">2015年10月</font>
				<div style="width:100%;height:0px;border-bottom: 1px solid #00E1FC;margin:5px 0px;"></div>
				三证合一
			</div>
			<div class="scztzsfx-circular1-label-left" style="top:82%;">
				<font style="font-size:14px;">2014年3月</font>
				<div style="width:100%;height:0px;border-bottom: 1px solid #00E1FC;margin:5px 0px;"></div>
				商事制度改革
			</div>
		</div
		><div class="scztzsfx-div" style="width:8%;">
			<div class="scztzsfx-line" style="height:2%;"></div>
			<div class="scztzsfx-circular">2019年</div>
			<div class="scztzsfx-line" style="height:4%;"></div>
			<div class="scztzsfx-circular1"></div>
			<div class="scztzsfx-line" style="height:4%;"></div>
			<div class="scztzsfx-circular">2018年</div>
			<div class="scztzsfx-line" style="height:3%;"></div>
			<div class="scztzsfx-circular1"></div>
			<div class="scztzsfx-line" style="height:3%;"></div>
			<div class="scztzsfx-circular1"></div>
			<div class="scztzsfx-line" style="height:3%;"></div>
			<div class="scztzsfx-circular">2017年</div>
			<div class="scztzsfx-line" style="height:3%;"></div>
			<div class="scztzsfx-circular1"></div>
			<div class="scztzsfx-line" style="height:3%;"></div>
			<div class="scztzsfx-circular1"></div>
			<div class="scztzsfx-line" style="height:3%;"></div>
			<div class="scztzsfx-circular">2016年</div>
			<div class="scztzsfx-line" style="height:4%;"></div>
			<div class="scztzsfx-circular1"></div>
			<div class="scztzsfx-line" style="height:4%;"></div>
			<div class="scztzsfx-circular">2015年</div>
			<div class="scztzsfx-line" style="height:4%;"></div>
			<div class="scztzsfx-circular1"></div>
			<div class="scztzsfx-line" style="height:4%;"></div>
			<div class="scztzsfx-circular">2014年</div>
			<div class="scztzsfx-line" style="height:2%;"></div>
		</div
		><div class="scztzsfx-div" style="width:10%;">
			<div class="scztzsfx-circular-label" style="top:19%;">
				{{scztclData[4]}}户
			</div>
			<div class="scztzsfx-circular1-label-right" style="top:25%;">
				<font style="font-size:14px;">2017年9月</font>
				<div style="width:100%;height:0px;border-bottom: 1px solid #00E1FC;margin:5px 0px;"></div>
				五十证合一
			</div>
			<div class="scztzsfx-circular-label" style="top:40%;">
				{{scztclData[3]}}户
			</div>
			<div class="scztzsfx-circular1-label-right" style="top:46%;">
				<font style="font-size:14px;">2016年12月</font>
				<div style="width:100%;height:0px;border-bottom: 1px solid #00E1FC;margin:5px 0px;"></div>
				个体两证合一
			</div>
			<div class="scztzsfx-circular-label" style="top:60%;">
				{{scztclData[2]}}户
			</div>
			<div class="scztzsfx-circular-label" style="top:76%;">
				{{scztclData[1]}}户
			</div>
			<div class="scztzsfx-circular-label" style="top:92%;">
				{{scztclData[0]}}户
			</div>
		</div
		><div class="scztzsfx-div" style="width:36%;">
			<div id="scztzjzs" style="height:25%;width:100%;"></div>
			<div id="qyzjzs" style="height:25%;width:100%;"></div>
			<div id="gtzjzs" style="height:25%;width:100%;"></div>
			<div id="nzzjzs" style="height:25%;width:100%;"></div>
		</div>
	</div>
</div>