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

public class AddRecords {
	public static void addARecord(Connection conn, Scanner in, int recordNum) {
		List<Object> list = new ArrayList<Object> ();
		List<Object> itemList = new ArrayList<Object> ();

		switch(recordNum){
		case 1: //Artist
			System.out.println();
			list = PromptInput.artistAttributes(in);
			Artist.insertIntoArtist(conn, list);
			break;
		case 2: //Album
			System.out.println();
			itemList = PromptInput.itemAttributes(in);
			list = PromptInput.albumAttributes(in);
			int error = Item.insertIntoItem(conn, itemList);
			if (error == 0) {
				list.add(0, itemList.get(0));
				Album.insertIntoAlbum(conn, list);
			}			
			break;
		case 3: //Track
			System.out.println();
			list = PromptInput.trackAttributes(in);		
			Track.insertIntoTrack(conn, list);
			break;
		case 4: //Actor
			System.out.println();
			list = PromptInput.actorAttributes(in);	
			Actor.insertIntoActor(conn, list);
			break;
		case 5: //Movie
			System.out.println();
			itemList = PromptInput.itemAttributes(in);
			list = PromptInput.movieAttributes(in);
			error = Item.insertIntoItem(conn, itemList);
			if (error == 0) {
				list.add(0, itemList.get(0));
				Movie.insertIntoMovie(conn, list);
			}
			
			break;
		case 6: //Actor's movies
			System.out.println();
			list = PromptInput.movieActorsAttributes(in);
			MovieActors.insertIntoMovieActors(conn, list);
			break;
		case 7: //Author
			System.out.println();
			list = PromptInput.authorAttributes(in);	
			Author.insertIntoAuthor(conn, list);
			break;
		case 8: //Narrator
			System.out.println();
			list = PromptInput.narratorAttributes(in);	
			Narrator.insertIntoNarrator(conn, list);
			break;
		case 9: //book
			System.out.println();
			itemList = PromptInput.itemAttributes(in);	
			list = PromptInput.bookAttributes(in);
			error = Item.insertIntoItem(conn, itemList);
			if (error == 0) {
				list.add(0, itemList.get(0));
				Audiobook.insertIntoBook(conn, list);
			}
			break;
		case 10: //patron
			System.out.println();
			list = PromptInput.patronAttributes(in);	
			Patron.insertIntoPatron(conn, list);
			break;
		case 11: //library card
			System.out.println();
			list = PromptInput.libraryCardAttributes(in);	
			LibraryCard.insertIntoLibraryCard(conn, list);
			break;
		case 12: //patron's returns
			System.out.println();
			list = PromptInput.patronReturnsAttributes(in);	
			PatronReturns.insertIntoPatronReturns(conn, list);
			break;
		case 13: //patron's checkouts
			System.out.println();
			list = PromptInput.patronCheckoutsAttributes(in);	
			PatronCheckouts.insertIntoPatronCheckouts(conn, list);
			break;
		case 14: //library
			System.out.println();
			list = PromptInput.libraryAttributes(in);	
			Library.insertIntoLibrary(conn, list);
			break;
		case 15: //librarian
			System.out.println();
			list = PromptInput.librarianAttributes(in);		
			Librarian.insertIntoLibrarian(conn, list);
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
