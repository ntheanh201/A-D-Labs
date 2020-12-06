<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
	<jsp:include page="/views/common/head.jsp"></jsp:include>
	<jsp:include page="/views/common/header.jsp"></jsp:include>
	<link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/static/css/login-register.css"
    />
  <!-- form login -->
  <div class="formLogin" id="formLogin">
  	<a href="/shop-pet/home">
	    <div class="wapper" onclick="showFormLogin()"></div>
  	</a>
    <div class="main-form-login">
      <h3>Chào mừng bạn đến với Shop Pet</h3>
		<c:url value="/login" var="loginUrl"></c:url>
		<form action="${loginUrl }" method="post">
        <div class="form-group">
          <label for="username">Username</label>
          <input type="text" name="username" required class="form-control">
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" required name="password" class="form-control">
        </div>
        <p class="text-regis">
        <c:url value="/user/adduser" var="addUrl"></c:url>
        Don't have an account? <a style="cursor: pointer;" onclick="showFormRegister()">Sign up here!</a>
        </p>
        <button type="submit" class="btn btn-primary">Login</button>
      </form>
    </div>
  </div>
  
  <jsp:include page="/views/common/end.jsp"></jsp:include>