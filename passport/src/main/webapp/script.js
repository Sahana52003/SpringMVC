function validatePassportForm() {

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value.trim();
    let phoneNumber = document.getElementById("phoneNumber").value.trim();
    let gender = document.getElementById("gender").value.trim();
    let nationality = document.getElementById("nationality").value.trim();
    let address = document.getElementById("address").value.trim();
    let country = document.getElementById("country").value.trim();
    let pincode = document.getElementById("pincode").value.trim();
    let state = document.getElementById("state").value.trim();

    // Name validation
    if (name.length <= 3 || name.length > 20) {
        alert("Name must be between 4 and 20 characters");
        return false;
    }

    // Email validation
    if (!email.includes("@") || !email.includes(".")) {
        alert("Please enter a valid email");
        return false;
    }

    // Password validation (numeric)
    let pwd = parseInt(password);
    if (isNaN(pwd) || pwd < 1000 || pwd > 999999) {
        alert("Password must be a number between 1000 and 999999");
        return false;
    }

    // Phone number validation
    if (phoneNumber.length !== 10 || isNaN(phoneNumber)) {
        alert("Phone number must be exactly 10 digits");
        return false;
    }

    // Gender validation
    if (gender === "") {
        alert("Gender is required");
        return false;
    }

    // Nationality validation
    if (nationality === "") {
        alert("Nationality is required");
        return false;
    }

    // Address validation
    if (address === "") {
        alert("Address is required");
        return false;
    }

    // Country validation
    if (country === "") {
        alert("Country is required");
        return false;
    }

    // Pincode validation
    if (pincode.length !== 6 || isNaN(pincode)) {
        alert("Pincode must be 6 digits");
        return false;
    }

    // State validation
    if (state === "") {
        alert("State is required");
        return false;
    }

    // All validations passed
    return true;
}
