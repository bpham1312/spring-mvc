package com.demo.spring.service;

import com.demo.spring.entity.Species;

public interface SpeciesService extends InterfaceService<Species>{
	Species selectLast(Species vo);
}
