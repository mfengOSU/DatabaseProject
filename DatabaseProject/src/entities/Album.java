package entities;

public class Album extends Item{
	private Artist artist;
	
	public Album(String copyType, double rating, String title, int year, String genre, 
			 Artist artist) {
		super(copyType, rating, title, year, genre);
		this.artist = artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Artist getArtist() {
		return this.artist;
	}

	@Override
	public String toString() {
		return "Album [artist=" + artist + ", id=" + id + ", copyType=" + copyType + ", rating=" + rating + ", title="
				+ title + ", year=" + year + ", genre=" + genre + ", location=" + location + ", itemStatus="
				+ itemStatus + ", dueDate=" + dueDate + ", patron=" + patron + "]";
	}
	
	

}
