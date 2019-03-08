<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div style="width: 100%; line-height: 25px; text-align: center; height: 25px; margin: 25px 0px 10px 0px; background: #acd6ff;">
		添加一级分类
	</div>
	
	<form action="" method="post">
		<div style="width: 50%; height: 30px; background: #f5fafe; text-align: center; line-height:30px; font-size: 14px; float: left;">
			一级分类名称:&emsp;&emsp;&emsp;<input type="text" name="cname">
		</div>
		
		<div style="width: 50%; height: 30px; background: #f5fafe; text-align: center; line-height:30px; font-size: 14px;  float: left;">
			
		</div>
		
		<div style="width: 100%; height: 25px; background: #f5fafe; text-align: center; padding: 6px 0px 6px 0px; font-size: 14px; clear: both;">
			<input type="button" value="确定" style="margin-right: 80px;" />
			<input type="reset" value="重置" style="margin-right: 80px;" />
			<input type="button" onclick="history.go(-1)" value="返回" />
		</div>
	</form>
	
</body>
</html>