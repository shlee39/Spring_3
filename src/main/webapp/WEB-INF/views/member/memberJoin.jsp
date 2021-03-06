<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
		<h2>Member Join Page</h2>
	
		<form action="./memberJoin" method="post">
			<div class="form-group">
				<label for="id">ID</label> 
				<input type="text" class="form-control" id="id" name="id" aria-describedby="idHelp"> 
				<small id="idHelp" class="form-text text-muted">
				We'll never share your email with anyone else.
				</small>
				
			</div>
			<div class="form-group">
				<label for="pw">Password</label> 
				<input type="password" class="form-control" id="pw" name="pw">
			</div>
			<div class="form-group">
				<label for="name">Name</label> 
				<input type="text" class="form-control" id="name" name="name">
			</div>
			<div class="form-group">
				<label for="email">Email</label> 
				<input type="text" class="form-control" id="email" name="email">
			</div>
			<div class="form-group">
				<label for="phone">Phone</label> 
				<input type="text" class="form-control" id="phone" name="phone">
			</div>
			
			<button type="submit" class="btn btn-primary">Join</button>
		</form>


	</div>
	
	
	
	<!-- <form action="memberJoin" method="post">
	
	ID <input type="text" name="id"><br>
	PW <input type="password" name="pw"><br>
	NAME <input type="text" name="name"><br>
	EMAIL <input type="text" name="email"><br>
	PHONE <input type="text" name="phone"><br>
	<button>Join</button>
	</form> -->
	
</body>
</html>