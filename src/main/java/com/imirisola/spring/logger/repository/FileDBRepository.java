package com.imirisola.spring.logger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imirisola.spring.logger.model.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
