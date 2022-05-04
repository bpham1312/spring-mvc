package com.demo.spring.dao;

import java.util.List;
//Generic type
public interface InterfaceDAO<T> {
	// CRUD methods
	void insert(T vo);

	void update(T vo);

	void delete(T vo);

	T get(T vo);

	List<T> list(T vo);
}
