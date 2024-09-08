package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.model.User;
import spring.mvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonModelAttr(Model model) {
		model.addAttribute("Header", "LearningSpring&MVC");
		model.addAttribute("Desc", "Anurag Rawat Programmer");
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User Created with id:"+createdUser);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam(name="email") String
	 * email, @RequestParam(name="username") String Username,
	 * 
	 * @RequestParam(name="password") String Password, Model model) {
	 * System.out.println(email); User user = new User(); user.setEmail(email);
	 * user.setPassword(Password); user.setUsername(Username);
	 * model.addAttribute("user",user);
	 * 
	 * model.addAttribute("email",email); model.addAttribute("username", Username);
	 * model.addAttribute("password", Password);
	 * 
	 * return "success"; }
	 */
}
