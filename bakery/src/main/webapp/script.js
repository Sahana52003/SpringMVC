function validateForm() {

        let name = document.getElementById("name").value.trim();
        let cost = parseFloat(document.getElementById("cost").value);
        let mobileNumber = document.getElementById("mobileNumber").value.trim();
        let color = document.getElementById("color").value.trim();
        let delivered = document.getElementById("delivered").checked;
        let code = document.getElementById("code").value.trim();
        let value = parseFloat(document.getElementById("value").value);
        let idNumber = document.getElementById("idNumber").value.trim();
        let comments = document.getElementById("comments").value.trim();
        let ratings = parseInt(document.getElementById("ratings").value);

        if (name === "") {
        alert("Name is required");
        return false;
        }
        if (isNaN(cost) || cost <= 0) {
        alert("Cost must be a positive number"); return false; }
        if (!/^\d{10}$/.test(mobileNumber)) {
        alert("Mobile number must be exactly 10 digits"); return false; }
        if (color === "") {
        alert("Color is required"); return false; }
        if (!delivered) {
        alert("Please confirm delivery"); return false; }
        if (code === "") {
        alert("Code is required"); return false; }
        if (isNaN(value) || value <= 0) {
         alert("Value must be a positive number"); return false; }
        if (!test(idNumber)) {
         alert("ID Number must be numeric"); return false; }
        if (comments === "") {
         alert("Comments are required"); return false; }
        if (isNaN(ratings) || ratings < 1 || ratings > 5) {
        alert("Ratings must be between 1 and 5"); return false; }

        alert("Form submitted successfully!");
        return true;
        }
        }