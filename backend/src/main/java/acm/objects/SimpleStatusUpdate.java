package acm.objects;

import java.sql.Date;

/**
 * @author Pranil
 * @description SimpleStatusUpdate class
 *
 */
public class SimpleStatusUpdate{
	
	public String userid;
	
	// TODO Issue #29 - Add a field for number of likes (int) - Create Getters/Setters - Update constructors
	public int likes;
	
	public String ssuid;

	public String title;

	public String description;

	public Date dateposted;

	public SimpleStatusUpdate(String userid, String id, String title, String description, Date datePosted, int likes) {
		super();
		this.likes = likes;
		this.userid = userid;
		this.ssuid = id;
		this.title = title;
		this.description = description;
		this.dateposted = datePosted;
	}

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDatePosted() {
		return dateposted;
	}


	public void setDatePosted(Date datePosted) {
		this.dateposted = datePosted;
	}


	public String getId() {
		return ssuid;
	}


	public void setId(String id) {
		this.ssuid = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

}
