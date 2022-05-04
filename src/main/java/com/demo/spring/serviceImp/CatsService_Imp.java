package com.demo.spring.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.daoImp.CatsDAO_Imp;
import com.demo.spring.entity.Cats;
import com.demo.spring.service.CatsService;
import com.demo.spring.service.InterfaceService;

@Service
public class CatsService_Imp implements CatsService{
	@Autowired
	private CatsDAO_Imp catsDAO_Imp;
	
	@Override
	public void insert(Cats vo) {
		// TODO Auto-generated method stub
		catsDAO_Imp.insert(vo);
	}

	@Override
	public void update(Cats vo) {
		// TODO Auto-generated method stub
		catsDAO_Imp.update(vo);
	}

	@Override
	public void delete(Cats vo) {
		// TODO Auto-generated method stub
		catsDAO_Imp.delete(vo);
	}

	@Override
	public Cats get(Cats vo) {
		// TODO Auto-generated method stub
		return catsDAO_Imp.get(vo);
	}

	@Override
	public List<Cats> list(Cats vo) {
		// TODO Auto-generated method stub
		return catsDAO_Imp.list(vo);
	}

	@Override
	public List<Cats> ListByStores(Cats vo) {
		// TODO Auto-generated method stub
		return catsDAO_Imp.ListByStores(vo);
	}

	@Override
	public Cats selectLast(Cats vo) {
		// TODO Auto-generated method stub
		return catsDAO_Imp.selectLast(vo);
	}

}
