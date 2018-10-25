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
import acm.objects.database.SsuFactory;
import acm.objects.datahandlers.SsuPostData;

/**
 * @author Pranil
 * @description REST API Controllers for SSU. See the Wiki for the URLs documentation.
 *
 */
@RestController
@RequestMapping("/SSU")
public class SsuControllers {

	@Autowired
	SsuFactory SsuDatabaseBean;

	/**
	 * @return GET - http://localhost:8080/SSU/all | Returns ALL SSU objects
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<SimpleStatusUpdate> getAllSsu() {
		return SsuDatabaseBean.getAllFromDatabase() ;
	}

	/**
	 * @param ssuId
	 * @return GET - http://localhost:8080/SSU/{ssuId} | Returns SSU with the {ssuId} that you pass in
	 */
	@RequestMapping(value = "/{ssuId}", method = RequestMethod.GET)
	public SimpleStatusUpdate getSsuFromId(@PathVariable("ssuId") String ssuId) {
		return SsuDatabaseBean.getById(ssuId);
	}
	
	/**
	 * @param DataToAdd - A SsuPostData object
	 * @return POST - http://localhost:8080/SSU/SSU | Returns id of the new SSU if successfully inserted | Returns -1 if failed to insert SSU.
	 */
	@RequestMapping(value="/SSU", method = RequestMethod.POST)
	public Map<String, String> AddSsu(@RequestBody SsuPostData DataToAdd) {

		String id = SsuDatabaseBean.insertToDatabase(DataToAdd);

		return Collections.singletonMap("id", id+"");
	}
	
	/**
	 * @author Andy Echeverria
	 * @param ssuId
	 * @return -1 if deletion is unsuccessful
	 */
	@RequestMapping(value = "/{ssuId}", method = RequestMethod.POST)
	public int deleteById(@PathVariable("ssuid") String ssuId) {
		int deletion = SsuDatabaseBean.deleteById(ssuId);
		return deletion;
	}

}
