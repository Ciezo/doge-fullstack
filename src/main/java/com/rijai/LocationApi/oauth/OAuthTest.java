package com.rijai.LocationApi.oauth;

import com.rijai.LocationApi.driver.MyDriver;
import com.rijai.LocationApi.model.Admin;

public class OAuthTest  {
    public static void main(String[] args) {
        MyDriver driver = new MyDriver();

        /**
         * Admin
         */
        // int id, String username, String password)
        Admin admin_creds_to_test = new Admin(4, "admin4", "12345abc");
        driver.insertAdminRecords(admin_creds_to_test);

//        AuthenticationService authServ = new AuthenticationService();

    }
}
