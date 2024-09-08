<%@page import="java.util.List"%>
<%@page import="java.lang.classfile.attribute.ModuleTargetAttribute"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>
<body>
	<h1>This is a home page.</h1>
	<% String name =(String) request.getAttribute("1");
       List<String> list =(List<String>) request.getAttribute("list");
	%>
	<% for(String s : list){
		out.println(s);
	}%>
	<h2>My name is <%=name %></h2>
</body>
</html>