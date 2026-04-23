package com.oops1;

public class Student {
	
	private int sid;
	private String sname;
	private long phone;
	
	void setSid(int sid) {
		this.sid = sid;
	}
	void setSname(String sname) {
		this.sname = sname;
		
	}
	void setPhone(long phone) {
		this.phone = phone;
	}
	int getSid() {
		return sid;
	}
	String getSname() {
		return sname;
	}
	long getPhone() {
		return phone;
	}

}
