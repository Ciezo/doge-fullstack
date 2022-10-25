package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Admin;
import com.rijai.LocationApi.model.Dog;

import java.util.List;

public interface IAdminService {

    // The application should allow, creating/adding, viewing, updating and deleting of dog record/s.
    List<Dog> findAll();
    Dog addDog(Dog dog);
    Dog updateDog(Dog dog);
    Dog getDog(long id);

    void deleteDog(long id);


    //Methods for returning admin values
    //not yet working
   // List<Admin> findAll();

}
