package entities;

import java.util.concurrent.atomic.AtomicLong;

public class Artist {
	private static final AtomicLong NEXT_ID = new AtomicLong(0); 
	private final long id;
	private String name;
	
	public Artist(String name) {
		this.id = NEXT_ID.getAndIncrement();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + "]";
	}
}
