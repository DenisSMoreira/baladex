/**
 *  
 *  Denis Soares Moreira - www.denissoaresmoreira.com
 */
package com.denism.core.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.denism.core.entity.Clube;
import com.denism.core.generic.JpaGenericDAO;

/**
 * 
 *
 * @autor denism
 * @version $Rev$ $Date$
 */
@Repository("clubeRepository")
public class ClubeRepository extends JpaGenericDAO<Clube, Long> {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@PostConstruct
	public void init() {
		super.setEntityManagerFactory(entityManagerFactory);
	}

}