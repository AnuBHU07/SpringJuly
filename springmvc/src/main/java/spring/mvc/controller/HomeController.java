package spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("1","Ayush");
		List<String> frndlist = new ArrayList<>();
		frndlist.add("Abhilash");
		frndlist.add("Abhash");
		frndlist.add("Vishok");
		model.addAttribute("list",frndlist);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView model = new ModelAndView();
		model.addObject("name","Anurag Rawat");
		model.addObject("id", 8);
		LocalDateTime time = LocalDateTime.now();
		model.addObject("time",time);
		List<Integer> coOrds = new ArrayList<>();
		coOrds.add(104);		
		coOrds.add(180);		
		coOrds.add(245);		
		coOrds.add(313);
		model.addObject("items",coOrds);
		return model;
	}
}
