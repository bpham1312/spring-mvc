package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.entity.Cats;

public interface CatsDAO extends InterfaceDAO<Cats>{
	List<Cats> ListByStores(Cats vo);
	Cats selectLast(Cats vo);
}
