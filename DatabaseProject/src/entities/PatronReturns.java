package entities;

public class PatronReturns {
	private Patron patron;
	private Item item;
	public PatronReturns(Patron patron, Item item) {
		this.patron = patron;
		this.item = item;
	}
	public Patron getPatron() {
		return patron;
	}
	public void setPatron(Patron patron) {
		this.patron = patron;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
}
