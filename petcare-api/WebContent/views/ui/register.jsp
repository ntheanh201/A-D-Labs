<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

	<jsp:include page="/views/common/head.jsp"></jsp:include>
	<jsp:include page="/views/common/header.jsp"></jsp:include>
	
    <div class="contain form-login" id="form-login">
        <div class="wapper" onclick="showFormLogin()"></div>
        <div class="form-common">
            <div class="content-left signin-right">
                <h2 style="text-align: center;">Đăng ký</h2>
                <p>
                    Đăng ký
                    để nhận theo dõi đơn hàng, lưu
                    <br>
                    danh sách sản phẩm ưu thích, nhận
                    <br>
                    nhiều ưu đãi hấp dẫn
                </p>
                <img src="/public/img/do-choi-cho-thu-cung.jpg" alt="img">
            </div>
            <div class="content-right signin-right">

                <div class="form-input input-login">
                    <form action="" method="post" class="login">
                        <div class="form-item ">
                            <label for="full-name">Họ tên</label>
                            <input type="text" name="full-name" id="full-name" placeholder="Nhập họ tên"
                                class="input-item">
                        </div>
                        <div class="form-item">
                            <label for="username">Tên đăng nhập</label>
                            <input type="text" name="username" id="username" placeholder="Nhập tên đăng nhập"
                                class="input-item">
                        </div>
                        <div class="form-item">
                            <label for="password">Mật khẩu</label>
                            <input type="password" name="password" id="password"
                                placeholder="Nhập mật khẩu từ 6 đến 32 ký tự" class="input-item">
                        </div>
                        <div class="form-item">
                            <label for="re-password">Nhập lại mật khẩu</label>
                            <input type="password" name="re-password" id="re-password" placeholder="Nhập lại mật khẩu"
                                class="input-item">
                        </div>
                        <div class="form-item ">
                            <label for="email">Email</label>
                            <input type="text" name="email" id="email" placeholder="Nhập email" class="input-item">
                        </div>
                        <div class="form-item date" id="birthday-hol">
                            <label for="birthday">Ngày sinh</label>
                            <input autocomplete="off" class="input-item" data-date-format="DD/MM/YYYY" data-val="true"
                                data-val-date="The field Sinh nhật must be a date." id="Birthday" name="Birthday"
                                placeholder="Ngày sinh (dd/mm/yyyy)" type="text" value="">
                        </div>
                        <div style="padding-left: 27%;">
                            <button type="button" class="userbutton button-signin">Đăng ký</button>
                        </div>
                </div>

                </form>
            </div>
        </div>
    </div>
    
      <jsp:include page="/views/common/end.jsp"></jsp:include>