package com.denism.core.entity;

import java.util.List;

public class Email {

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

}
