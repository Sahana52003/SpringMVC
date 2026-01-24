<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-In</title>
</head>
<body>
<form class="row g-3" action="status" method="post">
    <div class="row g-3">
        <div class="col">
            <input type="text" class="form-control" placeholder="First name" aria-label="First name" name="firstName">
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="Last name" aria-label="Last name" name="lastName">
        </div>
    </div>
    <div class="col-md-6">
        <label for="inputEmail4" class="form-label">Email</label>
        <input type="email" class="form-control" id="inputEmail4" name="email">
    </div>
    <div class="col-md-6">
        <label for="inputPassword4" class="form-label">Password</label>
        <input type="password" class="form-control" id="inputPassword4" name="password">
    </div>
    <div class="col-md-6">
        <label for="inputPassword4" class="form-label">Confirm Password</label>
        <input type="password" class="form-control" id="inputPassword4" name="confirmpassword">
    </div>
    <div class="col-12">
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="gridCheck">
            <label class="form-check-label" for="gridCheck">
                Check me out
            </label>
        </div>
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
</form>
</body>
</html>