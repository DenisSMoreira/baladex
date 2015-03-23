/**
 * 
 */
package com.denism.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denism.core.entity.Clube;
import com.denism.core.repository.ClubeRepository;
import com.denism.service.ClubeService;

/**
 * @author denism
 *
 */
@Service("clubeService")
public class ClubeServiceImpl implements ClubeService {

	@Autowired
	private ClubeRepository clubeRepo;

	/* (non-Javadoc)
	 * @see com.denism.controller.ClubeController#findAll()
	 */
	@Override
	public List<Clube> findAll() {
		// 
		return clubeRepo.findAll();
	}

	@Override
	public Clube findById(Long id) {
		// 
		return clubeRepo.findById(id);
	}

	@Override
	public void save(Clube clube) {
		// 
		clubeRepo.save( clube );
	}

	@Override
	public void saveOrUpdate(Clube clube) {
		// 
		clubeRepo.merge( clube );
	}	

	@Override
	public void remove(Clube clube) {
		// 
		clubeRepo.remove( clube );
	}

}
