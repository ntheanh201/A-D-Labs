<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

	<jsp:include page="/views/common/head.jsp"></jsp:include>
	<jsp:include page="/views/common/header.jsp"></jsp:include>
	
    <div class="contain form-login" id="form-login">
        <div class="wapper" onclick="showFormLogin()"></div>
        <div class="form-common">
            <div class="content-left login-right">
                <h2>Đăng nhập</h2>
                <p>
                    Đăng nhập
                    để nhận theo dõi đơn hàng, lưu
                    
                    danh sách sản phẩm ưu thích, nhận
               
                    nhiều ưu đãi hấp dẫn
                </p>
                <img src="/public/img/do-choi-cho-thu-cung.jpg" alt="img">
            </div>
            <div class="content-right login-right">
                
                <div class="form-input input-login">
                    <form action="" method="post" class="login">
                        <div class="form-item">
                            <label for="username">Tên đăng nhập</label>
                            <input type="text" name="username" id="username" placeholder="Nhập tên đăng nhập"
                                class="input-item">
                        </div>
                        <div class="form-item">
                            <label for="password">Mật khẩu</label>
                            <input type="password" name="password" id="password" placeholder="Nhập mật khẩu từ 6 đến 32 ký tự"
                                class="input-item">
                        </div>
                        <div style="padding-left: 25%;" >
                            <p class="forgot-password" style="margin-bottom: 20px;">
                                Quên mật khẩu? Nhấn vào
                                <a href="#">đây</a>
                            </p>
                            <button type="button" class="userbutton button-login">Đăng nhập</button>
                            <button type="button" class="button-login-with-facebook">
                                <span class="button-face">
                                    <i class="fab fa-facebook-square"></i>
                                    Đăng nhập bằng Facebook
                                </span>
                            </button>
                            <button type="button" class="button-login-with-google">
                                <span class="button-google">
                                    <i class="fab fa-google-plus-g"></i>
                                    Đăng nhập bằng Google
                                </span>
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
     <jsp:include page="/views/common/end.jsp"></jsp:include>