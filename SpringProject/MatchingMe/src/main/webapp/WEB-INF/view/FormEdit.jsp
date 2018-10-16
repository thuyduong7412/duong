<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
	function confirmAction() {
		return confirm("Bạn muốn đăng xuất?")
	}
</script>
<style type="text/css">
li a {
	display: inline;
	text-decoration: none;
	font-family: "Arial";
	font-size: 100%;
	color: white;
	text-align: center;
	font-weight: bold;
}

div.menu {
	background-color: #f49242;
}

body {
	background-image: url("/MatchingMe/resource/image/pika.jpg");
	background-repeat: repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<div class="menu"
		style="border: 1px solid #ccc; padding: 2%; margin-bottom: 20px;">
		<ul style="list-style-type: none;">
			<li class="col-md-1 col-sm-1 col-xs-1" style="padding-left: 0%">
				<a href="${pageContext.request.contextPath}/">HomePage</a>
			</li>
			<li class="col-md-1 col-sm-1 col-xs-1"><a href="./admin/list/"
				target="_blank">List User</a></li>
			<li class="col-md-1 col-sm-1 col-xs-1"></li>
			<%-- 			<li class="col-md-1 col-sm-1 col-xs-1"> <a href="${pageContext.request.contextPath}/profile/" target="_blank">Profile</a> </li> --%>
			<li class="col-md-6 col-sm-6 col-xs-4"><a
				href="https://www.google.com.vn/" target="_blank">Help</a></li>
			<li class="col-md-2 col-sm-2 col-xs-2" style="margin-left: 8%">
				<form action="<%=request.getContextPath()%>/logout" method="post">
					<input type="submit" value="Logout" onclick="confirmAction()" />
				</form>
			</li>
		</ul>
	</div>
	<div style="margin-left: 40%; margin-top: 10%;">
		<form action="<%=request.getContextPath()%>/admin/update">
			<table style="border-width: 1px; border: 0px solid #ccc;">

				<tr>
					<th width="20%" class="col-md-6 col-sm-6 col-xs-6">ID</th>
					<td class="col-md-6 col-sm-6 col-xs-6"><input name="id"
						value="${user.idUser}" hidden="true" /></td>
				</tr>
				<tr>
					<th width="20%" class="col-md-6 col-sm-6 col-xs-6">FULL NAME</th>
					<td class="col-md-6 col-sm-6 col-xs-6"><input type="text"
						value="${user.name}" name="name" id="name" /></td>
				</tr>
				<tr>
					<th width="20%" class="col-md-6 col-sm-6 col-xs-6">PASSWORD</th>
					<td class="col-md-6 col-sm-6 col-xs-6"><input type="text"
						value="${user.password}" name="pass" id="pass" /></td>
				</tr>
				<tr>
					<th width="20%" class="col-md-6 col-sm-6 col-xs-6">EMAIL</th>
					<td class="col-md-6 col-sm-6 col-xs-6"><input type="text"
						value="${user.email}" name="email" id="email" /></td>
				</tr>
				<tr>
					<th width="20%" class="col-md-6 col-sm-6 col-xs-6">PHONE</th>
					<td class="col-md-6 col-sm-6 col-xs-6"><input type="text"
						value="${user.phone}" name="phone" id="phone"></td>
				</tr>
				<tr>
					<th width="20%" class="col-md-6 col-sm-6 col-xs-6">GENDER</th>
					<td class="col-md-6 col-sm-6 col-xs-6"><input type="text"
						value="${user.gender}" name="gender"></td>
				</tr>
			</table>
			<br>
			<button formmethod="post" type="submit"
				style="margin-left: 10%; width: 20%;">Edit</button>
		</form>
	</div>

</body>
</html>