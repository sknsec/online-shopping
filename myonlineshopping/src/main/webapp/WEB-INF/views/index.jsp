<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>

<%-- <c:set var=contextRoot value="${pageContext.request.contextPath}"></c:set> --%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}</title>
    <script>
      window.menu='${title}';
    </script>

    <!-- Bootstrap Core CSS -->
     <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${css}/myapp.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation comes here -->
    <%@include file="./shared/navbar.jsp" %>
    
    <div>
    
       <!-- Page Content (Home page is loading here)   -->
     <c:if test="${userClickHome==true}">
       <%@include file="home.jsp" %>
     </c:if>    
     
      <c:if test="${userClickAbout==true}">
       <%@include file="about.jsp" %>
     </c:if>   
     
      <c:if test="${userClickContact==true}">
       <%@include file="contact.jsp" %>
     </c:if>  
     
       <c:if test="${userClickAllProducts==true or userClickCategoryProducts==true }">
       <%@include file="listProduct.jsp" %>
     </c:if>  
     
      
        <!-- /.container -->
     
    <!--  Footer comes here -->
    <%@include file="./shared/footer.jsp" %>
    
    </div>

    <!-- jQuery -->
 <script src="${js}/jquery.js"></script>
    <%-- <script src="vendor/bootstrap${js}/bootstrap.bundle.min.js"></script> --%>
    <script src="${js}/bootstrap.min.js"></script>

</body>

</html>
