package com.fb.services;

import javax.ejb.Remote;

import com.fb.domain.User;
import com.fb.generic.GenericService;
import com.fb.services.wrapper.UserDTO;

@Remote
public interface UserServiceRemote extends GenericService<UserDTO,User>{
	/*public User getUser(UserDTO userDto);*/

	

}
