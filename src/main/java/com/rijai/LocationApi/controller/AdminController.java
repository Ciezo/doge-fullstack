package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")     // AngularJS, Localhost Node Server

@RestController
public class AdminController {

    /**
     * This is responsible for communicating with the Admin Models and Service
     * The application should allow, creating/adding, viewing, updating and deleting of dog record/s.
     */
    @Autowired
    private IAdminService adminService;

    @RequestMapping("/api/admin")
    public List<Dog> findDogs_withAdmin() {
        // Using the admin root path, it should list all the Dogs properly
        return adminService.findAll();
    }

    @RequestMapping(value = "/api/show-admin-dog/{id}")
    public Dog showDog_withAdmin(@PathVariable long id) {
        // Using the admin root path, it should list all the Dogs properly
        return adminService.getDog(id);
    }

    @RequestMapping(value = "/api/add-dog-with-admin", method = RequestMethod.POST)
    public Dog addCountrySubmit(@RequestBody Dog dog) {
        return adminService.addDog(dog);
    }

    @RequestMapping(value = "/api/add-dog-with-admin", method = RequestMethod.PUT)
    public Dog updateDog(@RequestBody Dog dog) {
        return adminService.updateDog(dog);
    }

}
