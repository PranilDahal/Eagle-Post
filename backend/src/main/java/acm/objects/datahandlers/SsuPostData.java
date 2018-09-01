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

	public String dateposted;
	
	public SsuPostData(String title, String description, String datePosted) {
		super();
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



	public String getDatePosted() {
		return dateposted;
	}


	public void setDatePosted(String datePosted) {
		this.dateposted = datePosted;
	}

}
