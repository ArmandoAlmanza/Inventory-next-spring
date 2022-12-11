package com.armando.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@GetMapping
	public GreetResponse greet() {
		return new GreetResponse("Welcome to producst List");
	}

	record GreetResponse(String greet) {
	}
}
