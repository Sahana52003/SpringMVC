package com.xworkz.homepage.dto;


import java.util.Objects;


public class HomepageDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String signup;
    private String signin;
    private String confirmpassword;

    public String getConfirmpassword() {
        return confirmpassword;
    }
    public HomepageDTO() {
        System.out.println("HomepageDTO is Called");
    }
    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getSignup() {
        return signup;
    }

    public void setSignup(String signup) {
        this.signup = signup;
    }

    public String getSignin() {
        return signin;
    }

    public void setSignin(String signin) {
        this.signin = signin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HomepageDTO(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public HomepageDTO(String firstName, String lastName, String email, String password, String signup, String signin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.signup = signup;
        this.signin = signin;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HomepageDTO that = (HomepageDTO) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(signup, that.signup) && Objects.equals(signin, that.signin) && Objects.equals(confirmpassword, that.confirmpassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, password, signup, signin, confirmpassword);
    }

    @Override
    public String toString() {
        return "HomepageDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", signup='" + signup + '\'' +
                ", signin='" + signin + '\'' +
                ", confirmpassword='" + confirmpassword + '\'' +
                '}';
    }

    public HomepageDTO(String firstName, String lastName, String email, String password, String signup, String signin, String confirmpassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.signup = signup;
        this.signin = signin;
        this.confirmpassword = confirmpassword;
    }
}
