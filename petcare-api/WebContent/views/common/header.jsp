<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

  <!-- header -->
   <!-- form login -->
  <div class="formLogin" id="formLogin">
  	<a href="${pageContext.request.contextPath}/home">
	    <div class="wapper" onclick="showFormLogin()"></div>
  	</a>
    <div class="main-form-login">
      <h3>Chào mừng bạn đến với Shop Pet</h3>
		<c:url value="/login" var="loginUrl"></c:url>
		<form action="${loginUrl }" method="post">
        <div class="form-group">
          <label for="username">UserName</label>
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
  
  <header>
    <div class="title-header-main" >
      <div class="hotline">
        <i class="fas fa-phone-square" style="color: red"></i>
        <p style="margin-bottom: 0px;">HotLine : 0965 <span style="color: blue;"> xxx xxx</span></p>
      </div>
      <div class="img-main">
      	<a href="${pageContext.request.contextPath}/home" style="width: 100%;display: flex;justify-content: center;">
	        <img src="${pageContext.request.contextPath}/static/public/img/logo_MeowWool_2_1_.png" alt="logo" />
      	</a>
      </div>
      <div class="giohang">
		<c:if test="${user.username == null}">
<!-- 	      	<a href="${pageContext.request.contextPath}/login"> -->
		        <i class="fas fa-user" onclick="showFormLogin()"></i>
<!-- 	      	</a>-->	      	
			<a href="${pageContext.request.contextPath}/register">
		        <i class="fas fa-registered" onclick="showFormRegister()"></i>
	      	</a>
     	</c:if>
		<c:if test="${user.role == 'ADMIN'}">
	      	<a href="${pageContext.request.contextPath}/admin/products/addProduct">
		        <i class="fas fa-users-cog"></i>
	      	</a>
     	</c:if>
        <i class="fas fa-shopping-cart"></i>
        <i class="fas fa-bars" onclick="clickMenuIcon()"></i>
        <c:if test="${user.username != null}">
	        <a href="${pageContext.request.contextPath}/logout">
		        <img src="${pageContext.request.contextPath}/static/public/img/exit.png" alt="register" style="width: 23px; cursor: pointer;" />
	        </a>
     	</c:if>
      </div>
    </div>
    <div class="nav-main" id="header">
      <div class="fas">
        <i class="fas fa-search">
        </i>
        <form method="GET" class="form-search">
          <input type="text" placeholder="tìm kiếm ..." />
        </form>
      </div>
      <ul class="title-nav-main">
        <li class="title"><a href="${pageContext.request.contextPath}/products/list-products"> Đồ cho chó <img src="${pageContext.request.contextPath}/static/public/img/new-item.png" alt="hot-dog" /></a></li>
        <li class="title"><a> Đồ cho mèo <img src="${pageContext.request.contextPath}/static/public/img/hot-item.png" alt="hot-cat" /> </a></li>
        <li class="title"><a>Phụ kiện</a></li>
        <li class="title blog-about1"><a>Chăm sóc thú cưng <i class="fas fa-chevron-down"></i></a>
          <ul class="submenu1">
            <li><a href="${pageContext.request.contextPath}/products/list-products">Đồ ăn</a></li>
            <li><a href="#">Sữa tắm</a></li>
            <li><a href="#">Dụng cụ</a></li>
            <li><a href="#">Đồ chơi</a></li>
            <li><a href="#">Dịch vụ khác</a></li>
          </ul>
        </li>
        <li class="title blog-about"><a>About <i class="fas fa-chevron-down"></i></a>
          <ul class="submenu">
            <li><a href="#">Vdev Việt</a></li>
            <li><a href="#">Dung</a></li>
            <li><a href="#">Uyên</a></li>
            <li><a href="#">Thế Anh</a></li>
          </ul>
        </li>
        <li class="title"><a>Nhiều thông tin hơn</a></li>
        <li class="title"><a>Thương hiệu</a></li>
        <li class="title" style="border: none;">Phụ kiện khác</li>
      </ul>
      <div class="menu-small" id="menu-small">
        <ul>
          <li class="title"><a> Đồ cho chó <img src="${pageContext.request.contextPath}/static/public/img/new-item.png" alt="hot-dog" /></a></li>
          <li class="title"><a> Đồ cho mèo <img src="${pageContext.request.contextPath}/static/public/img/hot-item.png" alt="hot-cat" /> </a></li>
          <li class="title"><a>Phụ kiện</a></li>
          <li class="title blog1"><a>Chăm sóc thú cưng <i class="fas fa-chevron-down"></i></a>
            <ul class="submenu1">
              <li><a href="#">Cate 1</a></li>
              <li><a href="#">Cate 2</a></li>
              <li><a href="#">Cate 3</a></li>
              <li><a href="#">Cate 4</a></li>
              <li><a href="#">Cate 5</a></li>
            </ul>
          </li>
          <li class="title blog"><a>About <i class="fas fa-chevron-down"></i></a>
            <ul class="submenu">
              <li><a href="#">Vdev</a></li>
              <li><a href="#">Dung</a></li>
              <li><a href="#">Uyên</a></li>
              <li><a href="#">Thế Anh</a></li>
            </ul>
          </li>
          <li class="title"><a>Nhiều thông tin hơn</a></li>
          <li class="title"><a>Thương hiệu</a></li>
          <li class="title" style="border: none;"><a>Phụ kiện khác</a></li>
        </ul>
      </div>
    </div>
  </header>
