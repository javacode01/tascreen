<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
.ztlbfzfx-round1 {
	position:absolute;
	top:10%;
	left:20%;
	width:50%;
	height:0;
	text-align:left;
	padding-top:10%;
	padding-left:15%;
	padding-bottom: 40%;
	border-radius: 50%;
	background-color: #FF6C0D;
	color:#00E1FC;
	font-size:14px;
	font-weight: bold;
}
.ztlbfzfx-round2 {
	position:absolute;
	top:40%;
	right:25%;
	width:30%;
	height:0;
	padding-bottom: 30%;
	border-radius: 50%;
	background-color: #091C46;
}
.ztlbfzfx-round3 {
	margin:5%;
	width:90%;
	height:0;
	padding-top:10%;
	padding-left:5%;
	padding-bottom: 80%;
	border-radius: 50%;
	background-color: #0699EF;
	color:#00E1FC;
	font-size:14px;
	font-weight: bold;
}
.ztlbfzfx-label {
	position:absolute;
	bottom:0;
	width:90%;
	height:14%;
	padding-top:1%;
	background-color: #006699;
	color:#00E1FC;
	margin-left:5%;
	font-size:14px;
	font-weight: bold;
}
.scztfzfx-page-table {
	color:#00E1FC;
	text-align: center;
}
.scztfzfx-page-table>tbody>tr>td, .scztfzfx-page-table>tbody>tr>th, .scztfzfx-page-table>tfoot>tr>td, .scztfzfx-page-table>tfoot>tr>th, .scztfzfx-page-table>thead>tr>td, .scztfzfx-page-table>thead>tr>th {
    padding: 2px 5px;
    line-height: 1;
    vertical-align: middle;
    border-top: none;
    border-bottom: 0px solid #3092E7;
}
-->
</style>
<div class="container-fluid" style="height:100%;min-height:768px;">
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			市场主体发展分析
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="height:100%;">
		<div class="col-lg-6 page-content-col">
			<div class="page-box" style="height:41.4%;">
				<div class="page-box-title-left">期末主体发展-主体数量</div>
				<div id="qmztfzqs_ztsl" style="height:100%;"></div>
			</div>
			<div class="page-box" style="height:41.4%;">
				<div class="page-box-title-left">期末主体发展-注册资金</div>
				<div id="qmztfzqs_zczj" style="height:100%;"></div>
			</div>
		</div>
		<div class="col-lg-6 page-content-col">
			<div class="page-box" style="height:24%;">
				<div class="page-box-title-left">主体同比增加量排行榜</div>
				<div class="page-box-lable-right font-style">【{{nd}}年度】</div>
				<div id="zttbzz_qy" style="height:100%;width:33%;display:inline-block;margin-left:0.5%;"></div
				><div id="zttbzz_gt" style="height:100%;width:33%;display:inline-block;"></div
				><div id="zttbzz_nz" style="height:100%;width:33%;display:inline-block;margin-right:0.5%;"></div>
			</div>
			<div class="page-box" style="height:26%;">
				<div class="page-box-title-left">主体类别发展分析</div>
				<div id="zttbzz_qy" style="position:relative;height:100%;width:33%;text-align:center;display:inline-block;margin-left:0.5%;">
					<div class="ztlbfzfx-round1">
						{{ztlbfzfxQyData.value}}<br/>(户)
					</div>
					<div class="ztlbfzfx-round2">
						<div class="ztlbfzfx-round3">
							同比<br/>+{{ztlbfzfxQyData.tb}}%
						</div>
					</div>
					<div class="ztlbfzfx-label">
						企业
					</div>
				</div
				><div id="zttbzz_gt" style="position:relative;height:100%;width:33%;text-align:center;display:inline-block;">
					<div class="ztlbfzfx-round1">
						{{ztlbfzfxGtData.value}}<br/>(户)
					</div>
					<div class="ztlbfzfx-round2">
						<div class="ztlbfzfx-round3">
							同比<br/>+{{ztlbfzfxGtData.tb}}%
						</div>
					</div>
					<div class="ztlbfzfx-label">
						个体
					</div>
				</div
				><div id="zttbzz_nz" style="position:relative;height:100%;width:33%;text-align:center;display:inline-block;margin-right:0.5%;">
					<div class="ztlbfzfx-round1">
						{{ztlbfzfxNzData.value}}<br/>(户)
					</div>
					<div class="ztlbfzfx-round2">
						<div class="ztlbfzfx-round3">
							同比<br/>+{{ztlbfzfxNzData.tb}}%
						</div>
					</div>
					<div class="ztlbfzfx-label">
						农专
					</div>
				</div>
			</div>
			<div class="page-box" style="height:27%;">
				<div class="page-box-title-right">行业同比增长量TOP5</div>
				<div class="page-box-lable-left font-style">【{{nd}}年度】</div>
				<div style="height:100%;padding:5% 2% 0 2%;">
					<table class="table scztfzfx-page-table font-style" style="height:100%;">
						<tbody>
							<tr>
								<td style="width:50%;background-color:#074E82;border-right:2px solid #091C46;">行业类型</td>
								<td style="width:25%;background-color:#0A769D;">存量户数</td>
								<td style="width:25%;background-color:#074E82;border-left:2px solid #091C46;">同比增长率</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in hytbzzlData">
								<td>{{data.name}}</td>
								<td>{{data.value}}</td>
								<td>{{data.tb}}%</td>
					      	</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>