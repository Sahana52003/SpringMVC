<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-Up</title>
</head>
<body>
<form action="status" method="post" onsubmit="return validateSignup()">

    <input type="text" name="firstName" placeholder="First Name">

    <input type="text" name="lastName" placeholder="Last Name">

    <input type="email" name="email" placeholder="Email">

    <input type="password" name="password" placeholder="Password">

    <input type="password" name="confirmpassword" placeholder="Confirm Password">

    <button type="submit">Sign Up</button>
</form>
<script src="script.js"></script>
</body>
</html>