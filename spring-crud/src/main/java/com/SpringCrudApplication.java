package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.courses.model.Course;
import com.courses.repository.CourseRepository;

@SpringBootApplication
public class SpringCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository) {
		return arg -> {
			// courseRepository.deleteAll();
			System.out.println("Executando");
			Course c = new Course();
			c.setName("HTML");
			c.setCategory("FRONT-END");
			courseRepository.save(c);
		};
	}

}
