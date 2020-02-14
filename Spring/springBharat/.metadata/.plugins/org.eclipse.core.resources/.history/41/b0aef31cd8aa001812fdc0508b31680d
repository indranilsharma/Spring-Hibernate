package springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {

	// this method purpose take input from url and show in tomcat console
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("age") String age) {

		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("regView");
		return modelAndView;
	}
}
