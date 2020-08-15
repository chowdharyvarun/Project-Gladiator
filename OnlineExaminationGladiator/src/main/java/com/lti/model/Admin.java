package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue
	@Column(name="ADMIN_ID") 
	int adminId;
	
	@Column(name="ADMIN_NAME") 
	String adminName;
	
	@Column(name="ADMIN_EMAIL") 
	String adminEmail;
	
	@Column(name="ADMIN_PWD")
	String adminPwd;

}
