package entities;

public class Movie extends Item{
	private int length;
	private String director;
	
	public Movie(String copyType, double rating, String title, int year, String genre,
			int length, String director) {
		super(copyType, rating, title, year, genre);
		this.length = length;
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [length=" + length + ", director=" + director + ", id=" + id + ", copyType=" + copyType
				+ ", rating=" + rating + ", title=" + title + ", year=" + year + ", genre=" + genre + ", location="
				+ location + ", itemStatus=" + itemStatus + ", dueDate=" + dueDate + ", patron=" + patron + "]";
	}
	

	
}
