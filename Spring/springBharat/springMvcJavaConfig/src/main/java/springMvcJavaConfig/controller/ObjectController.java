package springMvcJavaConfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springMvcJavaConfig.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/test")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
        
		modelAndView.setViewName("objectView");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Jon");
		employee.setSalary(2000);
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}

}
