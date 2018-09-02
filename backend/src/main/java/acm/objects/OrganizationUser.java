package acm.objects;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class OrganizationUser implements UserDetails{

	public String orgid;
	
	public String name;
	
	public String head;
	
	public String location;
	
	public String description;
	
	public String website;
	
	public String emailaddress;
	
	public String password;
	
	public OrganizationUser(String orgid, String name, String head, String location, String description,
			String website, String emailaddress, String password) {
		super();
		this.orgid = orgid;
		this.name = name;
		this.head = head;
		this.location = location;
		this.description = description;
		this.website = website;
		this.emailaddress = emailaddress;
		this.password = password;
	}
	
	

	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmailaddress() {
		return emailaddress;
	}



	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}



	public String getOrgid() {
		return orgid;
	}



	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getHead() {
		return head;
	}



	public void setHead(String head) {
		this.head = head;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
