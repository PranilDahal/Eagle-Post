package acm.objects.datahandlers;

public class HumanUserPostData {

	public String firstName;
	
	public String lastName;
	
	public String userName;
	
	public String password;
	
	public String CIN;
	
	public String phoneNumber;
	
	public String emailAddress;
	
	public String birthDay;
	
	public String secretCode;

	public HumanUserPostData(String firstName, String lastName, String userName, String password, String cin,
			String phoneNumber, String emailAddress, String birthDay, String secretCode) {
		super();

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

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
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
