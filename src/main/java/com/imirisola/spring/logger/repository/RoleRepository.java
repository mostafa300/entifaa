package com.imirisola.spring.logger.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imirisola.spring.logger.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByName(String name);

}
