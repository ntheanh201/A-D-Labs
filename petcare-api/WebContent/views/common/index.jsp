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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css" />
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

<jsp:include page="/views/common/header.jsp"></jsp:include>

<jsp:include page="/views/common/main.jsp"></jsp:include>

<jsp:include page="/views/common/footer.jsp"></jsp:include>

<script src="${pageContext.request.contextPath}/static/js/script.js"></script>

<!-- 
  <script src="${pageContext.request.contextPath}/static/js/script.js"></script> -->

</body>

</html>