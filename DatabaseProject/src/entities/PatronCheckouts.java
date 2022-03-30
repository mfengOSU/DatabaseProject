package entities;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PatronCheckouts {
	private static String INSERT = "INSERT INTO Patron_Checkouts VALUES (?, ?, ?);";
	private static String DELETE = "DELETE FROM Patron_Checkouts WHERE PatronId=? AND ItemNo=?;";
	private static String UPDATE = "UPDATE Patron_Checkouts SET PatronId=?, ItemNo=?, DueDate=? WHERE PatronId=? AND ItemNo=?;";

	public static void insertIntoPatronCheckouts(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.setDate(3, Date.valueOf(list.get(2).toString()));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new patron checkout item into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new patron checkout item into database");
    	} 
	}
	public static void deleteFromCheckouts(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted checkout from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting checkout from database");
    	} 
	}

}
