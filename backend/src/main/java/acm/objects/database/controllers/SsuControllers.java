package acm.objects.database.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import acm.objects.SimpleStatusUpdate;
import acm.objects.SsuPostData;
import acm.objects.database.SsuDatabaseBean;

@RestController
@RequestMapping("/SSU")
public class SsuControllers {

	@Autowired
	SsuDatabaseBean SsuDatabaseBean;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<SimpleStatusUpdate> getAllSsu() {
		return SsuDatabaseBean.getAllSSUs() ;
	}

	@RequestMapping(value = "/{ssuId}", method = RequestMethod.GET)
	public SimpleStatusUpdate getSsuFromId(@PathVariable("ssuId") String ssuId) {
		return SsuDatabaseBean.getSsuFromId(ssuId) ;
	}
	
	@RequestMapping(value="/SSU", method = RequestMethod.POST)
	public Map<String, String> AddSsu(@RequestBody SsuPostData DataToAdd) {

		int id = SsuDatabaseBean.insertSsu(DataToAdd);

		return Collections.singletonMap("id", id+"");
	}

}
