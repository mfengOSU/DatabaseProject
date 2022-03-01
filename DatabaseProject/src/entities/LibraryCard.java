package entities;

import java.util.concurrent.atomic.AtomicLong;

public class LibraryCard {
	private static final AtomicLong NEXT_NUMBER = new AtomicLong(100); 
	private final long number;
	private boolean isActive;
	
	public LibraryCard() {
		this.number = NEXT_NUMBER.getAndIncrement();
		this.isActive = false;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public long getNumber() {
		return number;
	}
	
	

}
