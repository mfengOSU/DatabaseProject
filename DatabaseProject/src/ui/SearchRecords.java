package ui;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchRecords {
	public static void addARecord(Connection conn, Scanner in, int recordNum) {
		List<Object> list = new ArrayList<Object> ();
		
		switch(recordNum){
		case 1: //Artist
			System.out.println();
			System.out.println("Enter artist id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 2: //Album
			System.out.println();	
			System.out.println("Enter album number to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 3: //Track
			System.out.println();
			System.out.println();	
			System.out.println("Enter track length to get tracks with length smaller than input: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 4: //Actor
			System.out.println();
			System.out.println("Enter actor id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 5: //Movie
			System.out.println();
			System.out.println("Enter movie number to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 6: //Actor's movies
			System.out.println();
			System.out.println("Enter movie number to get all actors in the movie: ");
			list.add(in.nextInt());
			in.nextLine();

			break;
		case 7: //Author
			System.out.println();
			System.out.println("Enter author id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 8: //Narrator
			System.out.println();
			System.out.println("Enter narrator id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 9: //book
			System.out.println();
			System.out.println("Enter book number to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 10: //patron
			System.out.println();
			System.out.println("Enter patron id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 11: //library card
			System.out.println();
			System.out.println("Enter true or false to get all library cards that are active or inactive: ");
			list.add(in.nextBoolean());
			in.nextLine();
			
			break;
		case 12: //patron's returns
			System.out.println();
			System.out.println("Enter item number to get item title of a returned item: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 13: //patron's checkouts
			System.out.println();
			System.out.println("Enter item number to get due date of checked out item: ");
			list.add(in.nextInt());
			in.nextLine();
			
			break;
		case 14: //library
			System.out.println();
			System.out.println("Enter a state to get all libraries in that state: ");
			list.add(in.nextLine());
			
			break;
		case 15: //librarian
			System.out.println();
			System.out.println("Enter salary to get all librarians with greater salary: ");
			list.add(in.nextDouble());
			in.nextLine();
			
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
