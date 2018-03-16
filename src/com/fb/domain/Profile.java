package com.fb.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fb.services.wrapper.UserDTO;

@Entity
@Table(name = "proifle")
public class Profile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Gender {
		MALE, FEMALE
	};

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long profileId;

	private String firstName;
	private String lastName;
	private LocalDate dob;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String profilePicURL;

	public Profile() {
		super();

	}

	public Profile(UserDTO userDto) {

		this.profileId = userDto.getProfileId();
		this.firstName = userDto.getFirstName();
		this.lastName = userDto.getLastName();
		this.dob = userDto.getDob();
		this.gender = userDto.getGender();
		this.profilePicURL = userDto.getProfilePicURL();
	}

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
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
