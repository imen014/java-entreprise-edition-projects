package com.octest.beans;


public class ValidationLogin {
	private String username;
	private String password;
	private String email;
	
	public ValidationLogin(String username, String password, String email ) {
		this.username = username;
		this.password =  password;
		this.email = email;
		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean verfication_username() {
		boolean username_valide;
		
		if(this.username.length() >= 5 && this.username.length() < 10) {
			username_valide = true;
		}else {
			username_valide = false;
			
		}
		return username_valide;
		
	}
	
	
	public boolean verfication_password() {
		boolean password_valide;
		
		if(this.password.length() > 5 && this.password.length() < 11 && this.password.toLowerCase().contains(this.username.toLowerCase() + 123)) {
			password_valide = true;
		}else {
			password_valide = false;
			
		}
		return password_valide;
		
	}
	
	public boolean verfication_email() {
		boolean email_valide;
		
		if(email.length() > 5 && email.length() < 15 && this.email.contains("@") && this.email.contains(".com")) {
			email_valide = true;
		}else {
			email_valide = false;
			
		}
		return email_valide;
		
	}
	
	public boolean validation_main() {
		boolean username_validation = this.verfication_username();
		boolean password_validation = this.verfication_password();
		boolean email_validation = this.verfication_email();
		boolean verification_final;
		
		if(username_validation == true && password_validation == true && email_validation == true ) {
			verification_final = true;
		}else {
			verification_final = false;
			
		}
		return verification_final;

		
		
		
	}


}
