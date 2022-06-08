package com.demo.spring.controller;


import java.util.List;
import java.util.Locale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.spring.entity.Species;


import com.demo.spring.serviceImp.SpeciesService_Imp;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/admin/species")
public class AdminSpeciesController {
	@Autowired
	private SpeciesService_Imp speciesService_Imp;
	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<Species> list = speciesService_Imp.list(null);
		model.addAttribute("speciesList",list);
		return "admin/species/list";
	}
	
	@RequestMapping(value = {"/new"}, method = RequestMethod.GET)
	public String regis(Locale locale, Model model) {
		Species vo = new Species();
		model.addAttribute("species",vo);
		return "admin/species/new";
	}
	
	@RequestMapping(value = {"/add"}, method = RequestMethod.POST)
	public String add(@ModelAttribute("species") Species vo,Locale locale, Model model) {
		speciesService_Imp.insert(vo);
		return "redirect:/admin/species";
	}
	
	@RequestMapping(value = {"/edit"}, method = RequestMethod.GET)
	public String edit(@RequestParam(value="id")Integer id,Locale locale, Model model) {
		Species vo = new Species();
		vo.setId(id);
		Species species = speciesService_Imp.get(vo);
		model.addAttribute("species",species);
		return "admin/species/edit";
	}
	
	@RequestMapping(value = {"/update"}, method = RequestMethod.POST)
	public String update(@RequestParam(value="id")Integer id,
		@ModelAttribute("species") Species vo,Locale locale, Model model) {
		vo.setId(id);
		speciesService_Imp.update(vo);
		return "redirect:/admin/species";
	}
	
	@RequestMapping(value = {"/delete"}, method = RequestMethod.GET)
	public String delete(@RequestParam(value="id")Integer id, Locale locale, Model model) {
		Species vo = new Species();
		vo.setId(id);
		speciesService_Imp.delete(vo);
		return "redirect:/admin/species";
	}
}
