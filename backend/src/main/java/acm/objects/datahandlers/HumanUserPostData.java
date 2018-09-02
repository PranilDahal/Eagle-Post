package acm.objects.datahandlers;

public class HumanUserPostData {

	public String firstname;
	
	public String lastname;
	
	public String username;
	
	public String password;
	
	public String cin;
	
	public String phonenumber;
	
	public String emailaddress;
	
	public String birthday;
	
	public String secretcode;

	public HumanUserPostData(String firstName, String lastName, String userName, String password, String cin,
			String phoneNumber, String emailAddress, String birthDay, String secretCode) {
		super();

		this.firstname = firstName;
		this.lastname = lastName;
		this.username = userName;
		this.password = password;
		this.cin = cin;
		this.phonenumber = phoneNumber;
		this.emailaddress = emailAddress;
		this.birthday = birthDay;
		this.secretcode = secretCode;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getCIN() {
		return cin;
	}

	public void setCIN(String cIN) {
		cin = cIN;
	}

	public String getPhoneNumber() {
		return phonenumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phonenumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailaddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailaddress = emailAddress;
	}

	public String getBirthDay() {
		return birthday;
	}

	public void setBirthDay(String birthDay) {
		this.birthday = birthDay;
	}

	public String getSecretCode() {
		return secretcode;
	}

	public void setSecretCode(String secretCode) {
		this.secretcode = secretCode;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
