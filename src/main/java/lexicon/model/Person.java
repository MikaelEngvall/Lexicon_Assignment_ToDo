package lexicon.model;

import lexicon.AppUser;

import java.util.Objects;

public class Person {

    // ******
    // Fields
    // ******

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    // **************d
    // Constructor(s)
    // **************

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    // *******
    // Methods
    // *******


    // ******************************************
    // Overridden methods from 'java.lang.Object'
    // ******************************************

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(this.firstName, person.getFirstName()) &&
                Objects.equals(this.lastName, person.getLastName()) &&
                Objects.equals(this.email, person.getEmail());
    }

    @Override
    public String toString() {
        return "Person { id: " + getId() + ", name: " + getFirstName() + " " + getLastName() + // when called, prints out all fields except credentials
                ", email: " + getEmail() + " }";
    }

    // *****************
    // Getters & Setters
    // *****************

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("First name cannot be null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("Last name cannot be null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email cannot be null");
        this.email = email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }
}
