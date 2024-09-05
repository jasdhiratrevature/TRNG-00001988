<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Flux</title>
</head>
<body>
${fluxEmp}
<hr/>
<c:forEach items="${fluxEmp}" var="emp">
<tr>
					<td><c:out value="${emp.id}"></c:out></td>
<td><c:out value="${emp.name}"></c:out></td>
</tr>
<br/>
</c:forEach>
</body>
</html>