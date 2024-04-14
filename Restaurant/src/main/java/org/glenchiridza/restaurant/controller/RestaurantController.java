package org.glenchiridza.restaurant.controller;


import lombok.RequiredArgsConstructor;
import org.glenchiridza.restaurant.model.Restaurant;
import org.glenchiridza.restaurant.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Restaurant recipe
            ){
        service.saveRestaurant(recipe);
    }

    @GetMapping
    public ResponseEntity<List<Restaurant>> findAllRecipes(){
        return ResponseEntity.ok(service.findAllRestaurants());
    }
}
