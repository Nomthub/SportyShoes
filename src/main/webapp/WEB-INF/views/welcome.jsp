<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<%@ include file="header.jsp" %>
</head>
<body>
<h1>Welcome to Sporty Shoes</h1>
<c:choose>
    <c:when user = Admin   password = "@dm!n">
      <%@ include file="AdminWork.jsp" %>  
    </c:when>
    <c:otherwise>
        <%@ include file="listProducts.jsp" %>
    </c:otherwise>
</c:choose>
</body>
</html>