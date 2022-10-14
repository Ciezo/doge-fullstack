/**
 Author: Cloyd Van S. Secuya
 Filename: UserController.java
 Package: com.rijai.Location.Api;
 Date of Creation: September 15, 2022
 Description:
    The controller that uses cross origins at port 4200. This helps routing with the
    specific resources based on URL. Cross and connect this to Angular.
    Angular localhost server starts at port 4200.
    We should allow mapping and use the IUserService.

    Lastly, since this controller implements IUserService, therefore, it is like an Object Mapper
    we try to map and link objects returned by the interface, that is, accessed through this class.

 */

// PACKAGE SECTION
package com.rijai.LocationApi.controller;


// IMPORT SECTION
import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.model.User;
import com.rijai.LocationApi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    // GET
    @RequestMapping("/api/users")
    public List<User> findUsers() {
        /**
         * @return All lists of users resources
         */
        return userService.findAll();
    }

    // GET BY ID
    @RequestMapping(value = "/api/show-user{id}")
    public User showUser(@PathVariable int id) {
        /**
         * @return A User by ID
         */
        return userService.getUser(id);
    }

    // ADD USER
    @RequestMapping(value = "/api/add-user", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        /**
         * @note Request a User through POST
         * @return Add user object
         */
        return userService.addUser(user);
    }

    // UPDATE USER
    @RequestMapping(value = "/api/update-user", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user) {
        /**
         * @note Update a User through PUT
         * @return Update user object
         */
        return userService.updateUser(user);
    }

    // DELETE USER
    @RequestMapping(value = "/api/users/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        System.out.println("Resource deleted!");
    }
}
