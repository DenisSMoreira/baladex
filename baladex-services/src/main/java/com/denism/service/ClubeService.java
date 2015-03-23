/**
 * 
 */
package com.denism.service;

import java.util.List;

import com.denism.core.entity.Clube;

/**
 * @author denism
 *
 */
public interface ClubeService {

	/**
	 * 
	 * @return
	 */
	public List<Clube> findAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Clube findById( Long id );

	/**
	 * 
	 * @param clube
	 */
	public void save(Clube clube);

	/**
	 * 
	 * @param clube
	 */
	public void saveOrUpdate(Clube clube);
	
	/**
	 * 
	 * @param clube
	 */
	public void remove(Clube clube);
}