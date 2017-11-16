package edu.mum.service;

import java.util.List;

import edu.mum.domain.Category;

public interface CategoryService {
    
    List<Category> getAllCategories();
    Category getCategory(int id);
    Category save(Category category);
	Category update(Category category);
	public Category getCategoryByName(String name);
}
