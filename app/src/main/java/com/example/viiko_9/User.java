package com.example.viiko_9;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String degreeProgram;

    public User(String firstName, String lastName, String email, String degreeProgram){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getDegreeProgram() {
        return degreeProgram;
    }
}
