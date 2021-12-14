package com.priya;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.priya.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
//	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
//		
//		int i = Integer.parseInt(request.getParameter("num1"));
//		int j = Integer.parseInt(request.getParameter("num2"));
	
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j ) {
	
		
//		int k=i+j; all logic part should be in service
		AddService as = new AddService();
		int k= as.add(i, j);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv;
		// return "display.jsp";  => return type string

	}

}
