<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	body{
	text-align: center;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>show page</h1><br>
	<s:a href="regist.jsp">添加部门</s:a>
	<table align="center" width="420">
		<tr>
			<th>部门</th>
			<th>描述</th>
			<th>操作</th>
		</tr>
		<s:iterator value="#department">
			<tr>
				<td> <s:property value="name"/> </td>
				<td> <s:property value="description"/> </td>
				<td>				
					 <s:a href="depAction_findDep?did=%{did}">修改</s:a>
					 <s:a href="depAction_delDep?did=%{did}">删除</s:a>
				 </td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>