package org.glenchiridza.recipe.repository;

import org.glenchiridza.recipe.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe,Integer>, CrudRepository<Recipe,Integer> {
    List<Recipe> findAllByRestaurantId(Integer restaurantId);

}
