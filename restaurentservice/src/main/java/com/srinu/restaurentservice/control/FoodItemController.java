package com.srinu.restaurentservice.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinu.restaurentservice.model.FoodItem;
import com.srinu.restaurentservice.service.FoodItemService;

@RestController
@RequestMapping("/fooditem")
public class FoodItemController {

	@Autowired
	FoodItemService foodItemService;

	@PostMapping("/createfood")
	public FoodItem CreateFoodItem(@RequestBody FoodItem foodItem) {
		return foodItemService.CreateFoodItem(foodItem);
	}

	@GetMapping("/getAllFoodItems")
	public List<FoodItem> getAllFoodItems() {
		return foodItemService.getAllFoodItems();
	}
	
	@GetMapping("/getAllFoodItemsById/{id}")
	public List<FoodItem> getAllFoodItems(@PathVariable Integer id) {
	return foodItemService.getAllFoodItems(id);
	}
}
