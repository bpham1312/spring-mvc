package com.demo.spring.daoImp;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.CatsDAO;
import com.demo.spring.entity.Cats;

@Repository
public class CatsDAO_Imp implements CatsDAO{
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public void insert(Cats vo) {
		// TODO Auto-generated method stub
		session.insert("Cats.insert",vo);
	}

	@Override
	public void update(Cats vo) {
		// TODO Auto-generated method stub
		session.update("Cats.update",vo);
	}

	@Override
	public void delete(Cats vo) {
		// TODO Auto-generated method stub
		session.delete("Cats.delete",vo);
	}

	@Override
	public Cats get(Cats vo) {
		// TODO Auto-generated method stub
		return session.selectOne("Cats.selectOne",vo);
	}

	@Override
	public List<Cats> list(Cats vo) {
		// TODO Auto-generated method stub
		return session.selectList("Cats.selectList",vo);
	}

	@Override
	public List<Cats> ListByStores(Cats vo) {
		// TODO Auto-generated method stub
		return session.selectList("Cats.selectListInStores",vo);
	}

	@Override
	public Cats selectLast(Cats vo) {
		// TODO Auto-generated method stub
		return session.selectOne("Cats.selectLast",vo);
	}

}
