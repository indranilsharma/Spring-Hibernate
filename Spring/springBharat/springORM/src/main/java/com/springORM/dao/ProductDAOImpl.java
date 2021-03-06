package com.springORM.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springORM.model.Product;

//@Component same as  
@Repository("productDao")
public class ProductDAOImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	/*
	 * @Autowired Product product;
	 */

	@Transactional
	public int create(Product product) {
		// return serializable object so casting to integer

		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	public Product find(int id) {
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	public List<Product> findAll() {
		List<Product> list = hibernateTemplate.loadAll(Product.class);
		return list;
	}

}
