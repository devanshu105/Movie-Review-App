package com.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "m_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	private String firstName;
	private String lastName;

	@Column(unique = true)
	private String emailId;

	@Column(unique = true)
	private double mobileNo;

	private String pwd;

	private String userDP;

	private int noofreview;

	public int getNoofreview() {
		return noofreview;
	}

	public void setNoofreview(int noofreview) {
		this.noofreview = noofreview;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(double mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserDP() {
		return userDP;
	}

	public void setUserDP(String userDP) {
		this.userDP = userDP;
	}

	public User() {

	}

	public User(Integer userId, String firstName, String lastName, String emailId, double mobileNo, String pwd,
			String userDP, int noofreview) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.pwd = pwd;
		this.userDP = userDP;
		this.noofreview = noofreview;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", pwd=" + pwd + ", userDP=" + userDP + "]";
	}

}
