package com.pew.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Reminder 
{
	@Id
	@GeneratedValue(generator = "uid")
	@SequenceGenerator(name="uid",initialValue = 101,allocationSize = 1)
	private int sid;
	private String date;
	private String subject;
	private String description; 
	private String email;
	private String phone;
	private String sms;	
	private String days;
	public Reminder(String date, String email, String phone, String subject, String description,String sms, String days) 
	{
		this.date = date;
		this.subject = subject;
		this.description=description;
		this.email = email;
		this.phone = phone;
		this.phone = sms;
		this.days = days;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date =date;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	
	
}
