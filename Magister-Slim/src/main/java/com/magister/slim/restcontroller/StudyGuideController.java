package com.magister.slim.restcontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.magister.slim.entity.StudyGuide;
import com.magister.slim.service.StudyGuideAppService;

@RestController
@RequestMapping("studyGuide")
//@CrossOrigin(origins = "http://localhost:4200")
public class StudyGuideController {

	@Autowired
	StudyGuideAppService studyGuideAppService;

	@RequestMapping(method = RequestMethod.POST)
	public StudyGuide createStudyGuide(@RequestBody StudyGuide studyGuide) {
		StudyGuide status = studyGuideAppService.addStudyGuide(studyGuide);
		return status;
	}

	@RequestMapping(value = "/{studyGuideId}", method = RequestMethod.DELETE)
	public int deleteStudyGuideDetails(@PathVariable("studyGuideId") int studyGuideId, HttpServletRequest request,
			HttpServletResponse response) {
		int status = studyGuideAppService.deleteStudyGuide(studyGuideId);
		return status;
	}

	@RequestMapping(value = "/{studyGuideId}", method = RequestMethod.PUT)
	public StudyGuide updateStudyGuideDetails(@PathVariable("studyGuideId") int studyGuideId, @RequestBody StudyGuide studyGuide) {
		StudyGuide status = studyGuideAppService.updateStudyGuide(studyGuide,studyGuideId);
		return status;
	}

	@RequestMapping(value = "/{studyGuideId}",method = RequestMethod.GET)
	public StudyGuide getStudyGuideDetail(@PathVariable("studyGuideId") int studyGuideId) {
		StudyGuide studyGuide = studyGuideAppService.getStudyGuide(studyGuideId);
		return studyGuide;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<StudyGuide> getStudyGuideDetails(@RequestParam String studyGuideName) {
		List<StudyGuide> studyGuide = studyGuideAppService.getStudyGuide(studyGuideName);
		return studyGuide;
	}
}
