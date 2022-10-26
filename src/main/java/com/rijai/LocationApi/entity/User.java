package com.rijai.LocationApi.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    private String email;
    private String user_name;
    private String first_name;
    private String last_name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)     // Entity relationship
    private Set<Role> role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
