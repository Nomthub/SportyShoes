<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<%@ include file="header.jsp" %>
</head>
<body>
<main class="login-form">
  <div class="cotainer">
    <div class="row justify-content-center">
      <div class="col-md-8">
        <div class="card">
          <div class="card-header">
            Login 
          </div>
          <div class="card-body">
          
          <h3 class="text-danger">${msg}</h3>
          
            <form action="${pageContext.request.contextPath}/loginUser" method="post" modelattribute="form">
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Login Id<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="text" id="login"  class="form-control" placeholder="Enter Login Id"
                    name="login" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              <div class="form-group row">
                <label for="password"
                  class="col-md-4 col-form-label text-md-right">Password<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="password" id="password" class="form-control" placeholder="Enter Password"
                    name="password" value="" >
                    <font color="red"> </font>
                </div>
              </div>
              <div class="col-md-6 offset-md-4">
                <input type="submit" class="btn btn-primary" name="operation" value="Login">
              </div>
            </form> 
          </div>
        </div>
      </div>
    </div>
  </div>
  </main>
