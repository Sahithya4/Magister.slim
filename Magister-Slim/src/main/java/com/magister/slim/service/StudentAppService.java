package com.magister.slim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.magister.slim.entity.Student;
import com.magister.slim.entity.User;
import com.magister.slim.entity.User.role;
import com.magister.slim.repository.StudentInterface;

@Service
public class StudentAppService {
	
	@Autowired
	StudentInterface studentInterface;
	@Autowired
	UserAppService userAppService;
	
	public Student deleteStudent(Student student)
	{
		studentInterface.deleteById(student.getid());
		return student;
	}
	public List<Student> getStudents()
	{
		List<Student> student1=studentInterface.findAll();
		return student1;
	}
	public Student addStudent(Student student)
	{
		User user=new User();
		student.setUserid(user);
		user.setUserType(role.student);
		user.setUserid(student.getid());
		studentInterface.save(student);
		userAppService.addUser(user);
		return student;
	}
	public Student getStudent(int studentid) {
		Student student=studentInterface.findById(studentid).get();
		return student;
	}
}
