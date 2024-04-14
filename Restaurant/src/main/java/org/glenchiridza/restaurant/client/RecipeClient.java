package org.glenchiridza.restaurant.client;

import org.glenchiridza.restaurant.model.Recipe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "recipe-service",url = "${application.config.recipe-url}")
public interface RecipeClient {

    @GetMapping("/restaurant/{restaurant-id}")
    List<Recipe> findAllRecipesByRestaurant(
            @PathVariable("restaurant-id") Integer restaurantId
    );
}
