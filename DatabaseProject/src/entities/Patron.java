package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Patron {

	private static String INSERT = "INSERT INTO Patron VALUES (?, ?, ?, ?, ?, ?);";
	private static String DELETE = "DELETE FROM Patron WHERE PatronId=?;";
	private static String UPDATE = "UPDATE Patron SET PatronId=?, LibraryCardNo=?, FName=?, LName=?, Address=?, Email=? WHERE PatronId=?;";

	public static void insertIntoPatron(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.setString(3, list.get(2).toString());
    		stmt.setString(4, list.get(3).toString());
    		stmt.setString(5, list.get(4).toString());
    		stmt.setString(6, list.get(5).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new patron into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new patron into database");
    	} 
	}
	
	public static void deleteFromPatron(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted patron from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting patron from database");
    	} 
	}

}