package com.rijai.LocationApi.oauth;

import com.rijai.LocationApi.driver.MyDriver;
import com.rijai.LocationApi.model.Admin;

public class OAuthTest  {
    public static void main(String[] args) {
        MyDriver driver = new MyDriver();
        AuthenticationService authServ;

        /**
         * Admin
         */
        // int id, String username, String password)
        Admin admin_creds_to_test = new Admin(5, "admin5", "12345678");

        // Log to console, while in runtime
        System.out.println(admin_creds_to_test.getId());
        System.out.println(admin_creds_to_test.getUsername());
        System.out.println(admin_creds_to_test.getPassword());

        /** Only uncomment when NECESSARY. THIS SRC FILE IS FOR AUTH TESTING */
//        driver.insertAdminRecords(admin_creds_to_test);

        // Now, begin init of my implementation on AuthServ based on the
        // object {
        //      admin_creds_to_test: Admin
        // }
        authServ = new AuthenticationService
                                        (
                                                admin_creds_to_test.getId(),
                                                admin_creds_to_test.getUsername(),
                                                admin_creds_to_test.getPassword()
                                        );        // test the admin5

        // Use the boolean method
         authServ.checkAdminCredsValidity();
        /**
         * @note if this prints to console as TRUE then, my AuthServ has worked!
         */
    }
}
