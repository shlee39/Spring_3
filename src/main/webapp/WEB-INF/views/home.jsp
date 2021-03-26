<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 위에는 jsp 코드 -->
<!-- 밑은 Bootstrap 코드 -->
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="./template/bootStrap.jsp"></c:import>
<title>Home</title>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>
	
	<h1>Home Page</h1>
	
	
	
	
<%-- 
	<h1>Hello, world!</h1>
	<h1>Welcome Back!</h1>
	
	<P>The time on the server is ${serverTime}.</P>

	<a href="./bankbook/bankbookList">BankBook List</a>

	<!-- if else와 같은 기능, switch문 -->
	<c:choose>
		<c:when test=""></c:when>
		<c:when test=""></c:when>
		<c:otherwise></c:otherwise>
	</c:choose>



	<!-- 로그인 전 나오는 페이지들 - DTO가 비어있을 때(member) -->
	<!-- seesionScope명은 다른 곳으 member와 중복되지 않는다면 생략 가능하다 -->
	<c:if test="${empty member}">
		<a href="./member/memberJoin">Join</a>
		<a href="./member/memberLogin">Login</a>
	</c:if>

	<!-- 로그인 성공했을 때 나오는 페이지들 - DTO가 비어있지 않을 때-->
	<c:if test="${not empty member}">
		<h3>${member.id}님환영합니다</h3>
		<a href="./member/memberPage">MyPage</a>
		<a href="./member/memberLogout">Logout</a>
	</c:if> --%>

</body>
</html>