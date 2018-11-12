<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8" />
    <title>login</title>
</head>
<body>
	<h1>login</h1>
	<p></p>

	<form action="/sample001/login" method="post" >
        <label for="username">username</label>
        <input type="text" name="username" id="username" placeholder="Input username, please." />
        <br />
        <label for="password">password</label>
        <input type="password" name="password" id="password" placeholder="Input password, please." />
	    <br />
	    <button type="submit">login</button>
	    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</body>
</html>