package acm.objects.datahandlers;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpRequestData {
	@NotBlank
	@Size(min = 2, max = 15)
	private String firstName;

	@NotBlank
	@Size(min = 2, max = 15)
	private String lastName;
	
	@NotBlank
	@Size(min = 7, max = 30)
	private String userName;

	@NotBlank
	@Size(min = 7, max = 20)
	private String password;
	
	@NotBlank
	@Size(min = 8, max = 10)
	private String CIN;
	
	@NotBlank
	@Size(min = 10, max = 20)
	private String phoneNumber;
	
	@NotBlank
	@Size(max = 40)
	@Email
	private String emailAddress;

	@NotBlank
	private String birthDay;
	
	@NotBlank
	@Size(min = 10, max = 40)
	private String secretCode;

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

	
}