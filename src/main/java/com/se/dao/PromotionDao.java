package com.se.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.se.entity.Promotion;


public interface PromotionDao extends JpaRepository<Promotion, String>{
	
}
