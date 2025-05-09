<%--
  Created by IntelliJ IDEA.
  User: Tạ Mạnh Dũng
  Date: 5/9/2025
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <title>Chi tiết</title>

  <link href="img/favicon.ico" rel="shortcut icon" type="image/x-icon">

  <!-- Bootstrap v5.0.1 -->
  <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
  <script src="js/bootstrap.bundle.js" type="text/javascript"></script>

  <!-- Bootstrap Icons v1.5.0 -->
  <link href="css/bootstrap-icons.css" type="text/css" rel="stylesheet">

  <!-- Custom Styles -->
  <link href="css/styles.css" type="text/css" rel="stylesheet">

  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background-color: #f9f9f9;
      margin: 0;
      padding: 0;
    }

    .container-detail {
      max-width: 1000px;
      margin: 40px auto;
      background-color: #fff;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
      padding: 30px;
      border-radius: 8px;
    }

    h2 {
      text-align: center;
      color: #333;
      margin-bottom: 30px;
    }

    .product-detail {
      display: flex;
      gap: 30px;
      flex-wrap: wrap;
    }

    .product-image {
      flex: 1;
      min-width: 250px;
      text-align: center;
    }

    .product-image img {
      width: 100%;
      max-width: 300px;
      height: auto;
      border-radius: 6px;
    }

    .product-info {
      flex: 2;
      min-width: 300px;
    }

    .product-info p {
      margin: 10px 0;
      font-size: 16px;
      color: #555;
    }

    .product-info strong {
      color: #222;
    }

    .price {
      font-size: 20px;
      font-weight: bold;
      color: #e74c3c;
    }

    .discount {
      font-size: 16px;
      color: #27ae60;
    }

    .buy-button {
      display: inline-block;
      margin-top: 20px;
      padding: 10px 20px;
      font-size: 16px;
      color: white;
      background-color: #3498db;
      border: none;
      border-radius: 4px;
      text-decoration: none;
      cursor: pointer;
      transition: background-color 0.3s;
    }

    .buy-button:hover {
      background-color: #2980b9;
    }
  </style>
</head>

<body>

<header class="section-header">
  <section class="header-main border-bottom">
    <div class="container">
      <div class="row align-items-center">
        <div class="col-lg-3 py-3">
          <a class="text-body" href="./home.html">
            <h3>Shop Bán Sách</h3>
          </a>
        </div> <!-- col.// -->
        <div class="col-lg-4 col-xl-5">
          <form action="#" class="search">
            <div class="input-group w-100">
              <input type="text" class="form-control" placeholder="Nhập từ khóa cần tìm ...">
              <button class="btn btn-primary" type="button">
                <i class="bi bi-search"></i>
              </button>
            </div>
          </form>
        </div> <!-- col.// -->
        <div class="col-lg-5 col-xl-4">
          <ul class="nav col-12 col-lg-auto my-2 my-lg-0 justify-content-center justify-content-lg-end text-small">
            <li>
              <a href="#" class="nav-link text-body">
                <i class="bi bi-person d-block text-center fs-3"></i>
                Tài khoản
              </a>
            </li>
            <li>
              <a href="#" class="nav-link text-body">
                <i class="bi bi-list-check d-block text-center fs-3"></i>
                Đơn hàng
              </a>
            </li>
            <li>
              <a href="#" class="nav-link text-body">
                <i class="bi bi-cart d-block text-center fs-3"></i>
                Giỏ hàng
              </a>
            </li>
          </ul>
        </div> <!-- col.// -->
      </div> <!-- row.// -->
    </div> <!-- container.// -->
  </section> <!-- header-main.// -->
</header> <!-- section-header.// -->

