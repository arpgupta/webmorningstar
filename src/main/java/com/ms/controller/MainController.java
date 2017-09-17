/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/


package com.ms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ms.bean.ContentDataBean;
import com.ms.entity.ContentData;
import com.ms.service.ContentDataService;
import com.ms.util.MSException;




/**
 * @author arpit  gupta
 *
 */
@Controller
@Scope("request")
public class MainController {

	@Autowired
	private ContentDataService contentDataService;
	
	
	 
	 @RequestMapping(value = "/index", method = {RequestMethod.GET })
	    public ModelAndView index(@ModelAttribute("dashboard") @Validated ContentDataBean contentDataBean, BindingResult bindingResult, Model model,HttpServletRequest request) throws MSException { 
		 List<ContentData> obj=contentDataService.findStudentData();
		 
			contentDataBean.setContentData(obj);
		 
	        return new ModelAndView("index");  
	    }  
	 
	 
	 @RequestMapping("/about")  
	    public ModelAndView about() {  
	        
	        return new ModelAndView("about");  
	    }  
	 @RequestMapping("/contact")  
	    public ModelAndView contact() {  
	        
	        return new ModelAndView("contact");  
	    }
	
	 @RequestMapping("/blog-with-sidebar")  
	    public ModelAndView blog() {  
	        
	        return new ModelAndView("blog-with-sidebar");  
	    }  
	
	 @RequestMapping("/courses")  
	    public ModelAndView courses() {  
	        
	        return new ModelAndView("courses");  
	    }  
	 @RequestMapping("/gallery")  
	    public ModelAndView gallery() {  
	        
	        return new ModelAndView("gallery");  
	    }  
	 @RequestMapping("/message")  
	    public ModelAndView message() {  
	        
	        return new ModelAndView("message");  
	    }  
	 @RequestMapping("/mission")  
	    public ModelAndView mission() {  
	        
	        return new ModelAndView("mission");  
	    }  
	
	 
	 @RequestMapping("/motto")  
	    public ModelAndView motto() {  
	        
	        return new ModelAndView("motto");  
	    } 
	 @RequestMapping("/objective")  
	    public ModelAndView objective() {  
	        
	        return new ModelAndView("objective");  
	    } 
	 @RequestMapping("/ourinspretion")  
	    public ModelAndView ourinspretion() {  
	        
	        return new ModelAndView("ourinspretion");  
	    } 
	 @RequestMapping("/theschool")  
	    public ModelAndView theschool() {  
	        
	        return new ModelAndView("theschool");  
	    } 
	 @RequestMapping("/vision")  
	    public ModelAndView vision() {  
	        
	        return new ModelAndView("vision");  
	    } 
	 @RequestMapping("/tc")  
	    public ModelAndView tc() {  
	        
	        return new ModelAndView("tc");  
	    } 
	 
	
	 
	 @RequestMapping("/feer")  
	    public ModelAndView feer() {  
	        
	        return new ModelAndView("feer");  
	    }
	 
	 
	 
	
	
}