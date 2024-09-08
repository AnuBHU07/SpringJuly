<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page isELIgnored = "false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelpLine</title>
</head>
<body>
	<%-- <%String name = (String) request.getAttribute("name");
	  Integer id = (Integer) request.getAttribute("id");
	  LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%> --%>

	<h1>This is HelpLine Page.</h1>
	<h2>Please Contact ${name} for any Help.</h2>
	<h2>Batch Id ${id}.</h2>
	<h1>Current Time ${time}.></h1>
	<c:forEach var="coOrds" items="${items}">
		<%-- <h1>${coOrds}</h1> --%>
		<h1><c:out value="${coOrds}"></c:out></h1>  
	</c:forEach>
</body>
</html>