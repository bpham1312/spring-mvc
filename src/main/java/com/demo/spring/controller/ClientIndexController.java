package com.demo.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.spring.entity.Cats;
import com.demo.spring.serviceImp.CatsService_Imp;

@Controller
@RequestMapping(value= "/")
public class ClientIndexController {
	
	@Autowired
	private CatsService_Imp cat;
	@GetMapping
	public String index(HttpServletRequest request,Model model) {
		List<Cats> cats = cat.list(null);
		model.addAttribute("catsList", cats);
		return "client/index";
	}
	
	@GetMapping("/logout")
	public String logOut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "/client/index";
	}
	

}
