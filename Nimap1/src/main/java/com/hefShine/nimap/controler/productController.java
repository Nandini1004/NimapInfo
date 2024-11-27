package com.hefShine.nimap.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hefShine.nimap.entity.Product;
import com.hefShine.nimap.serviceImpl.ProductService;

@RestController
@RequestMapping("/api/products")

public class productController {
	
	@Autowired
	ProductService productService;
	
	 @PostMapping
	    public Product saveproduct(@RequestBody Product product) {
	        return productService.saveProducts(product);
	    }
	    @GetMapping
	    public List<Product> getAllProduct() {
	        return productService.getAllProducts();
	    }
	    @GetMapping("/{id}")
	    public Product getProductById(@PathVariable Long id) {
	        return productService.getProduuctById(id);
	    }

	    @PutMapping("/{id}")
	    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
	        return productService.updateProduct(id, updatedProduct);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteProduct(@PathVariable Long id) {
	       productService.deleteProduct(id);
	        return "Product deleted successfully";
	    }

}
