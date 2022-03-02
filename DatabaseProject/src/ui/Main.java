package ui;

import java.util.Scanner;

import entities.*;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int recordNum;
		Map<Integer, Object> albums = new HashMap<Integer, Object>();
		Map<Integer, Object> audiobooks = new HashMap<Integer, Object>();
		Map<Integer, Object> movies = new HashMap<Integer, Object>();
		Map<Integer, Object> orders = new HashMap<Integer, Object>();
		Map<Integer, Object> patrons = new HashMap<Integer, Object>();
		Map<Integer, Object> librarians = new HashMap<Integer, Object>();
		
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

				recordNum = recordOptions(in);
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
				recordNum = recordOptions(in);
				Integer id;
				String attr;
				
				switch(recordNum)
				{
					case 1:
						System.out.println();
						System.out.print("Please enter an item number: ");
						id = Integer.valueOf(in.nextInt());
						System.out.println();
						in.nextLine();
						
						System.out.print("Please enter attribute to edit: ");
						attr = in.nextLine();
						
						albums.get(id);
						break;
					case 2:
						System.out.println();
						System.out.print("Please enter an item number: ");
						id = Integer.valueOf(in.nextInt());
						System.out.println();
						in.nextLine();
						
						break;
					case 3:
						System.out.println();
						System.out.print("Please enter an item number: ");
						id = Integer.valueOf(in.nextInt());
						System.out.println();
						in.nextLine();
						
						break;
					case 4:
						System.out.println();
						System.out.print("Please enter an order number: ");
						id = Integer.valueOf(in.nextInt());
						System.out.println();
						in.nextLine();
						
						break;
					case 5:
						System.out.println();
						System.out.print("Please enter an patron number: ");
						id = Integer.valueOf(in.nextInt());
						System.out.println();
						in.nextLine();
						
						break;
					case 6:
						System.out.println();
						System.out.print("Please enter an librarian number: ");
						id = Integer.valueOf(in.nextInt());
						System.out.println();
						in.nextLine();
						
						break;
					default:
						System.out.println("Invalid Input");
						break;
				}
				
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

	public static int recordOptions(Scanner in)
	{
		System.out.println();
		System.out.println("Record Options:");
		System.out.println("1 - Album");
		System.out.println("2 - Audiobook");
		System.out.println("3 - Movie");
		System.out.println("4 - Order");
		System.out.println("5 - Patron");
		System.out.println("6 - Librarian");
		System.out.print("Please choose a record: ");
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