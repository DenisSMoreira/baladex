package com.denism.core.entity;

import java.io.Serializable;

/**
 * @author denism
 * @version $Rev$ $Date$
 */
public interface BaseEntity<T> extends Serializable {

	/**
	 * getId entity
	 * 
	 * @return id
	 */
	T getId();

	/**
	 * SetId entity
	 * 
	 * @param id
	 */
	void setId(T id);
}
