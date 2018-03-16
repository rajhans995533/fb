package com.fb.managed;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.ibm.wsdl.util.StringUtils;

import java.io.IOException;
import java.io.Serializable;

@ManagedBean(name = "userLogin")
@SessionScoped
public class UserLoginBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private FacesContext facesContext;
	private HttpServletRequest request;

	public UserLoginBean() throws IOException {
		super();
		facesContext = FacesContext.getCurrentInstance();
		request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
//		if (request.getUserPrincipal() != null)
//			facesContext.getExternalContext().redirect("user/home.xhtml");

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {

		try {
			request.login(userName, password);
			request.getSession().setMaxInactiveInterval(120);

			System.out.println("logged in ");
			return "/user/home.xhtml";
		} catch (ServletException e) {
			facesContext.addMessage(null, new FacesMessage("Login failed."));

			// e.printStackTrace();
			return "error";
		}

	}

	public void logout() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		try {
			request.logout();
		} catch (ServletException e) {

			context.addMessage(null, new FacesMessage("Logout failed."));
		}
	}

	public void test() {
		System.out.println("working");
	}

}
