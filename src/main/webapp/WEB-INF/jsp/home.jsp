<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<c:if test="${not empty skills}">
		<ul>
			<c:forEach var="listValue" items="${skills}">
				<li>${listValue.employeeSkillRating}</li>
				<li>${listValue.employee.employeeName}</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>
