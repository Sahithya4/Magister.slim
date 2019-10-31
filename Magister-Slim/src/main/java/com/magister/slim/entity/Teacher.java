package com.magister.slim.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.magister.slim.references.GroupReference;

@Document
public class Teacher {
	
	@Id
	private int teacherid;
	private User userid;
	private String name;
	private String address;
	private long phoneno;
	private List<GroupReference> groupReference;
	public List<GroupReference> getGroupReference() {
		return groupReference;
	}
	public void setGroupReference(List<GroupReference> groupReference) {
		this.groupReference = groupReference;
	}
	private int age;
	private String gender;
	private boolean isActive;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean active) {
		this.isActive = active;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + teacherid + ", userid=" + userid + ", name=" + name + ", address=" + address + ", phoneno="
				+ phoneno  + ", age=" + age + ", gender=" + gender + ", active=" + isActive + "]";
	}
	
	
	
}

