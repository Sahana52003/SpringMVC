<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-Up</title>
    <link rel="stylesheet" href="static/style.css">

<style>
body {
    margin: 0;
    background-color: white;
    display: flex;
    flex-direction: column;
    height: 100vh;
}

/* Navbar */
.navbar {
    display: flex;
    justify-content: space-between;
    align-items: center;
    background-color: black;
    padding: 15px 40px;
}

.nav-left {
    color: white;
    font-size: 22px;
    font-weight: bold;
}

.nav-right {
    display: flex;
    align-items: center;
    gap: 15px;
}

.nav-right a {
    color: white;
    text-decoration: none;
    font-weight: bold;
}

.nav-right a:hover {
    text-decoration: none;
}

/* Search bar */
.search-box input {
    padding: 5px 10px;
    border-radius: 5px;
    border: none;
    outline: none;
}

/* Center content */
.container {
    flex: 1;
    display: flex;
    justify-content: center;
    align-items: center;
}

/* Form box */
.home {
    background-color: #ffffff;
    padding: 40px 60px;
    border-radius: 10px;
    box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
    text-align: center;
}

.home h1 {
    color: black;
}
</style>
</head>

<body>

<!-- Navbar -->
<div class="navbar">
    <div class="nav-left">
        X-workz
    </div>

    <div class="nav-right">
        <a href="/contact">Contact Me</a>
        <div class="search-box">
            <input type="text" placeholder="Search...">
        </div>
    </div>
</div>

<!-- Centered Content -->
<div class="container">
    <div class="home">
        <form action="home" method="post">
            <h1>Login Successfully</h1>
        </form>
    </div>
</div>

</body>
</html>
