package com.rijai.LocationApi.connection;

public class Credentials {

    /**
     * Config Vars from Heroku:
     *  mysql://b4cc3f0cac419d:bba06d96@us-cdbr-east-06.cleardb.net/heroku_0bd884b1bec8bec?reconnect=true
     *
     */

    /**
     * Implementing JDBC:
     *  jdbc:mysql://b4cc3f0cac419d:bba06d96@us-cdbr-east-06.cleardb.net/heroku_0bd884b1bec8bec?reconnect=true
     *  URI
     *  user
     *  password
     */

	private String URI;
	private String user;
	private String password;

	public Credentials() {
		URI = "jdbc:mysql://b4cc3f0cac419d:bba06d96@us-cdbr-east-06.cleardb.net/heroku_0bd884b1bec8bec?reconnect=true";
		user = "b4cc3f0cac419d";
		password = "bba06d96";
	}

	public String getURI() {
		return URI;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
}
