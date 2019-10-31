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
import com.magister.slim.entity.StudyGuide;
import com.magister.slim.service.StudyGuideAppService;

@RestController
@RequestMapping("studyGuide")
@CrossOrigin(origins = "http://localhost:4200")
public class StudyGuideController {

	@Autowired
	StudyGuideAppService studyGuideAppService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public StudyGuide add(@RequestBody StudyGuide studyGuide) {
		StudyGuide status = studyGuideAppService.addStudyGuide(studyGuide);
		System.out.println(status);
		return status;
	}

	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public StudyGuide delete(@RequestBody StudyGuide studyGuide, HttpServletRequest request,
			HttpServletResponse response) {
		StudyGuide status = studyGuideAppService.deleteStudyGuide(studyGuide);
		return status;
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public StudyGuide update(@RequestBody StudyGuide studyGuide) {
		StudyGuide status = studyGuideAppService.addStudyGuide(studyGuide);
		System.out.println(status);
		return status;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<StudyGuide> get() {
		List<StudyGuide> studyGuide = studyGuideAppService.getStudyGuides();
		return studyGuide;

	}
}
