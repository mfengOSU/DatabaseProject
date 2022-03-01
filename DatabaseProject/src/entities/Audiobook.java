package entities;

public class Audiobook extends Item{
	private int length;
	private int chapters;
	private Author author;
	private Narrator narrator;
	
	public Audiobook(String copyType, double rating, String title, int year, String genre,
			int length, int chapters, Author author, Narrator narrator) {
		super(copyType, rating, title, year, genre);
		this.length = length;
		this.chapters = chapters;
		this.author = author;
		this.narrator = narrator;
	}

	@Override
	public String toString() {
		return "Audiobook [length=" + length + ", chapters=" + chapters + ", author=" + author + ", narrator="
				+ narrator + ", id=" + id + ", copyType=" + copyType + ", rating=" + rating + ", title=" + title
				+ ", year=" + year + ", genre=" + genre + ", location=" + location + ", itemStatus=" + itemStatus
				+ ", dueDate=" + dueDate + ", patron=" + patron + "]";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setNarrator(Narrator narrator) {
		this.narrator = narrator;
	}

	public Narrator getNarrator() {
		return narrator;
	}
}
