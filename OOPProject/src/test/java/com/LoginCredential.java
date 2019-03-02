package com;

public class LoginCredential 
{
	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String pass;
	public  void loginValidation()
	{
		System.out.println(userId+"+"+pass);
	}

}
