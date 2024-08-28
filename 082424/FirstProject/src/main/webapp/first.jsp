<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP</title>
</head>
<body>

<%--This is Declaration --%>

<%! int x;
int y;
%>

<%-- This are scriptlets --%>
<%
x=10;
y=20;
%>
<%-- These are expressions --%>
<h2>Value of X = <%=x %></h2>
<h3>Value of Y = <%=y %></h3>
</body>
</html>