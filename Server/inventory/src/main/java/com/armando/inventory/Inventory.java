package com.armando.inventory;

import com.armando.product.Product;
import com.armando.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@OneToMany(targetEntity = User.class)
	private List<User> user;

	@OneToMany(targetEntity = Product.class)
	private List<Product> product;

	public Inventory() {
	}

	public Inventory(Integer id, List<User> user, List<Product> product) {
		this.id = id;
		this.user = user;
		this.product = product;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Inventory{" +
				"id=" + id +
				", user=" + user +
				", product=" + product +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Inventory inventory = (Inventory) o;
		return Objects.equals(id, inventory.id) && Objects.equals(user, inventory.user)
				&& Objects.equals(product, inventory.product);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, user, product);
	}
}
