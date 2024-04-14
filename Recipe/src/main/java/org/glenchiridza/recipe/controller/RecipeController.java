package org.glenchiridza.recipe.controller;


import lombok.RequiredArgsConstructor;
import org.glenchiridza.recipe.model.Recipe;
import org.glenchiridza.recipe.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recipes")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Recipe recipe
            ){
        service.saveRecipe(recipe);
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> findAllRecipes(){
        return ResponseEntity.ok(service.findAllRecipes());
    }
}
