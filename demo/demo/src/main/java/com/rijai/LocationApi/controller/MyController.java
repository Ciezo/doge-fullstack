package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Country;
import com.rijai.LocationApi.model.City;
import com.rijai.LocationApi.service.ICountryService;
import com.rijai.LocationApi.service.ICityService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "https://localhost:4200")

@RestController
public class MyController {
    @Autowired
    private ICountryService countryService;
    @Autowired
    private ICityService cityService;

    @RequestMapping("/api/countries")
    public List<Country> findCountries() { return countryService.getCountries(); }

    @RequestMapping(value = "/api/show-country/{id}")
    public Country showCountry(@PathVariable long id) { return countryService.getCountryId(id); }

    @RequestMapping(value = "/api/add-country", method = RequestMethod.POST)
    public Country addCountrySubmit(@RequestBody Country country) {return countryService.addCountry(country); }

    @RequestMapping(value = "/api/update-country/{id}", method = RequestMethod.PUT)
    public Country updateCountry(@PathVariable int id) {return countryService.updateCountry(id); }

    @GetMapping("/countries")
    public String findCountries(Model model){
        var countries= (List<Country>) countryService.findAll();
        model.addAttribute("countries",countries);
        return "showCountries";
    }

    @GetMapping("/cities")
    public String findCities(Model model) {
        var cities = (List<City>) cityService.findAll();
        model.addAttribute("cities", cities);
        return "showCities";
    }
}
