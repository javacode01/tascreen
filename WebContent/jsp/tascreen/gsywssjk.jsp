<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="container-fluid" style="height:100%;min-height:768px;">
	<!-- 标题 -->
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			登记业务实时监控
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<!-- 内容 -->
	<div class="row page-content" style="height:100%;">
		<!-- 第一列 -->
		<div class="col-lg-4 page-content-col">
			<div class="page-box" style="height:36%;">
				<!-- 今日登记排行榜 -->
				<div class="page-box-title-left">今日登记排行榜</div>
				<div id="djphb" style="height:100%;"></div>
			</div>
			<div class="page-box" style="height:46%;">
				<!-- 名称核准 -->
				<div class="page-box-title-left">名称预核准</div>
				<div class="page-box-lable-right font-style">单位：件</div>
				<div style="height:100%;padding-top:10%;">
					<div>
						<img alt="" src="resource/img/gsywssjk/tubiao1.png" style="width:16px;height:16px;margin-left:20px;">
						<img alt="" src="resource/img/gsywssjk/tubiao2.png" style="width:16px;height:16px;float:right;margin-right:20px;">
					</div>
					<table class="table page-table font-style" style="height:80%;margin-bottom:0px">
						<tbody>
					      <tr ng-repeat="data in mchzData">
					      	<td><img style="margin-right:10px;height:19px;vertical-align:top;" ng-src="{{data.src}}">{{data.nametypeName}}</td>
					      	<td>{{data.now}}</td>
					      	<td>{{data.before}}</td>
					      </tr>
					      <tr>
							<td style="width:33%;"></td>
							<td style="width:33%;">今日</td>
							<td style="width:33%;">昨日</td>
					      </tr>
						</tbody>
					</table>
					<div>
						<img alt="" src="resource/img/gsywssjk/tubiao3.png" style="width:16px;height:16px;margin-left:20px;">
						<img alt="" src="resource/img/gsywssjk/tubiao4.png" style="width:16px;height:16px;float:right;margin-right:20px;">
					</div>
				</div>
			</div>
		</div>
		<!-- 第二列 -->
		<div class="col-lg-4 page-content-col">
			<div class="page-box" style="height:56%;padding-top:1%;">
				<!-- 设立登记 -->
				<div style="height:45%;">
					<table class="table page-table font-style" style="height:86%;">
						<caption class="page-table-caption" style="text-align: left;padding-left:16px;font-weight: bold;">设立登记（件）</caption>
						<tbody>
					      <tr ng-repeat="data in sldjData">
					      	<td><img style="margin-right:10px;height:19px;vertical-align:top;" ng-src="{{data.src}}">{{data.entcatName}}</td>
					      	<td>{{data.now}}</td>
					      	<td>{{data.before}}</td>
					      </tr>
					      <tr>
							<td style="width:33%;"></td>
							<td style="width:33%;">今日</td>
							<td style="width:33%;">昨日</td>
					      </tr>
						</tbody>
					</table>
				</div>
				<!-- 其他登记 -->
				<div style="height:55%;">
					<table class="table page-table font-style" style="height:86%;">
						<caption class="page-table-caption" style="text-align: left;padding-left:16px;font-weight: bold;">其他登记（件）</caption>
						<tbody>
						  <tr>
							<td style="width:25%;"></td>
							<td style="width:25%;">今日/昨日</td>
							<td style="width:25%;">今日/昨日</td>
							<td style="width:25%;">今日/昨日</td>
					      </tr>
					      <tr ng-repeat="data in qtdjData">
					      	<td><img style="margin-right:10px;height:19px;vertical-align:top;" ng-src="{{data.src}}">{{data.entcatName}}</td>
					      	<td>{{data.bgnow}}/{{data.bgbefore}}</td>
					      	<td>{{data.banow}}/{{data.babefore}}</td>
					      	<td>{{data.zxnow}}/{{data.zxbefore}}</td>
					      </tr>
					      <tr>
							<td></td>
							<td>变更登记</td>
							<td>备案登记</td>
							<td>注销登记</td>
					      </tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="page-box" style="height:26%;padding-top:1%;">
				<!-- 年报监控-->
				<div style="height:100%;">
					<table class="table page-table font-style" style="height:90%;">
						<caption class="page-table-caption" style="text-align: left;padding-left:16px;font-weight: bold;">年报监控</caption>
						<tbody>
						  <tr>
							<td style="width:25%;"></td>
							<td style="width:25%;">已报量</td>
							<td style="width:25%;">应报量</td>
							<td style="width:25%;">年报率</td>
					      </tr>
					      <tr ng-repeat="data in nbjkData">
					      	<td><img style="margin-right:10px;height:19px;vertical-align:top;" ng-src="{{data.src}}">{{data.entname}}</td>
					      	<td>{{data.yb}}</td>
					      	<td>{{data.zs}}</td>
					      	<td>{{data.nbl}}</td>
					      </tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- 第三列 -->
		<div class="col-lg-4 page-content-col">
			<div class="page-box" style="height:36%;">
				<div class="page-box-title-right">执法办案情况</div>
				<!-- 执法办案情况 -->
				<div id="zfbaqk" style="height:100%;"></div>
			</div>
			<div class="page-box" style="height:46%;">
				<!-- 消保维权 -->
				<div class="page-box-title-right">消保维权</div>
				<div class="page-box-lable-left font-style">单位：件</div>
				<div style="height:100%;padding-top:10%;">
					<div>
						<img alt="" src="resource/img/gsywssjk/tubiao1.png" style="width:16px;height:16px;margin-left:20px;">
						<img alt="" src="resource/img/gsywssjk/tubiao2.png" style="width:16px;height:16px;float:right;margin-right:20px;">
					</div>
					<table class="table page-table font-style" style="margin:0px auto;width:90%;height:80%;">
						<tbody>
					      <tr ng-repeat="data in xbwqData">
					      	<td><img style="margin-right:10px;height:19px;vertical-align:top;" ng-src="{{data.src}}">{{data.infotypeName}}</td>
					      	<td>{{data.jrdj}}</td>
					      	<td>{{data.zrdj}}</td>
					      	<td>{{data.jrbj}}</td>
					      	<td>{{data.zrbj}}</td>
					      </tr>
					      <tr>
							<td style="width:20%;"></td>
							<td style="width:20%;">今日登记</td>
							<td style="width:20%;">昨日登记</td>
							<td style="width:20%;">今日办结</td>
							<td style="width:20%;">昨日办结</td>
					      </tr>
						</tbody>
					</table>
					<div style="margin-bottom:20px;">
						<img alt="" src="resource/img/gsywssjk/tubiao3.png" style="width:16px;height:16px;margin-left:20px;">
						<img alt="" src="resource/img/gsywssjk/tubiao4.png" style="width:16px;height:16px;float:right;margin-right:20px;">
					</div>
				</div>
			</div>
		</div>
	</div>
</div>