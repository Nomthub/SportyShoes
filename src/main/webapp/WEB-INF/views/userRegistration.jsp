<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<%@ include file="header.jsp" %>
</head>
<body>
<main class="login-form">
  <div class="cotainer">
    <div class="row justify-content-center">
      <div class="col-md-8">
        <div class="card">
          <div class="card-header">
            User Registration
            
          </div>
          <div class="card-body">
          <h3 class="text-success">${msg}</h3>
            <form action="${pageContext.request.contextPath}/saveUser" method="post" modelattribute="form">
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">First Name<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text"   class="form-control" placeholder="Enter First Name"
                    name="firstName" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Last Name<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text"   class="form-control" placeholder="Enter Last Name"
                    name="lastName" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              
                 <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Email<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text"   class="form-control" placeholder="Enter email"
                    name="email" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Login Id<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text" id="email_address"  class="form-control" placeholder="Enter Login Id"
                    name="login" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Password<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="password" id="email_address"  class="form-control" placeholder="Enter password"
                    name="password" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Mobile No.<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text" id="email_address"  class="form-control" placeholder="Enter Mobile No"
                    name="mobile" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              <div class="col-md-6 offset-md-4">
                <input type="submit" class="btn btn-primary" name="operation" value="Register">
                
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  </main>
</body>
</html>