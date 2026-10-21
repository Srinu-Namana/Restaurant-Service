package com.srinu.restaurentservice.service;

import java.util.List;

import com.srinu.restaurentservice.model.FoodItem;

// What to do
public interface FoodItemService {

	//CreateFoodItem
	FoodItem CreateFoodItem(FoodItem foodItem);
	
	//getAllFoodItems
	List<FoodItem>getAllFoodItems();
	
    //getAllFoodItemsById
	List<FoodItem>getAllFoodItems(Integer id);

}
