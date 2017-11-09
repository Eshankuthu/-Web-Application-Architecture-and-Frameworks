package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.mum.domain.User;
import edu.mum.service.DataService;

@Controller
@SessionAttributes("user")
public class AuthenticationServlet {

	@Autowired
	private DataService loginservice;

	@RequestMapping({"/","/login"})
	public String welcomelogin() {
		return "login";

	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(User userl, Model model) {

		String userpass = loginservice.findPassword(userl.getName());
		if (userl.getPassword().equals(userpass)) {
			model.addAttribute("user", userl);
			return "redirect:advice";
		} else {
			return "redirect:login";
		}

	}
	

	  @RequestMapping(value="/logout",method = RequestMethod.POST)
	  public String Logout(Model model, SessionStatus status ) throws Exception {

		  status.setComplete();
	       
		  return  "redirect:advice";  

	}


}
