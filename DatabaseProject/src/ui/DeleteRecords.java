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
import entities.Item;
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

public class DeleteRecords {
	public static void deleteARecord(Connection conn, Scanner in, int recordNum) {
		
		List<Object> list = new ArrayList<Object> ();
		
		switch(recordNum){
		case 1: //Artist
			System.out.println();
			Main.queryAllRows(conn, "Artist");
			System.out.println("Enter artist id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Artist.deleteFromArtist(conn, list);
			break;
		case 2: //Album
			System.out.println();
			Main.queryAllRows(conn, "Album");
			System.out.println("Enter album # to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Album.deleteFromAlbum(conn, list);
			Item.deleteFromItem(conn, list);
			break;
		case 3: //Track
			System.out.println();
			Main.queryAllRows(conn, "Track");
			System.out.println("Enter album id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			System.out.println("Enter track title to delete: ");
			list.add(in.nextLine());
			Track.deleteFromTrack(conn, list);
			break;
		case 4: //Actor
			System.out.println();
			Main.queryAllRows(conn, "Actor");
			System.out.println("Enter actor id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Actor.deleteFromActor(conn, list);
			break;
		case 5: //Movie
			System.out.println();
			Main.queryAllRows(conn, "Movie");
			System.out.println("Enter movie # to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Movie.deleteFromMovie(conn, list);
			Item.deleteFromItem(conn, list);
			break;
		case 6: //Actor's movies
			System.out.println();
			Main.queryAllRows(conn, "Movie_Actors");
			System.out.println("Enter actor id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			System.out.println("Enter movie # to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			MovieActors.deleteFromMovieActors(conn, list);
			break;
		case 7: //Author
			System.out.println();
			Main.queryAllRows(conn, "Author");
			System.out.println("Enter author id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Author.deleteFromAuthor(conn, list);
			break;
		case 8: //Narrator
			System.out.println();
			Main.queryAllRows(conn, "Narrator");
			System.out.println("Enter narrator id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Narrator.deleteFromNarrator(conn, list);
			break;
		case 9: //book
			System.out.println();
			Main.queryAllRows(conn, "Audiobook");
			System.out.println("Enter book # to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Audiobook.deleteFromBook(conn, list);
			break;
		case 10: //patron
			System.out.println();
			Main.queryAllRows(conn, "Patron");
			System.out.println("Enter patron id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Patron.deleteFromPatron(conn, list);
			break;
		case 11: //library card
			System.out.println();
			Main.queryAllRows(conn, "Library_Card");
			System.out.println("Enter library card # to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			LibraryCard.deleteFromLibraryCard(conn, list);
			break;
		case 12: //patron's returns
			System.out.println();
			Main.queryAllRows(conn, "Patron_Returns");
			System.out.println("Enter patron id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			System.out.println("Enter item # to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			PatronReturns.deleteFromReturns(conn, list);
			break;
		case 13: //patron's checkouts
			System.out.println();
			Main.queryAllRows(conn, "Patron_Checkouts");
			System.out.println("Enter patron id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			System.out.println("Enter item # to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			PatronCheckouts.deleteFromCheckouts(conn, list);
			break;
		case 14: //library
			System.out.println();
			Main.queryAllRows(conn, "Library");
			System.out.println("Enter city to delete: ");
			list.add(in.nextLine());
			System.out.println("Enter state to delete: ");
			list.add(in.nextLine());
			Library.deleteFromLibrary(conn, list);
			break;
		case 15: //librarian
			System.out.println();
			Main.queryAllRows(conn, "Librarian");
			System.out.println("Enter librarian id to delete: ");
			list.add(in.nextInt());
			in.nextLine();
			Librarian.deleteFromLibrarian(conn, list);
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
