package springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {

		ModelAndView modelAndView = new ModelAndView();
		// send object type data to UI
		modelAndView.setViewName("hello");
		modelAndView.addObject("id",1);
		modelAndView.addObject("name","Ram");
		modelAndView.addObject("Dept","Eng");
		return modelAndView;

	}
}
