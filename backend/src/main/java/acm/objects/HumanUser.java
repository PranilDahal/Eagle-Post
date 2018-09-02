package acm.objects;

import java.sql.Date;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Pranil
 * 
 * @description This is a class for user accounts that are personal.
 *
 */
public class HumanUser implements UserDetails{
	
	public int userid;

	public String firstname;
	
	public String lastname;
	
	public String username;
	
	public String password;
	
	public String cin;
	
	public String phonenumber;
	
	public String emailaddress;
	
	public Date birthday;
	
	public String secretcode;

	public HumanUser(int userId, String firstName, String lastName, String userName, String password, String cin,
			String phoneNumber, String emailAddress, Date birthDay, String secretCode) {
		super();
		this.userid = userId;
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

	public Date getBirthDay() {
		return birthday;
	}

	public void setBirthDay(Date birthDay) {
		this.birthday = birthDay;
	}

	public String getSecretCode() {
		return secretcode;
	}

	public void setSecretCode(String secretCode) {
		this.secretcode = secretCode;
	}

	public int getUserId() {
		return userid;
	}

	public void setUserId(int userId) {
		this.userid = userId;
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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return "acm";
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
