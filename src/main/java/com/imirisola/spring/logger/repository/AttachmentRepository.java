package com.imirisola.spring.logger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imirisola.spring.logger.model.Attachment;


public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

}
