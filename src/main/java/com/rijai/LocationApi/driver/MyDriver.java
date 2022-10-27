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

    // Insert records of Admin to remote database
    public void insertAdminRecords(Admin admin_to_insert) {
        /**
         * @note This inserts a single instance of an Admin record
         * @void it only does insert statement into the remote database
         */
        // SQL Statement
        String SQL = "INSERT INTO heroku_0bd884b1bec8bec.admin(id, username, password) VALUES" +
                "(" +
                 "'"+admin_to_insert.getId()+"'," +
                 "'"+admin_to_insert.getUsername()+"'," +
                 "'"+admin_to_insert.getPassword()+"'" +
                ")";

        System.out.println("INSERT STATEMENT: " + SQL);

        try {
            statement = connect.getConnection().createStatement();
            statement.executeUpdate(SQL);
            statement.close();
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Get records of Admin from remote database
    public Admin getAdminRecords(String username) {
        /**
         * @note This returns a single instance of an Admin record
         * @return It will return an entry of admin based by username to select the statement
         */
        // SQL Statement
        String SQL = "SELECT * FROM heroku_0bd884b1bec8bec.admin";
        System.out.println("SELECT STATEMENT: " + SQL);

        // Create a local object for admin
        Admin admin = new Admin();

        // Temp vars
        int admin_tmp_id;
        String admin_tmp_usename = "";
        String admin_tmp_password = "";

        try {
            statement = connect.getConnection().createStatement();
            result = statement.executeQuery(SQL);

            while(result.next()) {
                System.out.println("\n\nFinding user...Admin Username -> " + admin_tmp_usename + " at heroku_0bd884b1bec8bec.admin");
                admin_tmp_id = result.getInt("id");
                admin_tmp_usename = result.getString("username");
                admin_tmp_password = result.getString("password");

                // Log to console, for debugging purposes
                System.out.println("Inserting Admin Credentials");
                System.out.println("======================================");
                System.out.println("ID: " + admin_tmp_id);
                System.out.println("Username: " + admin_tmp_usename);
                System.out.println("Password: " + admin_tmp_password);
                System.out.println("======================================");

                // Now, assign the newly fetched attributes for return
                admin.setId(admin_tmp_id);
                admin.setUsername(admin_tmp_usename);
                admin.setPassword(admin_tmp_password);
            }
        }
        catch (SQLException e) { e.printStackTrace();}
        return admin;
    }
}
