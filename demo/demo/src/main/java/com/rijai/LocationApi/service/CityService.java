package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.City;
import com.rijai.LocationApi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {
    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
        return (List<City>) repository.findAll();
    }
}
