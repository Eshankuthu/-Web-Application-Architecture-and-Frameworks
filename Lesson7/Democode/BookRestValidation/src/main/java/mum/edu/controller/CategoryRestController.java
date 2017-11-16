package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mum.edu.domain.Category;
import mum.edu.service.CategoryService;

@Controller
public class CategoryRestController {

	@Autowired
	private CategoryService categoryService;

	// @Valid - but NO BindResult! an exception will be thrown...
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public @ResponseBody Category saveCategory(@Valid @RequestBody Category category) {
		categoryService.save(category);
		return category;
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Category getCategoryInJSON(@PathVariable String name) {
		Category category = new Category(1, name);
		category.setDescription("This is " + name + " Category!");

		return category;
	}

	@RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
	public @ResponseBody Category getCategoryInXML(@PathVariable String name) {
		Category category = new Category(1, name);
		category.setDescription("This is " + name + " Category!");
		return category;
	}
	
	@RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
	public @ResponseBody Category getEmployeeInXML(@PathVariable String name) {
		Category category = new Category(1, name);
		category.setDescription("This is " + name + " Category!");
		return category;
	}

}
