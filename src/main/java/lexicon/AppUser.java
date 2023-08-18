package lexicon;

import java.util.Objects;

public class AppUser {

    // ******
    // Fields
    // ******

    private String username;
    private String password;
    private AppRole role;

    // **************
    // Constructor(s)
    // **************

    public AppUser(String username, String password, AppRole role) {
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    // *******
    // Methods
    // *******

    // *****************
    // Getters & Setters
    // *****************

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isEmpty()) throw new IllegalArgumentException("The username cannot be 'null', nor empty.");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty()) throw new IllegalArgumentException("The password cannot be 'null', nor empty.");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("The role cannot be 'null'");
        this.role = role;
    }

    // ******************************************
    // Overridden methods from 'java.lang.Object'
    // ******************************************

    @Override
    public int hashCode() {
        return Objects.hash(username, role); // simply returns an int for the hashCode for the chosen fields of the reference object
    }

    @Override
    public boolean equals(Object obj) { // check if the content of the two objects are the same
        if (this == obj) return true; // checks if the memory addresses are the  same
        if (obj == null || getClass() != obj.getClass()) return false; // IF the object being compared is null OR the classes for the objects are not the same, THEN return false

        AppUser appUser = (AppUser) obj; // casting 'obj' to the right class
        return Objects.equals(username, appUser.username) &&
                (role == appUser.role); // checks if the fields are the same
    }

    @Override
    public String toString() {
        return "AppUser { username: " + getUsername() + // returns a string with information about the username and role
                ", role: " + getRole() + " }";
    }
}
