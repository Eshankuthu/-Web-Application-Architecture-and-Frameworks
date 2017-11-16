package mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
	
	@RequestMapping(value = { "/" })
	public String listBooks(Model model) {

		return "category";
	}
	
}
