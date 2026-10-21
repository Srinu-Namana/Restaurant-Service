package com.srinu.restaurentservice.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinu.restaurentservice.model.Restaurent;
import com.srinu.restaurentservice.service.RestaurentService;

@RestController
@RequestMapping("/restaurant")
public class RestaurentController {

	@Autowired
	RestaurentService restaurentService;

	@PostMapping("/create")
	Restaurent createReasturent(@RequestBody Restaurent restaurent) {
		return restaurentService.createReasturent(restaurent);
	}

	@GetMapping("/getRestaurents")
	public List<Restaurent> getAllReasturent() {
		return restaurentService.getAllReasturent();
	}

	@GetMapping("/getRestaurentId/{id}")
	public Restaurent RestaurentById(@PathVariable Integer id) {
		return restaurentService.RestaurentById(id);
	}

	@DeleteMapping("/deleteRestaurent/{id}")
	public String deleRestaurentById(@PathVariable Integer id) {
		return restaurentService.deleRestaurentById(id);
	}

}
