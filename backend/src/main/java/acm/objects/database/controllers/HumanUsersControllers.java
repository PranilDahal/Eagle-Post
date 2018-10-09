package acm.objects.database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import acm.objects.HumanUser;
import acm.objects.database.HumanUserFactory;
import acm.objects.datahandlers.AccountSettingsData;

@RestController
@RequestMapping("/userdata")
public class HumanUsersControllers {

	@Autowired
	HumanUserFactory userFactory;
	
	/**
	 * @param userid - id to identify a user
	 * @return GET - http://localhost:8080/userdata/userid | Returns the data needed for AccountSettings page
	 */
	@RequestMapping(value = "/{userid}", method = RequestMethod.GET)
	public AccountSettingsData getAccountSettingsInfo(@PathVariable("userid") String userid) {
		HumanUser user = userFactory.getById(userid);
		
		AccountSettingsData userDataWithoutPassword = null;
		// TODO Issue 7 : Change this HumanUser object into AccountSettingsData and return it
		//(Don't forget to document this API on the wiki)
		
		// The difference between HumanUser and AccountSettingsData is that HumanUser objects have the passwords in them.
		// (Look at HumanUser.java and AccountSettingsData.java to see the difference)
		// We don't want to return the password. That's not a safe practise.
		
		return userDataWithoutPassword;
	}
	
}
