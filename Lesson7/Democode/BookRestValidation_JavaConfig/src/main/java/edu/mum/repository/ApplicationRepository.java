package edu.mum.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.mum.domain.Category;
import edu.mum.service.CategoryService;

@Repository
public class ApplicationRepository {

	private List<Category> categories;

	public ApplicationRepository() {
		categories = new ArrayList<Category>();
		categories.add(new Category(1, "Computing"));
		categories.add(new Category(2, "Travel"));
		categories.add(new Category(3, "Health"));

	}

	public List<Category> getCategories() {
		return categories;
	}

}
