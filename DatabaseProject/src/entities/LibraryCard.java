package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class LibraryCard {
	private static String INSERT = "INSERT INTO Library_Card VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Library_Card WHERE LibraryCardNo=?;";
	private static String UPDATE = "UPDATE Library_Card SET Active=? WHERE LibraryCardNo=?;";

	public static void insertIntoLibraryCard(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setBoolean(2, (boolean) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new library card into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new library card into database");
    	} 
	}
	
	public static void deleteFromLibraryCard(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted library card from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting library card from database");
    	} 
	}
	
	public static void updateLibraryCard(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(UPDATE);
    		stmt.setBoolean(1, Boolean.valueOf(list.get(0).toString()));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully updated library card in database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with updating library card in database");
    	} 
	}
	
}