package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Author {
	private static String INSERT = "INSERT INTO Author VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Author WHERE AuthorId=?;";
	private static String UPDATE = "UPDATE Author SET AuthorId=?, Name=? WHERE AuthorId=?;";

	public static void insertIntoAuthor(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new author into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new author into database");
    	} 
	}
	
	public static void deleteFromAuthor(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted author from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting author from database");
    	} 
	}
	
}
