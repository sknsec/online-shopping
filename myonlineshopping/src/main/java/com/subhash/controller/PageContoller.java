package com.subhash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sk.myshoppingbackend.dao.CategoryDAO;
import com.sk.myshoppingbackend.daoimpl.CategoryDAOImpl;
import com.sk.myshoppingbackend.dto.Category;

@Controller
public class PageContoller {

	@Autowired
	//@Qualifier("categoryDAO")
	CategoryDAOImpl categoryDAO;
	
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() 
	{
		ModelAndView mv = new ModelAndView("index");
		//mv.setViewName("page");
		mv.addObject("title", "home");
		mv.addObject("userClickHome", true);
		
		mv.addObject("categories", categoryDAO.listCategory());
		
		return mv;
	}
	

	@RequestMapping(value ="/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("index");
		//mv.setViewName("page");
		mv.addObject("title", "about us");
		mv.addObject("userClickAbout", true);
		
		return mv;
	}
	
	@RequestMapping(value ="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("index");
		//mv.setViewName("page");
		mv.addObject("title", "contact us");
		mv.addObject("userClickContact", true);
		
		return mv;
	}
	

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() 
	{
		ModelAndView mv = new ModelAndView("index");
		//mv.setViewName("page");
		mv.addObject("title", "home");
		mv.addObject("userClickAllProducts", true);
		
		mv.addObject("categories", categoryDAO.listCategory());
		
		return mv;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id ) 
	{
		
		ModelAndView mv = new ModelAndView("index");
		Category category = categoryDAO.get(id);
		
		//mv.setViewName("page");
		mv.addObject("title", category.getName());
		
		mv.addObject("categories", categoryDAO.listCategory());
		
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);
		
		return mv;
	}
}
