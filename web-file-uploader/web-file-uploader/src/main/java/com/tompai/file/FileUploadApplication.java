package com.tompai.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.tompai.file.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
public class FileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}
}
