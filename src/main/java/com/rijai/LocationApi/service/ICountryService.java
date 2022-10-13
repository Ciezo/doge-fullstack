package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Country;

import java.util.List;

public interface ICountryService {
    List<Country> findAll();
    Country addCountry(Country country);
    Country updateCountry(Country country);
    Country getCountry(long id);
}