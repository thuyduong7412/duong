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
}

.container {
	max-width: 500px;
	margin: 10% 20%;
	padding: 10px;
}

h2 {
	font-weight: bold;
	color: hsl(220, 100%, 30%);
}

input {
	margin: 10px;
}
</style>
<!--  <script type="text/javascript">alert("Đăng nhập để truy cập trang web ")</script>   -->
</head>
<body>
	<div class="container">
	<h2>ĐĂNG NHẬP</h2>
	<h3>${message}</h3>
		<form name='loginForm' action="<%=request.getContextPath()%>/j_spring_security_login" method="post">

			Username: <input name="username" type="text" > <br>
			Password: <input name="password" type="password"> <br>
			<%
				if(request.getParameter("error") != null){
					out.print("<p style='color:red'>Sai tên đăng nhập hoặc mật khẩu </p>");
				}

			%>
			<label> <input type="checkbox" value="remember-me">	Remember me	</label> <br>
			<button type="submit" value="Log in" onclick="checkLogin()">Log	In</button>
			<br>
			<hr>
			<a href="${pageContext.request.contextPath}/signup">Tạo tài khoản mới</a> <br>
			
		</form>

	</div>
</body>
</html>