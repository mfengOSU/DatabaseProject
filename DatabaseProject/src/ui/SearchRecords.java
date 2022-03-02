package ui;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entities.*;

public class SearchRecords {
	public static Movie searchMovie(Scanner in, Map<Integer, Movie> records) {
		System.out.println("Input movie title to search for");
		String movieInput = in.nextLine();
		
		for (Movie item : records.values()) {
				if (item.title.equalsIgnoreCase(movieInput)) {
					System.out.println("Movie found: " + item);
					return item;
				}
				
		}
		
		System.out.println("No movie found with title " + movieInput);
		return null;
	}
	
	public static Album searchAlbum(Scanner in, Map<Integer, Album> records) {
		System.out.println("Input album title to search for");
		String input = in.nextLine();
		
		for (Album item : records.values()) {
				if (item.title.equalsIgnoreCase(input)) {
					System.out.println("Album found: " + item);
					return item;
				}
				
		}
		
		System.out.println("No album found with title " + input);
		return null;
	}
	

	public static Audiobook searchAudiobook(Scanner in, Map<Integer, Audiobook> records) {
		System.out.println("Input Audiobook title to search for");
		String input = in.nextLine();
		
		for (Audiobook item : records.values()) {
				if (item.title.equalsIgnoreCase(input)) {
					System.out.println("Audiobook found: " + item);
					return item;
				}
				
		}
		
		System.out.println("No Audiobook found with title " + input);
		return null;
		
	}
	
	public static Patron searchPatron(Scanner in, Map<Integer,Patron> records) {
		System.out.println("Input Patron last name to search for");
		String input = in.nextLine();
		
		for (Patron item : records.values()) {
				if (item.lastName.equalsIgnoreCase(input)) {
					System.out.println("Patron found: " + item);
					return item;
				}
				
		}
		
		System.out.println("No Patron found with last name " + input);
		return null;
		
	}
	
	public static Librarian searchLibrarian(Scanner in, Map<Integer,Librarian> records) {
		System.out.println("Input Librarian name to search for");
		String input = in.nextLine();
		
		for (Librarian item : records.values()) {
				if (item.name.equalsIgnoreCase(input)) {
					System.out.println("Librarian found: " + item);
					return item;
				}
				
		}
		
		System.out.println("No Librarian found with title " + input);
		return null;
		
	}
}
