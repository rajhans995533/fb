package com.fb.generic;

import java.util.List;
import java.util.stream.Collectors;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@WebService
public abstract class GenericServiceImp<E, T> implements GenericService<T, E> {
	Class<T> t;
	Class<E> e;

	@PersistenceContext(name = "fb")
	protected EntityManager entityManager;

	public GenericServiceImp(Class<E> e, Class<T> t) {
		this.e = e;
		this.t = t;

	}

	@Override
	public void save(T t) {
		E e = convert(t);
		entityManager.persist(e);
	}

	@Override
	public T update(T t) {

		return convertDto(entityManager.merge(convert(t)));
	}

	@Override
	public T find(long id) {
		return convertDto(entityManager.find(e, id));

	}

	@Override
	public List<T> findAll() {
		CriteriaBuilder builder=entityManager.getCriteriaBuilder();
		CriteriaQuery<E> criteria=builder.createQuery(e);
		Root<E> root=criteria.from(e);
		List<E>pojos=entityManager.createQuery(criteria).getResultList();
		/*System.out.println(e.getTypeName().split("\\."));
		Query querry = entityManager.createNamedQuery(e.getSimpleName()+".findAll",e.getClass());
		List<E> pojo = querry.getResultList();*/
		 List<T> dtos = pojos.stream().map(p ->
		 convertDto(p)).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public boolean remove(long id) {

		try {
			entityManager.remove(this.find(id));
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

		return true;
	}

	public abstract E convert(T t);

	public abstract T convertDto(E e);

}
