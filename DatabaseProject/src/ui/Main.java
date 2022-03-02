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

		while (true) {
			int input = in.nextInt();
			in.nextLine();
			
			switch (input) {
			case 0:
				in.close();
				System.exit(0);
			case 1: 
				int recordNum = recordInputOptions(in);
				List<Object> list = new ArrayList<Object> ();

				switch(recordNum){
					case 1:
						System.out.println();
						list = itemAttributes(in, list);
						list = albumAttributes(in, list);
						Album album = new Album(list);

						break;
					case 2:
						System.out.println();
						list = itemAttributes(in, list);
						list = bookAttributes(in, list);
						Audiobook book  = new Audiobook(list);
						
						break;
					case 3:
						System.out.println();
						list = itemAttributes(in, list);
						list = movieAttributes(in, list);
						Movie movie  = new Movie(list);

						break;
					case 4:
						System.out.println();
						list = orderAttributes(in, list);
						Order order  = new Order(list);
		
						break;
					case 5:
						System.out.println();
						list = patronAttributes(in, list);
						Patron patron  = new Patron(list);

						break;
					case 6:
						System.out.println();
						list = librarianAttributes(in, list);
						Librarian librarian  = new Librarian(list);
				
						break;
					default:
						System.out.println("Invalid Input");
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
					//searchMovie(in, movies);
					break;
				case "a":
					//searchAlbum(in, albums);
					break;
				case "b":
					//searchAudiobook(in, audiobooks);
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

	public static int recordInputOptions(Scanner in)
	{
		System.out.println();
		System.out.println("Record Input Options:");
		System.out.println("1 - Album");
		System.out.println("2 - Audiobook");
		System.out.println("3 - Movie");
		System.out.println("4 - Order");
		System.out.println("5 - Patron");
		System.out.println("6 - Librarian");
		System.out.print("Please choose a record to add: ");
		int recordNum = in.nextInt();
		System.out.println();

		return recordNum;
	}

	public static List<Object> itemAttributes(Scanner in, List<Object> list)
	{
		in.nextLine();

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
