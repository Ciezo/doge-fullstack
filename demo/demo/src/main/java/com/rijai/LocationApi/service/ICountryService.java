package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Country;

import java.util.List;

public interface ICountryService {
    List<Country> findAll();

    List<Country> getCountries();

    Country getCountryId(long id);

    Country addCountry(Country country);

    Country updateCountry(int id);
}