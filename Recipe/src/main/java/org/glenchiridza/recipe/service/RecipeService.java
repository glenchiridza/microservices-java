package org.glenchiridza.recipe.service;

import lombok.RequiredArgsConstructor;
import org.glenchiridza.recipe.model.Recipe;
import org.glenchiridza.recipe.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository repository;

    public void saveRecipe(Recipe recipe){
        repository.save(recipe);
    }

    public List<Recipe> findAllRecipes(){
        return repository.findAll();
    }

    public List<Recipe> findAllRecipesByRestaurant(Integer restaurantId) {
        return repository.findAllByRestaurantId(restaurantId);
    }
}
