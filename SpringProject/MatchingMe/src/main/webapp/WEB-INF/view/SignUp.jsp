<%@page import="javax.swing.text.Document"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>

<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>SIGN UP</title>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(function(){
	//Năm tự động điền vào select
	    var seYear = $('#year');
	    var date = new Date();
	    var cur = date.getFullYear();
	
	    seYear.append('<option value="">-- Năm --</option>');
	    for (i = cur; i >= 1900; i--) {
	        seYear.append('<option value="'+i+'">'+i+'</option>');
	    };
	    
	//Tháng tự động điền vào select
	    var seMonth = $('#month');
	    var date = new Date();    
	    var month=new Array();
	    month[1]="Tháng 1";
	    month[2]="Tháng 2";
	    month[3]="Tháng 3";
	    month[4]="Tháng 4";
	    month[5]="Tháng 5";
	    month[6]="Tháng 6";
	    month[7]="Tháng 7";
	    month[8]="Tháng 8";
	    month[9]="Tháng 9";
	    month[10]="Tháng 10";
	    month[11]="Tháng 11";
	    month[12]="Tháng 12";
	
	    seMonth.append('<option value="">-- Tháng --</option>');
	    for (i = 12; i > 0; i--) {
	        seMonth.append('<option value="'+i+'">'+month[i]+'</option>');
	    };
	    
	//Ngày tự động điền vào select
	    function dayList(month,year) {
	        var day = new Date(year, month, 0);
	        return day.getDate();
	    }    
	    
	    $('#year, #month').change(function(){
	        //Đoạn code lấy id không viết bằng jQuery để phù hợp với đoạn code bên dưới
	        var y = document.getElementById('year');
	        var m = document.getElementById('month');
	        var d = document.getElementById('day');
	        
	        var year = y.options[y.selectedIndex].value;
	        var month = m.options[m.selectedIndex].value;
	        var day = d.options[d.selectedIndex].value;
	        if (day == ' ') {
	            var days = (year == ' ' || month == ' ')? 31 : dayList(month,year);
	            d.options.length = 0;
	            d.options[d.options.length] = new Option('-- Ngày --',' ');
	            for (var i = 1; i <= days; i++)
	            d.options[d.options.length] = new Option(i,i);
	        }
	    });
	});
</script>

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box
}
/* Full-width input fields */
input[type=text], input[type=password], input[type=email] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Set a style for all buttons */
button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

button:hover {
	opacity: 1;
}

/* Extra styles for the cancel button */
.cancelbtn {
	padding: 14px 20px;
	background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
	float: left;
	width: 50%;
}

/* Add padding to container elements */
.container {
	padding: 16px;
}

