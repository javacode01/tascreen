<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
<!--
	.display-inline {
		display:inline-block;
		vertical-align: middle;
		margin:5px 2px;
		height:15px;
		color:#00E1FC;
		line-height: 15px;
		font-size:10px;
	}
-->
</style>
<div class="container-fluid" style="height:100%;min-height:768px;">
	<div class="row page-title-row">
		<div class="col-lg-2">
		</div>
		<div class="col-lg-8 page-title">
			服务发展专题分析
		</div>
		<div class="col-lg-2">
		</div>
	</div>
	<div class="row page-content" style="height:100%;padding-top:40px;">
		<div class="col-lg-5 page-content-col">
			<div class="page-box" style="height:89%;">
				<div class="page-box-title-left">全市驰著名商标数据分析</div>
				<div id="qsczmsbsjfx_map" style="height:70%;"></div>
				<div id="qsczmsbsjfx_bar" style="height:40%;width:90%;position: absolute;bottom:50px;"></div>
			</div>
		</div>
		<div class="col-lg-7 page-content-col">
			<div class="row" style="height:42%;padding:0px 10px;">
				<div class="col-lg-6 page-content-col">
					<div class="page-box">
						<div class="page-box-title-left">注册商标趋势分析</div>
						<div id="zcsbqsfx" style="height:100%;"></div>
					</div>
				</div>
				<div class="col-lg-6 page-content-col">
					<div class="page-box">
						<div class="page-box-title-left">守重企业数据分析</div>
						<div id="szqysjfx" style="height:100%;"></div>
					</div>
				</div>
			</div>
			<div class="row" style="height:46%;padding:10px 10px 0px 10px;">
				<div class="col-lg-12 page-content-col">
						<div class="row" style="height:100%;padding:0px 0px 0px 0px;">
							<div class="col-lg-4" style="height:100%;padding-right: 10px;">
								<div class="page-box">
									<div style="position:relative;height:100%;width:100%;padding:0px 9%;">
										<div style="position:absolute;top:0;left:5px;">
											<div class="display-inline" style="width:15px;border-radius: 50%;background-color: #92C220;"></div><div class="display-inline">业务办理量(件)</div>
											<div></div>
											<div class="display-inline" style="width:15px;border-radius: 50%;background-color: #7D2F8E;"></div><div class="display-inline">担保债权数额(亿元)</div>
											<div></div>
											<div class="display-inline" style="width:15px;border-radius: 50%;background-color: #F29700;"></div><div class="display-inline">出质金额(亿元)</div>
										</div>
										<div style="position:absolute;top:6%;right:9%;color:#00E1FC;text-align: right;">{{zqrzGqczData[0]}}</div>
										<div style="position:absolute;top:14%;right:25%;color:#00E1FC;text-align: right;">{{zqrzGqczData[1]}}</div>
										<div style="position:absolute;top:20%;right:40%;color:#00E1FC;text-align: right;">{{zqrzGqczData[2]}}</div>
										<div style="height:15%;"></div>
										<div style="position:relative;width:100%;height:70%;background-image: url('resource/img/fwfzztfx/gqcz.png');background-size: 100% 100%;">
										</div>
										<div style="height:10%;width:100%;margin-top:5%;text-align: center;color:#00E1FC;fong-size:16px;font-weight: bold;">股权出质</div>
									</div>
								</div>
							</div>
							<div class="col-lg-4" style="height:100%;padding-left:0px;padding-right:0px;">
								<div class="page-box">
									<div style="position:relative;height:100%;width:100%;padding:0 5% 0 0;">
										<div style="position:absolute;top:0;left:0px;">
											<div class="display-inline" style="width:15px;border-radius: 50%;background-color: #E96C02;"></div><div class="display-inline">业务办理量</div>
											<div class="display-inline" style="width:15px;border-radius: 50%;background-color: #31A3AC;"></div><div class="display-inline">抵押物数量</div>
											<div class="display-inline" style="width:15px;border-radius: 50%;background-color: #7FB61D;"></div><div class="display-inline">抵押金额</div>
										</div>
										<div style="position:absolute;top:11%;left:15%;color:#00E1FC;text-align: right;">{{zqrzDcdyData[0]}}件</div>
										<div style="position:absolute;top:11%;left:40%;color:#00E1FC;text-align: right;">{{zqrzDcdyData[1]}}件</div>
										<div style="position:absolute;top:11%;left:60%;color:#00E1FC;text-align: right;">{{zqrzDcdyData[2]}}亿元</div>
										<div style="height:20%;"></div>
										<div style="position:relative;width:100%;height:65%;">
											<div style="width:20%;height:100%;display:inline-block;"></div
											><img src="resource/img/fwfzztfx/dcdy3.png" style="width:15%;height:100%;display:inline-block;vertical-align: bottom;"
											><div style="width:10%;height:100%;display:inline-block;"></div
											><img src="resource/img/fwfzztfx/dcdy2.png" style="width:15%;height:100%;display:inline-block;vertical-align: bottom;"
											><div style="width:10%;height:100%;display:inline-block;"></div
											><img src="resource/img/fwfzztfx/dcdy1.png" style="width:15%;height:100%;display:inline-block;vertical-align: bottom;">
										</div>
										<div style="height:10%;width:100%;margin-top:5%;text-align: center;color:#00E1FC;fong-size:16px;font-weight: bold;">动产抵押</div>
									</div>
								</div>
							</div>
							<div class="col-lg-4" style="height:100%;padding-left: 10px;">
								<div class="page-box">
									<div style="position:relative;height:100%;width:100%;">
										<div style="position:absolute;top:0;right:5px;">
											<div class="display-inline" style="width:15px;border-radius: 50%;background-color: #7FB61D;"></div><div class="display-inline">质押数量</div>
											<div class="display-inline" style="width:15px;border-radius: 50%;background-color: #F29700;"></div><div class="display-inline">质押金额</div>
										</div>
										<div style="position:absolute;top:46%;left:29%;color:#00E1FC;text-align: right;">{{zqrzSbqzyData[0]}}件</div>
										<div style="position:absolute;top:20%;left:65%;color:#00E1FC;text-align: right;">{{zqrzSbqzyData[1]}}亿元</div>
										<div style="height:30%;"></div>
										<div style="position:relative;width:100%;height:50%;">
											<div style="width:15%;height:100%;display:inline-block;"></div
											><img src="resource/img/fwfzztfx/sbqzy1.png" style="width:30%;height:50%;display:inline-block;vertical-align: bottom;"
											><div style="width:10%;height:100%;display:inline-block;"></div
											><img src="resource/img/fwfzztfx/sbqzy2.png" style="width:30%;height:100%;display:inline-block;vertical-align: bottom;">
										</div>
										<div style="height:5%;"></div>
										<div style="height:10%;width:100%;margin-top:5%;text-align: center;color:#00E1FC;fong-size:16px;font-weight: bold;">商标权质押</div>
									</div>
								</div>
							</div>
						</div>
				</div>
			</div>
		</div>
	</div>
</div>