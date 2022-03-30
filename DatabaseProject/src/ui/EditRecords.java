package ui;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Actor;
import entities.Artist;
import entities.Audiobook;
import entities.Author;
import entities.Item;
import entities.Librarian;
import entities.LibraryCard;
import entities.Movie;
import entities.Narrator;
import entities.Patron;
import entities.PatronCheckouts;
import entities.Track;

public class EditRecords {
	public static void editARecord(Connection conn, Scanner in, int recordNum) {
		
		List<Object> updatelist = new ArrayList<Object> ();
		List<Object> list = new ArrayList<Object> ();
		
		switch(recordNum){
		case 1: //Artist
			System.out.println();
			Main.queryAllRows(conn, "Artist");
			System.out.println("Enter artist id to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updateartistAttributes(in);
			list.addAll(updatelist);
			Artist.updateFromArtist(conn, list);
			break;
		case 2: //Album
			System.out.println();
			Main.queryAllRows(conn, "Album");
			System.out.println("Enter album # to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updateitemAttributes(in);
			list.addAll(updatelist);
			Item.updateItem(conn, list);
			break;
		case 3: //Track
			System.out.println();
			Main.queryAllRows(conn, "Track");
			System.out.println("Enter album # to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			System.out.println("Enter track title to update: ");
			updatelist.add(in.nextLine());
			list = PromptInput.updatetrackAttributes(in);
			list.addAll(updatelist);
			Track.updateTrack(conn, list);
			break;
		case 4: //Actor
			System.out.println();
			Main.queryAllRows(conn, "Actor");
			System.out.println("Enter actor id to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updateactorAttributes(in);
			list.addAll(updatelist);
			Actor.updateFromActor(conn, list);
			break;
		case 5: //Movie
			System.out.println();
			Main.queryAllRows(conn, "Movie");
			System.out.println("Enter movie # to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updateitemAttributes(in);
			List<Object> movieList = PromptInput.updatemovieAttributes(in);
			movieList.addAll(updatelist);
			list.addAll(updatelist);
			int ret = Item.updateItem(conn, list);
			if (ret == 0) {
				Movie.updateMovie(conn, movieList);
			}
			
			break;
		case 6: //Author
			System.out.println();
			Main.queryAllRows(conn, "Author");
			System.out.println("Enter author id to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updateauthorAttributes(in);
			list.addAll(updatelist);
			Author.updateFromAuthor(conn, list);
			break;
		case 7: //Narrator
			System.out.println();
			Main.queryAllRows(conn, "Narrator");
			System.out.println("Enter narrator id to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updatenarratorAttributes(in);
			list.addAll(updatelist);
			Narrator.updateFromNarrator(conn, list);
			break;
		case 8: //book
			System.out.println();
			Main.queryAllRows(conn, "Audiobook");
			System.out.println("Enter book # to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updateitemAttributes(in);
			List<Object> bookList = PromptInput.updatebookAttributes(in);
			bookList.addAll(updatelist);
			list.addAll(updatelist);
			ret = Item.updateItem(conn, list);
			if (ret == 0) {
				Audiobook.updateBook(conn, bookList);
			}
			
			break;
		case 9: //patron
			System.out.println();
			Main.queryAllRows(conn, "Patron");
			System.out.println("Enter patron id to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updatepatronAttributes(in);
			list.addAll(updatelist);
			Patron.updatePatron(conn, list);
			break;
		case 10: //library card
			System.out.println();
			Main.queryAllRows(conn, "Library_Card");
			System.out.println("Enter library card # to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updatelibraryCardAttributes(in);
			list.addAll(updatelist);
			LibraryCard.updateLibraryCard(conn, list);
			break;
		case 11: //patron's checkouts
			System.out.println();
			Main.queryAllRows(conn, "Patron_Checkouts");
			System.out.println("Enter patron id to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			System.out.println("Enter item # to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updatepatronCheckoutsAttributes(in);
			list.addAll(updatelist);
			PatronCheckouts.updatePatronCheckouts(conn, list);
			break;
		case 12: //librarian
			System.out.println();
			Main.queryAllRows(conn, "Librarian");
			System.out.println("Enter librarian id to update: ");
			updatelist.add(in.nextInt());
			in.nextLine();
			list = PromptInput.updatelibrarianAttributes(in);
			list.addAll(updatelist);
			Librarian.updateFromLibrarian(conn, list);
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
