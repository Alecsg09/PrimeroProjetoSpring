package com.myfirstproject.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myfirstproject.myfirstproject.entities.Category;
import com.myfirstproject.myfirstproject.repositories.CategoryRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		Category cat3 = new Category(3L, "Games");
	

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);

	}

}
