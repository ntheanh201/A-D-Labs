<%@page import="java.util.ArrayList"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.Item"%>
<%@page import="java.util.List"%>
<%@page import="dao.impl.ItemDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Store | Items</title>
        <link rel="stylesheet" href="css/items.css">
        <style>
            /*            div{
                            width: 20%;
                            text-align: right;
                        }*/
            html, body {
                height: 100%;
                margin: 0px;
            } 
        </style>
    </head>
    <bodytyle="background-color: azure; height: 200px"">
        <jsp:include page="/common/header.jsp"></jsp:include>
        <jsp:include page="/items.jsp"></jsp:include>
    </body>
</html>
