package com.denism.core.entity;

import java.io.Serializable;

/**
 * @author denism
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
