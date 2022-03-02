package entities;

public class LibraryCard {

	public int number;
	public String status;
	
	public LibraryCard(int n, String s)
	{
		number = n;
		status = s;
	}

	@Override
	public String toString() {
		return "LibraryCard [number=" + number + ", status=" + status + "]";
	}
	
	
}