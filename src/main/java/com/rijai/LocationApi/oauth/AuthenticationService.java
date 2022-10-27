/*
    Document   : AuthenticationServices.java
    Package	   : com.rijai.Location.Api;
    Created on : July 26, 2022
    Author     : Cloyd Van S. Secuya
    Description:
    	!!! THIS IMPLEMENTATION IS FROM ONE OF MY PROJECTS FROM RESTFUL API BACK ON IT128L !!!
    	!!! THIS IMPLEMENTATION IS FROM ONE OF MY PROJECTS FROM RESTFUL API BACK ON IT128L !!!
    	!!! THIS IMPLEMENTATION IS FROM ONE OF MY PROJECTS FROM RESTFUL API BACK ON IT128L !!!



    	This authenticates the user registration, logging on, and account creation.
    	It has the capability to register the user when it does not exist in the database.
    	Moreover, it accesses the Driver to communicate with the fetching of data from the database.

    	Checks if the user exists in the database, and follows these conditions:
    		1. Allow user to access the Client application if they have successfully logged-in
    		2. Allow user to register their account if they do not have an existing record in the database.
    		3. Allow logging in of existing users.
*/

// PACKAGE SECTION
package com.rijai.LocationApi.oauth;

// IMPORT SECTION
import com.rijai.LocationApi.driver.MyDriver;
import com.rijai.LocationApi.model.*;


public class AuthenticationService {

    // Models
    Admin admin;
    User user;

    private boolean check = false;

    // My Driver API
    MyDriver driver = new MyDriver();
    public AuthenticationService(Admin admin_to_instantiate) {
        /**
         * @note This can instantiate the admin: Admin object
         * @param setID, setUsername, setPassword
         */
        this.admin.setId(admin_to_instantiate.getId());
        this.admin.setUsername(admin_to_instantiate.getUsername());
        this.admin.setPassword(admin_to_instantiate.getPassword());
    }

    public AuthenticationService(User user_to_instantiate) {
        /**
         * @note This can instantiate an object of the user: User
         * @param setID, setUsername, setPassword, setEmail
         */
        this.user.setId(user_to_instantiate.getId());
        this.user.setUsername(user_to_instantiate.getUsername());
        this.user.setPassword(user_to_instantiate.getPassword());
        this.user.setEmail(user_to_instantiate.getEmail());
    }

}

