
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>HOMEPAGE</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">alert("Đăng nhập để truy cập trang web ")</script> 
<style type="text/css">
	li a {
	 	display: inline;
	    text-decoration: none;
	    text-transform: uppercase;
		font-family: "Arial";
		font-size: 70%;
		color: black;
	    text-align: center;	
		font-weight: bold;
		
	  }
	div.menu{
		background-color: #f49242;
    }

	body  {
            background-image: url("./image/pika.jpg");
            background-repeat: no-repeat;
   			background-size: cover;
         }

</style>
</head>
<body>
	<div class="menu">
		<ul style="list-style-type: none; ">
			<li class="col-md-1 col-sm-1 col-xs-1" style="padding-left: 0%"> <a href="/">Home Page</a> </li>
			<li class="col-md-1 col-sm-1 col-xs-1"> <a href="" target="_blank">Gia Sư</a> </li>				  
			<li class="col-md-1 col-sm-1 col-xs-1"> <a href="#" target="_blank">Gia Chủ</a> </li>
			<li class="col-md-1 col-sm-1 col-xs-1"> <a href="https://www.google.com.vn/" target="_blank">Help</a> </li>
			<li class="col-md-6 col-sm-6 col-xs-4"> <a href="https://www.google.com.vn/" target="_blank">Browse</a> </li>
			<li class="col-md-1 col-sm-1 col-xs-1"> <a href="signup/">Đăng ký </a> </li>
			<li class="col-md-1 col-sm-1 col-xs-1"> <a href="login/">Đăng nhập</a> </li>
		</ul>
	</div>

	<h1
 	 class="col-md-12 col-sm-12 col-xs-12"
	 style="	font-family:serif;
				color: #821329;
	 			font-size: 300%;
				font-weight: bold;
				text-align: center;
				padding: 20%" >MATCHING ME <br>
				<a href="login/">Đăng ký Tài Khoản</a></h1>
				<%-- <a href="${pageContext.request.contextPath}/users" >API</a> --%>
</body>
</html>
