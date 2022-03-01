package entities;

import java.util.concurrent.atomic.AtomicLong;

public class Narrator {
	private static final AtomicLong NEXT_ID = new AtomicLong(0); 
	private final long id;
	private String name;
	
	public Narrator(String name) {
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
		return "Narrator [id=" + id + ", name=" + name + "]";
	}
}
