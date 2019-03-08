<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
	function addCategory(){
		window.location.href = "${pageContext.request.contextPath}/admin/category/add.jsp";
	}
</script>
</head>
<body style="padding: 0px 2px 0px 2px; margin: 0px;">
	<div style="width: 100%; line-height: 25px; text-align: center; height: 25px; margin: 25px 0px 10px 0px; background: #acd6ff;">
		一级分类列表
	</div>
	
	<div style="width: 100%; height: 30px;">
		<button type="button" id="add" name="add" value="添加" class="button_add" onclick="addCategory()" 
			style="float: right; "> 添加 </button>
	</div>
	
	<table cellspacing="0" cellpadding="1" rules="all" width="100%" border="1" bordercolor="gray" style="background-color: #f5fafe; margin-bottom: 100px">
		<tr style="font-weight: bold; font-size: 12px; height: 25px; background-color: #acd6ff;">
			<td width="36%" align="center">序号</td>
			<td width="36%" align="center">一级分类列表</td>
			<td width="14%" align="center">编辑</td>
			<td width="14%" align="center">删除</td>
		</tr>
		<tr onmouseover="this.style.backgroundColor = 'white'" onmouseout="this.style.backgroundColor = '#F5FAFE';" style="font-size: 12px;">
			<td width="36%" align="center">1</td>
			<td width="36%" align="center">服装</td>
			<td width="14%" align="center">
				<%-- <a href="${pageContext.request.contextPath}/adminCategory_edit.action?cid=<s:property value="#c.cid"/>"> --%>
				<a href="${pageContext.request.contextPath}/admin/category/edit.jsp">
					<img src="${pageContext.request.contextPath}/images/i_edit.gif" border="0" style="CURSOR: hand">
				</a>
			</td>
			<td width="14%" align="center">
				<a>
					<img src="${pageContext.request.contextPath}/images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand">
				</a>
			</td>
		</tr>
		
		<tr onmouseover="this.style.backgroundColor = 'white'" onmouseout="this.style.backgroundColor = '#F5FAFE';" style="font-size: 12px;">
			<td width="36%" align="center">2</td>
			<td width="36%" align="center">家电</td>
			<td width="14%" align="center">
				<%-- <a href="${pageContext.request.contextPath}/adminCategory_edit.action?cid=<s:property value="#c.cid"/>"> --%>
				<a href="${pageContext.request.contextPath}/admin/category/edit.jsp">
					<img src="${pageContext.request.contextPath}/images/i_edit.gif" border="0" style="CURSOR: hand">
				</a>
			</td>
			<td width="14%" align="center">
				<a>
					<img src="${pageContext.request.contextPath}/images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand">
				</a>
			</td>
		</tr>
		
	</table>
	
</body>
</html>