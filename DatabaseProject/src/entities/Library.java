package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Library {
	private static String INSERT = "INSERT INTO Library VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Library WHERE City=? AND State=?;";
	//private static String UPDATE = "UPDATE Library SET City=?, State=? WHERE City=? AND State=?;";

	public static void insertIntoLibrary(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setString(1, list.get(0).toString());
    		stmt.setString(2, list.get(1).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new library into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new library into database");
    	} 
	}
	
	public static void deleteFromLibrary(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setString(1, list.get(0).toString());
    		stmt.setString(2, list.get(1).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted library from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting library from database");
    	} 
	}
	
	
}
