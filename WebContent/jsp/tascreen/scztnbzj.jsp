<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
.nbzj-page-table {
	color:#46bee9;
	text-align: center;
}
.nbzj-page-table>tbody>tr>td, .nbzj-page-table>tbody>tr>th, .nbzj-page-table>tfoot>tr>td, .nbzj-page-table>tfoot>tr>th, .nbzj-page-table>thead>tr>td, .nbzj-page-table>thead>tr>th {
    padding: 10px 5px;
    line-height: 1.42857143;
    vertical-align: middle;
    border-top: none;
    border-bottom: 0px solid #3092E7;
}
.nbzj-page-table>thead>tr>th {
    vertical-align: bottom;
    border-bottom: 0px solid #3092E7;
    text-align: center;
}
.nbzj-page-table-caption {
	padding-top: 8px;
    padding-bottom: 15px;
    color: #3092E7;
    text-align: center;
    font-size:16px;
}
.ndqsnbqk {
	width:300px;
	margin:2% 0px 0px 5%;
	padding:5% 0px 0px 6%;
	display:inline-block;
}
-->
</style>
<div class="container-fluid" style="height:100%;min-height:768px;">
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			市场主体年报总结
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="height:50%;">
		<div class="col-lg-4 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">{{nbnd}}年度全市年报情况</div>
				<div id="ndqsnbqk" style="height:100%;color:#00E1FC;padding-top:6%;">
					<div class="ndqsnbqk" style="height:29%;width:65%;font-size:16px;font-weight:bold;background:url(resource/img/scztnbzj/nb_gt.png) no-repeat;background-size: auto 100%;">
						企业<br/>{{(ndqsnbqkData.qyyb/(ndqsnbqkData.qyyb+ndqsnbqkData.qywb)*100)|number:0}}%
					</div>
					<div style="display:inline-block;"><font color="#06EDF7" style="font-size:16px;font-weight:bold;">应报{{ndqsnbqkData.qyyb+ndqsnbqkData.qywb}}户</font><br/><font color="#FF6C0D" style="font-size:16px;font-weight:bold;">已报{{ndqsnbqkData.qyyb}}户</font></div>
					<div class="ndqsnbqk" style="height:29%;width:65%;font-size:16px;font-weight:bold;background:url(resource/img/scztnbzj/nb_nh.png) no-repeat;background-size: auto 100%;">
						农合<br/>{{(ndqsnbqkData.nhyb/(ndqsnbqkData.nhyb+ndqsnbqkData.nhwb)*100)|number:0}}%
					</div>
					<div style="display:inline-block;"><font color="#06EDF7" style="font-size:16px;font-weight:bold;">应报{{ndqsnbqkData.nhyb+ndqsnbqkData.nhwb}}户</font><br/><font color="#FF6C0D" style="font-size:16px;font-weight:bold;">已报{{ndqsnbqkData.nhyb}}户</font></div>
					<div class="ndqsnbqk" style="height:29%;width:65%;font-size:16px;font-weight:bold;background:url(resource/img/scztnbzj/nb_qy.png) no-repeat;background-size: auto 100%;">
						个体<br/>{{(ndqsnbqkData.gtyb/(ndqsnbqkData.gtyb+ndqsnbqkData.gtwb)*100)|number:0}}%
					</div>
					<div style="display:inline-block;"><font color="#06EDF7" style="font-size:16px;font-weight:bold;">应报{{ndqsnbqkData.gtyb+ndqsnbqkData.gtwb}}户</font><br/><font color="#FF6C0D" style="font-size:16px;font-weight:bold;">已报{{ndqsnbqkData.gtyb}}户</font></div>
				</div>
			</div>
		</div>
		<div class="col-lg-8 page-content-col">
			<div class="page-box">
				<div class="page-box-title-right">各辖区年报情况</div>
				<div id="gxqnbqk" style="height:100%;"></div>
			</div>
		</div>
	</div>
	<div class="row page-content-multiple" style="height:39%;">
		<div class="col-lg-5 page-content-col">
			<div class="page-box">
				<div class="page-box-title-left">党组织建设情况</div>
				<div style="height:100%;padding:6% 2% 2% 2%;">
					<table class="table nbzj-page-table font-style" style="height:100%;">
						<tbody>
							<tr>
								<td rowspan="2" style="width:12.5%;background-color:#074E82;border-right:2px solid #091C46;">企业类型</td>
								<td colspan="5" style="width:62.5%;background-color:#0A769D;">已建立党组织</td>
								<td rowspan="2" style="width:12.5%;background-color:#074E82;border-left:2px solid #091C46;">党组织覆盖率</td>
								<td rowspan="2" style="width:12.5%;background-color:#074E82;">党员人数</td>
					      	</tr>
					      	<tr>
								<td style="width:12.5%;background-color:#074E82;">党委</td>
								<td style="width:12.5%;background-color:#074E82;">党总支</td>
								<td style="width:12.5%;background-color:#074E82;">党支部</td>
								<td style="width:12.5%;background-color:#074E82;">合计</td>
								<td style="width:12.5%;background-color:#074E82;">同比</td>
					      	</tr>
					      	<tr style="border-bottom: 1px solid #3092E7;">
								<td>{{dzzjsqkQyData.entcat}}</td>
								<td>{{dzzjsqkQyData.dw}}</td>
								<td>{{dzzjsqkQyData.dzz}}</td>
								<td>{{dzzjsqkQyData.dzb}}</td>
								<td>{{dzzjsqkQyData.hj}}</td>
								<td>{{dzzjsqkQyData.tb}}%</td>
								<td>{{dzzjsqkQyData.dzzfgl}}%</td>
								<td>{{dzzjsqkQyData.dyrs}}</td>
					      	</tr>
					      	<tr>
								<td>{{dzzjsqkGtData.entcat}}</td>
								<td>{{dzzjsqkGtData.dw}}</td>
								<td>{{dzzjsqkGtData.dzz}}</td>
								<td>{{dzzjsqkGtData.dzb}}</td>
								<td>{{dzzjsqkGtData.hj}}</td>
								<td>{{dzzjsqkGtData.tb}}%</td>
								<td>{{dzzjsqkGtData.dzzfgl}}%</td>
								<td>{{dzzjsqkGtData.dyrs}}</td>
					      	</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="col-lg-7 page-content-col">
			<div style="width:50%;height:100%;padding-right:20px;display:inline-block;">
				<div class="page-box">
					<div class="page-box-title-left">{{nbnd}}年度纳税额TOP5</div>
					<div id="ndnse" style="height:100%;"></div>
				</div>
			</div
			><div style="width:50%;height:100%;padding-left:20px;display:inline-block;">
				<div class="page-box">
				<div class="page-box-title-right">{{nbnd}}年度利润额TOP5</div>
				<div id="ndlre" style="height:100%;"></div>
			</div>
			</div>
		</div>
	</div>
</div>