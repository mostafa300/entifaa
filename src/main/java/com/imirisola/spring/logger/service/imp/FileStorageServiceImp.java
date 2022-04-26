package com.imirisola.spring.logger.service.imp;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.imirisola.spring.logger.model.FileDB;
import com.imirisola.spring.logger.repository.FileDBRepository;

import org.springframework.util.StringUtils;

@Service
public class FileStorageServiceImp {

	  @Autowired
	  private FileDBRepository fileDBRepository;
	  
	  
	  public FileDB store(MultipartFile file) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    String contentType = file.getContentType() ;
 	    byte[] bytes = file.getBytes() ;
	    FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
	    return fileDBRepository.save(FileDB);
	  }
	  
	  
	  public FileDB getFile(String id) {
	    return fileDBRepository.findById(id).get();
	  }
	  
	  
	  
	  public Stream<FileDB> getAllFiles() {
	    return fileDBRepository.findAll().stream();
	  }
	
}
