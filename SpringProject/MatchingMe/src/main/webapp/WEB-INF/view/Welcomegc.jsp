<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Host</title>
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
	background-image: url("/MatchingMe/resource/image/pika.jpg");
	background-repeat: repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<div class="menu" style="border: 1px solid #ccc; padding:2%; margin-bottom:20px;">
		<ul style="list-style-type: none;">
			<li class="col-md-1 col-sm-2 col-xs-3"><a href="<%=request.getContextPath()%>/">HomePage</a>	</li>
<%-- 			<li class="col-md-2 col-sm-2 col-xs-4" style="padding-left: 7%"><a href="<%=request.getContextPath()%>/profile/">Profile</a></li> --%>
			<li class="col-md-9 col-sm-8 col-xs-5" style="padding-left: 60%">
				<form action="<%=request.getContextPath()%>/logout" method="post">
					<input type="submit" value="Logout" onclick="confirmAction()" />
				</form>
		</ul>
	</div>
	<br>

	<h3 class="col-md-12 col-sm-12 col-xs-12" style="font-style: bold ; color :#fced44">
			Welcome Host : ${pageContext.request.userPrincipal.name}</h3>
			
	<h1 class="col-md-12 col-sm-12 col-xs-12"
		style="font-family:serif;
				color: #821329;
	 			font-size: 300%;
				font-weight: bold;
				text-align: center;
				padding-top: 10%;
				padding-left: 10%;">
		MATCHING ME <br> <br>
	</h1>
	<form action="<%=request.getContextPath()%>/profile"
		class="col-md-12 col-sm-12 col-xs-12"
		style="font-family:serif;
	 			font-size: 100%;
				font-weight: bold;
				text-align: center;">
		<input name="usrn" value="${pageContext.request.userPrincipal.name}"
			hidden="true" />
		<button formmethod="get" type="submit"
			style="margin-left: 10%; width: 20%;">Edit Profile</button>
		<br>
	</form>
</body>
</html>