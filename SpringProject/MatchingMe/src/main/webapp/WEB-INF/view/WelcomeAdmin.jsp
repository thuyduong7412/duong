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
	<!-- 	<div class="menu"> -->
	<!-- 		<ul style="list-style-type: none;"> -->
	<%-- 			<li class="col-md-1 col-sm-2 col-xs-3"><a href="${pageContext.request.contextPath}/">HomePage</a> --%>
	<!-- 			</li> -->
	<!-- 			<li class="col-md-2 col-sm-2 col-xs-2"><a href="DisplayUser.jsp" target="_blank">Danh sách User</a></li> -->
	<!-- 			<li class="col-md-2 col-sm-1 col-xs-1"><a href="#"	target="_blank">Xóa user </a></li> -->
	<!-- 			<li class="col-md-5 col-sm-4 col-xs-2"></li> -->
	<!-- 			<li class="col-md-1 col-sm-2 col-xs-2"><a href="./profile/">Profile</a></li> -->
	<!-- 			<li class="col-md-1 col-sm-1 col-xs-2"> -->
	<%-- 				<form action="<%=request.getContextPath()%>/logout" method="post">  --%>
	<!-- 					<input type="submit" value="Logout" onclick="confirmAction()" /> -->
	<!-- 				</form> -->
	<!-- 			</li> -->
	<!-- 		</ul> -->
	<!-- 	</div> -->
	
	<div class="menu"
		style="border: 1px solid #ccc; padding: 2%; margin-bottom: 20px;">
		<ul style="list-style-type: none;">
			<li class="col-md-1 col-sm-1 col-xs-1" style="padding-left: 0%">
				<a href="${pageContext.request.contextPath}/">HomePage</a>
			</li>
			<li class="col-md-1 col-sm-1 col-xs-1"><a href="./admin/list/"
				target="_blank">List User</a></li>
			<li class="col-md-1 col-sm-1 col-xs-1"> </li>
			<li class="col-md-1 col-sm-1 col-xs-1">	</li>
			<li class="col-md-6 col-sm-6 col-xs-4">
				<a href="https://www.google.com.vn/" target="_blank">Help</a></li>
			<li class="col-md-2 col-sm-2 col-xs-2">
				<form action="<%=request.getContextPath()%>/logout" method="post">
					<input type="submit" value="Logout" onclick="confirmAction()" />
				</form>
			</li>
		</ul>
	</div>

	<br>

	<h3 class="col-md-12 col-sm-12 col-xs-12" style="font-style: bold;">
		Welcome Admin : ${pageContext.request.userPrincipal.name}</h3>
	<h1 class="col-md-12 col-sm-12 col-xs-12"
		style="font-family:serif;
				color: #821329;
	 			font-size: 300%;
				font-weight: bold;
				text-align: center;
				padding-top: 10%;
				padding-left: 10%;">
			MATCHING ME <br> 
		<a 	href="${pageContext.request.contextPath}/admin/list/"
			style="font-style: bold; color: #f72d3d">
			Quản Lý User</a>
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