package com.magister.slim.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.magister.slim.references.AssignmentReference;
import com.magister.slim.references.StudentReference;

@Document
public class AssignmentResult {

	@Id
	private int assignmentResultId;
	private StudentReference studentReference;
	private AssignmentReference assignmentReference;
	private int assignedMarks;
	private int totalmarks;

	public int getAssignmentResultId() {
		return assignmentResultId;
	}

	public void setAssignmentResultId(int assignmentResultId) {
		this.assignmentResultId = assignmentResultId;
	}

	public StudentReference getStudentReference() {
		return studentReference;
	}

	public void setStudentReference(StudentReference studentReference) {
		this.studentReference = studentReference;
	}

	public AssignmentReference getAssignmentReference() {
		return assignmentReference;
	}

	public void setAssignmentReference(AssignmentReference assignmentReference) {
		this.assignmentReference = assignmentReference;
	}

	public int getAssignedMarks() {
		return assignedMarks;
	}

	public void setAssignedMarks(int assignedMarks) {
		this.assignedMarks = assignedMarks;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "AssignmentResult [assignmentResultId=" + assignmentResultId + ", studentReference=" + studentReference
				+ ", assignmentReference=" + assignmentReference + ", assignedMarks=" + assignedMarks + ", totalmarks="
				+ totalmarks + "]";
	}

}
