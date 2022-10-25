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
    public List<Dog> findCDog() {
        /**
         * @return All lists of dogs resources
         */
        return dogService.findAll();
    }

    @RequestMapping(value = "/api/show-dog/{id}")
    public Dog showDog(@PathVariable long id) {
        /**
         * @return A Dog by ID
         */
        return dogService.getDog(id);
    }

    @RequestMapping(value = "/api/add-dog", method = RequestMethod.POST)
    public Dog addDogSubmit(@RequestBody Dog dog) {
        /**
         * @note Request a Dog through POST
         * @return Add Dog object
         */
        return dogService.addDog(dog);
    }

    @RequestMapping(value = "/api/update-dog", method = RequestMethod.PUT)
    public Dog updateCountry(@RequestBody Dog dog) {
        /**
         * @note Update a User through PUT
         * @return Update user object
         */
        return dogService.updateDog(dog);

    }

    @RequestMapping(value = "/api/delete-dog/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        dogService.deleteDog(id);
        System.out.println("Resource deleted!");
    }


}
