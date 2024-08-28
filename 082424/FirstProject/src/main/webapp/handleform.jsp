<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Handling Form in JSP</title>
</head>
<body>

<%!
String username;
String pwd;
%>

<%
username=request.getParameter("username");
pwd=request.getParameter("pass");
%>

<h3>Welcome <%=username %> Your Password is <%=pwd %></h3>

</body>
</html>