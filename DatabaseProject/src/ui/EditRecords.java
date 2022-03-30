package ui;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditRecords {
	public static void editARecord(Connection conn, Scanner in, int recordNum) {
		
		List<Object> list = new ArrayList<Object> ();
		
		switch(recordNum){
		case 1: //Artist
			System.out.println();
			Main.queryAllRows(conn, "Artist");
			break;
		case 2: //Album
			System.out.println();
			Main.queryAllRows(conn, "Album");
		
			break;
		case 3: //Track
			System.out.println();
			Main.queryAllRows(conn, "Track");

			break;
		case 4: //Actor
			System.out.println();
			Main.queryAllRows(conn, "Actor");

			break;
		case 5: //Movie
			System.out.println();
			Main.queryAllRows(conn, "Movie");

			
			break;
		case 6: //Actor's movies
			System.out.println();
			Main.queryAllRows(conn, "Movie_Actors");

			break;
		case 7: //Author
			System.out.println();
			Main.queryAllRows(conn, "Author");

			break;
		case 8: //Narrator
			System.out.println();
			Main.queryAllRows(conn, "Narrator");

			break;
		case 9: //book
			System.out.println();
			Main.queryAllRows(conn, "Audiobook");

			break;
		case 10: //patron
			System.out.println();
			Main.queryAllRows(conn, "Patron");

			break;
		case 11: //library card
			System.out.println();
			Main.queryAllRows(conn, "Library_Card");

			break;
		case 12: //patron's returns
			System.out.println();
			Main.queryAllRows(conn, "Patron_Returns");

			break;
		case 13: //patron's checkouts
			System.out.println();
			Main.queryAllRows(conn, "Patron_Checkouts");

			break;
		case 14: //library
			System.out.println();
			Main.queryAllRows(conn, "Library");

			break;
		case 15: //librarian
			System.out.println();
			Main.queryAllRows(conn, "Librarian");

			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
