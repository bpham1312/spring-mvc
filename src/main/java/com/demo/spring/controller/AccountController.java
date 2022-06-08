package com.demo.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.demo.spring.entity.Admin;
import com.demo.spring.serviceImp.AdminService_Imp;

@Controller
@RequestMapping(value="/account")
public class AccountController {
	@Autowired
	private AdminService_Imp admin; 
	@GetMapping(value={"","/","login"})
	public String login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "/admin/account/login";
	}
	
	@PostMapping("/login")
	public String checkLogin(Model model,Admin vo,
			@RequestParam(value="url")String url,
			HttpServletRequest request){
		HttpSession session = request.getSession();
		Admin user = admin.checkLogin(vo);
		if(user!=null) {
			session.setAttribute("id", user.getId());
			session.setAttribute("user", user.getUserName());
			if(user.getRole()==1) {
				session.setAttribute("auth", "ADMIN");
				url = url.contains("login")||url.isEmpty()?
						"redirect:/admin/species":"redirect:/"+url.substring(request.getContextPath().length());
			}else {
				session.setAttribute("auth", "USER");
				url="redirect:/";
			}
		}else {
			model.addAttribute("error", "Please check user name or password again!");
			url="/admin/account/login";
		}
		return url;
	}
	

	@GetMapping("/register")
	public String register() {
		return "/admin/account/register";
	}
	
	@PostMapping("/register")
	public String add(Admin vo, Model model) {
			String url ="";
			Admin user = admin.selectByName(vo);
			if(user==null) {	
				admin.insert(vo);
				url ="redirect:/account/login";
			}else{
				model.addAttribute("error", "User name is exist!");
				url ="/admin/account/register";
			}
		return url;
	}
}
