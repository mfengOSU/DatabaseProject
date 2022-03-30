package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Track {
	private static String INSERT = "INSERT INTO Track VALUES (?, ?, ?);";
	private static String DELETE = "DELETE FROM Track WHERE AlbumNo=? AND Title=?;";
	private static String UPDATE = "UPDATE Track SET AlbumNo=?, Title=?, Length=? WHERE AlbumNo=? AND Title=?;";

	public static void insertIntoTrack(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.setInt(3, (int) list.get(2));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new track into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new track into database");
    	} 
	}
	
	public static void deleteFromTrack(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted track from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting track from database");
    	} 
	}

}
