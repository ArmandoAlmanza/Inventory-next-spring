package com.armando.product;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String productName;
	private String productDescription;

	private String productImagePath;
	
	private String productTag;

	public Product(Integer id, String productName, String productDescription, String productImagePath,
			String productTag) {
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productImagePath = productImagePath;
		this.productTag = productTag;
	}

	public Product() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

	public String getProductTag() {
		return productTag;
	}

	public void setProductTag(String productTag) {
		this.productTag = productTag;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", productName='" + productName + '\'' +
				", productDescription='" + productDescription + '\'' +
				", productImagePath='" + productImagePath + '\'' +
				", productTag='" + productTag + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Product product = (Product) o;
		return Objects.equals(id, product.id) && Objects.equals(productName, product.productName)
				&& Objects.equals(productDescription, product.productDescription)
				&& Objects.equals(productImagePath, product.productImagePath)
				&& Objects.equals(productTag, product.productTag);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, productName, productDescription, productImagePath, productTag);
	}
}