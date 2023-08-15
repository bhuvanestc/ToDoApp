package org.example;
import java.util.Objects;

public class Person {


    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id ,String firstName, String lastName,String email) {
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

    public String getLastname() {
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
        System.out.println(this.toString());
        return  this.toString();

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
