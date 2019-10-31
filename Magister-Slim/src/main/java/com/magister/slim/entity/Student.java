package com.magister.slim.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.magister.slim.references.CourseReference;
import com.magister.slim.references.GroupReference;

@Document
public class Student {

	@Id
	private int id;
	private User userid;
	private List<GroupReference> groupReference;
	private String name, gender;
	private List<CourseReference> courseReference;
	private long phoneno;
	private boolean active;

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public List<GroupReference> getGroup() {
		return groupReference;
	}

	public void setGroup(List<GroupReference> groupReference) {
		this.groupReference = groupReference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getid() {
		return id;
	}
	
	public List<CourseReference> getCourseReference() {
		return courseReference;
	}

	public void setCourseReference(List<CourseReference> courseReference) {
		this.courseReference = courseReference;
	}

	public Student(int id, String name, String gender, long phoneno, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phoneno = phoneno;
		this.active = active;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void setid(int id) {
		this.id = id;
	}

}
