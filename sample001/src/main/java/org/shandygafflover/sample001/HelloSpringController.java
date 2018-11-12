package org.shandygafflover.sample001;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringController {

	@RequestMapping("/loginPage")
	public String showLoginForm(Model model) {
		return "login";
	}

	@RequestMapping("/greeting")
	public String helloSpring(Model model) {
		model.addAttribute("greeting", "Hello, Spring MVC!");
		return "hello";
	}
}