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
<c:import url="./template/bootStrap.jsp"></c:import>
<title>Home</title>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>
	
	<button onclick="go()">BUTTON</button>
<!-- 
	기능
	글 리스트 보기 - 누구나
	상세보기 - 누구나, 글 리스트에서 제목을 클릭
	글 수정 - 관리자만
	글 삭제 - 관리자만
	글 작성 - 관리자만
	
	
	Back-end
		- com.sh.s3.notice
		noticeMapper
		NoticeDAO
			getList		: 글 리스트
			getSelect 	: 상세보기
			setInsert 	: 글 작성
			setUpdate 	: 글 수정
			setDelete	: 글 삭제
			**setHitUpdate: select 될 때 조회수 업데이트 (1 증가)
			
			
		NoticeDTO
		
		NoticeService
			getList		: 글 리스트
			getSelect 	: 상세보기
			setInsert 	: 글 작성
			setUpdate 	: 글 수정
			setDelete	: 글 삭제
			
		NoticeController
			getList		: 글 리스트
			getSelect 	: 상세보기
			setInsert 	: 글 작성*2
			setUpdate 	: 글 수정*2
			setDelete	: 글 삭제
			
	Front-end
		- /WEB-INF/views/notice/
		
		글 리스트
		/notice/noticeList		GET		noticeList.jsp
		글 상세보기
		/notice/noticeSelect	GET		noticeSelect.jsp
		글 작성
		/notice/noticeInsert	GET		noticeInsert.jsp
		/notice/noticeInsert	POST	글 리스트로 이동
		글 수정
		/notice/noticeUpdate	GET		noticeUpdate.jsp
		/notice/noticeUpdate	POST	글 리스트로 이동
		글 삭제
		/notice/noticeDelete	GET		글 리스트로 이동
		
 -->
	
	
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