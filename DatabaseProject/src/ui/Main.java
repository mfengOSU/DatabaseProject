package ui;

import java.util.*;

import entities.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Library library1 = new Library("Columbus", "Ohio");
		Librarian librarian1 = new Librarian("Jane Doe", 100.00, library1);
		List<MovieActors> moviesActors = new ArrayList<>();
		List<LibraryInventory> libraryInventory = new ArrayList<>();
		List<LibraryOrders> libraryOrder = new ArrayList<>();
		List<Item> records = new ArrayList<>();
		List<Track> tracks = new ArrayList<>();

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
				System.out.println("Choose what to add: ");
				System.out.println("M - Add movie");
				System.out.println("A - Add album");
				System.out.println("B - Add audiobook");
				String choice = in.nextLine();
				
				switch (choice.toLowerCase()) {
				case "m":
					addMovie(in, moviesActors, records);
					break;
				case "a":
					addAlbum(in, records, tracks);
					break;
				case "b":
					addAudioBook(in, records);
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
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
					searchMovie(in, moviesActors, records);
					break;
				case "a":
					searchAlbum(in, records, tracks);
					break;
				case "b":
					searchAudiobook(in, records);
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
	
	public static void addMovie(Scanner in, List<MovieActors> moviesActors, List<Item> records) {		
			
		System.out.println("physical or electronic?");
		String copyType = in.nextLine();
		
		System.out.println("Input rating");
		double rating = in.nextDouble();
		in.nextLine();
		
		System.out.println("Input title");
		String title = in.nextLine();
		
		System.out.println("Input year");
		int year = in.nextInt();
		in.nextLine();
		
		System.out.println("Input genre");
		String genre = in.nextLine();
		
		System.out.println("Input movie length");
		int length = in.nextInt();
		in.nextLine();
		
		System.out.println("Input movie director");
		String director = in.nextLine();
		
		Movie item = new Movie(copyType, rating, title, year, genre, length, director);
		
		System.out.println("Input actor names on separate lines. Press 'q' to quit.");
		String actorStr = in.nextLine();
		while (!actorStr.toLowerCase().equals("q")) {
			Actor actor = new Actor(actorStr);
			moviesActors.add(new MovieActors(item, actor));
			actorStr = in.nextLine();
		}
		records.add(item);
		System.out.println("New movie: " + item);
	}
	
	public static void addAudioBook(Scanner in, List<Item> records) {		
		
		System.out.println("physical or electronic?");
		String copyType = in.nextLine();
		
		System.out.println("Input rating");
		double rating = in.nextDouble();
		in.nextLine();
		
		System.out.println("Input title");
		String title = in.nextLine();
		
		System.out.println("Input year");
		int year = in.nextInt();
		in.nextLine();
		
		System.out.println("Input genre");
		String genre = in.nextLine();
		
		System.out.println("Input audiobook length");
		int length = in.nextInt();
		in.nextLine();
		
		System.out.println("Input number chapters");
		int chapters = in.nextInt();
		in.nextLine();
		
		System.out.println("Input author");
		String authorStr = in.nextLine();
		Author author = new Author(authorStr);
		
		System.out.println("Input narrator");
		String narratorStr = in.nextLine();
		Narrator narrator = new Narrator(narratorStr);
		
		Audiobook item = new Audiobook(copyType, rating, title, year, genre, length, chapters, author, narrator);
		
		records.add(item);
		System.out.println("New audiobook: " + item);
	}
	
	public static void addAlbum(Scanner in, List<Item> records, List<Track> tracks) {		
		
		System.out.println("physical or electronic?");
		String copyType = in.nextLine();
		
		System.out.println("Input rating");
		double rating = in.nextDouble();
		in.nextLine();
		
		System.out.println("Input title");
		String title = in.nextLine();
		
		System.out.println("Input year");
		int year = in.nextInt();
		in.nextLine();
		
		System.out.println("Input genre");
		String genre = in.nextLine();
		
		System.out.println("Input artist");
		String artistStr = in.nextLine();
		Artist artist = new Artist(artistStr);
		
		Album item = new Album(copyType, rating, title, year, genre, artist);
		
		System.out.println("Input tracks on separate lines. Press 'q' to quit.");
		String trackStr = "";
		while (!trackStr.toLowerCase().equals("q")) {
			System.out.println("Press q to quit. Other continue with any key");
			trackStr = in.nextLine();
			if (!trackStr.equals("q")) {
				System.out.println("Input track length");
				int trackLen = in.nextInt();
				in.nextLine();
				System.out.println("Input track title");
				String trackTitle = in.nextLine();
				tracks.add(new Track(trackTitle, trackLen, item));
			}
			
			

		}
		
		records.add(item);
		System.out.println("New Album: " + item);
	}
	
	public static void searchMovie(Scanner in, List<MovieActors> moviesActors, List<Item> records) {
		List<Long> movieIds = new ArrayList<>();
		System.out.println("Input movie title to search for");
		String movieInput = in.nextLine();
		
		for (Item item : records) {
			if (item instanceof Movie) {
				movieIds.add(item.getId());
			}		
		}
		for (long id : movieIds) {
			for (Item item : records) {
				if (id == item.getId()) {
					if (item.getTitle().equalsIgnoreCase(movieInput)) {
						System.out.println("Movie found: " + (Movie)item);
						return;
					}
					
				}
			}
		}
		System.out.println("No movie found with title " + movieInput);
	}
	
	private static void searchAlbum(Scanner in, List<Item> records, List<Track> tracks) {
		List<Long> albumIds = new ArrayList<>();
		System.out.println("Input album title to search for");
		String input = in.nextLine();

		for (Item item : records) {
			if (item instanceof Album) {
				albumIds.add(item.getId());
			}		
		}
		for (long id : albumIds) {
			for (Item item : records) {
				if (id == item.getId()) {
					if (item.getTitle().equalsIgnoreCase(input)) {
						System.out.println("Album found: " + (Album)item);
						return;
					}
					
				}
			}
		}
		System.out.println("No album found with title " + input);

	}
	

	private static void searchAudiobook(Scanner in, List<Item> records) {
		List<Long> bookIds = new ArrayList<>();
		System.out.println("Input audiobook title to search for");
		String input = in.nextLine();

		for (Item item : records) {
			if (item instanceof Audiobook) {
				bookIds.add(item.getId());
			}		
		}
		for (long id : bookIds) {
			for (Item item : records) {
				if (id == item.getId()) {
					if (item.getTitle().equalsIgnoreCase(input)) {
						System.out.println("audiobook found: " + (Audiobook)item);
						return;
					}
					
				}
			}
		}
		System.out.println("No audiobook found with title " + input);
		
	}
	
}
