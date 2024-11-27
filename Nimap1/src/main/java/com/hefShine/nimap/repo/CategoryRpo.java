package com.hefShine.nimap.repo;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hefShine.nimap.entity.Category;

public interface CategoryRpo extends JpaRepository<Category, Integer>{

	Optional<Category> findById(Long id);

	void deleteById(Long id);

}
