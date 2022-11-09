package org.gfg.productmanagement.service;

import java.util.List;

import org.gfg.productmanagement.model.Product;

public interface ProductService {

	Product createProduct(Product product);
	Product getProductById(long id) throws Exception;
	List<Product> getAllProducts();
	boolean deleteProducts(long id);
}
