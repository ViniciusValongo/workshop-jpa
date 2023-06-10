package com.vvs.vvs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvs.vvs.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
