function validateForm() {

    const name = document.forms[0].name.value.trim();
    const cost = parseFloat(document.forms[0].cost.value);
    const mobileNumber = document.forms[0].mobileNumber.value;
    const color = document.forms[0].color.value.trim();
    const delivered = document.forms[0].delivered.checked;
    const code = document.forms[0].code.value.trim();
    const value = parseFloat(document.forms[0].value.value);
    const idNumber = document.forms[0].idNumber.value;
    const comments = document.forms[0].comments.value.trim();
    const ratings = parseInt(document.forms[0].ratings.value);

    
    if (name === "") {
        alert("Name is required");
       
        return false;
    }

   
    if (isNaN(cost) || cost <= 0) {
        alert("Cost must be a positive number");
        return false;
    }

 
    if (!/^\d{10}$/.test(mobileNumber)) {
        alert("Mobile number must be exactly 10 digits");
        return false;
    }

  
    if (color === "") {
        alert("Color is required");
        return false;
    }

    if (!delivered) {
        alert("Please confirm delivery");
        return false;
    }

 
    if (code === "") {
        alert("Code is required");
        return false;
    }

 
    if (isNaN(value) || value <= 0) {
        alert("Value must be a positive number");
        return false;
    }

    if (!/^\d+$/.test(idNumber)) {
        alert("ID Number must be numeric");
        return false;
    }

   
    if (comments === "") {
        alert("Comments are required");
        return false;
    }


    if (isNaN(ratings) || ratings < 1 || ratings > 5) {
        alert("Ratings must be between 1 and 5");
        return false;
    }

    return true;
}
