package com.dgobrito.dscatalog.tests;

import java.time.Instant;

import com.dgobrito.dscatalog.dto.CategoryDTO;
import com.dgobrito.dscatalog.dto.ProductDTO;
import com.dgobrito.dscatalog.entities.Category;
import com.dgobrito.dscatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-10-20T03:00:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		Category category = new Category(1L, "Electronics");
		return category;
	}
	
	public static CategoryDTO createCategoryDTO() {
		Category category = createCategory();
		return new CategoryDTO(category);
	}	
}
