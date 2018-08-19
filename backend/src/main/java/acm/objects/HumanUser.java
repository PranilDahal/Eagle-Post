package acm.objects;

import java.sql.Date;

/**
 * @author Pranil
 * 
 * @description This is a class for user accounts that are personal.
 *
 */
public class HumanUser extends AbstractUser{
	
	public int userId;

	public String firstName;
	
	public String lastName;
	
	public String userName;
	
	public String password;
	
	public String CIN;
	
	public String phoneNumber;
	
	public String emailAddress;
	
	public Date birthDay;
	
	public String secretCode;

	public HumanUser(int userId, String firstName, String lastName, String userName, String password, String cin,
			String phoneNumber, String emailAddress, Date birthDay, String secretCode) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.CIN = cin;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.birthDay = birthDay;
		this.secretCode = secretCode;
	}

	/**
	 * @see acm.objects.AbstractUser#postAPost(acm.objects.AbstractPost)
	 * 
	 * @description DO NOT USE THIS METHOD. ITS NOT FUNCITONAL YET.
	 */
	@Override
	public boolean postAPost(AbstractPost Post) {
		return Post.uploadToDatabase();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
