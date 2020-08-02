package com.ks.backend.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User 
{
	@Id
	private int uid;
	private String uname;
	private String email;
	private int mobno;
	private int age;
	
	public User() {
		
	}
	
	public User(int uid, String uname, String email, int mobno, int age) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.mobno = mobno;
		this.age = age;
	}



	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMobno() {
		return mobno;
	}
	
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", email=" + email + ", mobno=" + mobno + ", age=" + age + "]";
	}
	
}
