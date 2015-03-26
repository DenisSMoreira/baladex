package com.denism.core.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Address 
 * @author denism
 * @version $Rev$ $Date$
 */
public class Address implements BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	private Long addressId;
	private String postalCode;
	private String location;
	private String locationNumber;
	private String complement;
	private String city;
	private String state;
	private String checkingCopyStatus;
	private String country;
	private Boolean principal;
	private String addressNickname;
	private String category;
	private String locationType;

	/**
	 * Retorna o valor do addressId
	 * 
	 * @return the addressId
	 */
	public Long getAddressId() {
		return addressId;
	}

	/**
	 * Armazena o addressId no campo addressId
	 * 
	 * @param addressId
	 *            the addressId to set
	 */
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	/**
	 * Retorna o valor do postalCode
	 * 
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Armazena o postalCode no campo postalCode
	 * 
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Retorna o valor do location
	 * 
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Armazena o location no campo location
	 * 
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Retorna o valor do locationNumber
	 * 
	 * @return the locationNumber
	 */
	public String getLocationNumber() {
		return locationNumber;
	}

	/**
	 * Armazena o locationNumber no campo locationNumber
	 * 
	 * @param locationNumber
	 *            the locationNumber to set
	 */
	public void setLocationNumber(String locationNumber) {
		this.locationNumber = locationNumber;
	}

	/**
	 * Retorna o valor do complement
	 * 
	 * @return the complement
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * Armazena o complement no campo complement
	 * 
	 * @param complement
	 *            the complement to set
	 */
	public void setComplement(String complement) {
		this.complement = complement;
	}

	/**
	 * Retorna o valor do city
	 * 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Armazena o city no campo city
	 * 
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Retorna o valor do state
	 * 
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Armazena o state no campo state
	 * 
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Retorna o valor do checkingCopyStatus
	 * 
	 * @return the checkingCopyStatus
	 */
	public String getCheckingCopyStatus() {
		return checkingCopyStatus;
	}

	/**
	 * Armazena o checkingCopyStatus no campo checkingCopyStatus
	 * 
	 * @param checkingCopyStatus
	 *            the checkingCopyStatus to set
	 */
	public void setCheckingCopyStatus(String checkingCopyStatus) {
		this.checkingCopyStatus = checkingCopyStatus;
	}

	/**
	 * Retorna o valor do country
	 * 
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Armazena o country no campo country
	 * 
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Retorna o valor do principal
	 * 
	 * @return the principal
	 */
	public Boolean getPrincipal() {
		return principal;
	}

	/**
	 * Armazena o principal no campo principal
	 * 
	 * @param principal
	 *            the principal to set
	 */
	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}

	/**
	 * Retorna o valor do addressNickname
	 * 
	 * @return the addressNickname
	 */
	public String getAddressNickname() {
		return addressNickname;
	}

	/**
	 * Armazena o addressNickname no campo addressNickname
	 * 
	 * @param addressNickname
	 *            the addressNickname to set
	 */
	public void setAddressNickname(String addressNickname) {
		this.addressNickname = addressNickname;
	}

	/**
	 * Retorna o valor do category
	 * 
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Armazena o category no campo category
	 * 
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Retorna o valor do locationType
	 * 
	 * @return the locationType
	 */
	public String getLocationType() {
		return locationType;
	}

	/**
	 * Armazena o locationType no campo locationType
	 * 
	 * @param locationType
	 *            the locationType to set
	 */
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	@Override
	public Long getId() {
		return this.getAddressId();
	}

	@Override
	public void setId(Long id) {
		this.setAddressId(id);
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
