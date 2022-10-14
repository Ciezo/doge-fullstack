package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.service.IDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class MyDogController {
    @Autowired
    private IDogService dogService;

    @RequestMapping("/api/dogs")
    public List<Dog> findCountries() { return dogService.findAll(); }

    @RequestMapping(value = "/api/show-dog/{id}")
    public Dog showDog(@PathVariable long id) { return dogService.getDog(id); }

    @RequestMapping(value = "/api/add-dog", method = RequestMethod.POST)
    public Dog addDogSubmit(@RequestBody Dog dog) { return dogService.addDog(dog); }

    @RequestMapping(value = "/api/update-dog", method = RequestMethod.PUT)
    public Dog updateCountry(@RequestBody Dog dog) { return dogService.updateDog(dog); }

}
