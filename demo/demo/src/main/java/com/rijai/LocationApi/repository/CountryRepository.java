package com.rijai.LocationApi.repository;

import com.rijai.LocationApi.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository <Country, Long> {
}