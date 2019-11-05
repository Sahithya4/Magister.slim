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
import com.magister.slim.entity.Resource;
import com.magister.slim.references.TeacherReference;
import com.magister.slim.service.ResourceAppService;

@RestController
@RequestMapping("studyguide/{studyGuideId}/theme/{themeId}/unit/{unitId}/resource")
//@CrossOrigin(origins = "http://localhost:4200")
public class ResourceController {

	@Autowired
	ResourceAppService resourceAppService;

	@RequestMapping(method = RequestMethod.POST)
	public Resource createResource(@RequestBody Resource resource, HttpServletRequest request, HttpServletResponse response) {
		resource.setActive(true);
		TeacherReference teacher = new TeacherReference();
		Resource status = resourceAppService.addResource(resource, teacher);
		System.out.println(status);
		return status;
	}

	@RequestMapping(value = "/{resourceId}", method = RequestMethod.PUT)
	public Resource updateResourceDetails(@RequestBody Resource resource,@PathVariable("resourceId") int resourceId) {
		resource.setActive(true);
		TeacherReference teacher = new TeacherReference();
		Resource status = resourceAppService.addResource(resource, teacher);
		System.out.println(status);
		return status;
	}

	@RequestMapping(value = "/{resourceId}", method = RequestMethod.DELETE)
	public Resource deleteResourceDetails(@RequestBody Resource resource,@PathVariable("resourceId") int resourceId) {
		Resource status = resourceAppService.deleteResource(resource);
		return status;
	}
	
	@RequestMapping(value = "/{resourceId}",method = RequestMethod.GET)
	public Resource getResourceDetail(@PathVariable("resourceId") int resourceId) {
		Resource resource = resourceAppService.getResource(resourceId);
		return resource;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Resource> getResourceDetails(@RequestParam String resourceName) {
		List<Resource> resources = resourceAppService.getResources(resourceName);
		return resources;
	}
	
}
