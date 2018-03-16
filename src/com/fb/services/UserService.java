package com.fb.services;

import java.time.LocalDate;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.fb.domain.Profile;
import com.fb.domain.Profile.Gender;
import com.fb.generic.GenericServiceImp;
import com.fb.domain.User;
import com.fb.services.wrapper.UserDTO;

/**
 * Session Bean implementation class UserService
 */
@Stateless
@LocalBean
@WebService
public class UserService extends GenericServiceImp<User, UserDTO> implements UserServiceRemote {

	/**
	 * Default constructor.
	 */
	public UserService() {
		super(User.class, UserDTO.class);
	}

	@Override
	public User convert(UserDTO userDto) {
		Profile profile = new Profile(userDto);
		User user = new User(userDto);
		user.setProfile(profile);
		/*
		 * User user = new User(); user.setEmail("yadav@gmail.com");
		 * user.setMobile("785541"); user.setPassword("hans@fsdf"); Profile profile=new
		 * Profile(); profile.setFirstName("hans"); profile.setLastName("raj");
		 * profile.setDob(LocalDate.now()); profile.setGender(Gender.MALE);
		 * user.setProfile(profile);
		 */

		/* user.setProfile(new Profile(userDto)); */

		return user;
	}

	@Override
	public UserDTO convertDto(User user) {
		return new UserDTO(user, user.getProfile());
	}

}
