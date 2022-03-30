package entities;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PatronReturns {
	private static String INSERT = "INSERT INTO Patron_Returns VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Patron_Returns WHERE PatronId=? AND ItemNo=?;";
	private static String UPDATE = "UPDATE Patron_Returns SET PatronId=?, ItemNo=? WHERE PatronId=? AND ItemNo=?;";

	public static void insertIntoPatronReturns(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new patron return item into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new patron return item into database");
    	} 
	}
	
	public static void deleteFromReturns(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted returns from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting returns from database");
    	} 
	}
}
