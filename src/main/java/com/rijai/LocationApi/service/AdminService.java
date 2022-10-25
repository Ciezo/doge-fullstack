package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Country;
import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.repository.CountryRepository;
import com.rijai.LocationApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService implements IAdminService {

    @Autowired
    private DogRepository repository;

    @Override
    public List<Dog> findAll() {
        // The AdminService retrieves all List of Dogs
        return (List<Dog>) repository.findAll();
    }

    @Override
    public Dog addDog(Dog dog) {
        // The AdminService will add a record for Dog
        return repository.save(dog);
    }

    @Override
    public Dog updateDog(Dog dog) {
        // The AdminService will update a Dog record
        return repository.save(dog);
    }

    @Override
    public Dog getDog(long id) {
        // The AdminService will get a single record of dog record
        Optional optional = repository.findById(id);
        if (optional.isEmpty())
            return null;
        else
            return (Dog) optional.get();
    }
}
