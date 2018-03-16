package com.fb.services.wrapper;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import com.fb.domain.Profile;
import com.fb.domain.Profile.Gender;
import com.fb.domain.User;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userId;
	private long profileId;
	private String email;
	private String password;
	private String mobile;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private Gender gender;
	private String profilePicURL;

	public UserDTO() {
		super();

	}

	public UserDTO(String email, String password, String mobile, String firstName, String lastName, LocalDate dob,
			Gender gender, String profilePicURL) {
		super();
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.profilePicURL = profilePicURL;
	}

	public UserDTO(User user, Profile profile) {
		this.userId = user.getUserId();
		this.email = user.getEmail();
		this.mobile = user.getMobile();
		this.password = user.getPassword();
		this.profileId = profile.getProfileId();
		this.firstName = profile.getFirstName();
		this.lastName = profile.getLastName();
		this.dob = profile.getDob();
		this.gender = profile.getGender();
		this.profilePicURL = profile.getProfilePicURL();

	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("setting email " + email);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setDob(Date dob) {
		this.dob = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getProfilePicURL() {
		return profilePicURL;
	}

	public void setProfilePicURL(String profilePicURL) {
		this.profilePicURL = profilePicURL;
	}

}
