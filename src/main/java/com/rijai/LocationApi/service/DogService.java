package com.rijai.LocationApi.service;
import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class DogService implements IDogService {
    @Autowired
    private DogRepository repository;

    @Override
    public List<Dog> findAll() {
        return (List<Dog>) repository.findAll();
    }

    @Override
    public Dog addDog (Dog dog) {
        return repository.save(dog);
    }

    @Override
    public Dog updateDog(Dog dog) {
        return repository.save(dog);
    }

    @Override
    public Dog getDog(long id) {
        Optional optional = repository.findById(id);
        if (optional.isEmpty())
            return null;
        else
            return (Dog) optional.get();
    }
}

