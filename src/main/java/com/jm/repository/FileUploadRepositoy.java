package com.jm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jm.models.FileUpload;

public interface FileUploadRepositoy extends JpaRepository<FileUpload, Long> {
	
}
