package entities;

import java.util.concurrent.atomic.AtomicLong;

public class Librarian {
	private static final AtomicLong NEXT_ID = new AtomicLong(0); 
	private final long id;
	private String name;
	private double salary;
	private Library library;
	
	public Librarian(String name, double salary) {
		this.id = NEXT_ID.getAndIncrement();
		this.name = name;
		this.salary = salary;
	}
	
	public Librarian(String name, double salary, Library library) {
		this.id = NEXT_ID.getAndIncrement();
		this.name = name;
		this.salary = salary;
		this.setLibrary(library);
	}
	
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public String getLibrarianState() {
		return this.library.getState();
	}
	
	public String getLibrarianCity() {
		return this.library.getCity();
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
