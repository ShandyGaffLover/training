<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8" />
    <title>login</title>
</head>
<body>
	<h1>login</h1>
	<p>ユーザ名とパスワードを入力してログインをしてください.</p>
	<form action="/login" method="post" autocomplete="off">
        <label for="name">ユーザ名</label>
        <input type="text" name="username" id="username" placeholder="ユーザ名を入力して下さい" />
        <br />
        <label for="password">パスワード</label>
        <input type="password" name="password" id="password" placeholder="パスワードを入力して下さい" />
	    <br />
	    <button type="submit">ログイン</button>
	</form>
</body>
</html>