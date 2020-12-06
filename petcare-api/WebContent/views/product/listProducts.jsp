<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <Link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/public/img/love.png">
  <%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css" /> --%>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/styleProduct.css" />
  <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/static/fontawesome-free-5.14.0-web/css/fontawesome.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/static/fontawesome-free-5.14.0-web/css/brands.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/static/fontawesome-free-5.14.0-web/css/solid.min.css" rel="stylesheet">
  <title>Pet Web</title>
  <style>
    html {
      scroll-behavior: smooth;
    }
  </style>
</head>
<body>

     <!-- header -->
	<jsp:include page="/views/common/header.jsp"></jsp:include>
  <!-- main -->
  <main>
    <div class="title-main container">
      <h5>
        <i class="fas fa-home"></i>
        <a href="${pageContext.request.contextPath}/home">
          Trang chủ
        </a>
         > Sản phẩm theo loại</h5>
    </div>
    <div class="content-product-page container">
      <div class="quang-cao">
        <img src="${pageContext.request.contextPath}/static/public/img/quangCao.jpg" alt="quang-cao" />
        <img src="${pageContext.request.contextPath}/static/public/img/quangCao2.jpg" alt="quang-cao" />
        <img src="${pageContext.request.contextPath}/static/public/img/quangCao3.jpg" alt="quang-cao" />
        <img src="${pageContext.request.contextPath}/static/public/img/quangCao.jpg" alt="quang-cao" />
      </div>
      <div class="area-products">
        <c:forEach items="${Products}" var="product">
	        <div class="form-product">
	    <%--       <a href="${pageContext.request.contextPath}/product/detail/${product.id}"> --%>
	              <a href="${pageContext.request.contextPath}/product/detail?id=${product.id}"> 
	            <div class="img">
	              <img src="${pageContext.request.contextPath}/static/public/img/sanpham3.jpg" alt="sanpham" />
	              <div class="sale">
	                <i class="fas fa-star" style="color: #FFBA01;"></i>
	              </div>
	            </div>
	          </a>
	          <div class="content">
	            <a href="${pageContext.request.contextPath}/product/detail?id=${product.id}">
	              <div class="title">
	                <h3>${product.name}</h3>
	              </div>
	            </a>
	            <div class="price-content">
	              <div class="price-detail">
	                <h3 class="price"> ${product.price} đ</h3>
	                <p>Lượt mua : 10000</p>
	              </div>
	              <button class="btn-buy">
	                Add to Cart
	              </button>
	            </div>
	          </div>
	        </div>
	    
        </c:forEach>
    </div>
  </main>
	<!--Footer -->
	<jsp:include page="/views/common/footer.jsp"></jsp:include>
</body>
</html>