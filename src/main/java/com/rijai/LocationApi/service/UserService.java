/**
 Author: Cloyd Van S. Secuya
 Filename: UserService.java
 Package: com.rijai.Location.Api;
 Date of Creation: September 15, 2022
 Description:
    Implement the interface provided by IUserService. Moreover, it should return types based on its objects
    provided by the method body.
 */

// PACKAGE SECTION
package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.model.User;
import com.rijai.LocationApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        /**
         * @return User: List (object)
         */
        System.out.println("Returning all lists of Users from local database");
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        /**
         * @return Object: user
         * @insert into table=user
         */
        System.out.println("Inserting records into User table");
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        /**
         * @return Object: user
         * @update into table=user
         */
        System.out.println("Updating records from User table");
        return userRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        /**
         * @note This returns a User resource based on ID (PK) and so we need
         * @note to make comparisons on entries which should return ONE only
         */

        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            // Return the entry if present, otherwise...
            System.out.println("Entry found!");
            System.out.println("Returning user based by ID");
            return user.get();
        }
        return null;        // else, return null
    }

    @Override
    public void deleteUser(int id) {
        /**
         * @note This deletes a user entry from the database if it is present.
         * @note Otherwise, nothing happens, only a print in terminal
         */

        Optional<User> user_toDelete = userRepository.findById(id);
        if(user_toDelete.isPresent()) {
            userRepository.delete(user_toDelete.get());
            System.out.println("Entry deleted!");
        }
        System.out.println("No entries to delete!");
    }
}
