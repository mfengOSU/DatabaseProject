package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

public class PatronCheckouts {
	private static String INSERT = "INSERT INTO Patron_Checkouts VALUES (?, ?, ?);";
	private static String DELETE = "DELETE FROM Patron_Checkouts WHERE PatronId=? AND ItemNo=?;";
	private static String UPDATE = "UPDATE Patron_Checkouts SET DueDate=? WHERE PatronId=? AND ItemNo=?;";
	private static String SEARCH = "SELECT DueDate FROM Patron_Checkouts, Item WHERE Patron_Checkouts.ItemNo=Item.ItemNo AND Item.ItemNo=?";

	public static void insertIntoPatronCheckouts(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.setString(3, list.get(2).toString());
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
	public static void updatePatronCheckouts(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(UPDATE);

    		stmt.setString(1, list.get(0).toString());
    		stmt.setInt(2, (int) list.get(1));
    		stmt.setInt(3, (int) list.get(2));
    		stmt.executeUpdate();
    		System.out.println("Successfully updated patron checkout item into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with  updating patron checkout item into database");
    	} 
	}
	
	public static void search(Connection conn, List<Object> list) {
		try {
			PreparedStatement stmt = conn.prepareStatement(SEARCH);
			stmt.setInt(1, (int) list.get(0));
			ResultSet rSet = stmt.executeQuery();
			while (rSet.next()) {
				System.out.println(rSet.getString("DueDate"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error with searching records");
		}
	}

}
