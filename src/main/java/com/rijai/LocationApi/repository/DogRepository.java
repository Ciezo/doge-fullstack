/**
 * This is where we store the username and password for Administrators
 * as well as store accessed records from the Dog records
 */
package com.rijai.LocationApi.repository;

import com.rijai.LocationApi.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
}