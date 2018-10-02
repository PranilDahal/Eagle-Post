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
	SsuFactory SsuFactory;

	/**
	 * @return GET - http://localhost:8080/SSU/all | Returns ALL SSU objects
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<SimpleStatusUpdate> getAllSsu() {
		return SsuFactory.getAllFromDatabase() ;
	}

	/**
	 * @param ssuId
	 * @return GET - http://localhost:8080/SSU/{ssuId} | Returns SSU with the {ssuId} that you pass in
	 */
	@RequestMapping(value = "/{ssuId}", method = RequestMethod.GET)
	public SimpleStatusUpdate getSsuFromId(@PathVariable("ssuId") String ssuId) {
		return SsuFactory.getById(ssuId);
	}

	/**
	 * @param DataToAdd - A SsuPostData object
	 * @return POST - http://localhost:8080/SSU/SSU | Returns id of the new SSU if successfully inserted | Returns -1 if failed to insert SSU.
	 */
	@RequestMapping(value="/SSU", method = RequestMethod.POST)
	public Map<String, String> AddSsu(@RequestBody SsuPostData DataToAdd) {

		String id = SsuFactory.insertToDatabase(DataToAdd);

		return Collections.singletonMap("id", id+"");
	}


	/**
	 * @param userid - id to identify a user
	 * @return GET - http://localhost:8080/SSU/byuser/{userid} | Returns all the SSUs posted by a specific userid
	 */
	@RequestMapping(value="/byuser/{userid}", method = RequestMethod.GET)
	public List<SimpleStatusUpdate> getSsuPostedByAUser(@PathVariable("userid") String userid) {
		// TODO Issue #31 (Don't forget to document this API on the wiki)

		// The parameter that this method receives is the userid that we wan't to query for in the database.
		// Look at the other @RequestMapping methods in this file, and understand the way SsuFactory.java is being used.
		// This method should call the getAllByUserId(String userid) method you created in the SsuFactory.java to get the values.

		// *** TEST IF THE API WORKS *** Build and run the server and call the URL to test if it returns data.
		// *** Stay in touch with whoever is doing Issue #30. SSUs don't have a userid identifiers yet. Issue #30 implements userid 
		// for SSU class. Have him/her merge his code first, then test your code. OR work together in the same branch with him/her.***
		return null;
	}

	
	/**
	 * @param ssuid - the unique ssuid of the SSU to delete
	 * @return DELETE - http://localhost:8080/SSU/{userid} - Returns the id of the SSU deleted, or -1 if unsuccessful
	 */
	@RequestMapping(value="/{ssuid}", method = RequestMethod.DELETE)
	public int deleteById(@PathVariable("ssuid") String ssuid) {
		// TODO Issue #16 (Don't forget to document this API on the wiki)

		// this method should call deleteById(String ssuId) inside SsuFactory and return the result.
		return -1;
	}
	
	
	/**
	 * @param ssuid - the unique ssuid of the SSU to delete | dataToUpdate - The updated SSU datahandler object
	 * @return PUT - http://localhost:8080/SSU/{userid} - Returns the UPDATED ssu
	 */
	@RequestMapping(value="/{ssuid}", method = RequestMethod.PUT)
	public SimpleStatusUpdate updateById(@PathVariable("ssuid") String ssuid, @RequestBody SsuPostData dataToUpdate) {
		// TODO Issue #17 (Don't forget to document this API on the wiki)
		
		// When frontend calls this URL, it sends a SSU object which gets mapped to the SsuPostData object
		// this method should call updateById(String ssuId, SsuPostData dataToUpdate) inside SsuFactory.java
		return null;
	}

}
