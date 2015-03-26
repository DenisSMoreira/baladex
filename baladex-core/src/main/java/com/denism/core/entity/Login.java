package com.denism.core.entity;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Login
 * @author denism
 * @version $Rev$ $Date$
 */
public class Login implements BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	private Long loginId;
	private String cpf;
	private Date businessDate;
	private Date lastAccessDate;
	private List<Rule> rules;
	private String password;
	private String fullName;

	/**
	 * Retorna o valor do cpf
	 * 
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Armazena o cpf no campo cpf
	 * 
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Retorna o valor do businessDate
	 * 
	 * @return the businessDate
	 */
	public Date getBusinessDate() {
		return businessDate;
	}

	/**
	 * Armazena o businessDate no campo businessDate
	 * 
	 * @param businessDate
	 *            the businessDate to set
	 */
	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	/**
	 * Retorna o valor do lastAccessDate
	 * 
	 * @return the lastAccessDate
	 */
	public Date getLastAccessDate() {
		return lastAccessDate;
	}

	/**
	 * Armazena o lastAccessDate no campo lastAccessDate
	 * 
	 * @param lastAccessDate
	 *            the lastAccessDate to set
	 */
	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

	/**
	 * Retorna o valor do rules
	 * 
	 * @return the rules
	 */
	public List<Rule> getRules() {
		return rules;
	}

	/**
	 * Armazena o rules no campo rules
	 * 
	 * @param rules
	 *            the rules to set
	 */
	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	/**
	 * Retorna o valor do password
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Armazena o password no campo password
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Retorna o valor do fullName
	 * 
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Armazena o fullName no campo fullName
	 * 
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Retorna o valor do loginId
	 * 
	 * @return the loginId
	 */
	public Long getLoginId() {
		return loginId;
	}

	/**
	 * Armazena o loginId no campo loginId
	 * 
	 * @param loginId
	 *            the loginId to set
	 */
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	@Override
	public Long getId() {
		return this.getLoginId();
	}

	@Override
	public void setId(Long id) {
		this.setLoginId(id);
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
