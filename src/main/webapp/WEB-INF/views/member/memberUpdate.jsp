<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Update Page</h1>
	<form action="memberUpdate" method="post">
	
		<!-- readonly로 연결하기 -->
		<!-- 수정 전 정보를 미리 보여지게 뿌려주기 위해 value 활용 -->
		ID <input type="text" name="id" readonly="readonly" value="${member.id}"><br>
		PW <input type="password" name="pw" value="${member.pw}"><br>
		NAME <input type="text" name="name" value="${member.name}"><br>
		EMAIL <input type="text" name="email" value="${member.email}"><br>
		PHONE <input type="text" name="phone" value="${member.phone}"><br>
		<button>Update</button>
	</form>
	
</body>
</html>