/**
 Author: Cloyd Van S. Secuya
 Filename: UserRepository.java
 Package: com.rijai.Location.Api;
 Date of Creation: September 15, 2022
 Description:
    To make CRUD operations easier, we utilize a library from Spring.
    Basically, we extend CrudRepository, then, define the Model to manage and its respective ID:int
 */

// PACKAGE SECTION
package com.rijai.LocationApi.repository;


// IMPORT SECTION
import com.rijai.LocationApi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
