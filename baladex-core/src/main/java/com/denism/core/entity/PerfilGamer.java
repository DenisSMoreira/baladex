package com.denism.core.entity;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * PerfilGamer
 * @author denism
 * @version $Rev$ $Date$
 */
public class PerfilGamer implements BaseEntity<Long>{

	private static final long serialVersionUID = 1L;
	private Long perfilGamerId;
	private Short level;
	private Long experienceTotal;
	private byte[] avatar;
	private List<Mission> tasks;
	
	/**
	 * Retorna o valor do perfilGamerId
	 * @return the perfilGamerId
	 */
	public Long getPerfilGamerId() {
		return perfilGamerId;
	}
	/**
	 * Armazena o perfilGamerId no campo perfilGamerId 
	 * @param perfilGamerId the perfilGamerId to set
	 */
	public void setPerfilGamerId(Long perfilGamerId) {
		this.perfilGamerId = perfilGamerId;
	}
	/**
	 * Retorna o valor do level
	 * @return the level
	 */
	public Short getLevel() {
		return level;
	}
	/**
	 * Armazena o level no campo level 
	 * @param level the level to set
	 */
	public void setLevel(Short level) {
		this.level = level;
	}
	/**
	 * Retorna o valor do experienceTotal
	 * @return the experienceTotal
	 */
	public Long getExperienceTotal() {
		return experienceTotal;
	}
	/**
	 * Armazena o experienceTotal no campo experienceTotal 
	 * @param experienceTotal the experienceTotal to set
	 */
	public void setExperienceTotal(Long experienceTotal) {
		this.experienceTotal = experienceTotal;
	}
	/**
	 * Retorna o valor do avatar
	 * @return the avatar
	 */
	public byte[] getAvatar() {
		return avatar;
	}
	/**
	 * Armazena o avatar no campo avatar 
	 * @param avatar the avatar to set
	 */
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	/**
	 * Retorna o valor do tasks
	 * @return the tasks
	 */
	public List<Mission> getTasks() {
		return tasks;
	}
	/**
	 * Armazena o tasks no campo tasks 
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<Mission> tasks) {
		this.tasks = tasks;
	}
	
	@Override
	public Long getId() {
		return this.getPerfilGamerId();
	}
	
	@Override
	public void setId(Long id) {
		this.setPerfilGamerId(id);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	
}
