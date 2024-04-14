package org.glenchiridza.restaurant.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.glenchiridza.restaurant.model.Recipe;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantResponse {

    private String name;
    private String email;
    private String address;
    List<Recipe> recipeList;
}
