package com.magister.slim.restcontroller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.magister.slim.entity.Teacher;
import com.magister.slim.service.TeacherAppService;

@RestController
@RequestMapping("teacher")
//@CrossOrigin(origins = "http://localhost:4200")
public class TeacherController {
	@Autowired
	TeacherAppService teacherAppService;

	@PostMapping()
	public Teacher addTeacherDetails(@RequestBody Teacher teacherDetails) {
		Teacher status = teacherAppService.addTeacher(teacherDetails);
		return status;
	}

	@RequestMapping(value = "{teacherId}", method = RequestMethod.DELETE)
	public Teacher removeTeacher(@RequestParam("teacherId") int teacherId) {
	//	Teacher status = teacherAppService.deleteTeacher(student);
		return null;
	}
	
	@RequestMapping(value = "{teacherId}", method = RequestMethod.PUT)
	public Teacher updateTeacherDetails(@RequestParam("teacherId") int teacherId,@RequestBody Teacher student) {
		Teacher status = teacherAppService.addTeacher(student);
		return status;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Teacher> get() {
		List<Teacher> students = teacherAppService.getTeachers();
		return students;

	}
}
