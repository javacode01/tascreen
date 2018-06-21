<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
.xbwqrdgz-div{
	height:100%;
	display:inline-block;
	vertical-align: middle;
	padding:2% 0 6% 0;
	color:#00E1FC;
	text-align: center;
}
.xbwqrdgz-jbwtfx {
	width:30%;
	height:90%;
	background-color: #064D82;
	margin:0px 1.5%;
	display:inline-block;
	vertical-align: middle;
	text-align: left;
	padding:5px 10px;
	color:#00E1FC;
}
.xbwqrdgz-jbwtfx img {
	width:29%;
	height:86%;
	display: inline-block;
	vertical-align: middle;
}
.xbwqrdgz-jbwtfx div {
	width:65%;
	margin-left:2%;
	height:100%;
	background-color: #133255;
	display: inline-block;
	vertical-align: middle;
	text-align: center;
	font-size:16px;
}
.xbwqrdgz-page-table {
	color:#00E1FC;
	text-align: center;
	height:100%;
}
.xbwqrdgz-page-table>tbody>tr>td, .xbwqrdgz-page-table>tbody>tr>th, .xbwqrdgz-page-table>tfoot>tr>td, .xbwqrdgz-page-table>tfoot>tr>th, .xbwqrdgz-page-table>thead>tr>td, .xbwqrdgz-page-table>thead>tr>th {
    padding: 5px;
    line-height: 1;
    vertical-align: middle;
    border-top: none;
}
-->
</style>
<div class="container-fluid" style="height:100%;min-height:768px;">
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			消费维权热点关注
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="height:46%;">
		<div class="col-lg-7 page-content-col">
			<div class="page-box">
				<div style="height:20%;padding-top:1%;color:#00E1FC;font-size:29px;padding-left:50px;">
					本年度受理量&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font style="color:#FF6C0D;">{{xfwqzlData.bqzs}}</font>
				</div>
				<div style="width:33%;height:80%;display:inline-block;vertical-align: middle;text-align: center;padding:2% 6.25%;">
					<div style="width:100%;padding:30% 0;border-radius: 50%;border:10px solid #4F7AB1;text-align: center;">
						<div style="font-size:18px;font-weight:bold;color:#00E1FC;height:20%;">投诉</div>
						<div style="font-size:14px;font-weight:bold;color:#00E1FC;height:20%;">本年度：{{xfwqzlData.bqts}}</div>
					</div>
				</div
				><div style="width:33%;height:80%;display:inline-block;vertical-align: middle;text-align: center;padding:2% 6.25%;">
					<div style="width:100%;padding:30% 0;border-radius: 50%;border:10px solid #D15C29;text-align: center;">
						<div style="font-size:18px;font-weight:bold;color:#00E1FC;height:20%;">举报</div>
						<div style="font-size:14px;font-weight:bold;color:#00E1FC;height:20%;">本年度：{{xfwqzlData.bqjb}}</div>
					</div>
				</div
				><div style="width:33%;height:80%;display:inline-block;vertical-align: middle;text-align: center;padding:2% 6.25%;">
					<div style="width:100%;padding:30% 0;border-radius: 50%;border:10px solid #3FAA71;text-align: center;">
						<div style="font-size:18px;font-weight:bold;color:#00E1FC;height:20%;">咨询</div>
						<div style="font-size:14px;font-weight:bold;color:#00E1FC;height:20%;">本年度：{{xfwqzlData.bqzx}}</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-lg-5 page-content-col">
			<div class="page-box" style="padding-top:5px;">
				<div style="width:49%;height:100%;padding:0 0 0 2%;display:inline-block;">
					<table class="table xbwqrdgz-page-table font-style">
						<tbody>
							<tr>
								<td style="width:20%;background-color:#074E82;border-right:2px solid #091C46;">排名</td>
								<td style="width:40%;background-color:#0A769D;">区县</td>
								<td style="width:40%;background-color:#074E82;border-left:2px solid #091C46;">投诉数量</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in gqxtsjbTsData">
								<td>{{$index+1}}</td>
								<td>{{data.NAME}}</td>
								<td>{{data.VALUE}}</td>
					      	</tr>
						</tbody>
					</table>
				</div>
				<div style="width:49%;height:100%;padding:0 2% 0 0%;display:inline-block;">
					<table class="table xbwqrdgz-page-table font-style">
						<tbody>
							<tr>
								<td style="width:20%;background-color:#074E82;border-right:2px solid #091C46;">排名</td>
								<td style="width:40%;background-color:#0A769D;">区县</td>
								<td style="width:40%;background-color:#074E82;border-left:2px solid #091C46;">举报数量</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in gqxtsjbJbData">
								<td>{{$index+1}}</td>
								<td>{{data.NAME}}</td>
								<td>{{data.VALUE}}</td>
					      	</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div class="row page-content-multiple" style="height:43%;">
		<div class="col-lg-8 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">投诉问题分析</div>
				<div style="width:60%;height:100%;padding:3% 0 0 2%;display:inline-block;">
					<table class="table xbwqrdgz-page-table font-style">
						<tbody>
							<tr>
								<td style="width:20%;background-color:#074E82;border-right:2px solid #091C46;">排名</td>
								<td style="width:50%;background-color:#0A769D;">商品(共{{tswtfxSpData.zj}}件)</td>
								<td style="width:30%;background-color:#074E82;border-left:2px solid #091C46;">投诉数量</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in tswtfxSpData.list">
								<td>{{$index+1}}</td>
								<td>{{data.name}}</td>
								<td>{{data.value}}</td>
					      	</tr>
						</tbody>
					</table>
				</div
				><div style="width:40%;height:100%;padding:3% 2% 0 0;display:inline-block;">
					<table class="table xbwqrdgz-page-table font-style">
						<tbody>
							<tr>
								<td style="width:60%;background-color:#0A769D;border-left:1px solid #091C46;">服务(共{{tswtfxFwData.zj}}件)</td>
								<td style="width:40%;background-color:#074E82;border-left:2px solid #091C46;">投诉数量</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in tswtfxFwData.list">
								<td>{{data.name}}</td>
								<td>{{data.value}}</td>
					      	</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="col-lg-4 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">举报问题分析</div>
				<div style="height:35%;width:100%;padding-top:30px;">
					<div class="xbwqrdgz-jbwtfx">
						<img src="resource/img/gsywssjk/qy.png">
						<div>
							{{jbwtfxZt.slsl}}件<br/>
							<font style="font-size:12px;">受理数量</font>
						</div>
					</div
					><div class="xbwqrdgz-jbwtfx">
						<img src="resource/img/gsywssjk/gt.png">
						<div>
							{{jbwtfxZt.jasl}}件<br/>
							<font style="font-size:12px;">结案数量</font>
						</div>
					</div
					><div class="xbwqrdgz-jbwtfx">
						<img src="resource/img/gsywssjk/nz.png">
						<div>
							{{jbwtfxZt.lasl}}件<br/>
							<font style="font-size:12px;">立案数量</font>
						</div>
					</div>
				</div>
				<div id="jbwtfx" style="height:65%;"></div>
			</div>
		</div>
	</div>
</div>