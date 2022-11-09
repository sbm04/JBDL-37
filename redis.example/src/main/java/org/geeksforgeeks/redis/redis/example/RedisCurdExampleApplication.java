package org.geeksforgeeks.redis.redis.example;

import java.util.List;

import org.geeksforgeeks.redis.redis.example.entity.Product;
import org.geeksforgeeks.redis.redis.example.respository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class RedisCurdExampleApplication {

	@Autowired
	private ProductDAO dao;
	
	@PostMapping
	public Product save (@RequestBody Product product) {
		System.out.println(product);
		return dao.save(product);
	}
	
	@GetMapping
	public List<Product> fetchAllProducts () {
		return dao.getAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(RedisCurdExampleApplication.class, args);
	}

}
