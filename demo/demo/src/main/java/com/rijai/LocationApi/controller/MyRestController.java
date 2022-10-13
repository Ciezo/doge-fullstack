package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.City;
import com.rijai.LocationApi.model.Country;
import com.rijai.LocationApi.service.ICityService;
import com.rijai.LocationApi.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {
    @Autowired
    private ICountryService countryService;
    private ICityService cityService;

    @RequestMapping("/all-users")
    public List<Country> getAllUser() {
        return countryService.findAll();
    }
}
