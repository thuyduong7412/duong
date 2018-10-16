<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>List of users</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
  <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style type="text/css">
li a {
	display: inline;
	text-decoration: none;
	font-family: "Arial";
	font-size: 100%;
	color: black;
	text-align: center;
	font-weight: bold;
}

div.menu {
	background-color: #87d21e;
	
}

body {
	background-color: #baf442;
	background-repeat: repeat;
	background-size: cover;
}
td a{
color: red;
font-weight: bold;
}
table, th, td {
    border:1px solid black;
    text-align: center;
}
</style>
 <script>
	function confirmAction() {
		return confirm("Are you sure?")
	}
</script>
</head>
<body>
	<div class="menu" style="border: 1px solid #ccc; padding:2%; margin-bottom:20px;" >
		<ul style="list-style-type: none; ">
			<li class="col-md-1 col-sm-1 col-xs-1" style="padding-left: 0%"> <a href="${pageContext.request.contextPath}/">HomePage</a> </li>
			<li class="col-md-1 col-sm-1 col-xs-1"> <a href="./admin/list/" target="_blank">List User</a> </li>				  
			<li class="col-md-1 col-sm-1 col-xs-1">  </li>
<%-- 			<li class="col-md-1 col-sm-1 col-xs-1"> <a href="${pageContext.request.contextPath}/profile/" target="_blank">Profile</a> </li> --%>
			<li class="col-md-6 col-sm-6 col-xs-4"> <a href="https://www.google.com.vn/" target="_blank">Help</a> </li>
			<li class="col-md-3 col-sm-2 col-xs-2">
				<form action="<%=request.getContextPath()%>/logout" method="post"> 
					<input type="submit" value="Logout" onclick="confirmAction()" />
				</form>
			</li>
		</ul>
	</div>
	<div>
	<center>
		<h1>List of teams</h1>
	</center>
	<center>
		<p>Here you can see the list of the users, remove or update them.</p>
	</center>
	</div>
<!-- 	<table border="1px" cellpadding="0" cellspacing="0" -->
<!-- 		style="margin-left: 100px; margin-right: 100px"> -->
  <table class="table table-striped">
		<thead>
			<tr>
				<th width="5%">Id</th>
				<th width="8%">Username</th>
				<th width="15%">Name</th>
				<th width="10%">Email</th>
				<th width="10%">Phone</th>
				<th width="5%">Right Code</th>
				<th width="8%">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.idUser}</td>
					<td>${user.username}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td>${user.phone}</td>
					<td>${user.idRight}</td>
					<td>
						<form action="${pageContext.request.contextPath}/user/delete/${user.idUser}" method="get">
							<input type="submit" value="delete" onclick="confirmAction()" />
						</form>
						<br /> 
						<form action="${pageContext.request.contextPath}/admin/update/${user.idUser}" method="get">
							<input type="submit" value="update" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<a href="${pageContext.request.contextPath}/">Home page</a>
	</p>

</body>
</html>