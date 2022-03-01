package entities;

public class Track {
	private int length;
	private String title;
	private Album album;
	
	public Track(String title, int length, Album album) {
		this.title = title;
		this.length = length;
		this.album = album;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Track [length=" + length + ", title=" + title + ", album=" + album + "]";
	}
	
	

}
