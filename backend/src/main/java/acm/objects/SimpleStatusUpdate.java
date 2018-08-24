package acm.objects;

import java.sql.Date;

/**
 * @author Pranil
 * @description SimpleStatusUpdate class
 *
 */
public class SimpleStatusUpdate extends AbstractPost{
	
	public String ssuId;

	public String title;

	public String description;

	public Date datePosted;

	public SimpleStatusUpdate(String id, String title, String description, Date datePosted) {
		super();
		this.ssuId = id;
		this.title = title;
		this.description = description;
		this.datePosted = datePosted;
	}


	/**
	 * @see acm.objects.AbstractPost#uploadToDatabase()
	 * @description DONT USE THIS METHOD. IT'S NOT FUNCTIONAL YET.
	 */
	@Override
	public boolean uploadToDatabase() {
		return false;
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
		return datePosted;
	}



	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}


	public String getId() {
		return ssuId;
	}


	public void setId(String id) {
		this.ssuId = id;
	}

}
