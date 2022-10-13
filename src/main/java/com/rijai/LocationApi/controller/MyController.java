package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Country;
import com.rijai.LocationApi.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class MyController {
    @Autowired
    private ICountryService countryService;

    @RequestMapping("/api/countries")
    public List<Country> findCountries() { return countryService.findAll(); }

    @RequestMapping(value = "/api/show-country/{id}")
    public Country showCountry(@PathVariable long id) { return countryService.getCountry(id); }

    @RequestMapping(value = "/api/add-country", method = RequestMethod.POST)
    public Country addCountrySubmit(@RequestBody Country country) { return countryService.addCountry(country); }

    @RequestMapping(value = "/api/update-country", method = RequestMethod.PUT)
    public Country updateCountry(@RequestBody Country country) { return countryService.updateCountry(country); }

}
