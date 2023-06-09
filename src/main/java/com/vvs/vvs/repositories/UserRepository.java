package com.vvs.vvs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvs.vvs.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
