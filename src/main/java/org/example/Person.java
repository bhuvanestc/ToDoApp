package org.example;

public class Person {
    private int id;
    private String firstname;
    private String lastname;
    private String email;

    public Person() {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname == null) throw new IllegalArgumentException("FirstName cannot be null");
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (lastname == null) throw new IllegalArgumentException("LastName cannot be null");
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email cannot be null");
        this.email = email;
    }

    public String getSummary(int id, String firstname,String lastname, String email)
    {
        return "Person{ Id=" + id + ", firstName='" + firstname + ", lastName='" + lastname + '}';
    }


}
