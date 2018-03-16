package com.fb.generic;

import java.util.List;

public interface GenericService<T,E> {
	public void save(T t);
	public T update(T t);
	public T find(long id);
	public List<T> findAll();
	public boolean remove(long id);


}
