package com.imirisola.spring.logger.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imirisola.spring.logger.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	// Query by jpa 
	
	Optional<User> findByEmail(String email);
	Optional<User> findByUsernameOrEmail(String username, String email);
	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);
	
	
}
