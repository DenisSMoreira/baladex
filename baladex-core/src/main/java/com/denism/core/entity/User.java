package com.denism.core.entity;

import java.util.Date;
import java.util.List;

public class User {

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
}
