package com.srinu.restaurentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.restaurentservice.model.Restaurent;
import com.srinu.restaurentservice.repo.ReasturentRepo;


//How to do

@Service
public class RestaurentServiceImp implements RestaurentService {

	@Autowired
	ReasturentRepo reasturentRepo;

	@Override
	public Restaurent createReasturent(Restaurent restaurent) {
		return reasturentRepo.save(restaurent);
	}

	@Override
	public List<Restaurent> getAllReasturent() {
		return reasturentRepo.findAll();
	}

	@Override
	public Restaurent RestaurentById(Integer id) {
		return reasturentRepo.findById(id).get();
	}

	@Override
	public String deleRestaurentById(Integer id) {
		reasturentRepo.deleteById(id);
		return "Restaurent Deleted Successfully";
	}

}
