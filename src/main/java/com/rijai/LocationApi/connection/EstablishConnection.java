package com.rijai.LocationApi.connection;

import java.sql.*;

public class EstablishConnection {
    Connection conn = null;

    public EstablishConnection() {

        Credentials creds = new Credentials();

        try {
            System.out.println("Setting up default connection to " + creds.getURI());
            conn = DriverManager.getConnection(creds.getURI(), creds.getUser(), creds.getPassword());

            // Check if connection is established
            if (conn.isValid(1)) { System.out.println("Connection is successful and has been established");}
        }

        catch(SQLException e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
