package ui;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Actor;
import entities.Album;
import entities.Artist;
import entities.Audiobook;
import entities.Author;
import entities.Librarian;
import entities.Library;
import entities.LibraryCard;
import entities.Movie;
import entities.MovieActors;
import entities.Narrator;
import entities.Patron;
import entities.PatronCheckouts;
import entities.PatronReturns;
import entities.Track;

public class SearchRecords {
	public static void searchRecord(Connection conn, Scanner in, int recordNum) {
		List<Object> list = new ArrayList<Object> ();
		
		switch(recordNum){
		case 1: //Artist
			System.out.println();
			System.out.println("Enter artist id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			Artist.search(conn, list);
			break;
		case 2: //Album
			System.out.println();	
			System.out.println("Enter album number to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			Album.search(conn, list);
			break;
		case 3: //Track
			System.out.println();
			System.out.println();	
			System.out.println("Enter track length to get tracks with length smaller than input: ");
			list.add(in.nextInt());
			in.nextLine();
			Track.search(conn, list);
			break;
		case 4: //Actor
			System.out.println();
			System.out.println("Enter actor id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			Actor.search(conn, list);
			break;
		case 5: //Movie
			System.out.println();
			System.out.println("Enter movie number to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			Movie.search(conn, list);
			break;
		case 6: //Actor's movies
			System.out.println();
			System.out.println("Enter movie number to get all actors in the movie: ");
			list.add(in.nextInt());
			in.nextLine();
			MovieActors.search(conn, list);
			break;
		case 7: //Author
			System.out.println();
			System.out.println("Enter author id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			Author.search(conn, list);
			break;
		case 8: //Narrator
			System.out.println();
			System.out.println("Enter narrator id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			Narrator.search(conn, list);
			break;
		case 9: //book
			System.out.println();
			System.out.println("Enter book number to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			Audiobook.search(conn, list);
			break;
		case 10: //patron
			System.out.println();
			System.out.println("Enter patron id to search for: ");
			list.add(in.nextInt());
			in.nextLine();
			Patron.search(conn, list);
			break;
		case 11: //library card
			System.out.println();
			System.out.println("Enter true or false to get all library cards that are active or inactive: ");
			list.add(in.nextBoolean());
			in.nextLine();
			LibraryCard.search(conn, list);
			break;
		case 12: //patron's returns
			System.out.println();
			System.out.println("Enter item number to get item title of a returned item: ");
			list.add(in.nextInt());
			in.nextLine();
			PatronReturns.search(conn, list);
			break;
		case 13: //patron's checkouts
			System.out.println();
			System.out.println("Enter item number to get due date of checked out item: ");
			list.add(in.nextInt());
			in.nextLine();
			PatronCheckouts.search(conn, list);
			break;
		case 14: //library
			System.out.println();
			System.out.println("Enter a state to get all libraries in that state: ");
			list.add(in.nextLine());
			Library.search(conn, list);
			break;
		case 15: //librarian
			System.out.println();
			System.out.println("Enter salary to get all librarians with greater salary: ");
			list.add(in.nextDouble());
			in.nextLine();
			Librarian.search(conn, list);
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
