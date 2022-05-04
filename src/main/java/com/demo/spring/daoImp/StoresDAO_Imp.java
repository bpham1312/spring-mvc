package com.demo.spring.daoImp;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.InterfaceDAO;
import com.demo.spring.entity.Stores;

@Repository
public class StoresDAO_Imp implements InterfaceDAO<Stores>{
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public void insert(Stores vo) {
		// TODO Auto-generated method stub
		session.insert("Stores.insert",vo);
	}

	@Override
	public void update(Stores vo) {
		// TODO Auto-generated method stub
		session.update("Stores.update",vo);
	}

	@Override
	public void delete(Stores vo) {
		// TODO Auto-generated method stub
		session.delete("Stores.delete",vo);
	}

	@Override
	public Stores get(Stores vo) {
		// TODO Auto-generated method stub
		return session.selectOne("Stores.selectOne",vo);
	}

	@Override
	public List<Stores> list(Stores vo) {
		// TODO Auto-generated method stub
		return session.selectList("Stores.selectList",vo);
	}

}
