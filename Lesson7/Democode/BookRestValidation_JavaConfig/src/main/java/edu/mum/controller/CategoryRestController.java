package edu.mum.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Category;
import edu.mum.service.CategoryService;

@RestController
public class CategoryRestController {

	@Autowired
	private CategoryService categoryService;

	// @Valid - but NO BindResult! an exception will be thrown...
	@CrossOrigin(origins = { "http://localhost:9080", "http://localhost:9000" }, maxAge = 6000)
	@PostMapping(value="/api/addCategory", produces = "application/json")
	public Category saveCategory(@Valid @RequestBody Category category) {
		categoryService.save(category);
		return category;
	}
	
//	@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping("/api/{name}.json")
	public Category getCategoryInJSON(@PathVariable String name) {
		return categoryService.getCategoryByName(name);
	}
	
	@GetMapping("/api/{name}.xml")
	public Category getCategoryInXML(@PathVariable String name) {
		return categoryService.getCategoryByName(name);
	}

}
