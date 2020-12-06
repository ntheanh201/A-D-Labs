<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> --%>

	<jsp:include page="/views/common/head.jsp"></jsp:include>
	<jsp:include page="/views/common/header.jsp"></jsp:include>

<c:url value="/admin/cate/addCategory" var="addCateUrl"></c:url>
<form action="${addCateUrl}" method="post" class="form-add-product">
	<div class="form-group">
       <label for="name">Name Category</label>
       <input type="text" name="name" placeholder="Category ..." required class="form-control">
     </div>
     <div class="form-group">
       <label for="code">Code</label>
       <input type="text" name="category_Id" required class="form-control" placeholder="Category Id ">
     </div>
     <div class="form-group">
       <input class="text" type="hidden" name="role" value="ADMIN" />
     </div>
     <p class="text-regis">
     <button type="submit" class="btn btn-primary"> Create Catregory </button>
</form>
