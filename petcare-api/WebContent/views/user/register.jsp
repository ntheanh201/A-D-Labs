<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/views/common/head.jsp"></jsp:include>
<jsp:include page="/views/common/header.jsp"></jsp:include>
    
 <!-- formRegister -->
 <div class="formRegister" id="formRegister">
 	<a href="/shop-pet/home">
   		<div class="wapper" onclick="showFormRegister()"></div>
 	</a>
   <div class="main-form-login">
    <h3>Chào mừng bạn đến với Shop Pet</h3>
 <c:url value="/register" var="addUserUrl"></c:url>
 <form action="${addUserUrl }" method="post" class="register">
       <div class="form-group">
         <label for="Email">Email</label>
         <input type="text" name="email" placeholder="Email của bạn" required class="form-control">
       </div>
       <div class="form-group">
         <label for="name">Họ và tên</label>
         <input type="text" name="name" required class="form-control" placeholder="Tên của bạn">
       </div>
       <div class="form-group">
         <label for="userName">UserName</label>
         <input type="text" name="username" required class="form-control" placeholder="User name">
       </div>
       <div class="form-group">
         <label for="password">Password</label>
         <input type="password" name="password" required class="form-control" placeholder="password">
       </div>
       <div class="form-group">
         <label for="RePassword">Nhập lại Password</label>
         <input type="password" name="rePassword" required class="form-control" placeholder="password again">
       </div>
       <div class="form-group">
         <input class="text" type="hidden" name="role" value="USER" />
         <input class="text" type="hidden" name="formName" value="register" />
       </div>
       <p class="text-regis">
       <button type="submit" class="btn btn-primary">Register</button>
     </form>
   </div>
 </div>