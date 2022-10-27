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

    // Attributes
    private int id;
    private String username;
    private String password;

    // Models
    Admin admin_toAuth = null;
    User user_toAuth;

    private boolean check = false;

    // My Driver API
    MyDriver driver = new MyDriver();

    public AuthenticationService(Admin admin_to_instantiate) {
        /**
         * @note This can instantiate the admin: Admin object
         * @param setID, setUsername, setPassword
         */
        this.admin_toAuth.setId(admin_to_instantiate.getId());
        this.admin_toAuth.setUsername(admin_to_instantiate.getUsername());
        this.admin_toAuth.setPassword(admin_to_instantiate.getPassword());
    }

    public AuthenticationService(int ID, String username, String password) {
        /**
         * @note This can instantiate the admin: Admin object
         * @param setID, setUsername, setPassword
         */
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public AuthenticationService(User user_to_instantiate) {
        /**
         * @note This can instantiate an object of the user: User
         * @param setID, setUsername, setPassword, setEmail
         */
        this.user_toAuth.setId(user_to_instantiate.getId());
        this.user_toAuth.setUsername(user_to_instantiate.getUsername());
        this.user_toAuth.setPassword(user_to_instantiate.getPassword());
        this.user_toAuth.setEmail(user_to_instantiate.getEmail());
    }

    public AuthenticationService() {}


    // This method will check the validity of the passed attributes to Authenticate the Admin
    public boolean checkAdminCredsValidity() {
        /**
         * @note This method checks the validity of the attributes passed on the AuthenticationService()
         * @return true if the user has a record in the database (repository)
         * @return false if the user does not have a record in the database (repository)
         */

        this.admin_toAuth = driver.getAdminRecords(admin_toAuth.getUsername());

        // Create a user object and is used to be assigned on returned records from the database
        Admin admin_to_check_Existing;
        admin_to_check_Existing = driver.getAdminRecords(admin_toAuth.getUsername());

        // Check using username and assign by ID
        if ( (admin_to_check_Existing.getUsername().equals(admin_toAuth.getUsername()) ) &&         // check username
                (admin_to_check_Existing.getPassword().equals(admin_toAuth.getPassword()) )  &&     // check password
                    (admin_to_check_Existing.getId() == admin_toAuth.getId()) &&                    // check ID
                        (admin_to_check_Existing.equals(admin_toAuth)) )
                            {
                                check = true;
                                System.out.println("VALIDITY REQUEST: " + check);
                                return check;
                            }
        // Otherwise, return FALSE
        return check;
    }
}
