package acm.objects.datahandlers;

import java.sql.Date;

public class AccountSettingsData {
	
	public String userid;

	public String firstname;
	
	public String lastname;
	
	public String username;
		
	public String cin;
	
	public String phonenumber;
	
	public String emailaddress;
	
	public Date birthday;
	
	public String secretcode;

	public AccountSettingsData(String userid, String firstname, String lastname, String username, String cin,
			String phonenumber, String emailaddress, Date birthday, String secretcode) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.cin = cin;
		this.phonenumber = phonenumber;
		this.emailaddress = emailaddress;
		this.birthday = birthday;
		this.secretcode = secretcode;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSecretcode() {
		return secretcode;
	}

	public void setSecretcode(String secretcode) {
		this.secretcode = secretcode;
	}
	
}
