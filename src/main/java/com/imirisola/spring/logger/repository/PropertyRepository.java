package com.imirisola.spring.logger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imirisola.spring.logger.model.Property;

//extends JpaRepository<Post, Long>
public interface PropertyRepository extends JpaRepository<Property, Long> {

}

