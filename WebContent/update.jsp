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
	<h1>update page</h1>
<s:form action="depAction_updateDep">
			<s:hidden name="did" value="%{did}"></s:hidden>
			<s:textfield label="部门名称" name="name" value="%{name}"></s:textfield>
			<s:textarea name="description" value="%{description}" label="部门描述"></s:textarea>
			<s:submit label="提交"></s:submit>
</s:form>

</body>
</html>