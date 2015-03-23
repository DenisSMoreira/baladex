/**
 * 
 */
package com.denism.core.entity;

import java.io.Serializable;

/**
 * @author denism
 *
 */
public interface BaseEntity<T> extends Serializable {

	/**
	 * 
	 * @return
	 */
	T getId();
	
	/**
	 * 
	 * @param id
	 */
	void setId( T id );
}
