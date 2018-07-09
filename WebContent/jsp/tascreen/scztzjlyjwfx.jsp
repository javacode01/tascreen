<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
.zjly-page-table {
	color:#00E1FC;
	text-align: center;
}
.zjly-page-table>tbody>tr>td, .zjly-page-table>tbody>tr>th, .zjly-page-table>tfoot>tr>td, .zjly-page-table>tfoot>tr>th, .zjly-page-table>thead>tr>td, .zjly-page-table>thead>tr>th {
    padding: 5px;
    line-height: 1.42857143;
    vertical-align: top;
    border-top: none;
    border-bottom: 1px solid #3092E7;
}
.zjly-page-table>thead>tr>th {
    vertical-align: bottom;
    border-bottom: 1px solid #3092E7;
    text-align: center;
}
.zjly-page-table-caption {
	padding-top: 8px;
    padding-bottom: 15px;
    color: #3092E7;
    text-align: center;
    font-size:16px;
}
-->
</style>
<div class="container-fluid" style="height:100%;min-height:768px;">
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			市场主体资金来源（境外）分析
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="padding-right:60px;height:100%;">
		<div class="col-lg-8" style="height:100%;padding:0px;">
			<div id="wlzjqk" style="height:100%;width:100%;"></div>
		</div>
		<div class="col-lg-4" style="height:100%;padding:0px;">
			<div class="row" style="height:40%;">
				<div class="col-lg-12" style="padding:0px;height:100%;">
					<div id="jwtzph" style="height:100%;"></div>
				</div>
			</div>
			<div class="row" style="height:60%;padding-top:20px;">
				<div class="col-lg-6" style="height:100%;padding:0px;">
					<table class="table table-condensed zjly-page-table font-style">
						<tbody>
							<tr>
								<td style="width:20%;">序号</td>
								<td style="width:55%;">国家</td>
								<td style="width:25%;">{{title}}</td>
					      	</tr>
					      	<tr ng-repeat="data in jwtzphTableData1">
						      	<td>{{data.seq}}</td>
						      	<td>{{data.name}}</td>
						      	<td>{{data.value}}</td>
					      	</tr>
						</tbody>
					</table>
				</div>
				<div class="col-lg-6" style="height:100%;padding:0px;">
					<table class="table table-condensed zjly-page-table font-style">
						<tbody>
							<tr>
								<td style="width:20%;">序号</td>
								<td style="width:55%;">国家</td>
								<td style="width:25%;">{{title}}</td>
					      	</tr>
					      	<tr ng-repeat="data in jwtzphTableData2">
						      	<td>{{data.seq}}</td>
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