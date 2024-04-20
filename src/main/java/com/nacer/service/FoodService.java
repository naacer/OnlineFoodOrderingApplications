package com.nacer.service;

import com.nacer.model.Category;
import com.nacer.model.Food;
import com.nacer.model.Restaurant;
import com.nacer.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    public List<Food> getRestaurantFood(Long restaurantId,
                                        boolean isVegetarian,
                                        boolean isNonveg,
                                        boolean isSeasonal,
                                        String foodCategory);

    public List<Food>searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;

    public Food updateAvailabiltyStatus(Long foodId) throws Exception;

}
