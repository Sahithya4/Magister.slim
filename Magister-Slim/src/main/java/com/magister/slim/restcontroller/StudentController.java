package com.magister.slim.restcontroller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.magister.slim.entity.Student;
import com.magister.slim.service.StudentAppService;

@RestController
@RequestMapping("offering/offering-level/group")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	@Autowired
	StudentAppService studentAppService;

	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Student add(@RequestBody Student student) {
		Student status = studentAppService.addStudent(student);
		System.out.println(status);
		return status;
	}

	@RequestMapping(value = "/students", method = RequestMethod.DELETE)
	public Student delete(@RequestBody Student student, HttpServletRequest request, HttpServletResponse response) {
		Student status = studentAppService.deleteStudent(student);
		return status;
	}

	@RequestMapping(value = "/students", method = RequestMethod.PUT)
	public Student update(@RequestBody Student student) {
		Student status = studentAppService.addStudent(student);
		return status;
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> get() {
		List<Student> students = studentAppService.getStudents();
		return students;
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public Student getStudent(@RequestParam int studentid) {
		Student student = studentAppService.getStudent(studentid);
		return student;

	}

}
