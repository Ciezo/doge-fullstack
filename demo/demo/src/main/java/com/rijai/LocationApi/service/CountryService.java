package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Country;
import com.rijai.LocationApi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findAll() {
        return (List<Country>) repository.findAll();
    }

    @Override
    public List<Country> getCountries() {
        return (List<Country>) repository.findAll();
    }

    @Override
    public Country getCountryId(long id) {
        Optional<Country> country = repository.findById(id);
        if(country.isPresent())
            return country.get();
        else
            return null;
    }

    @Override
    public Country addCountry(Country country) {
        return null;
    }

    @Override
    public Country updateCountry(int id) {
        return null;
    }
}
