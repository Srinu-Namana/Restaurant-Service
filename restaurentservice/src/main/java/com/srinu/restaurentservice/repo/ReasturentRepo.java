package com.srinu.restaurentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srinu.restaurentservice.model.Restaurent;

@Repository
public interface ReasturentRepo extends JpaRepository<Restaurent, Integer> {

}
