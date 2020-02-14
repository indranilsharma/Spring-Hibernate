package com.springORM.dao;

import java.util.List;

import com.springORM.model.Product;

public interface ProductDao {

	int create(Product product);

	void update(Product product);

	void delete(Product product);
	
	Product find(int id);
	
	List<Product> findAll();
}
