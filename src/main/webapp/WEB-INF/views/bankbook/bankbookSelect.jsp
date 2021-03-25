<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook Select Page</h1>
	
	<h3>Name : ${dto.bookName}</h3>
	<h3>Number : ${dto.bookNumber}</h3>
	
	<!-- c:catch : try-catch 처럼 작동 -->
	<c:catch>
	<!-- 로그인 상관없이 조건을 admin일때만 보이게 하는 경우? 에러발생! (로그인 안했을 경우, member가 null이 들어가기 때문)-->
	<c:if test="${member.id eq 'admin'}">
	<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">Delete</a>
	<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">Update</a>
	</c:if>
	</c:catch>
	
	<!-- 로그인 계정이 admin일 때만 delete, update 버튼이 보이게 하기 -->
	<!-- 계정이 empty가 아니고 admin 계정일 때만 보이게 하는 것 -->
<%-- 	<c:if test="${not empty member && member.id eq 'admin'}">
		<!-- <c:if test="${member.id eq 'admin'}"> -->
		<!-- 홑따옴표가 없으면 문자열 admin으로 인식하지 못한다 -->
		<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">Delete</a>
		<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">Update</a>
		</c:if>
	</c:if>	
--%>
</body>
</html>