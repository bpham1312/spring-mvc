package com.demo.spring.daoImp;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.SpeciesDAO;
import com.demo.spring.entity.Species;

@Repository
public class SpeciesDAO_Imp implements SpeciesDAO{
	@Autowired
	private SqlSessionTemplate session;
	@Override
	public void insert(Species vo) {
		// TODO Auto-generated method stub
		session.insert("Species.insert",vo);
	}
	@Override
	public void update(Species vo) {
		// TODO Auto-generated method stub
		session.update("Species.update",vo);
	}
	@Override
	public void delete(Species vo) {
		// TODO Auto-generated method stub
		session.delete("Species.delete",vo);
	}
	@Override
	public Species get(Species vo) {
		// TODO Auto-generated method stub
		return session.selectOne("Species.selectOne",vo);
	}
	@Override
	public List<Species> list(Species vo) {
		// TODO Auto-generated method stub
		return session.selectList("Species.selectList",vo);
	}
	@Override
	public Species selectLast(Species vo) {
		// TODO Auto-generated method stub
		return session.selectOne("Species.selectLast",vo);
	}
}
