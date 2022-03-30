package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Artist {
	private static String INSERT = "INSERT INTO Artist VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Artist WHERE ArtistId=?;";
	private static String UPDATE = "UPDATE Artist SET ArtistId=?, Name=? WHERE ArtistId=?;";

	public static void insertIntoArtist(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new artist into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new artist into database");
    	} 
	}
	
	public static void deleteFromArtist(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted artist from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting artist from database");
    	} 
	}
	
	
}
