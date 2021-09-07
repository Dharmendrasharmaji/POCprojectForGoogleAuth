<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <head>
        <title>Home</title>
    </head>
    <body>

        <div Style="text-align: center;margin-top:20vh">
            <img Style="border-radius:5%" src="${user_pic_url}" alt="" />
        </div>
        <h1 Style="text-shadow: 1px 1px 2px black;color:blue;text-align: center;margin-top:5vh">Welcome ${name}</h1>
        <h3 Style="text-shadow: 1px 1px 1px black;color:brown;text-align: center">You are successfully authenticated with google account ${email}.</h3>
    </body>
</html>