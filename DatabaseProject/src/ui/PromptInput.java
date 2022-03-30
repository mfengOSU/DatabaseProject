package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromptInput {
	public static int recordInputOptions(Scanner in, String text)
	{
		System.out.println();
		System.out.println("Record Input Options:");
		System.out.println("1 - Artist");
		System.out.println("2 - Album");
		System.out.println("3 - Track");
		System.out.println("4 - Actor");
		System.out.println("5 - Movie");
		System.out.println("6 - Actor's Movies");
		System.out.println("7 - Author");
		System.out.println("8 - Narrator");
		System.out.println("9 - Book");
		System.out.println("10 - Patron");
		System.out.println("11 - Library Card");
		System.out.println("12 - Patron's Return Items");
		System.out.println("13 - Patron's Checkout Items");
		System.out.println("14 - Library");
		System.out.println("15 - Librarian");
		System.out.print(text);
		int recordNum = in.nextInt();
		in.nextLine();
		System.out.println();

		return recordNum;
	}
	
	public static int recordUpdateOptions(Scanner in, String text)
	{
		System.out.println();
		System.out.println("Record Update Options:");
		System.out.println("1 - Artist");
		System.out.println("2 - Album");
		System.out.println("3 - Track");
		System.out.println("4 - Actor");
		System.out.println("5 - Movie");
		System.out.println("6 - Author");
		System.out.println("7 - Narrator");
		System.out.println("8 - Book");
		System.out.println("9 - Patron");
		System.out.println("10 - Library Card");
		System.out.println("11 - Patron's Checkout Items");
		System.out.println("12 - Librarian");
		System.out.print(text);
		int recordNum = in.nextInt();
		in.nextLine();
		System.out.println();

		return recordNum;
	}
	
	public static int orderOptions(Scanner in, String text)
	{
		System.out.println();
		System.out.println("Order Options:");
		System.out.println("1 - Album");
		System.out.println("2 - Movie");
		System.out.println("3 - Book");
		System.out.print(text);
		int recordNum = in.nextInt();
		in.nextLine();
		System.out.println();

		return recordNum;
	}
	
	public static int reportOptions(Scanner in, String text)
	{
		System.out.println();
		System.out.println("Report Options:");
		System.out.println("1 - Get Patron Checkouts");
		System.out.println("2 - Get Most Popular Actor");
		System.out.println("3 - Get Most Popular Artist");
		System.out.println("4 - Get Most Popular Author");
		System.out.println("5 - Get patron who checked out most movies and number of movies checked out");
		System.out.println("6 - Get tracks by artist released before year");
		System.out.print(text);
		int recordNum = in.nextInt();
		in.nextLine();
		System.out.println();

		return recordNum;
	}

	public static List<Object> itemAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Item Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		System.out.print("Copy Type (E or P): ");
		list.add(in.nextLine().toUpperCase());
		System.out.println();
		
		System.out.print("Rating: ");
		list.add((int) in.nextInt());
		in.nextLine();
		System.out.println();

		System.out.print("Title: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Year: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		System.out.print("Genre: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}

	public static List<Object> albumAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();

		System.out.print("Artist Id: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		return list;
	}
	
	public static List<Object> artistAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Artist Id: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Artist Name: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}

	public static List<Object> trackAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Album Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Track Title: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Length: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		return list;
	}
	
	public static List<Object> authorAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Author Id: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Author Name: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}
	
	public static List<Object> narratorAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Narrator Id: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Narrator Name: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}
	
	public static List<Object> bookAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		

		System.out.print("Number of Pages: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Chapters: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		System.out.print("Author Id: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		System.out.print("Narrator Id: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		return list;
	}
	
	public static List<Object> actorAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Actor Id: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Actor Name: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}
	
	public static List<Object> movieAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Movie Length: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Director Name: ");
		list.add(in.nextLine());
		System.out.println();

		return list;
	}
	
	public static List<Object> movieActorsAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Movie Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Actor Id: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		return list;
	}
	
	public static List<Object> patronAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Patron Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Library Card Number: ");
		list.add((int) in.nextInt());
		in.nextLine();
		System.out.println();
		
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

		return list;
	}
	
	public static List<Object> patronReturnsAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Patron Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Item Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		return list;
	}
	
	public static List<Object> patronCheckoutsAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Patron Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Item Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Due Date (yyyy-mm-dd): ");
		list.add(in.nextLine());
		System.out.println();

		return list;
	}
	
	public static List<Object> libraryCardAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Library Card Number: ");
		list.add((int) in.nextInt());
		in.nextLine();
		System.out.println();
		
		System.out.print("Card Status (Input True for ACTIVE or False for INACTIVE): ");
		list.add(in.nextBoolean());
		in.nextLine();
		System.out.println();

		return list;
	}
	
	public static List<Object> libraryAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();

		System.out.print("City: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("State: ");
		list.add(in.nextLine());
		System.out.println();

		return list;
	}
	
	public static List<Object> librarianAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Librarian Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("City: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("State: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Salary: ");
		list.add(Double.valueOf(in.nextDouble()));
		in.nextLine();
		System.out.println();

		return list;
	}
	
	public static List<Object> orderAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Item Number: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("City of Library: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("State of Library: ");
		list.add(in.nextLine());
		System.out.println();
		
		System.out.print("Arrival Date (yyyy-mm-dd): ");
		list.add(in.nextLine());
		System.out.println();
		
		System.out.print("Price: ");
		list.add(Double.valueOf(in.nextDouble()));
		in.nextLine();
		System.out.println();

		System.out.print("Copies: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		return list;
	}
	
	public static List<Object> updateitemAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Copy Type (E or P): ");
		list.add(in.nextLine().toUpperCase());
		System.out.println();
		
		System.out.print("Rating: ");
		list.add((int) in.nextInt());
		in.nextLine();
		System.out.println();

		System.out.print("Title: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Year: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();

		System.out.print("Genre: ");
		list.add(in.nextLine());
		System.out.println();
		
		System.out.print("Location: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}
	
	public static List<Object> updateartistAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Artist Name: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}

	public static List<Object> updatetrackAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Track Title: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Length: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		return list;
	}
	
	public static List<Object> updateauthorAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Author Name: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}
	
	public static List<Object> updatenarratorAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Narrator Name: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}
	
	public static List<Object> updatebookAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();

		System.out.print("Number of Pages: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Chapters: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		return list;
	}
	
	public static List<Object> updateactorAttributes(Scanner in) {
		List<Object> list = new ArrayList<>();
		
		System.out.print("Actor Name: ");
		list.add(in.nextLine());
		System.out.println();
		
		return list;
	}
	
	public static List<Object> updatemovieAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Movie Length: ");
		list.add(Integer.valueOf(in.nextInt()));
		in.nextLine();
		System.out.println();
		
		System.out.print("Director Name: ");
		list.add(in.nextLine());
		System.out.println();

		return list;
	}
	
	public static List<Object> updatepatronAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
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

		return list;
	}
	
	public static List<Object> updatepatronCheckoutsAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		
		System.out.print("Due Date (yyyy-mm-dd): ");
		list.add(in.nextLine());
		System.out.println();

		return list;
	}
	
	public static List<Object> updatelibraryCardAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();

		System.out.print("Card Status (Input True for ACTIVE or False for INACTIVE): ");
		list.add(in.nextBoolean());
		in.nextLine();
		System.out.println();

		return list;
	}
	
	public static List<Object> updatelibrarianAttributes(Scanner in)
	{
		List<Object> list = new ArrayList<>();
		System.out.print("City: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("State: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Name: ");
		list.add(in.nextLine());
		System.out.println();

		System.out.print("Salary: ");
		list.add(Double.valueOf(in.nextDouble()));
		in.nextLine();
		System.out.println();

		return list;
	}
}
