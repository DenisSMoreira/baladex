package com.denism.core.entity;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 
 * @author denism 
 * @version $Rev$ $Date$
 */
public class Email implements BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	private Long emailId;
	private String fromAddress;
	private List<String> toAddresses;
	private List<String> ccAddresses;
	private List<String> bccAddresses;
	private String messageBody;
	private String messageSubject;
	private String profileName;
	private String attachName;
	private byte[] attach;
	private boolean principal;

	/**
	 * Retorna o valor do emailId
	 * 
	 * @return the emailId
	 */
	public Long getEmailId() {
		return emailId;
	}

	/**
	 * Armazena o emailId no campo emailId
	 * 
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}

	/**
	 * Retorna o valor do fromAddress
	 * 
	 * @return the fromAddress
	 */
	public String getFromAddress() {
		return fromAddress;
	}

	/**
	 * Armazena o fromAddress no campo fromAddress
	 * 
	 * @param fromAddress
	 *            the fromAddress to set
	 */
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	/**
	 * Retorna o valor do toAddresses
	 * 
	 * @return the toAddresses
	 */
	public List<String> getToAddresses() {
		return toAddresses;
	}

	/**
	 * Armazena o toAddresses no campo toAddresses
	 * 
	 * @param toAddresses
	 *            the toAddresses to set
	 */
	public void setToAddresses(List<String> toAddresses) {
		this.toAddresses = toAddresses;
	}

	/**
	 * Retorna o valor do ccAddresses
	 * 
	 * @return the ccAddresses
	 */
	public List<String> getCcAddresses() {
		return ccAddresses;
	}

	/**
	 * Armazena o ccAddresses no campo ccAddresses
	 * 
	 * @param ccAddresses
	 *            the ccAddresses to set
	 */
	public void setCcAddresses(List<String> ccAddresses) {
		this.ccAddresses = ccAddresses;
	}

	/**
	 * Retorna o valor do bccAddresses
	 * 
	 * @return the bccAddresses
	 */
	public List<String> getBccAddresses() {
		return bccAddresses;
	}

	/**
	 * Armazena o bccAddresses no campo bccAddresses
	 * 
	 * @param bccAddresses
	 *            the bccAddresses to set
	 */
	public void setBccAddresses(List<String> bccAddresses) {
		this.bccAddresses = bccAddresses;
	}

	/**
	 * Retorna o valor do messageBody
	 * 
	 * @return the messageBody
	 */
	public String getMessageBody() {
		return messageBody;
	}

	/**
	 * Armazena o messageBody no campo messageBody
	 * 
	 * @param messageBody
	 *            the messageBody to set
	 */
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	/**
	 * Retorna o valor do messageSubject
	 * 
	 * @return the messageSubject
	 */
	public String getMessageSubject() {
		return messageSubject;
	}

	/**
	 * Armazena o messageSubject no campo messageSubject
	 * 
	 * @param messageSubject
	 *            the messageSubject to set
	 */
	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}

	/**
	 * Retorna o valor do profileName
	 * 
	 * @return the profileName
	 */
	public String getProfileName() {
		return profileName;
	}

	/**
	 * Armazena o profileName no campo profileName
	 * 
	 * @param profileName
	 *            the profileName to set
	 */
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	/**
	 * Retorna o valor do attachName
	 * 
	 * @return the attachName
	 */
	public String getAttachName() {
		return attachName;
	}

	/**
	 * Armazena o attachName no campo attachName
	 * 
	 * @param attachName
	 *            the attachName to set
	 */
	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}

	/**
	 * Retorna o valor do attach
	 * 
	 * @return the attach
	 */
	public byte[] getAttach() {
		return attach;
	}

	/**
	 * Armazena o attach no campo attach
	 * 
	 * @param attach
	 *            the attach to set
	 */
	public void setAttach(byte[] attach) {
		this.attach = attach;
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
		return this.getEmailId();
	}

	@Override
	public void setId(Long id) {
		this.setEmailId(id);

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
