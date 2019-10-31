package com.magister.slim.restcontroller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.magister.slim.entity.Assignment;
import com.magister.slim.service.AssignmentAppService;

@RestController
@RequestMapping("studyguide/theme/unit/assignment")
@CrossOrigin(origins = "http://localhost:4200")

public class AssignmentController {

	@Autowired
	AssignmentAppService assignmentAppService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Assignment add(@RequestBody Assignment assignment) {
		Assignment status = assignmentAppService.addAssignment(assignment);
		return status;
	}

	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public Assignment delete(@RequestBody Assignment assignment, HttpServletRequest request,
			HttpServletResponse response) {
		Assignment status = assignmentAppService.deleteAssignment(assignment);
		return status;
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public Assignment update(@RequestBody Assignment assignment) {
		Assignment status = assignmentAppService.addAssignment(assignment);
		return status;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Assignment> get() {
		List<Assignment> assignments = assignmentAppService.getAssignments();
		return assignments;
	}

}
