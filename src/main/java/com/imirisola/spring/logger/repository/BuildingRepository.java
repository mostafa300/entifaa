package com.imirisola.spring.logger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imirisola.spring.logger.model.Building;

public interface BuildingRepository extends JpaRepository<Building,Long> {

}
