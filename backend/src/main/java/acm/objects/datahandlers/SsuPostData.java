package acm.objects.datahandlers;

/**
 * @author Pranil
 * @description Use this object while called POST request for a SSU. It contains all the SSU 
 * 	information in string format.
 *
 */
public class SsuPostData {

	public String title;

	public String description;

	public String date_posted;

	public SsuPostData() {}
	
	public SsuPostData(String title, String description, String datePosted) {
		super();
		this.title = title;
		this.description = description;
		this.date_posted = datePosted;
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



	public String getDatePosted() {
		return date_posted;
	}


	public void setDatePosted(String datePosted) {
		this.date_posted = datePosted;
	}

}
