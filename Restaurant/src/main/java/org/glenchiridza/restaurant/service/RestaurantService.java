package org.glenchiridza.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.glenchiridza.restaurant.model.Restaurant;
import org.glenchiridza.restaurant.repository.RestaurantRepository;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository repository;

    public void saveRestaurant(Restaurant recipe){
        repository.save(recipe);
    }

    public List<Restaurant> findAllRestaurants(){
        return repository.findAll();
    }
}
