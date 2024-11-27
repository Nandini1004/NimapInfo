package com.hefShine.nimap.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hefShine.nimap.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
