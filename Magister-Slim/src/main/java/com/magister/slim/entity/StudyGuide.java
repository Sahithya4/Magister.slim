package com.magister.slim.entity;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.magister.slim.references.TeacherReference;

@Document
public class StudyGuide {

	@Id
	private int studyGuideId;
	private String studyGuideName;
	private TeacherReference teacherReference;
	private List<Theme> themes;
	private List<Unit> units;
	private List<Student> students;
	private Course courseReference;
	private Offering offeringReference;
	private OfferingLevel offeringLevelReference;
	private Date validOnwards;
	private Date validUpto;
	private boolean isDeleted;
	public int getStudyGuideIdId() {
		return studyGuideId;
	}
	public void setStudyGuideId(int studyGuideId) {
		this.studyGuideId= studyGuideId;
	}
	public String getStudyGuideName() {
		return studyGuideName;
	}
	public void setStudyGuideName(String studyGuideName) {
		this.studyGuideName = studyGuideName;
	}
	public TeacherReference getTeacherReference() {
		return teacherReference;
	}
	public void setTeacherReference(TeacherReference teacherReference) {
		this.teacherReference = teacherReference;
	}
	public List<Theme> getThemes() {
		return themes;
	}
	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}
	public List<Unit> getUnits() {
		return units;
	}
	public void setUnits(List<Unit> units) {
		this.units = units;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Course getCourseReference() {
		return courseReference;
	}
	public void setCourseReference(Course courseReference) {
		this.courseReference = courseReference;
	}
	public Offering getOfferingReference() {
		return offeringReference;
	}
	public void setOfferingReference(Offering offeringReference) {
		this.offeringReference = offeringReference;
	}
	public OfferingLevel getOfferingLevelReference() {
		return offeringLevelReference;
	}
	public void setOfferingLevelReference(OfferingLevel offeringLevelReference) {
		this.offeringLevelReference = offeringLevelReference;
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
	public boolean isActive() {
		return isDeleted;
	}
	public void setActive(boolean active) {
		this.isDeleted = active;
	}
	@Override
	public String toString() {
		return "StudyGuide [studyGuideIdid=" + studyGuideId + ", studyGuideName=" + studyGuideName + ", teacherReference=" + teacherReference
				+ ", themes=" + themes + ", units=" + units + ", students=" + students + ", courseReference="
				+ courseReference + ", offeringReference=" + offeringReference + ", offeringLevelReference="
				+ offeringLevelReference + ", validOnwards=" + validOnwards + ", validUpto=" + validUpto + ", active="
				+ isDeleted + "]";
	}
	
	
	
}
