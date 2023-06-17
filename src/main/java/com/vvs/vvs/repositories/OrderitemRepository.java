package com.vvs.vvs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvs.vvs.entities.OrderItem;


public interface OrderitemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
