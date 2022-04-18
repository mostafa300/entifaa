package com.imirisola.spring.logger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imirisola.spring.logger.model.Land;

public interface LandRepository extends JpaRepository<Land, Long>  {

}
