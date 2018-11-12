<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>hello</title>
</head>
<body>
	<h1>hello</h1>
	<p>${greeting}</p>
	<c:url var="logoutUrl" value="/logout" />
	<form action="${logoutUrl}" method="post">
		<input type="submit" value="logout" />
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>

</body>
</html>