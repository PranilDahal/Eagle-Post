package acm.objects;

public class SetupTestObject {
	
	String first_name;
	String last_name;
	Integer cin;
	
	public SetupTestObject(String first_name, String last_name, Integer cin) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.cin = cin;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getCin() {
		return cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}
	
	
}
