package org.glenchiridza.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.glenchiridza.restaurant.client.RecipeClient;
import org.glenchiridza.restaurant.dto.responses.RestaurantResponse;
import org.glenchiridza.restaurant.model.Restaurant;
import org.glenchiridza.restaurant.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository repository;
    private RecipeClient recipeClient;

    public void saveRestaurant(Restaurant recipe){
        repository.save(recipe);
    }

    public List<Restaurant> findAllRestaurants(){
        return repository.findAll();
    }

    public RestaurantResponse findAllRestaurantRecipes(Integer id) {
        var restaurant = repository.findById(id)
                .orElse(
                        Restaurant.builder()
                                .name("not found")
                                .email("not found")
                                .address("not found")
                                .build()
                );
        var recipes = recipeClient.findAllRecipesByRestaurant(id);


        return RestaurantResponse.builder()
                .name(restaurant.getName())
                .email(restaurant.getEmail())
                .address(restaurant.getAddress())
                .recipeList(recipes)
                .build();
    }
}
