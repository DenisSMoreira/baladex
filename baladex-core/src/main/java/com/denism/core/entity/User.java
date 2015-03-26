package com.denism.core.entity;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class User implements BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	private Long userId;
	private String name;
	private String nickname;
	private int age;
	private String sex;
	private boolean signedTermsAndConditions;
	private Date createDate;
	private List<Phone> phones;
	private List<Address> addresses;
	private List<Email> emails;
	private Login login;
	private PerfilGamer perfilGamer;

	/**
	 * Retorna o valor do perfilGamer
	 * @return the perfilGamer
	 */
	public PerfilGamer getPerfilGamer() {
		return perfilGamer;
	}

	/**
	 * Armazena o perfilGamer no campo perfilGamer 
	 * @param perfilGamer the perfilGamer to set
	 */
	public void setPerfilGamer(PerfilGamer perfilGamer) {
		this.perfilGamer = perfilGamer;
	}

	/**
	 * Retorna o valor do userId
	 * 
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Armazena o userId no campo userId
	 * 
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * Retorna o valor do name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Armazena o name no campo name
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retorna o valor do nickname
	 * 
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * Armazena o nickname no campo nickname
	 * 
	 * @param nickname
	 *            the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * Retorna o valor do age
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Armazena o age no campo age
	 * 
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Retorna o valor do sex
	 * 
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Armazena o sex no campo sex
	 * 
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * Retorna o valor do signedTermsAndConditions
	 * 
	 * @return the signedTermsAndConditions
	 */
	public boolean isSignedTermsAndConditions() {
		return signedTermsAndConditions;
	}

	/**
	 * Armazena o signedTermsAndConditions no campo signedTermsAndConditions
	 * 
	 * @param signedTermsAndConditions
	 *            the signedTermsAndConditions to set
	 */
	public void setSignedTermsAndConditions(boolean signedTermsAndConditions) {
		this.signedTermsAndConditions = signedTermsAndConditions;
	}

	/**
	 * Retorna o valor do createDate
	 * 
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Armazena o createDate no campo createDate
	 * 
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * Retorna o valor do phones
	 * 
	 * @return the phones
	 */
	public List<Phone> getPhones() {
		return phones;
	}

	/**
	 * Armazena o phones no campo phones
	 * 
	 * @param phones
	 *            the phones to set
	 */
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	/**
	 * Retorna o valor do addresses
	 * 
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * Armazena o addresses no campo addresses
	 * 
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * Retorna o valor do emails
	 * 
	 * @return the emails
	 */
	public List<Email> getEmails() {
		return emails;
	}

	/**
	 * Armazena o emails no campo emails
	 * 
	 * @param emails
	 *            the emails to set
	 */
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	/**
	 * Retorna o valor do login
	 * 
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}

	/**
	 * Armazena o login no campo login
	 * 
	 * @param login
	 *            the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public Long getId() {
		return this.getUserId();
	}

	@Override
	public void setId(Long id) {
		this.setUserId(id);

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
