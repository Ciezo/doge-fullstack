/**
 Author: Cloyd Van S. Secuya
 Filename: IUserService.java
 Package: com.rijai.Location.Api;
 Date of Creation: September 15, 2022
 Description:
    Defined an interface where Services should implement from.
 */

// PACKAGE SECTION
package com.rijai.LocationApi.service;


// IMPORT SECTION
import com.rijai.LocationApi.model.User;
import java.util.List;

public interface IUserService {

    List<User> findAll();
    User addUser(User user);
    User updateUser(User user);
    User getUser(int id);
    void deleteUser(int id);
}
