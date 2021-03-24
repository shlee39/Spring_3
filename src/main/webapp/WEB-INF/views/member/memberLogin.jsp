<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Login Page</h1>
	<!-- MemberDTO로 보낼 것이기 때문에 그쪽과 변수명을 통일해야 한다. -->
	<form action="./memberLogin" method="post"></form>
		ID <input type="text" name="id"><br>
		PW <input type="password" name="pw"><br>
		<button>Login</button>
</body>
</html>