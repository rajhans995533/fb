package com.fb.managed;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.fb.services.EmailService;
import com.fb.services.UserService;
import com.fb.services.wrapper.UserDTO;

@ManagedBean(name = "userReg")
public class UserRegistrationBeam {
	public UserDTO user=new UserDTO();
	
	@EJB
	UserService userService;
	@EJB	
	EmailService emailService;
	
	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	/*private String fName;
	private String lName;
	private String email;
	private String password;
	

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
		System.out.println("working " + fName);
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
*/
	/*
	 * public void save() { System.out.println(toString()); }
	 * 
	 * @Override public String toString() { return "UserRegistrationBeam [fName=" +
	 * fName + ", lName=" + lName + ", email=" + email + ", password=" + password +
	 * "]"; }
	 */
	public String test() {
		userService.save(user);
//		emailService.send("hansraj.yadav@wittybrains.com", "nothing", "test");
		System.out.println("working");
		return "index.xhtml";
	}
}
