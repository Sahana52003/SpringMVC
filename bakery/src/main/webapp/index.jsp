

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport-Registeration</title>
</head>
<body>
        <form action="status" method="post" onsubmit="return validateForm()">
        <input type="text" placeholder="Enter your name" name="name">
        <input type="number" placeholder="Total Cost" name="cost">
        <input type="number" placeholder="Enter mobileNumber" name="mobileNumber">
        <input type="text" placeholder="Color PAck" name="color">
        <input type="checkbox" name="delivered" value="true">
        <input type="text" placeholder="Their code e.g C" name="code">
        <input type="number" placeholder="e.g 58767278" name="value">
        <input type="number" placeholder="ID_NUMber " name="idNumber">
        <input type="text" placeholder="Enter comments here" name="comments">
        <input type="number" placeholder="Ratings are" name="ratings">
        <script src="script.js"></script>
        <button type="submit">Submit</button>
    </form>
    <script src="script.js"></script>
</body>

</html>
