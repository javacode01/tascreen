<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="modal-dialog">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">&times;</button>
			<h4 class="modal-title">定时任务-<small id="addEditTitle">新增</small></h4>
		</div>
		<div class="modal-body">
			<form role="form" id="addEditForm">
				<div class="form-group" style="display:none;">
					<label for="recid">定时任务Id</label>
					<input type="text" class="form-control" id="recid" name="recid" value="${quartzJob.recid}">
				</div>
				<div class="form-group">
					<label for="jobName">任务名称</label>
					<input type="text" class="form-control" id="jobName" name="jobName" value="${quartzJob.jobName}" required>
				</div>
				<div class="form-group">
					<label for="jobGroupName">任务组</label>
					<input type="text" class="form-control" id="jobGroupName" name="jobGroupName" value="${quartzJob.jobGroupName}" required>
				</div>
				<div class="form-group">
					<label for="jobClass">任务执行类</label>
					<input type="text" class="form-control" id="jobClass" name="jobClass" value="${quartzJob.jobClass}" required>
				</div>
				<div class="form-group">
					<label for="cronExpression">触发时间</label>
					<input type="text" class="form-control" id="cronExpression" name="cronExpression" value="${quartzJob.cronExpression}" required>
				</div>
				<div class="form-group">
					<label for="remark">备注</label>
					<input type="text" class="form-control" id="remark" name="remark" value="${quartzJob.remark}">
				</div>
			</form>
		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-primary" id="addEditButton" onclick="addEditSubmit()">保存</button>
			<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		</div>
	</div>
	<!-- /.modal-content -->
</div>
<!-- /.modal -->
<script type="text/javascript">
	var edit_handle = '${handle}';//操作类型
	$(function(){
		//初始化界面
		if('add'==edit_handle){
			$('#addEditTitle').html("新增");
		}else if("edit"==edit_handle){
			$('#addEditTitle').html("修改");
		}
	});
	//提交
	function addEditSubmit(){
		//校验表单
		if(!$('#addEditForm').valid()){
			return false;
		}
		//提交
		$.ajax({
			url:basepath+'sys/quartzjob/editQuartzJob',
			type:'post',
			data:$("#addEditForm").serialize(),
			success:function(result){
				if(result.code=='success'){
					bootbox.alert({ 
						  size: "small",
						  title: "提示框",
						  message: "保存成功"
						});
					search();
					$('#quartzjobEdit').modal('hide');
				}else{
					bootbox.alert({ 
						  size: "small",
						  title: "警告框",
						  message: result.data
						});
				}
			},
			error:function(error){
				bootbox.alert({ 
					  size: "small",
					  title: "警告框",
					  message: error
					})
			}
		});
	}
</script>