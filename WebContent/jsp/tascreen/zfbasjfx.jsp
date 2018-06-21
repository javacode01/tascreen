<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="container-fluid" style="height:100%;min-height:768px;">
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			执法办案数据分析
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="height:50%">
		<div class="col-lg-5 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">【{{zfband}}年度】</div>
				<div id="nd" style="height:100%;padding-top:30px;">
					<table class="table page-table font-style" style="height:100%;">
						<tbody>
						  <tr style="color:#FFFFFF;">
							<td style="width:33%;">类型</td>
							<td style="width:33%;">数量/金额</td>
							<td style="width:33%;">同比</td>
					      </tr>
					      <tr ng-repeat="data in ndData">
					      	<td>{{data.type}}</td>
					      	<td>{{data.value}}</td>
					      	<td>{{data.tb}}%</td>
					      </tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="col-lg-7 page-content-col">
			<div class="page-box">
				<div class="page-box-title-right">各区县执法数据分析</div>
				<div id="gqxzfsjfx" style="height:100%;padding-top:30px;">
					<table class="table page-table font-style" style="height:100%;">
						<tbody>
						  <tr style="color:#FFFFFF;">
							<td style="width:14.29%;">排名</td>
							<td style="width:14.29%;">区县</td>
							<td style="width:14.29%;">结案数量</td>
							<td style="width:14.29%;">同比增量</td>
							<td style="width:14.29%;">总案值</td>
							<td style="width:14.29%;">平均案值</td>
							<td style="width:14.29%;">罚没金额</td>
					      </tr>
					      <tr ng-repeat="data in gqxzfsjfxData">
					      	<td>{{data.seq}}</td>
					      	<td>{{data.qx}}</td>
					      	<td>{{data.jasl}}件</td>
					      	<td>{{data.tbzl}}%</td>
					      	<td>{{data.zaz}}</td>
					      	<td>{{data.pjaz}}</td>
					      	<td>{{data.fmje}}</td>
					      </tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div class="row page-content-multiple" style="height:39%;">
		<div class="col-lg-6 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">案件类型分析</div>
				<div id="ajlxfx" style="height:100%;"></div>
			</div>
		</div>
		<div class="col-lg-6 page-content-col">
			<div class="page-box">
				<div class="page-box-title-right">案件趋势分析</div>
				<div id="ajqsfx" style="height:100%;"></div>
			</div>
		</div>
	</div>
</div>