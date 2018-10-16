<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome ADMIN</title>


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
	text-transform: uppercase;
	font-family: "Arial";
	font-size: 120%;
	color: white;
	text-align: center;
	font-weight: bold;
}

div.menu {
	background-color: #f49242;
}

body {
	background-image: url("./image/nen.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>

<body>
	<div class="menu">
		<ul style="list-style-type: none;">
			<li class="col-md-1 col-sm-2 col-xs-3"><a href="FirstPage.jsp">HomePage</a>
			</li>

			<li class="col-md-2 col-sm-2 col-xs-2"><a href="DisplayUser.jsp"
				target="_blank">Danh sách User</a></li>
			<li class="col-md-2 col-sm-1 col-xs-1"><a href="#"
				target="_blank">Xóa user </a></li>
			<li class="col-md-5 col-sm-4 col-xs-2"></li>
			<li class="col-md-1 col-sm-2 col-xs-2"><a href="profile.jsp">Welcome
					<%=session.getAttribute("username")%></a></li>
			<li class="col-md-1 col-sm-1 col-xs-2">
				<form action="<c:url value='/logout' /" method="post"> 
					<input type="submit" value="Logout" onclick="confirmAction()" />
				</form>
		</ul>
	</div>

	<h1 class="col-md-12 col-sm-12 col-xs-12"
		style="font-family: serif; color: #821329; font-size: 300%; font-weight: bold; text-align: center; padding: 20%">
		MATCHING ME <br>
		 <a href="#" style="font-style: bold; color: orange">Quản Lý User</a>
	</h1>
</body>
</html>



</head>
<body>