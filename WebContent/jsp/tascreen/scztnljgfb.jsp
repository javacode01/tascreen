<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
.ssztnljgfx-navigation {
	background-color:#050E23;
	color:#00E1FC;
	height:30px;
	width:60px;
	text-align: center;
	display:inline-block;
	line-height: 30px;
}
.ssztnljgfx-navigation-selected {
	background-color:#3D4E71;
}
.ssztnljgfx-page-table {
	color:#00E1FC;
	text-align: center;
	height:100%;
}
.ssztnljgfx-page-table>tbody>tr>td, .ssztnljgfx-page-table>tbody>tr>th, .ssztnljgfx-page-table>tfoot>tr>td, .ssztnljgfx-page-table>tfoot>tr>th, .ssztnljgfx-page-table>thead>tr>td, .ssztnljgfx-page-table>thead>tr>th {
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
			市场主体年龄结构分布
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="height:44%;">
		<div class="col-lg-7 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left" style="font-size:20px;">企业年龄占比</div>
				<div class="row" style="height:100%;">
					<div class="col-lg-3" style="height:100%;">
						<div id="qynlzb_zt" style="height:100%;"></div>
					</div>
					<div class="col-lg-3" style="height:100%;">
						<div id="qynlzb_qy" style="height:100%;"></div>
					</div>
					<div class="col-lg-3" style="height:100%;">
						<div id="qynlzb_nz" style="height:100%;"></div>
					</div>
					<div class="col-lg-3" style="height:100%;">
						<div id="qynlzb_gt" style="height:100%;"></div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-lg-5 page-content-col">
			<div class="page-box">
				<div class="page-box-title-right">长寿企业追踪分析</div>
				<div id="csqyzzfx" style="height:100%;"></div>
			</div>
		</div>
	</div>
	<div class="row page-content-multiple" style="height:44%;">
		<div class="col-lg-3 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">5年以下行业排行TOP5</div>
				<div style="height:100%;padding:10% 5% 10% 5%;">
					<table class="table ssztnljgfx-page-table font-style">
						<tbody>
							<tr>
								<td style="width:17%;background-color:#074E82;border-right:2px solid #091C46;">排名</td>
								<td style="width:50%;background-color:#0A769D;">行业</td>
								<td style="width:33%;background-color:#074E82;border-left:2px solid #091C46;">主体数量</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in top0Data">
								<td>{{$index+1}}</td>
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
				<div class="page-box-title-left">5-10年行业排行TOP5</div>
				<div style="height:100%;padding:10% 5% 10% 5%;">
					<table class="table ssztnljgfx-page-table font-style">
						<tbody>
							<tr>
								<td style="width:17%;background-color:#074E82;border-right:2px solid #091C46;">排名</td>
								<td style="width:50%;background-color:#0A769D;">行业</td>
								<td style="width:33%;background-color:#074E82;border-left:2px solid #091C46;">主体数量</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in top5Data">
								<td>{{$index+1}}</td>
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
				<div class="page-box-title-left">10-20年行业排行TOP5</div>
				<div style="height:100%;padding:10% 5% 10% 5%;">
					<table class="table ssztnljgfx-page-table font-style">
						<tbody>
							<tr>
								<td style="width:17%;background-color:#074E82;border-right:2px solid #091C46;">排名</td>
								<td style="width:50%;background-color:#0A769D;">行业</td>
								<td style="width:33%;background-color:#074E82;border-left:2px solid #091C46;">主体数量</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in top10Data">
								<td>{{$index+1}}</td>
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
				<div class="page-box-title-left">20年以上行业排行TOP5</div>
				<div style="height:100%;padding:10% 5% 10% 5%;">
					<table class="table ssztnljgfx-page-table font-style">
						<tbody>
							<tr>
								<td style="width:17%;background-color:#074E82;border-right:2px solid #091C46;">排名</td>
								<td style="width:50%;background-color:#0A769D;">行业</td>
								<td style="width:33%;background-color:#074E82;border-left:2px solid #091C46;">主体数量</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;" ng-repeat="data in top20Data">
								<td>{{$index+1}}</td>
								<td>{{data.name}}</td>
								<td>{{data.value}}</td>
					      	</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>