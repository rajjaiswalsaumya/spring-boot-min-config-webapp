<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" type="text/css">

</head>
<body>
<body onload="document.f.username.focus();">
<div class="container">
    <div class="content">

        <c:if test="${param.logout}">
            <p class="alert">You have been logged out</p>
        </c:if>

        <p>
            <form:errors path="userName" cssClass="alert alert-error" cssStyle="color: #ff0000;"/><br/>
            <form:errors path="passWord" cssClass="alert alert-error" cssStyle="color: #ff0000;"/><br/>
        </p>

        <form:errors path="*" class="alert alert-error"/>
        <h2>Login with Username and Password</h2>
        <form:form name="form" action="/login" method="POST" modelAttribute="user">
            <form:input path="userName" placeholder="Username"/>
            <form:password path="passWord" placeholder="Password"/>
            </fieldset>
            <input type="submit" id="login" value="Login"
                   class="btn btn-primary"/>
        </form:form>
    </div>
</div>
</body>
</body>
</html>