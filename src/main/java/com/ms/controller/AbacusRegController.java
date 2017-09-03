package com.ms.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("request")
public class AbacusRegController {

	
	@RequestMapping(value = "/abacusreg", method = { RequestMethod.POST, RequestMethod.GET })  
	    public ModelAndView abacusreg() {  
	        
	        return new ModelAndView("abacusreg");  
	    } 


}
