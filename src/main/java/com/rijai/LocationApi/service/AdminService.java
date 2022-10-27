package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.repository.AdminRepository;
import com.rijai.LocationApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService implements IAdminService {

    @Autowired
    private DogRepository repository;
    private AdminRepository AdminRepository;

    // Dog repository Functions
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
        long id = dog.getId();
        Dog dg = repository.findById(id).get();
        dg.setName(dog.getName());
        dg.setBreed(dog.getBreed());
        dg.setAge(dog.getAge());
        dg.setWeight(dog.getWeight());
        dg.setHeight(dog.getHeight());
        dg.setStatus(dog.getStatus());
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


    @Override
    public void deleteDog(long id) {
        /**
         * @note This deletes a user entry from the database if it is present.
         * @note Otherwise, nothing happens, only a print in terminal
         */

        Optional<Dog> dog_toDelete = repository.findById(id);
        if(dog_toDelete.isPresent()) {
            repository.delete(dog_toDelete.get());
            System.out.println("Entry deleted!");
        }
        System.out.println("No entries to delete!");
    }
}
