package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Admin;
import java.util.List;

public interface IAdminPageService {

    // This interface is responsible for listing all records of Admin only
    /**
     * List all the admin credentials
     * Therefore, it should pull from the AdminRepository and interact with that, rather than the dog
     */

    List<Admin> findAll();
    Admin addAdminCreds(Admin admin);       /** POST */
    Admin updateAdminCreds(Admin admin);    /** PATCH (PUT) */
    Admin getAdminCreds(long id);           /** GET */
    void deleteAdmin(long id);              /** DELETE */

}
