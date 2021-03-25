<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- %@ page session="false" % 없애주어야 seesion이 제대로 작동한다. -->
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Welcome Back!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="./bankbook/bankbookList">BankBook List</a>


<!-- 로그인 전 나오는 페이지들 - dto가 비어있을 때 -->
<!-- scope명은 생략 가능하다 -->
<c:if test="${empty member}">
<a href="./member/memberJoin">Join</a>
<a href="./member/memberLogin">Login</a>
</c:if>

<!-- 로그인 성공했을 때 나오는 페이지들 - dto가 비어있지 않을 때-->
<c:if test="${not empty member}">
<a href="./member/memberPage">MyPage</a>
<a href="./member/memberLogout">Logout</a>
</c:if>


</body>
</html>
