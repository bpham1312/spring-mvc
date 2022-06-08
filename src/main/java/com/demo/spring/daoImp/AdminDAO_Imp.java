package com.demo.spring.daoImp;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.AdminDAO;
import com.demo.spring.entity.Admin;

@Repository
public class AdminDAO_Imp implements AdminDAO{
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public void insert(Admin vo) {
		session.insert("Admin.insert",vo);
	}

	@Override
	public void update(Admin vo) {
		session.update("Admin.update",vo);
	}

	@Override
	public void delete(Admin vo) {
		session.delete("Admin.delete",vo);
	}

	@Override
	public Admin get(Admin vo) {
		return session.selectOne("Admin.selectOne",vo);
	}

	@Override
	public List<Admin> list(Admin vo) {
		return session.selectList("Admin.selectList",vo);
	}

	@Override
	public Admin checkLog(Admin vo) {
		return session.selectOne("Admin.checkLogin", vo);
	}

	@Override
	public Admin selectByName(Admin vo) {
		return session.selectOne("Admin.selectByName",vo);
	}

}
