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

import com.demo.spring.entity.Cats;
import com.demo.spring.entity.Species;
import com.demo.spring.serviceImp.CatsService_Imp;
import com.demo.spring.serviceImp.SpeciesService_Imp;

@Controller
@RequestMapping(value="/admin/cats")
public class CatsController {
	@Autowired
	private CatsService_Imp catsService_Imp;
	@Autowired
	private SpeciesService_Imp speciesService_Imp;
	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<Cats> list= catsService_Imp.list(null);
		model.addAttribute("catsList",list);
		return"admin/cats/list";
	}
	
	@RequestMapping(value = {"/new"}, method = RequestMethod.GET)
	public String regis(Locale locale, Model model) {
		Cats vo = new Cats();
		List<Species> list = speciesService_Imp.list(null);
		model.addAttribute("speciesList",list);
		model.addAttribute("cats",vo);
		return "admin/cats/new";
	}
	
	@RequestMapping(value = {"/add"}, method = RequestMethod.POST)
	public String add(@ModelAttribute("cats")Cats cat,
			@RequestParam(value="new", required=false)String newSpecies,
			@RequestParam(value="selectSpecies")Integer id,Locale locale, Model model) {
		Species species = new Species();
		if(!newSpecies.isEmpty()) {
			species.setName(newSpecies);
			speciesService_Imp.insert(species);
			species = speciesService_Imp.selectLast(null);
		}else {
			species.setId(id);			
		}
		cat.setSpecies(species);
		catsService_Imp.insert(cat);
		return"redirect:/admin/cats";
	}
	
	@RequestMapping(value = {"/edit"}, method = RequestMethod.GET)
	public String edit(@RequestParam(value="id")Integer id,Locale locale, Model model) {
		Cats vo = new Cats();
		vo.setId(id);
		Cats cats = catsService_Imp.get(vo);
		List<Species> list = speciesService_Imp.list(null);
		model.addAttribute("speciesList",list);
		model.addAttribute("cats",cats);
		return "admin/cats/edit";
	}
	
	@RequestMapping(value = {"/update"}, method = RequestMethod.POST)
	public String update(@RequestParam(value="id")Integer id,
		@RequestParam(value="new", required=false)String newSpecies,
		@ModelAttribute("cats") Cats cat,
		@RequestParam(value="selectSpecies")Integer idSpecies,
		Locale locale, Model model) {
		Species species = new Species();
		if(!newSpecies.isEmpty()) {
			species.setName(newSpecies);
			speciesService_Imp.insert(species);
			species = speciesService_Imp.selectLast(null);
		}else {
			species.setId(idSpecies);			
		}
		cat.setSpecies(species);
		cat.setId(id);
		catsService_Imp.update(cat);
		return "redirect:/admin/cats";
	}
	
	@RequestMapping(value = {"/delete"}, method = RequestMethod.GET)
	public String delete(@RequestParam(value="id")Integer id ,Locale locale, Model model) {
		Cats vo = new Cats();
		vo.setId(id);
		catsService_Imp.delete(vo);
		return "redirect:/admin/cats";
	}
	
}
