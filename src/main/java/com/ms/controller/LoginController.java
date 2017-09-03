/*******************************************************************************
* Copyright (c) 2016, 2017 PWC Corporation and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the PWC License v1.0
*
* Contributors:
* PWC - initial API and implementation
*******************************************************************************/
package com.ms.controller;

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
import com.ms.bean.Login;
import com.ms.dto.UserDTO;
import com.ms.entity.PaidFeeSummary;
import com.ms.entity.User;
import com.ms.service.ContentDataService;
import com.ms.service.LoginService;
import com.ms.util.MSConstant;
import com.ms.util.MSException;
import com.ms.util.SessionUtil;
import com.ms.entity.ContentData;



@Controller
@Scope("request")
public class LoginController {
	
	@Autowired
	private LoginService loginService;


	
	

	@RequestMapping(value = "/login", method = { RequestMethod.POST, RequestMethod.GET })
	    public ModelAndView Adminlogin(@ModelAttribute("login") @Validated Login login, BindingResult bindingResult, Model model,HttpServletRequest request) {
			if (request.getMethod().equalsIgnoreCase(RequestMethod.GET.name())) {
				login = new Login();
				System.out.println();
				return new ModelAndView("login", "login", login);
			}else{
				try {
					User user = loginService.authenticate(login);
					if(user != null){
						UserDTO userDTO = new UserDTO(user);
						SessionUtil.setUser(userDTO);
						SessionUtil.setCurrentSchoolSesseion((byte) 1);
						return new ModelAndView("redirect:/dashboard.do");
					}else{
						model.addAttribute(MSConstant.MESSAGE, "Incorrect Email/Password");
					}
				} catch (MSException e) {
					e.printStackTrace();
					model.addAttribute(MSConstant.MESSAGE, "Error Occured");
				}
				return new ModelAndView("login", "login", login);
			} 
	   }

	@RequestMapping(value = "/dashboard", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView dashboardPage(@ModelAttribute("dashboard") @Validated ContentDataBean contentDataBean, BindingResult bindingResult, Model model,HttpServletRequest request) {
		if (request.getMethod().equalsIgnoreCase(RequestMethod.GET.name())) {
			SessionUtil.setPage(MSConstant.DASHBOARD);	
			return new ModelAndView("dashboard");
		}else{
			SessionUtil.setPage(MSConstant.DASHBOARD);	
			
			String a=contentDataBean.getStudentName();
			String b=contentDataBean.getStudentDescription();
			String c=contentDataBean.getClassName(); 
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			ContentData contentData=new ContentData();
			
			contentData.setStudentname(a);
			contentData.setStudentdescription(b);
			contentData.setClassname(c);
			ContentDataService contentDataService =new  ContentDataService();
			
			contentDataService.saveData(contentData);
			
			/*ContentData obj=contentDataService.getStudentByStudentName(a);*/
			
			
			return new ModelAndView("dashboard");
		}
	}
	
		
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, RedirectAttributes attributes) throws Exception {
		/*UserDTO userDTO = SessionUtil.getUser();
		if (userDTO != null) {
			Integer userId = userDTO.getId();
			if (userId != null) {
				String sessionId = request.getSession().getId();
				
			}
		}*/
		request.getSession().invalidate();
		attributes.addFlashAttribute("message", "You have logged out!");
		return new ModelAndView("redirect:/login.do");
	}
	
	
}
