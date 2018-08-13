package acm.objects;

import java.sql.Date;

public class SimpleStatusUpdate extends AbstractPost{

	public String title;

	public String description;

	public Date datePosted;

	public SimpleStatusUpdate(String title, String description, Date datePosted) {
		super();
		this.title = title;
		this.description = description;
		this.datePosted = datePosted;
	}


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

}
