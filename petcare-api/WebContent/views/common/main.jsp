<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <!-- main -->
  <main>
  
    <!-- Courses -->
    <section class="courses">
      <img src="${pageContext.request.contextPath}/static/public/img/banner.jpg" alt="banner" />
    </section>

    <!-- ? top Area show  -->
    <section class="area-show-now">
      <div class="step-area-show">
        <div class="step-main">
          <div class="img">
            <a class="btn-show">Show now</a>
            <img src="${pageContext.request.contextPath}/static/public/img/area-show.jpg" alt="area" />
          </div>
        </div>
        <div class="step-main">
          <div class="img">
            <a class="btn-show">Show now</a>
            <img src="${pageContext.request.contextPath}/static/public/img/Thuc_an_cho_meo.jpg" alt="area" />
          </div>
        </div>
        <div class="step-main">
          <div class="img">
            <a class="btn-show">Show now</a>
            <img src="${pageContext.request.contextPath}/static/public/img/Mien_phi_van_chuyen_meowwoof_khai_truong.jpg" alt="area" />
          </div>
        </div>
      </div>
    </section>

    <!-- area advantage -->
    <section class="area-advantage">
      <div class="step-advantage">
        <i class="fas fa-donate"></i>
        <div class="title">
          <h3>Trả hàng sau 30 ngày</h3>
          <p>Chính sách hoàn trả</p>
        </div>
      </div>
      <div class="step-advantage">
        <i class="fas fa-dolly-flatbed"></i>
        <div class="title">
          <h3>Miễn phí vận chuyển</h3>
          <p>Đối với đơn hàng trên 100k</p>
        </div>
      </div>
      <div class="step-advantage">
        <i class="fas fa-dollar-sign"></i>
        <div class="title">
          <h3>Giá tốt nhấn</h3>
          <p>hàng chuẩn - giá tốt</p>
        </div>
      </div>
      <div class="step-advantage">
        <i class="fas fa-cat"></i>
        <div class="title">
          <h3>Chăm sóc vật nuôi</h3>
          <p>Tư vấn chăm sóc vật nuôi</p>
        </div>
      </div>
    </section>

    <!-- area specially -->
    <section class="area-specially">
      <div class="area-left">
      <a href="/shop-pet/product/detail">
        <img src="${pageContext.request.contextPath}/static/public/img/Thuc-an-cho-cun.jpg" alt="eat" />
      </a>
      </div>
      <div class="area-right">
        <div class="ontop">
          <img src="${pageContext.request.contextPath}/static/public/img/Phu-kien-thu-cung.jpg" alt="phu-kien" />
        </div>
        <div class="onbottom">
          <img src="${pageContext.request.contextPath}/static/public/img/pet-betk.jpg" alt="pet" />
          <img src="${pageContext.request.contextPath}/static/public/img/pet_noen_1.jpg" alt="pet" />
        </div>
      </div>
    </section>
  </main>
