package com.demo.spring.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.daoImp.StoresDAO_Imp;
import com.demo.spring.entity.Stores;
import com.demo.spring.service.InterfaceService;

@Service
public class StoresService_Imp implements InterfaceService<Stores>{
	@Autowired
	private StoresDAO_Imp storesDAO_Imp;
	@Override
	public void insert(Stores vo) {
		// TODO Auto-generated method stub
		storesDAO_Imp.insert(vo);
	}

	@Override
	public void update(Stores vo) {
		// TODO Auto-generated method stub
		storesDAO_Imp.update(vo);
	}

	@Override
	public void delete(Stores vo) {
		// TODO Auto-generated method stub
		storesDAO_Imp.delete(vo);
	}

	@Override
	public Stores get(Stores vo) {
		// TODO Auto-generated method stub
		return storesDAO_Imp.get(vo);
	}

	@Override
	public List<Stores> list(Stores vo) {
		// TODO Auto-generated method stub
		return storesDAO_Imp.list(vo);
	}

}
