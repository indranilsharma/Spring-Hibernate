package springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springMvc.dto.Employee;

@Controller
public class ListObjectController {

	@RequestMapping("/test1")
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
