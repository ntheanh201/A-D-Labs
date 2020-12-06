<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 

	<jsp:include page="/views/common/head.jsp"></jsp:include>
	<jsp:include page="/views/common/header.jsp"></jsp:include>

<c:url value="/admin/products/addProduct" var="addPrdUrl"></c:url>
<form action="${addPrdUrl}" method="post" enctype="multipart/form-data" class="form-add-product">
	<div class="form-group">
       <label for="name">Name Product</label>
       <input type="text" name="name" placeholder="Tên sản phẩm" required class="form-control">
     </div>
     <div class="form-group">
       <label for="code">Code</label>
       <input type="text" name="code" required class="form-control" placeholder="Mã sản phẩm">
     </div>
     <div class="form-group">
       	<label for="category">Category</label> * <a href="${pageContext.request.contextPath}/admin/cate/addCategory"> Add Categories </a>
	    <select class="form-control" id="category" name="category_ID" >
	    <c:forEach items="${categories}" var="cate">
	    	<option value=${cate.getId()}> ${cate.getName()} </option>
	    </c:forEach>
	    </select>
	 </div>
     <div class="form-group">
       <label for="brief">Brief</label>
       <input type="text" name="brief" required class="form-control" placeholder="Brief Product ...">
     </div>
     <div class="form-group">
       <label for="price">Price</label>
       <input type="text" name="price" required class="form-control" placeholder="Giá sản phẩm ...">
     </div>
     <div class="form-group">
       <label for="image">Image</label>
       <input type="file" name="photo" required class="form-control file-image" >
     </div>
     <div class="form-group">
       <input type="file" name="image1" class="form-control file-image" >
     </div>
     <div class="form-group">
       <input type="file" name="image2" class="form-control file-image" >
     </div>
     <div class="form-group">
       <label for="description">Description</label>
       <textarea name="description" required class="form-control" rows="4" cols="50"></textarea>
     </div>
     <div class="form-group">
       <input class="text" type="hidden" name="role" value="ADMIN" />
     </div>
     <p class="text-regis">
     <button type="submit" class="btn btn-primary"> Create Product </button>
</form>
