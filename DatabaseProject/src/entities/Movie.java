package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Movie {
	private static String INSERT = "INSERT INTO Movie VALUES (?, ?, ?);";
	private static String DELETE = "DELETE FROM Movie WHERE MovieNo=?;";
	private static String UPDATE = "UPDATE Movie SET Length=?, Director=? WHERE MovieNo=?;";

	public static void insertIntoMovie(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.setString(3, list.get(2).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new movie into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new movie into database");
    	} 
	}
	
	public static void deleteFromMovie(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted movie from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting movie from database");
    	} 
	}
	

	public static void updateMovie(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(UPDATE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.setInt(3, (int) list.get(2));    		
    		stmt.executeUpdate();
    		System.out.println("Successfully updated movie into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with updating movie into database");
    	} 
	}
	
}