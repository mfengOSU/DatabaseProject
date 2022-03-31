package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Narrator {
	private static String INSERT = "INSERT INTO Narrator VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Narrator WHERE NarratorId=?;";
	private static String UPDATE = "UPDATE Narrator SET Name=? WHERE NarratorId=?;";
	private static String SEARCH = "SELECT Name FROM Narrator WHERE NarratorId=?";

	public static void insertIntoNarrator(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new narrator into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new narrator into database");
    	} 
	}
	
	public static void deleteFromNarrator(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted narrator from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting narrator from database");
    	} 
	}
	
	public static void updateFromNarrator(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(UPDATE);
    		stmt.setString(1, list.get(0).toString());
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully updated narrator in database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with updated narrator in database");
    	} 
	}
	
}
