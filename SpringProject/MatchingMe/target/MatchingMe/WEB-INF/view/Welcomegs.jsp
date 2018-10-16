<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function confirmAction() {
    return confirm("Bạn muốn đăng xuất?")
  }
</script>
</head>
<body>
<h1 style="font-style: bold ; color :orange">Welcome <%=session.getAttribute("username") %></h1>
<a href="logout/" onclick="return confirmAction()">Log out</a>

</body>
</html>