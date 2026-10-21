package com.srinu.restaurentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.restaurentservice.model.FoodItem;
import com.srinu.restaurentservice.repo.FoodItemRepo;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class FoodItemServiceImp implements FoodItemService {

	@Autowired
	FoodItemRepo foodItemRepo;

	@Override
	public FoodItem CreateFoodItem(FoodItem foodItem) {
		return foodItemRepo.save(foodItem);
	}

	@Override
	public List<FoodItem> getAllFoodItems() {
		return foodItemRepo.findAll();
	}

	@Override
	public List<FoodItem> getAllFoodItems(Integer id) {
		return foodItemRepo.findByRestaurentId(id);
	}

}
