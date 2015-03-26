package com.denism.core.entity;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Mission 
 * @author denism
 *
 */
public class Mission implements BaseEntity<Long>{

	private static final long serialVersionUID = 1L;
	private Long missionId;
	private Short nivelNecessary;
	private Long experience;
	private String descrition;
	private List<Mission> missionNecessary;
	private List<Mission> missionLinked;
	private Status status;
	private Short order;
	
	/**
	 * Retorna o valor do missionId
	 * @return the missionId
	 */
	public Long getMissionId() {
		return missionId;
	}
	/**
	 * Armazena o missionId no campo missionId 
	 * @param missionId the missionId to set
	 */
	public void setMissionId(Long missionId) {
		this.missionId = missionId;
	}
	/**
	 * Retorna o valor do nivelNecessary
	 * @return the nivelNecessary
	 */
	public Short getNivelNecessary() {
		return nivelNecessary;
	}
	/**
	 * Armazena o nivelNecessary no campo nivelNecessary 
	 * @param nivelNecessary the nivelNecessary to set
	 */
	public void setNivelNecessary(Short nivelNecessary) {
		this.nivelNecessary = nivelNecessary;
	}
	/**
	 * Retorna o valor do experience
	 * @return the experience
	 */
	public Long getExperience() {
		return experience;
	}
	/**
	 * Armazena o experience no campo experience 
	 * @param experience the experience to set
	 */
	public void setExperience(Long experience) {
		this.experience = experience;
	}
	/**
	 * Retorna o valor do descrition
	 * @return the descrition
	 */
	public String getDescrition() {
		return descrition;
	}
	/**
	 * Armazena o descrition no campo descrition 
	 * @param descrition the descrition to set
	 */
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	/**
	 * Retorna o valor do missionNecessary
	 * @return the missionNecessary
	 */
	public List<Mission> getMissionNecessary() {
		return missionNecessary;
	}
	/**
	 * Armazena o missionNecessary no campo missionNecessary 
	 * @param missionNecessary the missionNecessary to set
	 */
	public void setMissionNecessary(List<Mission> missionNecessary) {
		this.missionNecessary = missionNecessary;
	}
	/**
	 * Retorna o valor do missionLinked
	 * @return the missionLinked
	 */
	public List<Mission> getMissionLinked() {
		return missionLinked;
	}
	/**
	 * Armazena o missionLinked no campo missionLinked 
	 * @param missionLinked the missionLinked to set
	 */
	public void setMissionLinked(List<Mission> missionLinked) {
		this.missionLinked = missionLinked;
	}
	/**
	 * Retorna o valor do status
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * Armazena o status no campo status 
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	/**
	 * Retorna o valor do order
	 * @return the order
	 */
	public Short getOrder() {
		return order;
	}
	/**
	 * Armazena o order no campo order 
	 * @param order the order to set
	 */
	public void setOrder(Short order) {
		this.order = order;
	}
	
	@Override
	public Long getId() {
		return this.getMissionId();
	}
	
	@Override
	public void setId(Long id) {
		this.setMissionId(id);
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
