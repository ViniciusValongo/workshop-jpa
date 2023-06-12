package com.vvs.vvs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvs.vvs.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
