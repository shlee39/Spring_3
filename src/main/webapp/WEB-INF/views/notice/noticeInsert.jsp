<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootStrap.jsp"></c:import>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<div class="container">
	<h2>Notice Update</h2>
		<form action="./noticeInsert" method="post">
			<div class="form-group">
				<label for="title">TITLE</label> 
				<input type="text" class="form-control" id="title" name="title" value="${dto.title}">
			</div>
			<div class="form-group">
				<label for="name">NAME</label> 
				<input type="text" class="form-control" id="name" name="name" value="${dto.name}">
			</div>
			<div class="form-group">
				<label for="contents">CONTENTS</label> 
				<input type="text" class="form-control" id="contents" name="contents" value="${dto.contents}">
			</div>
			<div class="form-group">
				<label for="regdate">DATE</label> 
				<input type="date" class="form-control" id="regdate" name="regdate" value="${dto.regdate}">
			</div>
			<div class="form-group">
				<label for="hit">HIT</label> 
				<input type="text" class="form-control" id="hit" name="hit" value="${dto.hit}">
			</div>
			<button type="submit" class="btn btn-primary">Insert</button>
		</form>
	</div>
	
</body>
</html>