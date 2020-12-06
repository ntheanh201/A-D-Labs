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
    <title>PetCare Dashboard</title>
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
              <li class="pure-menu-selected">
                <a href="./dashboard" class="pure-menu-link">Dashboard</a>
              </li>
              <li>
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
            <h1 class="subhead">Dashboard</h1>
          </div>

          <div class="pure-g">
            <div class="pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
              <div class="column-block">
                <div class="column-block-header column-success">
                  <h2>Customers</h2>
                  <span class="column-block-info"
                    >500 <span>this month</span></span
                  >
                </div>
                <ul class="column-block-list">
                  <li>
                    Today
                    <span class="buble-success button-small pull-right">2</span>
                  </li>
                  <li>
                    Yesterday
                    <span class="buble-secondary button-small pull-right"
                      >50</span
                    >
                  </li>
                  <li>
                    Total
                    <span class="buble-warning button-small pull-right"
                      >2200</span
                    >
                  </li>
                </ul>
              </div>
            </div>

            <div class="pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
              <div class="column-block">
                <div class="column-block-header column-warning">
                  <h2>Products</h2>
                  <span class="column-block-info"
                    >1000 <span>this month</span></span
                  >
                </div>
                <ul class="column-block-list">
                  <li>
                    Today
                    <span class="buble-success button-small pull-right"
                      >100</span
                    >
                  </li>
                  <li>
                    Yesterday
                    <span class="buble-secondary button-small pull-right"
                      >1000</span
                    >
                  </li>
                  <li>
                    Total
                    <span class="buble-warning button-small pull-right"
                      >10000</span
                    >
                  </li>
                </ul>
              </div>
            </div>

            <div class="pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
              <div class="column-block">
                <div class="column-block-header">
                  <h2>Orders</h2>
                  <span class="column-block-info"
                    >300 <span>this month</span></span
                  >
                </div>
                <ul class="column-block-list">
                  <li>
                    Today
                    <span class="buble-success button-small pull-right"
                      >20</span
                    >
                  </li>
                  <li>
                    Yesterday
                    <span class="buble-secondary button-small pull-right"
                      >40</span
                    >
                  </li>
                  <li>
                    Total
                    <span class="buble-warning button-small pull-right"
                      >3500</span
                    >
                  </li>
                </ul>
              </div>
            </div>
          </div>

          <div class="pure-g">
            <div class="pure-u-1">
              <div class="column-block">
                <table class="pure-table pure-table-horizontal">
                  <thead>
                    <tr>
                      <th>#</th>
                      <th>Name</th>
                      <th>Email</th>
                      <th>Status</th>
                    </tr>
                  </thead>

                  <tbody>
                    <tr>
                      <td>1</td>
                      <td>Full Name 1</td>
                      <td>nickname1@domain.local</td>
                      <td>Active</td>
                    </tr>
                    <tr>
                      <td>2</td>
                      <td>Full Name 2</td>
                      <td>nickname2@domain.local</td>
                      <td>Awaiting</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
