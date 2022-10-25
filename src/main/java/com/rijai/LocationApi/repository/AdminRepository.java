package com.rijai.LocationApi.repository;


import com.rijai.LocationApi.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {



}
