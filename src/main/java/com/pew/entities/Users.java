package com.pew.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Users 
{
	@Id
	@GeneratedValue(generator = "uid")
	@SequenceGenerator(name="uid",initialValue = 101,allocationSize = 1)
	private int sid;
	private String user_name;
    private String password;
	public Users(String user_name, String password) {
		this.user_name = user_name;
		this.password = password;
	}
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
    
}
