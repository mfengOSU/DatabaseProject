package entities;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public abstract class Item {
	private static final AtomicLong NEXT_ID = new AtomicLong(0); 
	protected final long id;
	protected String copyType;
	protected double rating;
	protected String title;
	protected int year;
	protected String genre;
	protected String location;
	protected String itemStatus;
	protected Date dueDate;
	protected Patron patron;
	
	public Item(String copyType, double rating, String title, int year, String genre) {
		this.id = NEXT_ID.getAndIncrement();
		this.copyType = copyType;
		this.rating = rating;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.itemStatus = "Not_Ordered";
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public long getId() {
		return id;
	}
	
	public String getCopyType() {
		return this.copyType;
	}
	
	public void setCopyType(String copyType) {
		this.copyType = copyType;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public double getRating() {
		return this.rating;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public void setPatron(Patron patron) {
		this.patron = patron;
	}
	
	public Patron getPatron() {
		return this.patron;
	}
}
