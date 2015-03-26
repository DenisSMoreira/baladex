package com.denism.core.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Phone implements BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	private Long phoneId;
	private String phoneNumber;
	private String areaCode;
	private String type;
	private boolean principal;

	/**
	 * Retorna o valor do phoneId
	 * 
	 * @return the phoneId
	 */
	public Long getPhoneId() {
		return phoneId;
	}

	/**
	 * Armazena o phoneId no campo phoneId
	 * 
	 * @param phoneId
	 *            the phoneId to set
	 */
	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}

	/**
	 * Retorna o valor do phoneNumber
	 * 
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Armazena o phoneNumber no campo phoneNumber
	 * 
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Retorna o valor do areaCode
	 * 
	 * @return the areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * Armazena o areaCode no campo areaCode
	 * 
	 * @param areaCode
	 *            the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * Retorna o valor do type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Armazena o type no campo type
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Retorna o valor do principal
	 * 
	 * @return the principal
	 */
	public boolean isPrincipal() {
		return principal;
	}

	/**
	 * Armazena o principal no campo principal
	 * 
	 * @param principal
	 *            the principal to set
	 */
	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	@Override
	public Long getId() {
		return this.getPhoneId();
	}

	@Override
	public void setId(Long id) {
		this.setPhoneId(id);
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
