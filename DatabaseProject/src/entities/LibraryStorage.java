package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class LibraryStorage {
	private static String INSERT = "INSERT INTO Library_Storage VALUES (?, ?, ?);";
	private static String DELETE = "DELETE FROM Library_Storage WHERE ItemNo=? AND City=? AND State=?;";
	//private static String UPDATE = "UPDATE Library_Storage SET ItemNo=?, City=?, State=? WHERE ItemNo=? AND City=? AND State=?;";

	public static void insertIntoLibraryStorage(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.setString(3, list.get(2).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new library storage item into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new library storage item into database");
    	} 
	}
	
	public static void deleteFromLibraryStorage(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.setString(3, list.get(2).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted library storage item from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting library storage item from database");
    	} 
	}
}
