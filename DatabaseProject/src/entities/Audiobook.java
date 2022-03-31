package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Audiobook {

	private static String INSERT = "INSERT INTO Audiobook VALUES (?, ?, ?, ?, ?);";
	private static String DELETE = "DELETE FROM Audiobook WHERE BookNo=?;";
	private static String UPDATE = "UPDATE Audiobook SET Length=?, Chapters=? WHERE BookNo=?;";
	private static String SEARCH = "SELECT Item.Title FROM Audiobook, Item WHERE Item.ItemNo=Audiobook.BookNo AND Audiobook.BookNo = ?;";

	public static void insertIntoBook(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.setInt(3, (int) list.get(2));
    		stmt.setInt(4, (int) list.get(3));
    		stmt.setInt(5, (int) list.get(4));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new audiobook into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new audiobook into database");
    	} 
	}
	public static void deleteFromBook(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted book from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting book from database");
    	} 
	}

	public static void updateBook(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(UPDATE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.setInt(3, (int) list.get(2));
    		stmt.executeUpdate();
    		System.out.println("Successfully updated book in database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with updating book in database");
    	} 
	}
	
	public static void search(Connection conn, List<Object> list) {
		try {
			PreparedStatement stmt = conn.prepareStatement(SEARCH);
			stmt.setInt(1, (int) list.get(0));
			ResultSet rSet = stmt.executeQuery();
			while (rSet.next()) {
				System.out.println(rSet.getString("Title"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error with searching records");
		}
	}
	  

}
