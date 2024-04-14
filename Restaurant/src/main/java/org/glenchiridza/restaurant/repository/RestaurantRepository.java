package org.glenchiridza.restaurant.repository;

import org.glenchiridza.restaurant.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
}
