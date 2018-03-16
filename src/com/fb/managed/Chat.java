package com.fb.managed;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Chat {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println(message);
	}
	

}
