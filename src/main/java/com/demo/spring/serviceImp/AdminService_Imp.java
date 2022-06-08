package com.demo.spring.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.daoImp.AdminDAO_Imp;
import com.demo.spring.entity.Admin;
import com.demo.spring.service.AdminService;

@Service
public class AdminService_Imp implements AdminService{
	@Autowired
	AdminDAO_Imp dao;

	@Override
	public void insert(Admin vo) {
		dao.insert(vo);
	}

	@Override
	public void update(Admin vo) {
		dao.update(vo);
	}

	@Override
	public void delete(Admin vo) {
		dao.delete(vo);
	}

	@Override
	public Admin get(Admin vo) {
		return dao.get(vo);
	}

	@Override
	public List<Admin> list(Admin vo) {
		return dao.list(vo);
	}

	@Override
	public Admin checkLogin(Admin vo) {
		return dao.checkLog(vo);
	}

	@Override
	public Admin selectByName(Admin vo) {
		return dao.selectByName(vo);
	}
	
	
}
