<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
.qxfgdjfx-page-table {
	color:#00E1FC;
	text-align: center;
	height:100%;
}
.qxfgdjfx-page-table>tbody>tr>td, .qxfgdjfx-page-table>tbody>tr>th, .qxfgdjfx-page-table>tfoot>tr>td, .qxfgdjfx-page-table>tfoot>tr>th, .qxfgdjfx-page-table>thead>tr>td, .qxfgdjfx-page-table>thead>tr>th {
    padding: 5px;
    line-height: 1.42857143;
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
			非公党建分析
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="height:46%;">
		<div class="col-lg-6 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">【{{nd}}】全市党组织建设情况总览</div>
				<div style="display:inline-block;width:25%;height:100%;">
					<div id="qsdzzjszl_dw" style="height:100%;"></div>
				</div
				><div style="display:inline-block;width:25%;height:100%;">
					<div id="qsdzzjszl_dzz" style="height:100%;"></div>
				</div
				><div style="display:inline-block;width:25%;height:100%;">
					<div id="qsdzzjszl_dzb" style="height:100%;"></div>
				</div
				><div style="display:inline-block;width:25%;height:100%;">
					<div id="qsdzzjszl_dy" style="height:100%;"></div>
				</div>
			</div>
		</div>
		<div class="col-lg-6 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">【{{nd}}】各区县党组织建设情况总览</div>
				<div id="gqxdzzjszl" style="height:100%;"></div>
			</div>
		</div>
	</div>
	<div class="row page-content-multiple" style="height:43%;">
		<div class="col-lg-3 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">党组织建设排行榜</div>
				<div style="height:100%;padding:10% 5% 10% 5%;">
					<table class="table qxfgdjfx-page-table font-style">
						<tbody>
					      	<tr ng-repeat="data in dzzphbData">
								<td>
									<img ng-if="data.seq==1" src="resource/img/qxfgdjfx/pm1.png" style="width:26px;height:32px;"/>
									<img ng-if="data.seq==2" src="resource/img/qxfgdjfx/pm2.png" style="width:26px;height:32px;"/>
									<img ng-if="data.seq==3" src="resource/img/qxfgdjfx/pm3.png" style="width:26px;height:32px;"/>
									<span ng-if="data.seq>3">{{data.seq}}</span>
								</td>
								<td>{{data.name}}</td>
								<td>{{data.value}}</td>
					      	</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="col-lg-3 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">党组织增长趋势</div>
				<div id="dzzzzqs" style="width:100%;height:100%;"></div>
			</div>
		</div>
		<div class="col-lg-3 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">党员人数排行榜</div>
				<div style="height:100%;padding:10% 5% 10% 5%;">
					<table class="table qxfgdjfx-page-table font-style">
						<tbody>
					      	<tr ng-repeat="data in dyrsphbData">
								<td>
									<img ng-if="data.seq==1" src="resource/img/qxfgdjfx/pm1.png" style="width:26px;height:32px;"/>
									<img ng-if="data.seq==2" src="resource/img/qxfgdjfx/pm2.png" style="width:26px;height:32px;"/>
									<img ng-if="data.seq==3" src="resource/img/qxfgdjfx/pm3.png" style="width:26px;height:32px;"/>
									<span ng-if="data.seq>3">{{data.seq}}</span>
								</td>
								<td>{{data.name}}</td>
								<td>{{data.value}}</td>
					      	</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="col-lg-3 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">党员人数增长趋势</div>
				<div id="dyrszzqs" style="width:100%;height:100%;"></div>
			</div>
		</div>
	</div>
</div>