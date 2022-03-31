package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Report {
	private static String sql = "";
	private static int intInput;
	private static String strInput;
	public static void getReport(Connection conn, Scanner in, int recordNum) {
		switch (recordNum) {
		case 1:
			sql = "SELECT COUNT(*)\n"
					+ "FROM ITEM, PATRON, PATRON_CHECKOUTS\n"
					+ "WHERE PATRON_CHECKOUTS.ItemNo = Item.ItemNo AND\n"
					+ "    PATRON.PatronId = PATRON_CHECKOUTS.PatronId AND\n"
					+ "    PATRON.PatronId = ?;";
			System.out.println("Enter a patron id: ");
			intInput = in.nextInt();
			in.nextLine();
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setInt(1, intInput);
	    		ResultSet rSet = stmt.executeQuery();
	    		ResultSetMetaData rsmd = rSet.getMetaData();
	        	int columnCount = rsmd.getColumnCount();
				System.out.print("\n");
	    		while (rSet.next()) {
	    			for (int i = 1; i <= columnCount; i++) {
	        			int columnValue = rSet.getInt(i);
	            		System.out.print("Number of checkouts: " +  columnValue);
	            		if (i < columnCount) System.out.print(",  ");
	        		}
	    			System.out.println("\n");
	    		}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			sql = "SELECT Actor.Name\n"
					+ "FROM Actor, Movie_Actors, Movie, Item, Library_Order\n"
					+ "WHERE Item.ItemNo = Movie.MovieNo AND\n"
					+ "Library_Order.ItemNo = Movie.MovieNo AND\n"
					+ "Actor.ActorId = Movie_Actors.ActorId AND\n"
					+ "Movie_Actors.MovieNo = Movie.MovieNo AND\n"
					+ "(Item.Status = 'INVENTORY' OR Item.Status = 'ORDER')\n"
					+ "GROUP BY Actor.Name\n"
					+ "ORDER BY Sum(Library_Order.Copies) DESC\n"
					+ "LIMIT 1;";
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
	    		ResultSet rSet = stmt.executeQuery();
	    		
				System.out.print("\n");
	    		while (rSet.next()) {
	    			System.out.print("Most Popular Actor: " + rSet.getString("Name"));
	    			System.out.println("\n");
	    		}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			sql = "SELECT Artist.Name\n"
					+ "FROM Item, Album, Artist, Track, Library_Order\n"
					+ "WHERE Item.ItemNo = Album.AlbumNo AND\n"
					+ "Album.ArtistId = Artist.ArtistId  AND\n"
					+ "Track.AlbumNo = Album.AlbumNo AND\n"
					+ "Library_Order.ItemNo = Album.AlbumNo AND\n"
					+ "(Item.Status = 'INVENTORY' OR Item.Status = 'ORDER')\n"
					+ "GROUP BY Artist.ArtistId\n"
					+ "ORDER BY Sum(Track.Length) * Library_Order.Copies DESC\n"
					+ "LIMIT 1;";
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
	    		ResultSet rSet = stmt.executeQuery();
	    		
				System.out.print("\n");
	    		while (rSet.next()) {
	    			System.out.print("Most Popular Artist: " + rSet.getString("Name"));
	    			System.out.println("\n");
	    		}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			sql = "SELECT Author.Name\n"
					+ "FROM Item, Audiobook, Author, Library_Order\n"
					+ "WHERE Item.ItemNo = Audiobook.BookNo AND\n"
					+ "Author.AuthorId = Audiobook.AuthorId  AND\n"
					+ "Library_Order.ItemNo = Audiobook.BookNo AND\n"
					+ "(Item.Status = 'INVENTORY' OR Item.Status = 'ORDER')\n"
					+ "GROUP BY Author.AuthorId\n"
					+ "ORDER BY Sum(Audiobook.Length) * Library_Order.Copies DESC\n"
					+ "LIMIT 1;";
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
	    		ResultSet rSet = stmt.executeQuery();
	    		
				System.out.print("\n");
	    		while (rSet.next()) {
	    			System.out.print("Most Popular Author: " + rSet.getString("Name"));
	    			System.out.println("\n");
	    		}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 5:
			sql = "SELECT PATRON.FName, PATRON.LName, COUNT(*) as NumberCheckedOut\n"
					+ "FROM ITEM, PATRON, PATRON_CHECKOUTS, MOVIE\n"
					+ "WHERE \n"
					+ "    ITEM.ItemNo = Movie.MovieNo AND\n"
					+ "    PATRON_CHECKOUTS.ItemNo = Movie.MovieNo AND\n"
					+ "    PATRON.PatronId = PATRON_CHECKOUTS.PatronId \n"
					+ "GROUP BY PATRON.PatronId\n"
					+ "ORDER BY NumberCheckedOut DESC\n"
					+ "LIMIT 1;";
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
	    		ResultSet rSet = stmt.executeQuery();
	    		
				System.out.print("\n");
	    		while (rSet.next()) {
	    			System.out.print(rSet.getString("FName") + " " 
	    					+ rSet.getString("LName") + ", " +
	    					rSet.getInt("NumberCheckedOut"));
	    			System.out.println("\n");
	    		}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 6:
			sql = "SELECT TRACK.Title\n"
					+ "FROM TRACK\n"
					+ "WHERE (TRACK.AlbumNo, TRACK.Title) IN (\n"
					+ "    SELECT TRACK.AlbumNo, TRACK.Title\n"
					+ "    FROM TRACK, ITEM, ALBUM, ARTIST\n"
					+ "    WHERE ITEM.ItemNo = ALBUM.AlbumNo AND\n"
					+ "    ALBUM.AlbumNo = TRACK.AlbumNo AND\n"
					+ "    ALBUM.ArtistId = ARTIST.ArtistId AND\n"
					+ "    ARTIST.Name = ? AND\n"
					+ "    ITEM.Year < ?\n"
					+ ");\n";
			System.out.println("Enter artist name: ");
			strInput = in.nextLine();
			System.out.println("Enter a year: ");
			intInput = in.nextInt();
			in.nextLine();
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1, strInput);
				stmt.setInt(2, intInput);
	    		ResultSet rSet = stmt.executeQuery();
	    		ResultSetMetaData rsmd = rSet.getMetaData();
	        	int columnCount = rsmd.getColumnCount();
				System.out.print("\n");
	    		while (rSet.next()) {
	    			for (int i = 1; i <= columnCount; i++) {
	        			String columnValue = rSet.getString(i);
	            		System.out.print("Track title: " + columnValue);
	            		if (i < columnCount) System.out.print(",  ");
	        		}
	    			System.out.println("\n");
	    		}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	}
}
