package com.demo.spring.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.daoImp.SpeciesDAO_Imp;
import com.demo.spring.entity.Species;
import com.demo.spring.service.SpeciesService;

@Service
public class SpeciesService_Imp implements SpeciesService{
	@Autowired
	private SpeciesDAO_Imp speciesDAO_Imp;
	
	@Override
	public void insert(Species vo) {
		// TODO Auto-generated method stub
		speciesDAO_Imp.insert(vo);
	}

	@Override
	public void update(Species vo) {
		// TODO Auto-generated method stub
		speciesDAO_Imp.update(vo);
	}

	@Override
	public void delete(Species vo) {
		// TODO Auto-generated method stub
		speciesDAO_Imp.delete(vo);
	}

	@Override
	public Species get(Species vo) {
		// TODO Auto-generated method stub
		return speciesDAO_Imp.get(vo);
	}

	@Override
	public List<Species> list(Species vo) {
		// TODO Auto-generated method stub
		return speciesDAO_Imp.list(vo);
	}

	@Override
	public Species selectLast(Species vo) {
		// TODO Auto-generated method stub
		return speciesDAO_Imp.selectLast(vo);
	}

}
