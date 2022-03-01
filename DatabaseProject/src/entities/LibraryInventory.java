package entities;

public class LibraryInventory {
	private Library library;
	private Item item;
	
	public Library getLibrary() {
		return library;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public LibraryInventory(Library library, Item item) {
		this.library = library;
		this.item = item;
	}
}
