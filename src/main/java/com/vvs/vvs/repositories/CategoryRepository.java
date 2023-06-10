package com.vvs.vvs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvs.vvs.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
