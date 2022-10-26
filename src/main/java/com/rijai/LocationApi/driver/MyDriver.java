// PACKAGE SECTION
package com.rijai.LocationApi.driver;

// IMPORT SECTION
import java.sql.*;
import com.rijai.LocationApi.connection.*;
import com.rijai.LocationApi.model.Admin;


public class MyDriver {

    private EstablishConnection connect;
    private Statement statement = null;
    private ResultSet result = null;

    public MyDriver() {
        System.out.println("Initializing Driver for custom SQL queries!");
        this.connect = new EstablishConnection();
    }


    // Get records of Admin from remote database
    public Admin getAdminRecords(String username) {
        /**
         * @note This returns a single instance of an Admin record
         * @return It will return an entry of admin based by username to select the statement
         */
        // SQL Statement
        String SQL = "SELECT * FROM heroku_0bd884b1bec8bec.users";
        System.out.println("SELECT STATEMENT: " + SQL);

        // Create a local object for admin
        Admin admin = new Admin();

        // Temp vars
        String admin_tmp_usename;
        String admin_tmp_password;

        try {
            statement = connect.getConnection().createStatement();
            result = statement.executeQuery(SQL);

            while(result.next()) {
                System.out.println("\n\nFinding user...Admin Username -> " + username + " at heroku_0bd884b1bec8bec.users");
                admin_tmp_usename = result.getString("username");
                admin_tmp_password = result.getString("password");

                // Log to console, for debugging purposes
                System.out.println("Admin Credentials");
                System.out.println("======================================");
                System.out.println("Username: " + admin_tmp_usename);
                System.out.println("Password: " + admin_tmp_password);
                System.out.println("======================================");

                // Now, assign the newly fetched attributes for return
                admin.setUsername(admin_tmp_usename);
                admin.setPassword(admin_tmp_password);
                return admin;
            }
        }
        catch (SQLException e) { e.printStackTrace();}
        return admin;
    }
}
