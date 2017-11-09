package edu.mum.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.service.DataService;


@Controller
public class AdviceServlet {
	

	@Autowired
	private DataService loginservice;
	
	@RequestMapping(value={"/advice"},method = RequestMethod.GET)
	public String advice(Model model) {
		
		Map< String, String > roastMap = new HashMap<String, String>();
		roastMap.put("Light", "light");
		roastMap.put("Medium", "medium");
		roastMap.put("Dark", "dark");
		model.addAttribute("roasts",roastMap);
		return "advice";
		
	}

	@RequestMapping(value= {"/advice"},method=RequestMethod.POST)
	public String displayroast(String roast,Model model) {
		List<String> advice = loginservice.getAdvice(roast);
		model.addAttribute("roastList", advice);
		return "display";
		
	}

}
