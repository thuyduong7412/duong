<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of teams</title>
</head>
<body>
<h1>List of teams</h1>
<p>Here you can see the list of the teams, edit them, remove or update.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">Id</th><th width="15%">Name</th><th width="10%">Email</th><th width="10%">Phone</th><th width="10%">Address</th><th width="8%">Actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="team" items="${teams}">
<tr>
	<td>${team.id}</td>
	<td>${team.name}</td>
	<td>${team.email}</td>
	<td>${team.phone}</td>
	<td>${team.address}</td>
	<td>
	<a href="${pageContext.request.contextPath}/user/edit/${team.id}.htm">Edit</a><br/>
	<a href="${pageContext.request.contextPath}/user/delete/${team.id}.htm">Delete</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/">Home page</a></p>

</body>
</html>