<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
	<title>Detail Product</title>
	<meta charset="utf-8">
	<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
  	<Link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/public/img/love.png">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/detailStyle.css" />
</head>
<body>
  <div class="detail-product">
	<!-- TOP NAV -->
	<div class="navbar">
		<a href="#" class="logo">
			<img src="${pageContext.request.contextPath}/static/public/img/logo_MeowWool_2_1_.png" alt="logo" style="width: 30%"/>
		</a>
		<div class="navbar-right menu">
      <a href="${pageContext.request.contextPath}/home"> Home</a>
      <a> Đồ cho chó</a>
      <a> Đồ cho mèo</a>
      <a> About Us</i></a>
		</div>
		<div class="navbar-right">
			<a href="#" class="cart">
				<i class="bx bx-cart-alt"></i>
				<span class="badge">2</span>
			</a>
		</div>
	</div>
	<!-- END TOP NAV -->

	<!-- MAIN -->
	<div id="slider" class="slider">

		<!-- SLIDE 1 -->
		<div class="row fullheight slide">
			<div class="col-6 fullheight">
				<!-- PRODUCT INFO -->
				<div class="product-info">
					<div class="info-wrapper">
						<div class="product-price left-to-right">
							<span>$</span> ${product.price}
						</div>
						<div class="product-name left-to-right">
							<h2>
								${product.name}
							</h2>
						</div>
						<div class="product-size left-to-right">
							<h3>SIZE</h3>
							<div class="size-wrapper">
								<div>M</div>
								<div>L</div>
								<div class="active">XL</div>
							</div>
						</div>
						<div class="product-color left-to-right">
							<h3>COLORS</h3>
							<div class="color-wrapper">
								<div class="active">
									<div class="bg-red"></div>
								</div>
								<div class="">
									<div class="bg-blue"></div>
								</div>
								<div class="">
									<div class="bg-white"></div>
								</div>
							</div>
						</div>
						<div class="product-description left-to-right">
							<p style="color: black"> ${product.description} </p>
						</div>
						<div class="button left-to-right">
							<button>
								Add to cart
							</button>
						</div>
					</div>
				</div>
				<!-- END PRODUCT INFO -->
			</div>
			<div class="col-6 fullheight img-col" style="background-image: linear-gradient(to top right, #e19e95, #fd835c)">
				<!-- PRODUCT IMAGE -->
				<div class="product-img">
					<div class="img-wrapper right-to-left">
						<div class="bounce">
							<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
						</div>
					</div>
				</div>
				<!-- END PRODUCT IMAGE -->
				<!-- PRODUCT MORE IMAGES -->
				<div class="more-images">
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham2.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham3.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham2.jpg" alt="placeholder+image">
					</div>
				</div>
				<!-- ENDPRODUCT MORE IMAGES -->
			</div>
		</div>
		<!-- END SLIDE 1 -->

		<!-- SLIDE 2 -->
		<div class="row fullheight slide">
			<div class="col-6 fullheight">
				<!-- PRODUCT INFO -->
				<div class="product-info">
					<div class="info-wrapper">
						<div class="product-price left-to-right">
							<span>$</span>230
						</div>
						<div class="product-name left-to-right">
							<h2>
								SP III
							</h2>
						</div>
						<div class="product-size left-to-right">
							<h3>SIZE</h3>
							<div class="size-wrapper">
								<div>M</div>
								<div>L</div>
								<div class="active">XL</div>
							</div>
						</div>
						<div class="product-color left-to-right">
							<h3>COLORS</h3>
							<div class="color-wrapper">
								<div class="active">
									<div class="bg-red"></div>
								</div>
								<div class="">
									<div class="bg-blue"></div>
								</div>
								<div class="">
									<div class="bg-white"></div>
								</div>
							</div>
						</div>
						<div class="product-description left-to-right">
							<p style="color: black"> ${product.description}
							</p>
						</div>
						<div class="button left-to-right">
							<button>
								Add to cart
							</button>
						</div>
					</div>
				</div>
				<!-- END PRODUCT INFO -->
			</div>
			<div class="col-6 fullheight img-col" style="background-image: linear-gradient(to top right, #6b6d68, #629f2a)">
				<!-- PRODUCT IMAGE -->
				<div class="product-img">
					<div class="img-wrapper right-to-left">
						<div class="bounce">
							<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
						</div>
					</div>
				</div>
				<!-- END PRODUCT IMAGE -->
				<!-- PRODUCT MORE IMAGES -->
				<div class="more-images">
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham2.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham3.jpg" alt="placeholder+image">
					</div>
				</div>
				<!-- ENDPRODUCT MORE IMAGES -->
			</div>
		</div>
		<!-- END SLIDE 2 -->

		<!-- SLIDE 3 -->
		<div class="row fullheight slide">
			<div class="col-6 fullheight">
				<!-- PRODUCT INFO -->
				<div class="product-info">
					<div class="info-wrapper">
						<div class="product-price left-to-right">
							<span>$</span>230
						</div>
						<div class="product-name left-to-right">
							<h2>
								Sản phẩm II
							</h2>
						</div>
						<div class="product-size left-to-right">
							<h3>SIZE</h3>
							<div class="size-wrapper">
								<div>M</div>
								<div>L</div>
								<div class="active">XL</div>
							</div>
						</div>
						<div class="product-color left-to-right">
							<h3>COLORS</h3>
							<div class="color-wrapper">
								<div class="active">
									<div class="bg-red"></div>
								</div>
								<div class="">
									<div class="bg-blue"></div>
								</div>
								<div class="">
									<div class="bg-white"></div>
								</div>
							</div>
						</div>
						<div class="product-description left-to-right">
							<p style="color: black"> ${product.description} </p>
						</div>
						<div class="button left-to-right">
							<button>
								Add to cart
							</button>
						</div>
					</div>
				</div>
				<!-- END PRODUCT INFO -->
			</div>
			<div class="col-6 fullheight img-col" style="background-image: linear-gradient(to top right, #cdcbd3, #171617)">
				<!-- PRODUCT IMAGE -->
				<div class="product-img">
					<div class="img-wrapper right-to-left">
						<div class="bounce">
							<img src="${pageContext.request.contextPath}/static/public/img/sanpham2.jpg" alt="placeholder+image">
						</div>
					</div>
				</div>
				<!-- END PRODUCT IMAGE -->
				<!-- PRODUCT MORE IMAGES -->
				<div class="more-images">
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham2.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham2.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham3.jpg" alt="placeholder+image">
					</div>
				</div>
				<!-- ENDPRODUCT MORE IMAGES -->
			</div>
		</div>
		<!-- END SLIDE 3 -->

		<!-- SLIDE 4 -->
		<div class="row fullheight slide">
			<div class="col-6 fullheight">
				<!-- PRODUCT INFO -->
				<div class="product-info">
					<div class="info-wrapper">
						<div class="product-price left-to-right">
							<span>$</span>230
						</div>
						<div class="product-name left-to-right">
							<h2>
								Sản phẩm III
							</h2>
						</div>
						<div class="product-size left-to-right">
							<h3>SIZE</h3>
							<div class="size-wrapper">
								<div>M</div>
								<div>L</div>
								<div class="active">XL</div>
							</div>
						</div>
						<div class="product-color left-to-right">
							<h3>COLORS</h3>
							<div class="color-wrapper">
								<div class="active">
									<div class="bg-red"></div>
								</div>
								<div class="">
									<div class="bg-blue"></div>
								</div>
								<div class="">
									<div class="bg-white"></div>
								</div>
							</div>
						</div>
						<div class="product-description left-to-right">
							<p style="color: black"> ${product.description} </p>
						</div>
						<div class="button left-to-right">
							<button>
								Add to cart
							</button>
						</div>
					</div>
				</div>
				<!-- END PRODUCT INFO -->
			</div>
			<div class="col-6 fullheight img-col" style="background-image: linear-gradient(to top right, #32519a, #4967af)">
				<!-- PRODUCT IMAGE -->
				<div class="product-img">
					<div class="img-wrapper right-to-left">
						<div class="bounce">
							<img src="${pageContext.request.contextPath}/static/public/img/sanpham3.jpg" alt="placeholder+image">
						</div>
					</div>
				</div>
				<!-- END PRODUCT IMAGE -->
				<!-- PRODUCT MORE IMAGES -->
				<div class="more-images">
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham3.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham2.jpg" alt="placeholder+image">
					</div>
					<div class="more-images-item bottom-up">
						<img src="${pageContext.request.contextPath}/static/public/img/sanpham3.jpg" alt="placeholder+image">
					</div>
				</div>
				<!-- ENDPRODUCT MORE IMAGES -->
			</div>
		</div>
		<!-- END SLIDE 4 -->

		<!-- SLIDE CONTROL -->
		<div id="slide-control" class="slide-control">
			<div class="slide-control-item">
				<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
			</div>
			<div class="slide-control-item">
				<img src="${pageContext.request.contextPath}/static/public/img/sanpham.jpg" alt="placeholder+image">
			</div>
			<div class="slide-control-item">
				<img src="${pageContext.request.contextPath}/static/public/img/sanpham2.jpg" alt="placeholder+image">
			</div>
			<div class="slide-control-item">
				<img src="${pageContext.request.contextPath}/static/public/img/sanpham3.jpg" alt="placeholder+image">
			</div>
		</div>
		<!-- END SLIDE CONTROL -->
	</div>
	<!-- END MAIN -->

	<!-- MODAL -->
	<div id="modal" class="modal">
		<span id="modal-close" class="close" style="position: fixed;">&times;</span>
		<img id="modal-content" class="modal-content">
		<div class="more-images">
			<div class="more-images-item">
				<img class="img-preview">
			</div>
			<div class="more-images-item">
				<img class="img-preview">
			</div>
			<div class="more-images-item">
				<img class="img-preview">
			</div>
			<div class="more-images-item">
				<img class="img-preview">
			</div>
		</div>
	</div>
	<!-- END MODAL -->
  </div>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/detailJs.js"></script>
</body>
</html>