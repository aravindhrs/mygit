package com.interview.serialize;

import java.io.Serializable;

public class StudentInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String name;
	int id;
	static String contact;
	
	@SuppressWarnings("static-access")
	public StudentInfo(String n, int sid, String cont) {
		this.name=n;
		this.id=sid;
		this.contact=cont;
	}
}
