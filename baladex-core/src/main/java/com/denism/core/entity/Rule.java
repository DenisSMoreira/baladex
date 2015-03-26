package com.denism.core.entity;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Rule
 * @author denism
 * @version $Rev$ $Date$
 */
public class Rule implements BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	private Long ruleId;
	private String description;
	private List<String> permission;


	/**
	 * Retorna o valor do ruleId
	 * 
	 * @return the ruleId
	 */
	public Long getRuleId() {
		return ruleId;
	}

	/**
	 * Armazena o ruleId no campo ruleId
	 * 
	 * @param ruleId
	 *            the ruleId to set
	 */
	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	/**
	 * Retorna o valor do description
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Armazena o description no campo description
	 * 
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Retorna o valor do permission
	 * 
	 * @return the permission
	 */
	public List<String> getPermission() {
		return permission;
	}

	/**
	 * Armazena o permission no campo permission
	 * 
	 * @param permission
	 *            the permission to set
	 */
	public void setPermission(List<String> permission) {
		this.permission = permission;
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
	
	@Override
	public Long getId() {
		return this.getRuleId();
	}

	@Override
	public void setId(Long id) {
		this.setRuleId(id);
	}
}
