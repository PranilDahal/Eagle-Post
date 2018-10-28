package acm.objects.database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import acm.objects.HumanUser;
import acm.objects.database.HumanUserFactory;
import acm.objects.datahandlers.AccountSettingsData;
import java.util.Date;

@RestController
@RequestMapping("/userdata")
public class HumanUsersControllers {

	@Autowired
	HumanUserFactory userFactory;

	/**
	 * @param userid - id to identify a user
	 * @return GET - http://localhost:8080/userdata/userid | Returns the data needed for AccountSettings page
	 */
	@RequestMapping(value = "/accountsettings/{userid}", method = RequestMethod.GET)
	public AccountSettingsData getAccountSettingsInfo(@PathVariable("userid") String userid) {


		AccountSettingsData userDataWithoutPassword = null;
		//(Don't forget to document this API on the wiki)

		// The difference between HumanUser and AccountSettingsData is that HumanUser objects have the passwords in them.
		// (Look at HumanUser.java and AccountSettingsData.java to see the difference)
		// We don't want to return the password. That's not a safe practise.
		HumanUser user = userFactory.getById(userid);
		
		if(user == null) {
			return null;
		}

		//1

		String fname =user.getFirstName();

		//2

		String lname =user.getLastName();

		//3

		String cin = user.getCIN();

		//4

		String phoneNumber = user.getPhoneNumber();

		//5

		Date birthDate = user.getBirthDay();

		//6

		String emailAddress = user.getEmailAddress();

		//7

		String secretCode = user.getSecretCode();

		//8

		int userID = user.getUserId();

		String userId = Integer.toString(userID);

		//9

		String userName =user.getUserName();

		userDataWithoutPassword = new AccountSettingsData (userId, fname, lname, userName, cin,

				phoneNumber,emailAddress, (java.sql.Date) birthDate, secretCode);

		// TODO Issue 7 : Change this HumanUser object into AccountSettingsData and return it

		//(Don't forget to document this API on the wiki)

		// The difference between HumanUser and AccountSettingsData is that HumanUser objects have the passwords in them.

		// (Look at HumanUser.java and AccountSettingsData.java to see the difference)

		// We don't want to return the password. That's not a safe practice.

		return userDataWithoutPassword;
	}

}
