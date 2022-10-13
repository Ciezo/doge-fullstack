package com.rijai.LocationApi.repository;

import com.rijai.LocationApi.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository <City, Long>{
}
