package com.example.software_patterns;

public class Users {

    String firstName, email;


    public Users() {
    }

    public Users(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
