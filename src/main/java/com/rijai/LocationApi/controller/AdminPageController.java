package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Admin;
import com.rijai.LocationApi.service.IAdminPageService;
import com.rijai.LocationApi.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")     // AngularJS, Localhost Node Server

@RestController
public class AdminPageController {

    // This page is responsible for viewing Admin credentials, rather than the ability of the admin to view dogs records
    /**
     * @note This displays the credentials of the
     * Administrator {
     *     id: number
     *     username: string
     *     password: string
     * }
     */

    @Autowired
    private IAdminPageService adminPageService;

    @RequestMapping("/api/admin-creds")
    public List<Admin> adminCreds() {
        // On rooth path, it should return all the admins credentials
        return adminPageService.findAll();
    }

    @RequestMapping(value = "/api/show-admin-creds/{id}")
    public Admin showAdminCreds_specifiedByID(@PathVariable long id) {
        // Return the specified ID for an admin creds
        return adminPageService.getAdminCreds(id);
    }

    @RequestMapping(value = "/api/add-admin-creds", method = RequestMethod.POST)
    public Admin addAdminCreds(@RequestBody Admin admin) {
        return adminPageService.addAdminCreds(admin);
    }

    @RequestMapping(value = "/api/update-admin-creds", method = RequestMethod.PUT)
    public Admin updateAdminCreds(@RequestBody Admin admin) {
        return adminPageService.updateAdminCreds(admin);
    }

    @RequestMapping(value = "/api/delete-admi-creds/{id}", method = RequestMethod.DELETE)
    public void deleteAdminCreds(@PathVariable int id) {
        adminPageService.deleteAdmin(id);
        System.out.println("Resource deleted!");
    }
}
