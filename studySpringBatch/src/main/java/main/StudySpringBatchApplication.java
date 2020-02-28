package main;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing // Spring Batch On
@SpringBootApplication
public class StudySpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringBatchApplication.class, args);
	}

}
