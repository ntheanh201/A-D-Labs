<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/static/css/admin-style.css"
    />
   
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/static/css/pure-min.css"
    />
     <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/static/css/pure-responsive-min.css"
    />
    <title>PetCare Products</title>
  </head>
  <body>
    <div id="layout" class="pure-g">
      <div class="sidebar pure-u-1 pure-u-md-4-24">
        <div id="menu">
          <div class="pure-menu">
            <p class="pure-menu-heading">
              PetCare
              <a href="./login" class="pure-button button-xxsmall"
                >OUT &raquo;</a
              >
            </p>
            <ul class="pure-menu-list">
              <li>
                <a href="./dashboard" class="pure-menu-link">Dashboard</a>
              </li>
              <li class="pure-menu-selected">
                <a href="./products" class="pure-menu-link">Products</a>
              </li>
              <li>
                <a href="./orders" class="pure-menu-link">Orders</a>
              </li>
              <li>
                <a href="./customers" class="pure-menu-link">Customers</a>
              </li>
              <li class="menu-item-divided">
                <a href="./profile" class="pure-menu-link">Profile</a>
              </li>
            </ul>
          </div>
        </div>
      </div>

      <div class="content pure-u-1 pure-u-md-21-24">
        <div class="header-small">
          <div class="items">
            <h1 class="subhead">
              Product List
              <a
                class="pure-button button-small button-secondary"
                href="./products/addProduct"
                >Add New</a
              >
            </h1>

            <!-- <aside class="pure-message message-success">
                <p><strong>SUCCESS</strong>: Success message.</p>
              </aside>
              <aside class="pure-message message-error">
                <p><strong>ERROR</strong>: Error message.</p>
              </aside>
              <aside class="pure-message message-warning">
                <p><strong>WARNING</strong>: Warning message.</p>
              </aside> -->

            <table class="pure-table pure-table-bordered">
              <thead>
                <tr>
                  <th>#</th>
                  <th>Name</th>
                  <th>Description</th>
                  <th>Supplier</th>
                  <th>Action</th>
                </tr>
              </thead>

              <tbody>
                <tr>
                  <td>1</td>
                  <td>Prodct 1</td>
                  <td>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit.
                  </td>
                  <td>VinGroup</td>
                  <td>
                    <a
                      class="pure-button button-small button-secondary"
                      href="#"
                      >View</a
                    >
                    <a
                      class="pure-button button-small button-success"
                      href="post-form.html"
                      >Edit</a
                    >
                    <a
                      class="pure-button button-small button-error"
                      href="#"
                      onclick="return confirm('Are you sure?');"
                      >Delete</a
                    >
                  </td>
                </tr>
                <tr>
                  <td>2</td>
                  <td>Product 2</td>
                  <td>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit
                  </td>
                  <td>Masan</td>
                  <td>
                    <a
                      class="pure-button button-small button-secondary"
                      href="#"
                      >View</a
                    >
                    <a
                      class="pure-button button-small button-success"
                      href="post-form.html"
                      >Edit</a
                    >
                    <a
                      class="pure-button button-small button-error"
                      href="#"
                      onclick="return confirm('Are you sure?');"
                      >Delete</a
                    >
                  </td>
                </tr>
              </tbody>
            </table>
          </div>

          <!-- <div class="navigation">
              <div class="pure-button-group">
                <a href="#" class="pure-button">Prev</a>
                <a href="#" class="pure-button">Next</a>
              </div>
            </div> -->
        </div>
      </div>
    </div>
  </body>
</html>
