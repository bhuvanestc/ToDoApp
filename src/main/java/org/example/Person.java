package org.example;

public class Person {
    private int id;
    private String firstName;
    private String lastName;



    private String email;

    public Person() {
        this.id = id;
        setFirstname(firstName);
        setLastname(lastName);
        setEmail(email);


    }
    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("FirstName cannot be null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastname(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("LastName cannot be null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email cannot be null");
        this.email = email;
    }

    public String getSummary(){
        return this.toString();
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }






}
