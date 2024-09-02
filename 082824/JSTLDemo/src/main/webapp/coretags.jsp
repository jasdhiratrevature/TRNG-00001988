<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core Tags</title>
</head>
<body>
	<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<%-- Using JSTL forEach and out to loop a list and display items in table --%>
<table>
<tbody>
<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
			</tr>
<c:forEach items="${requestScope.empList}" var="emp">
<tr>
					<td><c:out value="${emp.id}"></c:out></td>
<td><c:out value="${emp.name}"></c:out></td>
<td><c:out value="${emp.role}"></c:out></td>
				</tr>
</c:forEach>
</tbody>
</table>
<br>
	<br>
<%-- simple c:if and c:out example with HTML escaping --%>
<c:set var="ifVar" value="If is Working"></c:set>
<c:if test="${requestScope.htmlTagData eq null }">
<c:out value="${ifVar}"></c:out>
</c:if>
<br>
	<br>
<%-- c:set example to set variable value --%>
<c:set var="id" value="5" scope="request"></c:set>
<c:out value="${requestScope.id }"></c:out>
<br>
	<br>
<%-- c:catch example --%>
<c:catch var="exception">
   <%
   int x = 5 / 0;
   %>
</c:catch>

<c:if test="${exception ne null}">
   <p>Exception is : ${exception} <br>
   Exception Message: ${exception.message}</p>
</c:if>
<br>
	<br>
<%-- c:url example --%>
<a href="<c:url value="${requestScope.url }"></c:url>">JournalDev</a>
</body>


</html>