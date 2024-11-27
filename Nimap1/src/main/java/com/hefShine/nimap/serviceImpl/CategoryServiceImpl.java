package com.hefShine.nimap.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefShine.nimap.entity.Category;
import com.hefShine.nimap.repo.CategoryRpo;




@Service
public class CategoryServiceImpl {

	@Autowired
    private CategoryRpo categoryRepo;

    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Category createCategories(Category category) {
        return categoryRepo.save(category);
    }

    public Category getCategoiesById(Long id) {
        return categoryRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public Category updateCategories(Long id, Category updatedCategory) {
        Category category = categoryRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
        category.setCategoryName(updatedCategory.getCategoryName());
        return categoryRepo.save(category);
    }

    public void deleteCategories(Long id) {
        categoryRepo.deleteById(id);
    }

		
		

	}


