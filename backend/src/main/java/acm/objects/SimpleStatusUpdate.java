package acm.objects;

import java.sql.Date;

/**
 * @author Pranil
 * @description SimpleStatusUpdate class
 *
 */
public class SimpleStatusUpdate{
	
	public String ssuid;

	public String title;

	public String description;

	public Date dateposted;

	public SimpleStatusUpdate(String id, String title, String description, Date datePosted) {
		super();
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

}
