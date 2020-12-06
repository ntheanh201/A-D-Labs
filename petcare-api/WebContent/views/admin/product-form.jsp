<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
    <title>Product</title>
  </head>
  <body>
	<div id="layout" class="pure-g">
      <div class="sidebar pure-u-1 pure-u-md-4-24">
        <div id="menu">
          <div class="pure-menu">
            <p class="pure-menu-heading">
              PetCare Admin
              <a href="../login" class="pure-button button-xxsmall"
                >OUT &raquo;</a
              >
            </p>
            <ul class="pure-menu-list">
              <li>
                <a href="../dashboard" class="pure-menu-link">Dashboard</a>
              </li>
              <li class="pure-menu-selected">
                <a href="../products" class="pure-menu-link">Products</a>
              </li>
              <li>
                <a href="../orders" class="pure-menu-link">Orders</a>
              </li>
              <li>
                <a href="../customers" class="pure-menu-link">Customers</a>
              </li>
              <li class="menu-item-divided">
                <a href="../profile" class="pure-menu-link">Profile</a>
              </li>
            </ul>
          </div>
        </div>
      </div>

      <div class="content pure-u-1 pure-u-md-20-24">
        <div class="header-small">
          <div class="items">
            <h1 class="subhead">Product Form</h1>

            <!-- <aside class="pure-message message-success">
              <p><strong>SUCCESS</strong>: Success message.</p>
            </aside>
            <aside class="pure-message message-error">
              <p><strong>ERROR</strong>: Error message.</p>
            </aside>
            <aside class="pure-message message-warning">
              <p><strong>WARNING</strong>: Warning message.</p>
            </aside> -->
            <c:url value="/admin/products/addProduct" var="addPrdUrl"></c:url>
            <form
              action="${addPrdUrl}"
              method="post"
              enctype="multipart/form-data"
              class="pure-form pure-form-stacked"
            >
              <fieldset>
                <label for="title">Name</label>
                <input
                  id="title"
                  type="text"
                  placeholder="Name"
                  class="pure-input-1"
                  value=""
                />

                <label for="content">Description</label>
                <textarea
                  id="content"
                  class="pure-input-1"
                  rows="10"
                ></textarea>

                <label for="image">Image</label>
                <input
                  type="file"
                  name="photo"
                  required
                  class="form-control file-image"
                />

                <label for="price">Price</label>
                <input
                  id="price"
                  type="text"
                  placeholder="Price"
                  class="pure-input-1"
                  value=""
                />

                <div class="form-group">
                  <label for="category">Category</label> *
                  <a
                    href="${pageContext.request.contextPath}/admin/cate/addCategory"
                  >
                    Add New Category
                  </a>
                  <select class="form-control" id="category" name="category_ID">
                    <c:forEach items="${categories}" var="cate">
                      <option value="${cate.getId()}">${cate.getName()}</option>
                    </c:forEach>
                  </select>
                </div>
                <!-- <label for="status">Status</label>
                <select id="status" class="pure-input-1">
                  <option value="1">Passive</option>
                  <option value="2">Draft</option>
                  <option value="3">Awaiting</option>
                  <option value="4">Active</option>
                </select> -->

                <input type="hidden" name="id" value="1" />
                <button type="submit" class="pure-button button-success">
                  Add
                </button>
              </fieldset>
            </form>
          </div>
        </div>
      </div>
    </div>  	
  </body>
</html>
