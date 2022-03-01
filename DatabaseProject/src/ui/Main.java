package ui;

import java.util.*;

import entities.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Library library1 = new Library("Columbus", "Ohio");
		Librarian librarian1 = new Librarian("Jane Doe", 100.00, library1);
		
		List<Album> albums = new ArrayList<>();
		List<Movie> movies = new ArrayList<>();
		List<Audiobook> audiobooks = new ArrayList<>();

		List<Librarian> librarians = new ArrayList<>();
		librarians.add(librarian1);
		
				
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
			in.nextLine();
			
			switch (input) {
			case 0:
				in.close();
				System.exit(0);
			case 1: 
				break;
			case 2:
				System.out.println("Editing record");
				break;
			case 3:
				System.out.println("Choose what to search for: ");
				System.out.println("M - Search for movie");
				System.out.println("A - Search for album");
				System.out.println("B - Search for audiobook");
				String choice3 = in.nextLine();
				
				switch (choice3.toLowerCase()) {
				case "m":
					searchMovie(in, movies);
					break;
				case "a":
					searchAlbum(in, albums);
					break;
				case "b":
					searchAudiobook(in, audiobooks);
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
			case 4:
				System.out.println("Ordering an item");
				break;
			case 5:
				System.out.println("Getting report");
				// TODO
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

	public static void searchMovie(Scanner in, List<Movie> records) {
//		System.out.println("Input movie title to search for");
//		String movieInput = in.nextLine();
//		
//		for (Movie item : records) {
//				if (item.getTitle().equalsIgnoreCase(movieInput)) {
//					System.out.println("Movie found: " + (Movie)item);
//					return;
//				}
//				
//			}
//		}
//		
//		System.out.println("No movie found with title " + movieInput);
	}
	
	private static void searchAlbum(Scanner in, List<Album> records) {
//		System.out.println("Input album title to search for");
//		String input = in.nextLine();
//		
//		for (Album item : records) {
//				if (item.getTitle().equalsIgnoreCase(input)) {
//					System.out.println("Album found: " + (Album)item);
//					return;
//				}
//				
//			}
//		}
//		
//		System.out.println("No album found with title " + input);

	}
	

	private static void searchAudiobook(Scanner in, List<Audiobook> records) {
//		System.out.println("Input Audiobook title to search for");
//		String input = in.nextLine();
//		
//		for (Audiobook item : records) {
//				if (item.getTitle().equalsIgnoreCase(input)) {
//					System.out.println("Audiobook found: " + (Audiobook)item);
//					return;
//				}
//				
//			}
//		}
//		
//		System.out.println("No Audiobook found with title " + input);
		
	}
	
}
