<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.revature.model.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Handling Request</title>
</head>
<body>
<%! String userName,email;
Person person;%>
<%
userName=request.getParameter("username");
email=request.getParameter("email");
person=new Person(userName,email);
%>

<h3>Hello <%=userName %> your email is <%=email %></h3>
<h3>Hello Again <%=person.getUserName() %> your email is <%=person.getEmail() %></h3>

<jsp:useBean id="p1" class="com.revature.model.Person"></jsp:useBean>
<jsp:setProperty property="userName" name="p1" value="<%=userName%>"/>"Displaying <jsp:getProperty property="userName" name="p1"/>
</body>
</html>