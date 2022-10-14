/**
 Author: Cloyd Van S. Secuya
 Filename: User.java
 Package: com.rijai.Location.Api;
 Date of Creation: September 15, 2022
 Description:
    This is the Model that defines the User class. It is also a table in the MySQL Database

    User has the following attributes:
        id: int | Primary Key (PK)
        username: String
        password: String
        email: String
 */

// PACKAGE SECTION
package com.rijai.LocationApi.model;


// IMPORT SECTION
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String username;
    private String password; 
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    /**
     * Default constructor
     */
    public User() {}

    /**
     * Getters and setters
     */
    public int getId() { return id; }
    public void setId(int id) { this.id = id;}

    public String getUsername() { return username;}
    public void setUsername(String username) { this.username = username;}

    public String getPassword() { return password;}
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email; }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && username.equals(user.username) && password.equals(user.password) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
