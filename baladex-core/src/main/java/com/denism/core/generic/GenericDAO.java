/**
 * 
 */
package com.denism.core.generic;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;

/**
 * @author denism
 *
 */
public interface GenericDAO<T, ID extends Serializable> {

	/**
	 * 
	 * @param entity
	 * @return
	 * @throws HibernateException
	 */
	void save(T entity);

	/**
	 * 
	 * @param entity
	 * @return
	 * @throws HibernateException
	 */
	void update(T entity);

	/**
	 * 
	 * @param entity
	 * @return
	 * @throws HibernateException
	 */
	void merge(T entity);

	/**
	 * 
	 * @param entity
	 * @throws HibernateException
	 */
	void remove(T entity);

	/**
	 * 
	 * @return
	 */
	List<T> findAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	T findById(ID id);

}
