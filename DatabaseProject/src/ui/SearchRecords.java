package ui;

import java.util.List;
import java.util.Scanner;

import entities.*;

public class SearchRecords {
	public static void searchMovie(Scanner in, List<Movie> records) {
		System.out.println("Input movie title to search for");
		String movieInput = in.nextLine();
		
		for (Movie item : records) {
				if (item.title.equalsIgnoreCase(movieInput)) {
					System.out.println("Movie found: " + item);
					return;
				}
				
		}
		
		System.out.println("No movie found with title " + movieInput);
	}
	
	public static void searchAlbum(Scanner in, List<Album> records) {
		System.out.println("Input album title to search for");
		String input = in.nextLine();
		
		for (Album item : records) {
				if (item.title.equalsIgnoreCase(input)) {
					System.out.println("Album found: " + item);
					return;
				}
				
		}
		
		System.out.println("No album found with title " + input);
	}
	

	public static void searchAudiobook(Scanner in, List<Audiobook> records) {
		System.out.println("Input Audiobook title to search for");
		String input = in.nextLine();
		
		for (Audiobook item : records) {
				if (item.title.equalsIgnoreCase(input)) {
					System.out.println("Audiobook found: " + (Audiobook)item);
					return;
				}
				
		}
		
		System.out.println("No Audiobook found with title " + input);
		
	}
	
	public static void searchPatron(Scanner in, List<Patron> records) {
		System.out.println("Input Patron last name to search for");
		String input = in.nextLine();
		
		for (Patron item : records) {
				if (item.lastName.equalsIgnoreCase(input)) {
					System.out.println("Patron found: " + (Patron)item);
					return;
				}
				
		}
		
		System.out.println("No Patron found with last name " + input);
		
	}
	
	public static void searchLibrarian(Scanner in, List<Librarian> records) {
		System.out.println("Input Librarian name to search for");
		String input = in.nextLine();
		
		for (Librarian item : records) {
				if (item.name.equalsIgnoreCase(input)) {
					System.out.println("Librarian found: " + (Librarian)item);
					return;
				}
				
		}
		
		System.out.println("No Librarian found with title " + input);
		
	}
}
