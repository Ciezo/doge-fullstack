package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Dog;

import java.util.List;

public interface IDogService {

    List<Dog> findAll();
    Dog addDog(Dog dog);
    Dog updateDog(Dog dog);
    Dog getDog(long id);
}
