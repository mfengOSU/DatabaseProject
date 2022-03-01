package entities;


import java.util.concurrent.atomic.AtomicLong;

public class Patron {
	private static final AtomicLong NEXT_ID = new AtomicLong(0); 
	private final long id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private LibraryCard libraryCard;
	
	public Patron(String firstName, String lastName, String address, String email) {
		this.id = NEXT_ID.getAndIncrement();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.libraryCard = new LibraryCard();

	}
	
	public void activateLibraryCard() {
		this.libraryCard.setActive(true);
	}
	
	public void deactivateLibraryCard() {
		this.libraryCard.setActive(false);
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
