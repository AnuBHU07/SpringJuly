package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView redirect = new RedirectView();
		redirect.setUrl("enjoy");
		return redirect;
		//return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		return "contact";
	}
}
