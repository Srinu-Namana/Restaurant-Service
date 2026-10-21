package com.srinu.restaurentservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fooditem73")
@Setter
@Getter
public class FoodItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String item_name;
	Double item_price;
	
	@ManyToOne
	@JoinColumn(name ="reasturent_id",referencedColumnName = "id")
	Restaurent restaurent;

}
