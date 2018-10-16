<%@ page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link href="NewFile.css" type="text/css" rel="stylesheet"> -->
<%-- <link rel="stylesheet" href="<c:url value="/src/main/webapp/resources/css/NewFile.css" />"> --%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Welcome to Login Page</title>
<style>
body {
	background-color: lightblue;
	background-image: url("/MatchingMe/resource/image/pika.jpg");
	background-repeat: repeat;
	background-size: cover;
}

.container {
	max-width: 500px;
	margin: 10% 20%;
	padding: 10px;
}

li a {
	 	display: inline;
	    text-decoration: none;
	    text-transform: uppercase;
		font-family: "Arial";
		font-size: 80%;
		color: black;
	    text-align: center;	
		font-weight: bold;
		
	  }
h2 {
	font-weight: bold;
	color: hsl(220, 100%, 30%);
}

input {
	margin: 10px;
}

div.menu {
	background-color: #f49242;
}
</style>
<!--  <script type="text/javascript">alert("Đăng nhập để truy cập trang web ")</script>   -->
</head>
<body>

	<div class="menu"
		style="border: 1px solid #ccc; padding: 2%; margin-bottom: 20px;">
		<ul style="list-style-type: none;">
			<li class="col-md-1 col-sm-1 col-xs-1" style="padding-left: 0%">
				<a href="${pageContext.request.contextPath}/">Home Page</a>
			</li>
			<li class="col-md-1 col-sm-1 col-xs-1"><a href=""
				target="_blank">Gia Sư</a></li>
			<li class="col-md-1 col-sm-1 col-xs-1"><a href="#"
				target="_blank">Gia Chủ</a></li>
			<li class="col-md-1 col-sm-1 col-xs-1"><a
				href="https://www.google.com.vn/" target="_blank">Help</a></li>
			<li class="col-md-6 col-sm-6 col-xs-4"><a
				href="https://www.google.com.vn/" target="_blank">Browse</a></li>
			<li class="col-md-1 col-sm-1 col-xs-1"><a
				href="${pageContext.request.contextPath}/signup/">Đăng ký </a></li>
			<li class="col-md-1 col-sm-1 col-xs-1"><a
				href="${pageContext.request.contextPath}/login/">Đăng nhập</a></li>
		</ul>
	</div>

	<div class="container">
		<h2 style="margin-left: 280px;">ĐĂNG NHẬP</h2>
		<h3>${message}</h3>
		<form name='loginForm'
			action="<%=request.getContextPath()%>/j_spring_security_login"
			method="post" style="margin-left: 300px;">

			Username: <input name="username" type="text"> <br>
			Password: <input name="password" type="password"> <br>
			<%
				if (request.getParameter("error") != null) {
					out.print("<p style='color:red'>Sai tên đăng nhập hoặc mật khẩu </p>");
				}
			%>
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label> <br>
			<button type="submit" value="Log in" onclick="checkLogin()">Log
				In</button>
			<br>
			<hr>
			<a href="${pageContext.request.contextPath}/signup">Tạo tài khoản
				mới</a> <br>

		</form>

	</div>
</body>
</html>