package com.armando.product;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	private ProductRepository productRepository;

	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	record newProductRequest(String productName, String productDescription, String productImagePath,
			String productTag) {
	}

	@GetMapping
	public List<Product> greet() {
		return productRepository.findAll();
	}

	@PostMapping
	public void addProduct(@RequestBody newProductRequest req) {
		Product product = new Product();
		if (req.productName() == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
					"You need to add the product name and the other fields");
		}
		if (req.productImagePath() == null || req.productImagePath() == "") {
            product.setProductImagePath("https://avatars.dicebear.com/api/adventurer/your-custom-seed.svg");
        } else {
            product.setProductImagePath(req.productImagePath());
        }

		product.setProductName(req.productName());
		product.setProductDescription(req.productDescription);
		product.setProductTag(req.productTag);

		productRepository.save(product);

	}

}
