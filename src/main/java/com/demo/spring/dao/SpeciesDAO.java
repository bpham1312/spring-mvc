package com.demo.spring.dao;

import com.demo.spring.entity.Species;

public interface SpeciesDAO extends InterfaceDAO<Species>{
	Species selectLast(Species vo);
}
