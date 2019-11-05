package com.magister.slim.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.magister.slim.entity.Group;
import com.magister.slim.entity.OfferingLevel;
import com.magister.slim.entity.Student;
import com.magister.slim.entity.Teacher;
import com.magister.slim.references.CourseReference;
import com.magister.slim.references.GroupReference;
import com.magister.slim.references.OfferingLevelReference;
import com.magister.slim.references.StudentReference;
import com.magister.slim.references.StudyGuideReference;
import com.magister.slim.references.TeacherReference;
import com.magister.slim.repository.GroupInterface;

@Service
public class GroupAppService {

	@Autowired
	GroupInterface groupInterface;
	@Autowired
	CourseAppService courseAppService;
	@Autowired
	TeacherAppService teacherAppService;
	@Autowired
	StudentAppService studentAppService;
	@Autowired
	OfferingLevelAppService offeringLevelAppService;



	public StudyGuideReference studyGuideDetails(int id, String studyGuideName) {
		StudyGuideReference studyGuideReference = new StudyGuideReference();
		studyGuideReference.setStudyGuideId(id);
		studyGuideReference.setStudyGuideName(studyGuideName);
		return studyGuideReference;
	}

	public List<StudentReference> studentDetails(int id, String studentName) {
		StudentReference student = new StudentReference();
		List<StudentReference> studentReference = new ArrayList<StudentReference>();
		student.setId(id);
		student.setName(studentName);
		studentReference.add(student);
		return studentReference;
	}

	public Group deleteGroup(Group group) {
		groupInterface.deleteById(group.getGroupId());
		return group;
	}

	public Group addGroupDetails(Group groupDetails) {
		if(offeringLevelAppService.updateGroupReferences(groupDetails)){
			groupInterface.save(groupDetails);
			return groupDetails;
		}
		else
		return null;
	}

	public Group deleteGroup(int offeringId, int offeringLevelId, int groupId) {
		if(groupInterface.findById(groupId).isPresent())
		{
		Group group=groupInterface.findById(groupId).get();
		if(group.getOfferingLevelReference().getOfferingLevelId()==offeringLevelId)
		{
		group.setActive(false);
		groupInterface.save(group);
		boolean status=offeringLevelAppService.deleteGroupReference(offeringLevelId,groupId);
		}
		return group;
		}
		return null;
	}

	public  Group updateGroupDetails(int offeringId, Group groupDetails) {
		
		if(groupInterface.findById(groupDetails.getGroupId()).isPresent())
		{
		Group group = groupInterface.findById(groupDetails.getGroupId()).get();
		group.setGroupName(groupDetails.getGroupName());
		groupInterface.save(group);
		boolean status = offeringLevelAppService.updateGroupReferenceDetails(groupDetails);
		return groupDetails;
		}
		return null;
	}
}
