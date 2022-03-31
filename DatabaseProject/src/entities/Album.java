package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Album {
	private static String INSERT = "INSERT INTO Album VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Album WHERE AlbumNo=?;";
	//private static String UPDATE = "UPDATE Album SET AlbumNo=?, ArtistId=? WHERE AlbumNo=?;";
	private static String SEARCH = "SELECT Item.Title FROM Album, Item WHERE Item.ItemNo=Album.AlbumNo AND Album.AlbumNo = ?;";

	public static void insertIntoAlbum(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new album into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new album into database");
    	} 
	}
	
	public static void deleteFromAlbum(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted album from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting album from database");
    	} 
	}
	
	public static void search(Connection conn, List<Object> list) {
		try {
			PreparedStatement stmt = conn.prepareStatement(SEARCH);
			stmt.setInt(1, (int) list.get(0));
			ResultSet rSet = stmt.executeQuery();
			while (rSet.next()) {
				System.out.println(rSet.getString("Title"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error with searching records");
		}
	}
	
}
