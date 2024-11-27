package com.hefShine.nimap.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hefShine.nimap.entity.Product;
import com.hefShine.nimap.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	public Product saveProducts(Product product) {
		
		return productRepo.save(product);
	}
	
	public Product getProduuctById(Long id) {
		
		return productRepo.findById(id).orElseThrow(() -> new RuntimeException("product not found"));
		
	}
	
	public Product updateProduct(Long id, Product updatedProduct) {
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("product not found"));
        product.setName(updatedProduct.getName());
        return productRepo.save(product);
    }
	
	public void deleteProduct(Long id) {
		productRepo.deleteById(id);
	}
}
