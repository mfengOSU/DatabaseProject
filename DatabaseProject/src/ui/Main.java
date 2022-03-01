package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Librarian;
import entities.Library;
import entities.LibraryCard;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Library> libraries = new ArrayList<>();
		Library library1 = new Library("Columbus", "Ohio");
		libraries.add(library1);
		
		List<Librarian> librarians = new ArrayList<>();
		Librarian librarian1 = new Librarian("Jane Doe", 100.00, library1);
		librarians.add(librarian1);
		
		LibraryCard libraryCard1 = new LibraryCard();
		
		System.out.println("Library Application");
		System.out.println("Choose an option");
		System.out.println("0 - Exit");
		System.out.println("1 - Add a record");
		System.out.println("2 - Edit a record");
		System.out.println("3 - Search for a record");
		System.out.println("4 - Order an item");
		System.out.println("5 - Generate reports");

		while (true) {
			int input = in.nextInt();
			switch (input) {
			case 0:
				in.close();
				System.exit(0);
			case 1: 
				System.out.println("Adding record");
				break;
			case 2:
				System.out.println("Editing record");
				break;
			case 3:
				System.out.println("Looking for record");
				break;
			case 4:
				System.out.println("Ordering an item");
				break;
			case 5:
				System.out.println("Getting report");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Choose an option");
			System.out.println("0 - Exit");
			System.out.println("1 - Add a record");
			System.out.println("2 - Edit a record");
			System.out.println("3 - Search for a record");
			System.out.println("4 - Order an item");
			System.out.println("5 - Generate reports");
		}	
	}
	
}
