package com.products.crud;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.crud.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Product findByName(String name);

	void deleteById(Optional<Product> product);

	

	

}