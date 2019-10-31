package com.magister.slim.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.magister.slim.references.CourseReference;
import com.magister.slim.references.OfferingLevelReference;
import com.magister.slim.references.StudyGuideReference;
import com.magister.slim.references.TeacherReference;

@Document
public class Group {

	@Id
	private int groupId;
	private String groupName;
	private List<Student> students;
	private TeacherReference teacherReference;
	private StudyGuideReference studyGuideReference;
	private List<CourseReference> coursesreference;
	private OfferingLevelReference offeringLevelReference;
	private boolean isActive;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public TeacherReference getTeacherReference() {
		return teacherReference;
	}

	public void setTeacherReference(TeacherReference teacherReference) {
		this.teacherReference = teacherReference;
	}

	public StudyGuideReference getStudyGuideReference() {
		return studyGuideReference;
	}

	public void setStudyGuideReference(StudyGuideReference studyGuideReference) {
		this.studyGuideReference = studyGuideReference;
	}

	public List<CourseReference> getCoursesreference() {
		return coursesreference;
	}

	public void setCoursesreference(List<CourseReference> coursesreference) {
		this.coursesreference = coursesreference;
	}

	public OfferingLevelReference getOfferingLevelReference() {
		return offeringLevelReference;
	}

	public void setOfferingLevelReference(OfferingLevelReference offeringLevelReference) {
		this.offeringLevelReference = offeringLevelReference;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", students=" + students
				+ ", teacherReference=" + teacherReference + ", studyGuideReference=" + studyGuideReference
				+ ", coursesreference=" + coursesreference + ", offeringLevelReference=" + offeringLevelReference
				+ ", isActive=" + isActive + "]";
	}

}
