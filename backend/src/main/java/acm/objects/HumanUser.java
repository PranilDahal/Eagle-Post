package acm.objects;

import java.sql.Date;

public class HumanUser extends AbstractUser{

	public String firstName;
	
	public String lastName;
	
	public String CIN;
	
	public String phoneNumber;
	
	public String emailAddress;
	
	public Date birthDay;
	
	public String secretCode;
	
	public HumanUser(String firstName, String lastName, String CIN, String phoneNumber, String emailAddress,
			Date birthDay, String secretCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.CIN = CIN;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.birthDay = birthDay;
		this.secretCode = secretCode;
	}

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
	
	

}
