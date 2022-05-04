package com.demo.spring.service;

import java.util.List;

// Generic type
public interface InterfaceService<T> {
	// CRUD methods
	void insert(T vo);

	void update(T vo);

	void delete(T vo);

	T get(T vo);

	List<T> list(T vo);
}
