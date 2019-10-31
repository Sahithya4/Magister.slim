package com.magister.slim.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.magister.slim.entity.Course;
import com.magister.slim.entity.Student;
import com.magister.slim.entity.StudyGuide;
import com.magister.slim.references.StudyGuideReference;
import com.magister.slim.references.TeacherReference;
import com.magister.slim.repository.StudyGuideInterface;

@Service
public class StudyGuideAppService {
	
	@Autowired
	StudyGuideInterface studyGuideInterface;
	@Autowired
	CourseAppService courseAppService;
	
	public List<StudyGuide> getStudyGuides()
	{
		List<StudyGuide> studyGuide=studyGuideInterface.findAll();
		return studyGuide;
	}
	public StudyGuide deleteStudyGuide(StudyGuide studyGuide)
	{
		studyGuideInterface.deleteById(studyGuide.getStudyGuideIdId());
		return studyGuide;
	}
	
	public StudyGuide getStudyGuide(int studyGuideid) {
		StudyGuide student=studyGuideInterface.findById(studyGuideid).get();
		return student;
	}
	
	public StudyGuide addStudyGuide(StudyGuide studyGuide)
	{
		Course course=new Course();
		studyGuide.setActive(true);
		studyGuide.setCourseReference(courseDetails(121,"English"));
		studyGuide.setStudents(studentDetails(1,"shreya"));
		studyGuide.setStudyGuideName("StudyGuide1");
		studyGuide.setTeacherReference(teacherDetails(4,"Tom"));
		studyGuide.setStudyGuideId(151);
		studyGuideInterface.save(studyGuide);
		course.setCourseId(121);
		course.setStudyGuideReferences(studyGuideDetails(studyGuide.getStudyGuideIdId(), studyGuide.getStudyGuideName()));
		courseAppService.updateCourse(course);
		return studyGuide;
	}
	public List<StudyGuideReference> studyGuideDetails(int id ,String studyGuideName)
	{
		StudyGuideReference studyGuideReference=new StudyGuideReference();
		List<StudyGuideReference> sR=new ArrayList<StudyGuideReference>();
		studyGuideReference.setStudyGuideId(id);
		studyGuideReference.setStudyGuideName(studyGuideName);
		sR.add(studyGuideReference);
		return sR;
	}
	public Course courseDetails(int id,String courseName)
	{
		Course courseReference=new Course();
		courseReference.setCourseId(id);
		courseReference.setCourseName(courseName);
		return courseReference;
	}
	public List<Student> studentDetails(int id ,String studentName)
	{
		Student student=new Student();
		List<Student> studentReference=new ArrayList<Student>();
		student.setid(id);
		student.setName(studentName);
		studentReference.add(student);
		return studentReference;
	}
	public TeacherReference teacherDetails(int id,String teacherName)
	{
		TeacherReference teacherReference = new TeacherReference();
		teacherReference.setTeacherid(id);
		teacherReference.setName(teacherName);
		return teacherReference;
	}
}
