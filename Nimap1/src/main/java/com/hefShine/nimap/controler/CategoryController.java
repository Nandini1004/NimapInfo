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

import com.hefShine.nimap.entity.Category;
import com.hefShine.nimap.serviceImpl.CategoryServiceImpl;
@RestController
@RequestMapping("/api/categories")

public class CategoryController {

	
		  @Autowired
		  CategoryServiceImpl categoryService;
		    

		    @PostMapping
		    public Category createCategory(@RequestBody Category category) {
		        return categoryService.createCategories(category);
		    }
		    @GetMapping
		    public List<Category> getAllCategories() {
		        return categoryService.getAllCategories();
		    }
		    @GetMapping("/{id}")
		    public Category getCategoryById(@PathVariable Long id) {
		        return categoryService.getCategoiesById(id);
		    }

		    @PutMapping("/{id}")
		    public Category updateCategory(@PathVariable Long id, @RequestBody Category updatedCategory) {
		        return categoryService.updateCategories(id, updatedCategory);
		    }

		    @DeleteMapping("/{id}")
		    public String deleteCategory(@PathVariable Long id) {
		        categoryService.deleteCategories(id);
		        return "Category deleted successfully";
		    }
	}
	

