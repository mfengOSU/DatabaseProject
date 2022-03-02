package entities;

import java.util.List;

public class Patron {

	public int patronNum;
	public String firstName;
	public String lastName;
	public String address;
	public String email;
	public LibraryCard card;
	
	public Patron(List<Object> list)
	{
	    patronNum = (int) list.get(0);
	    firstName = list.get(1).toString();
	    lastName = list.get(2).toString();
	    address = list.get(3).toString();
	    email = list.get(4).toString();
	    card = new LibraryCard(Integer.parseInt((String) list.get(5)), list.get(6).toString());
	}

	@Override
	public String toString() {
		return "Patron [patronNum=" + patronNum + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", email=" + email + ", card=" + card + "]";
	}

}