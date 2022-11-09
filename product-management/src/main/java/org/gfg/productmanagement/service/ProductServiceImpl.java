package org.gfg.productmanagement.service;

import java.util.List;
import java.util.Optional;

import org.gfg.productmanagement.model.Product;
import org.gfg.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(long id) throws Exception {
		// TODO Auto-generated method stub
		
		Optional<Product> product = productRepository.findById(id);
		if(product.isPresent()) {
			return product.get();
		}else {
			throw new Exception("Product Doesnot exist");
		}
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();

	}

	@Override
	public boolean deleteProducts(long id) {
		// TODO Auto-generated method stub
		Optional<Product> product = productRepository.findById(id);
		if(product.isPresent()) {
			this.productRepository.delete(product.get());
			return true;
		}else {
			return false;
		}
		
	}

	
}
