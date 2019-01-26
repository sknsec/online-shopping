package com.subhash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageContoller {

	
	
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		//mv.setViewName("page");
		mv.addObject("greetngs", "welcome to spring web mvc");
		
		System.out.println("===============from method=============");
		return mv;
	}
}