/* The Modal (background) */
.modal {
	/* display: none;  Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: #474e5d;
	padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* The Close Button (x) */
.close {
	position: absolute;
	right: 35px;
	top: 15px;
	font-size: 40px;
	font-weight: bold;
	color: #f1f1f1;
}

.close:hover, .close:focus {
	color: #f44336;
	cursor: pointer;
}

/* Clear floats */
.clearfix::after {
	content: "";
	clear: both;
	display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
	.cancelbtn, .signupbtn {
		width: 100%;
	}
}
</style>

<!-- <script language="javascript" src="Script.js"></script> -->
</head>
<body>

<jsp:include page="_menu.jsp"/>
	<div id="id01" class="modal">
		<form class="modal-content"  action="<%=request.getContextPath()%>/register" autocomplete="on">
			<a href="${pageContext.request.contextPath}/">Home</a>
			<div class="container">
				<h1 style="color: red">Đăng ký</h1>
				<p>Điền vào mẫu sau để tạo mới một tài khoản.</p>
				<hr>
				
				<label for="usrn"><b>Tên đăng nhập(*)</b></label> <input type="text"
					placeholder="Nhập Tên đăng nhập" name="usrn" id="usrn"
					onblur="check()" required>

			<%
				if(request.getParameter("error") != null){
					out.print("<p style='color:red'>Tên đăng nhập đã tồn tại</p>");
				}
			%>
				<label 	for="name"><b>Họ tên</b></label>
				<input	type="text" placeholder="Nhập Họ tên" name="name" id="name"	required>
				<label	for="pass"><b>Mật khẩu</b></label>
				<input	type="password" placeholder="Nhập mật khẩu" name="pass" id="pass" required>
				<label	for="rep"><b>Nhập lại mật khẩu</b></label>
				<input	type="password" placeholder="Nhập lại mật khẩu"
							name="rep" id="rep" onblur="return rep_pass()" required>
			<script type="text/javascript">
			    function rep_pass(){     
			   	 var pass = document.getElementById("pass").value;
			        var rep = document.getElementById("rep").value;   
			   	  if (pass != rep){
			             alert("Mật khẩu nhập lại không đúng"); 
			             document.getElementById("rep").focus();
			             return false;            
			           }
			           	return true;       
			           	
			     }      
		    </script>
				<label for="email"><b> Email</b></label> 
				<input type="email"
					placeholder="Nhập email" name="email" id="email" required>
				<label for="phone"><b>Số điện thoại </b></label> 
				<input type="text"
					placeholder="Nhập Số điện thoại" name="phone" id="phone">
					


				<label><b>Ngày tháng năm sinh</b></label> <br>
				<div>
					<select name="day" id="day" size="1" required>
						<option value=" " selected="selected">-- Ngày --</option>
					</select>
					<select name="month" id="month" size="1" required></select> 
					<select
						name="year" id="year" size="1" required></select>
				</div>
				<br> 
				<label><b>Giới tính</b></label>
				<div>
					<input type="radio" name="gender" value="Male" style="padding: 10%">
					Nam <input type="radio" name="gender" value="Female"> Nữ <br>
				</div>
				<br> 
				<label><b>Bạn muốn đăng ký trở thành Gia sư
						hay gia chủ?</b></label>
				<div>
					<input type="radio" name="right" value="Tutor" style="padding: 10%"
						required>Gia sư <input type="radio" name="right"
						value="Host" required> Gia chủ <br>
				</div>
				<br> 
				<label> <input type="checkbox" checked="checked"
					name="remember" style="margin-bottom: 15px"> Remember me
				</label>

				<p>
					Khi tạo tài khoản thì bạn đã đồng ý với <a href="#"
						style="color: dodgerblue"> Điều khoản và Bảo mật của chúng tôi</a>.
				</p>

				<div class="clearfix">
					<button formmethod="post" type="submit" class="signupbtn"
						onclick="rep_pass()">Đăng ký</button>
					<button onclick="history.back()" class="cancelbtn">Hủy</button>
				</div>
			</div>

		</form>
	</div>
	

</body>
</html>
<!-- 			<script type="text/javascript"> -->
<!-- // 			      	var input = document.getElementById("phone"); -->
<!-- // 			     	 input.addEventListener('blur', function(){ -->
<!-- // 					var phoneno = /^\d{9}$/; -->
<!-- // 			    	var phone = /^\d{10}$/; -->
<!-- // 			    	if (input.value > 1700000000){ -->
<!-- // 			    		 alert("Số phone không hợp lệ!"); -->
<!-- // 			    		 return false; -->
<!-- // 			    	 } else{ -->
<!-- // 			    	  if(input.value.match(phoneno)|| input.value.match(phone)) -->
<!-- // 			    	  { -->
<!-- // 			    	      return true; -->
<!-- // 			    	  } -->
<!-- // 			    	  else -->
<!-- // 			    	  { -->
<!-- // 			    	     alert("Số phone không hợp lệ!"); -->
<!-- // 			    	     document.getElementById("phone").focus(); -->
<!-- // 			    	     return false; -->
<!-- // 			    	  } -->
<!-- // 			    	  } -->
<!-- // 			      }); -->
<!-- 			</script> -->
<!--  
<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>
-->