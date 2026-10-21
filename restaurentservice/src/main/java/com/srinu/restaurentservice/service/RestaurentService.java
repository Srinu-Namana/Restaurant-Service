package com.srinu.restaurentservice.service;

import java.util.List;

import com.srinu.restaurentservice.model.Restaurent;

//what to do
public interface RestaurentService {

	//create
	Restaurent createReasturent(Restaurent restaurent);
	
	//getAllReasturents
	List<Restaurent> getAllReasturent();
	
	//getReastuarentById
	Restaurent RestaurentById(Integer id);
	
	//deleteRestaurentById
	String deleRestaurentById(Integer id);
	
	
}
