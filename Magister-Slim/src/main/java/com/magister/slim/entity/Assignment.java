package com.magister.slim.entity;

import java.sql.Date; 
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.magister.slim.references.AssignmentResultReference;
import com.magister.slim.references.TeacherReference;

@Document
public class Assignment {
	@Id
	private int assignmentId;
	private String assignmentName;
	private Unit unitReference;
	private TeacherReference createdBy;
	private StudyGuide studyGuideReference;
	private List<AssignmentResultReference> assignmentResultReference;
	private Date validOnwards;
	private Date validUpto;
	private List<Student> students;
	private boolean isActive;
	public int getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}
	public String getAssignmentName() {
		return assignmentName;
	}
	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}
	public Unit getUnitReference() {
		return unitReference;
	}
	public void setUnitReference(Unit unitReference) {
		this.unitReference = unitReference;
	}
	public TeacherReference getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(TeacherReference createdBy) {
		this.createdBy = createdBy;
	}
	public StudyGuide getStudyGuideReference() {
		return studyGuideReference;
	}
	public void setStudyGuideReference(StudyGuide studyGuideReference) {
		this.studyGuideReference = studyGuideReference;
	}
	public List<AssignmentResultReference> getAssignmentResultReference() {
		return assignmentResultReference;
	}
	@SuppressWarnings("unchecked")
	public void setAssignmentResultReference(AssignmentResult assignmentResultReference) {
		this.assignmentResultReference = (List<AssignmentResultReference>) assignmentResultReference;
	}
	public Date getValidOnwards() {
		return validOnwards;
	}
	public void setValidOnwards(Date validOnwards) {
		this.validOnwards = validOnwards;
	}
	public Date getValidUpto() {
		return validUpto;
	}
	public void setValidUpto(Date validUpto) {
		this.validUpto = validUpto;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Assignment [assignmentId=" + assignmentId + ", assignmentName=" + assignmentName + ", unitReference="
				+ unitReference + ", createdBy=" + createdBy + ", studyGuideReference=" + studyGuideReference
				+ ", assignmentResultReference=" + assignmentResultReference + ", validOnwards=" + validOnwards
				+ ", validUpto=" + validUpto + ", students=" + students + ", isActive=" + isActive + "]";
	}

	
}
