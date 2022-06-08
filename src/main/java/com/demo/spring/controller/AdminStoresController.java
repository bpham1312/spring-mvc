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
import com.demo.spring.entity.Stores;
import com.demo.spring.serviceImp.CatsService_Imp;
import com.demo.spring.serviceImp.StoresService_Imp;

@Controller
@RequestMapping(value="/admin/stores")
public class AdminStoresController {
	@Autowired
	private CatsService_Imp catsService_Imp;
	@Autowired
	private StoresService_Imp storesService_Imp;
	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<Stores> list= storesService_Imp.list(null);
		model.addAttribute("storesList",list);
		return"admin/stores/list";
	}
	
	@RequestMapping(value = {"/new"}, method = RequestMethod.GET)
	public String regis(Locale locale, Model model) {
		Stores stores = new Stores(); 
		List<Cats> list= catsService_Imp.ListByStores(null); 
		model.addAttribute("stores",stores);
		model.addAttribute("catsListByStores",list);
		return"admin/stores/new";
	}
	
	@RequestMapping(value = {"/add"}, method = RequestMethod.POST)
	public String add(@ModelAttribute("stores")Stores stores,
			@RequestParam(value="new", required=false)String newCat,
			@RequestParam(value="selectCats", required=false)Integer idSCats,Locale locale, Model model) {
		Cats cats = new Cats();
		if(!newCat.isEmpty()){
			cats.setName(newCat);
			catsService_Imp.insert(cats);
			cats = catsService_Imp.selectLast(null);
		}else {
			cats.setId(idSCats);			
		}
		stores.setCats(cats);
		storesService_Imp.insert(stores);
		return"redirect:/admin/stores";
	}
	
	@RequestMapping(value = {"/edit"}, method = RequestMethod.GET)
	public String edit(@RequestParam(value="id")Integer id,Locale locale, Model model) {
		Stores stores = new Stores();
		stores.setId(id);
		stores = storesService_Imp.get(stores);
		List<Cats> list= catsService_Imp.ListByStores(null); 
		model.addAttribute("stores",stores);
		model.addAttribute("catsListByStores",list);
		return "admin/stores/edit";
	}
	
	@RequestMapping(value = {"/update"}, method = RequestMethod.POST)
	public String update(
		@ModelAttribute("stores") Stores stores,
		@RequestParam(value="new", required=false)String newCat,
		@RequestParam(value="selectCats", required=false)Integer idSCats,Locale locale, Model model) {
		Cats cats = new Cats();
		if(!newCat.isEmpty()){
			cats.setName(newCat);
			catsService_Imp.insert(cats);
			cats = catsService_Imp.selectLast(null);
		}else {
			cats.setId(idSCats);			
		}
		stores.setCats(cats);
		System.out.println(stores);
		storesService_Imp.update(stores);
		return "redirect:/admin/stores";
	}
	
	@RequestMapping(value = {"/delete"}, method = RequestMethod.GET)
	public String delete(@RequestParam(value="id")Integer id ,Locale locale, Model model) {
		Stores stores = new Stores(); 
		stores.setId(id);
		System.out.println(stores);
		storesService_Imp.delete(stores);
		return "redirect:/admin/stores";
	}
}
