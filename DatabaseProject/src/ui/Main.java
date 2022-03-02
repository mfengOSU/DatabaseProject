package ui;

import java.util.*;

import entities.*;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
				
		System.out.println("Library Application");
		System.out.println("Choose an option");
		System.out.println("0 - Exit");
		System.out.println("1 - Add a record");
		System.out.println("2 - Edit a record");
		System.out.println("3 - Search for a record");
		System.out.println("4 - Order an item");
		System.out.println("5 - Generate reports");
		

		int recordNum;
		Map<Integer, Album> albums = new HashMap<Integer, Album>();
		Map<Integer, Audiobook> audiobooks = new HashMap<Integer, Audiobook>();
		Map<Integer, Movie> movies = new HashMap<Integer, Movie>();
		Map<Integer, Order> orders = new HashMap<Integer, Order>();
		Map<Integer, Patron> patrons = new HashMap<Integer, Patron>();
		Map<Integer, Librarian> librarians = new HashMap<Integer, Librarian>();

		while (true) {
			int input = in.nextInt();
			in.nextLine();
			
			switch (input) {
			case 0:
				in.close();
				System.exit(0);
			case 1: 
				recordNum = recordInputOptions(in, "Please choose a record to add: ");
				List<Object> list = new ArrayList<Object> ();

				switch(recordNum){
				case 1:
					System.out.println();
					list = itemAttributes(in, list);
					list = albumAttributes(in, list);
					Album album = new Album(list);
					albums.put(album.itemNum, album);
					break;
				case 2:
					System.out.println();
					list = itemAttributes(in, list);
					list = bookAttributes(in, list);
					Audiobook book  = new Audiobook(list);
					audiobooks.put(book.itemNum, book);
					break;
				case 3:
					System.out.println();
					list = itemAttributes(in, list);
					list = movieAttributes(in, list);
					Movie movie  = new Movie(list);
					movies.put(movie.itemNum, movie);
					break;
				case 4:
					System.out.println();
					list = orderAttributes(in, list);
					Order order  = new Order(list);
					orders.put(order.orderNum, order);
					break;
				case 5:
					System.out.println();
					list = patronAttributes(in, list);
					Patron patron  = new Patron(list);
					patrons.put(patron.patronNum, patron);
					break;
				case 6:
					System.out.println();
					list = librarianAttributes(in, list);
					Librarian librarian  = new Librarian(list);
					librarians.put(librarian.librarianNum, librarian);
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
				break;
			case 2:
				List<Object> list2 = new ArrayList<Object> ();
				recordNum = recordInputOptions(in, "Please choose a record to edit: ");
				switch (recordNum) {
				case 1:
					Album album = SearchRecords.searchAlbum(in, albums);
					if (album != null) {
						System.out.println();
						list2 = itemAttributes(in, list2);
						list2 = albumAttributes(in, list2);
						album.init(list2);
					}
					break;
				case 2:
					Audiobook book = SearchRecords.searchAudiobook(in, audiobooks);
					if (book != null) {
						System.out.println();
						list2 = itemAttributes(in, list2);
						list2 = bookAttributes(in, list2);
						book.init(list2);
					}
					break;
				case 3:
					Movie movie = SearchRecords.searchMovie(in, movies);
					if (movie != null) {
						System.out.println();
						list2 = itemAttributes(in, list2);
						list2 = movieAttributes(in, list2);
						movie.init(list2);
					}
					break;
				case 4:
					Patron patron = SearchRecords.searchPatron(in, patrons);
					if (patron != null) {
						System.out.println();
						list2 = patronAttributes(in, list2);
						patron.init(list2);
					}
					break;
				case 5:
					Librarian librarian = SearchRecords.searchLibrarian(in, librarians);
					if (librarian != null) {
						System.out.println();
						list2 = librarianAttributes(in, list2);
						librarian.init(list2);
					}
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
			case 3:
				recordNum = recordInputOptions(in, "Please choose a record to search for: ");

				
				switch (recordNum) {
				case 1:
					SearchRecords.searchAlbum(in, albums);
					break;
				case 2:
					SearchRecords.searchAudiobook(in, audiobooks);
					break;
				case 3:
					SearchRecords.searchMovie(in, movies);
					break;
				case 4:
					SearchRecords.searchPatron(in, patrons);
					break;
				case 5:
					SearchRecords.searchLibrarian(in, librarians);
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
			case 4:
				List<Object> list4 = new ArrayList<Object> ();
				System.out.println();
				list = orderAttributes(in, list4);
				Order order  = new Order(list4);
				orders.put(order.orderNum, order);
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

	public static int recordInputOptions(Scanner in, String text)
	{
		System.out.println();
		System.out.println("Record Input Options:");
		System.out.println("1 - Album");
		System.out.println("2 - Audiobook");
		System.out.println("3 - Movie");
		System.out.println("4 - Patron");
		System.out.println("5 - Librarian");
		System.out.print(text);
		int recordNum = in.nextInt();
		in.nextLine();
		System.out.println();

		return recordNum;
	}

	public static List<Object> itemAttributes(Scanner in, List<Object> list)
	{
		System.out.print("Item Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("Item Status: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Copy Type: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Title: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Year: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("Genre: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Location: ");
		list.add(in.nextLine());
		System.out.println();
		
		System.out.print("Rating: ");
		list.add(in.nextLine());
		System.out.println();

		return list;
	}

	public static List<Object> albumAttributes(Scanner in, List<Object> list)
	{
		System.out.print("Artist Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Artist Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		//Need to implement multiple tracks, maybe add number of tracks?
		System.out.print("Track: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Length: ");
		list.add(Double.valueOf(in.nextDouble()));
		System.out.println();
		in.nextLine();

		return list;
	}

	public static List<Object> bookAttributes(Scanner in, List<Object> list)
	{
		System.out.print("Chapters: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("Number of Pages: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("Author Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Author Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("Narrator Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Narrator Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		return list;
	}

	public static List<Object> movieAttributes(Scanner in, List<Object> list)
	{
		System.out.print("Director Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Movie Length: ");
		list.add(Double.valueOf(in.nextDouble()));
		System.out.println();
		in.nextLine();

		//Implement multiple actors
		System.out.print("Actor Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Actor Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		return list;
	}

	public static List<Object> orderAttributes(Scanner in, List<Object> list)
	{
		System.out.print("Order Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("Media Type: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Copies: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("Date: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Price: ");
		list.add(Double.valueOf(in.nextDouble()));
		System.out.println();
		in.nextLine();

		return list;
	}

	public static List<Object> patronAttributes(Scanner in, List<Object> list)
	{
		System.out.print("Patron Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("First Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Last Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Address: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Email: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Library Card Number: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Card Status: ");
		list.add(in.nextLine());
		System.out.println();

		return list;
	}

	public static List<Object> librarianAttributes(Scanner in, List<Object> list)
	{
		System.out.print("Librarian Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		System.out.println();
		in.nextLine();

		System.out.print("Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Salary: ");
		list.add(Double.valueOf(in.nextDouble()));
		System.out.println();
		in.nextLine();

		return list;
	}


}
