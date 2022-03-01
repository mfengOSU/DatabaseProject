package entities;

public class LibraryOrders {
	private Order order;
	private Library library;
	
	public LibraryOrders(Order order, Library library) {
		this.order = order;
		this.library = library;
	}

	public Order getOrder() {
		return order;
	}

	public Library getLibrary() {
		return library;
	}
}