<nav class="navbar navbar-main navbar-expand-lg navbar-light border-bottom">
  <div class="container">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown"
             aria-expanded="false">
            <strong><i class="bi bi-list"></i> Danh mục sản phẩm</strong>
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">Sách giáo khoa</a></li>
            <li><a class="dropdown-item" href="#">Sách khoa học</a></li>
            <li><a class="dropdown-item" href="#">Truyện tranh</a></li>
            <li><a class="dropdown-item" href="#">Tiểu thuyết</a></li>
            <li>
              <hr class="dropdown-divider">
            </li>
            <li><a class="dropdown-item" href="#">Tất cả danh mục</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Sản phẩm mới</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Sản phẩm bán chạy</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Khuyến mãi</a>
        </li>
      </ul>
      <a class="btn btn-light me-2" href="#" role="button">Đăng ký</a>
      <a class="btn btn-primary" href="#" role="button">Đăng nhập</a>
    </div>
  </div> <!-- container.// -->
</nav> <!-- navbar-main.// -->

<section class="section-content mb-2">
  <div class="container">
    <header class="section-heading py-4 d-flex justify-content-between">
    </header> <!-- section-heading.// -->
  </div> <!-- container.// -->
</section> <!-- section-content.// -->

<section class="section-content mb-5">
  <div class="container">
    <div class="container-detail">
      <h2>Chi tiết Sách</h2>
      <div class="product-detail">
        <!-- Ảnh sách -->
        <div class="product-image">
          <img src="${product.imagePath}" alt="Ảnh bìa sách">
        </div>

        <!-- Thông tin sách -->
        <div class="product-info">
          <p><strong>Tên sách:</strong> ${product.name}</p>
          <p><strong>Tác giả:</strong> ${product.author}</p>
          <p><strong>Mô tả:</strong> ${product.description}</p>
          <p><strong>Thể loại:</strong> ${product.category}</p>
          <p><strong>Nhà xuất bản:</strong> ${product.publisher}</p>
          <p><strong>Năm xuất bản:</strong> ${product.publishYear}</p>
          <p><strong>Số trang:</strong> ${product.pages}</p>
          <p class="price"><strong>Giá bán:</strong> ${product.price}₫</p>
          <p><strong>Số lượng còn lại:</strong> ${product.quantity} cuốn</p>
          <p><strong>Danh mục:</strong> ${product.category}</p>
          <a href="#" class="buy-button">Mua ngay</a>
        </div>
      </div>
    </div>


  </div> <!-- container.// -->
</section> <!-- section-content.// -->

<footer class="section-footer">
  <section class="footer-top py-5 bg-light">
    <div class="container">
      <div class="row">
        <aside class="col-sm-6 col-lg-3">
          <h6 class="pb-2">Giới thiệu</h6>
          <ul class="list-unstyled">
            <li><a href="#">Về Shop</a></li>
            <li><a href="#">Tuyển dụng</a></li>
            <li><a href="#">Chính sách thanh toán</a></li>
            <li><a href="#">Chính sách bảo mật</a></li>
            <li><a href="#">Giải quyết khiếu nại</a></li>
            <li><a href="#">Hợp tác</a></li>
          </ul>
        </aside>
        <aside class="col-sm-6 col-lg-3">
          <h6 class="pb-2">Hỗ trợ khách hàng</h6>
          <ul class="list-unstyled">
            <li>Hotline: 1900-80xx</li>
            <li><a href="#">Câu hỏi thường gặp</a></li>
            <li><a href="#">Hướng dẫn đặt hàng</a></li>
            <li><a href="#">Phương thức vận chuyển</a></li>
            <li><a href="#">Chính sách đổi trả</a></li>
          </ul>
        </aside>
        <aside class="col-lg-5">
          <h6 class="pb-2">Đăng ký nhận tin</h6>
          <form action="#">
            <div class="input-group w-100">
              <input type="text" class="form-control" placeholder="Email của bạn ...">
              <button class="btn btn-primary" type="button">
                Đăng ký
              </button>
            </div>
          </form>
        </aside>
      </div> <!-- row.// -->
    </div> <!-- container.// -->
  </section> <!-- footer-top.// -->

  <section class="footer-bottom text-center bg-light border-top py-3">
    <div class="container-fluid">© 2021 — Shop Bán Sách</div> <!-- container-fluid.// -->
  </section> <!-- footer-bottom.// -->
</footer> <!-- section-footer.// -->

</body>

</html>
