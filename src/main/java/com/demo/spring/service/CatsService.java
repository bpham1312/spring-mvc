package com.demo.spring.service;

import java.util.List;

import com.demo.spring.entity.Cats;

public interface CatsService extends InterfaceService<Cats>{
	List<Cats> ListByStores(Cats vo);
	Cats selectLast(Cats vo);
}
