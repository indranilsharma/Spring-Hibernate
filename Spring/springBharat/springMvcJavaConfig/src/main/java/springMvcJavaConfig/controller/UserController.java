package springMvcJavaConfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMvcJavaConfig.dto.User;

@Controller
public class UserController {

	/*@RequestMapping("registration")
	public ModelAndView showUserRegistration() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user");
		return modelAndView;
	}*/
	
	
	
	@RequestMapping("registration")
	public String showUserRegistration() {
		  return "user";
	}
	
	

/*	//@RequestMapping("registration")
	@RequestMapping(value = "userRegistration", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("regView");
		return modelAndView;
	}
	*/
	
	
	
	
	//@RequestMapping("registration")
		@RequestMapping(value = "userRegistration", method = RequestMethod.POST)
		public String registerUser(@ModelAttribute("user") User user,ModelMap map) {
			System.out.println(user);
			map.addAttribute("user", user);
			return "regView";
		}
	
	
	
	
	
}