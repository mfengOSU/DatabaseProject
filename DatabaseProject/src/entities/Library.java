package entities;

public class Library {
	private String state;
	private String city;
	
	public Library(String city, String state) {
		this.state = state;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}	
	
}
