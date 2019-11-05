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
import com.magister.slim.entity.Course;
import com.magister.slim.service.CourseAppService;

@RestController
@RequestMapping("offering/{offeringId}/offering-level/{offeringLevelId}/group/{groupId}/course")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {

	@Autowired
	CourseAppService courseAppService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Course addCourse(@RequestBody Course course) {
	//	Course status = courseAppService.addCourse(course);
		return null;
	}

	@RequestMapping(value = "/{courseId}", method = RequestMethod.DELETE)
	public Course removeCourse(@RequestParam("courseId") int courseId) {
		//Course status = courseAppService.deleteCourse(course);
		return null;
	}
	
	@RequestMapping(value = "{courseId}", method = RequestMethod.PUT)
	public Course updateCourseDetails(@RequestParam("courseId") int courseId,@RequestBody Course course) {
	//	Course status = courseAppService.addCourse(course);
		return null;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Course> get() {
		List<Course> courses = courseAppService.getCourses();
		return courses;

	}
}
