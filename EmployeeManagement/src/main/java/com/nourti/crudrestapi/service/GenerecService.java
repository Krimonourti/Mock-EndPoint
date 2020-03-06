package com.nourti.crudrestapi.service;

import java.util.List;

public interface GenerecService<T, K> {
	
	T create(T t) throws Exception;
	
	T update(T t , K k);
	
	void delet(K k);

	T getById(K k);

	List<T> getAll();

}
