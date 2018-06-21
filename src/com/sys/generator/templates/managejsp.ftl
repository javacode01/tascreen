<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/jsp/sys/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/jsp/sys/include/header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="sys-skin sys-manage-title">
			<strong>&nbsp;${comment}管理</strong>
		</div>
		<div class="row sys-manage-body">
			<div class="row sys-manage-body-search">
				<#list columns as column>
					<div class="col-sm-1 sys-search-label">${column.columnComment}</div>
					<div class="col-sm-3 sys-search-input"><input class="form-control" id="search_${column.propertyName}"></div>
				</#list>
				<div class="col-sm-1 sys-search-input"><button type="button" class="btn btn-primary btn-sm" onclick="search()">查询</button></div>
			</div>
			<div id="toolbar">
				<button type="button" class="btn btn-success btn-sm" onclick="add()">增加</button>
				<button type="button" class="btn btn-primary btn-sm" onclick="edit()">修改</button>
				<button type="button" class="btn btn-danger btn-sm" onclick="remove()">删除</button>
			</div>
			<table id="table"></table>
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-hidden="true"></div>
	<%@ include file="/jsp/sys/include/footer.jsp"%>
	<script src="${r"${basepath}"}${targetDir}manage${className?lower_case}.js"></script>
	<script type="text/javascript">
		$(function(){
			init();
		});
	</script>
</body>
</html>