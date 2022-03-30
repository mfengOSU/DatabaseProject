package entities;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class LibraryOrder {
	private static String INSERT = "INSERT INTO Library_Order VALUES (?, ?, ?, ?, ?, ?);";
	private static String DELETE = "DELETE FROM Library_Order WHERE ItemNo=? AND City=? AND State=?;";
	private static String UPDATE = "UPDATE Library_Order SET ArrivalDate=?, Price=?, Copies=? WHERE ItemNo=? AND City=? AND State=?;";

	public static void insertIntoLibraryOrder(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.setString(3, list.get(2).toString());
    		stmt.setDate(4, Date.valueOf(list.get(3).toString()));
    		stmt.setDouble(5, Double.parseDouble(list.get(4).toString()));
    		stmt.setInt(6, (int) list.get(5));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new library order into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new library order into database");
    	} 
	}
	
	public static void deleteFromLibraryOrder(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.setString(3, list.get(2).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted library order from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting library order from database");
    	} 
	}
	
	public static void updateIntoLibraryOrder(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(UPDATE);
    
    		stmt.setDate(1, Date.valueOf(list.get(0).toString()));
    		stmt.setDouble(2, Double.parseDouble(list.get(1).toString()));
    		stmt.setInt(3, (int) list.get(2));
    		stmt.setInt(4, (int) list.get(3));
    		stmt.setString(5, list.get(4).toString());
    		stmt.setString(6, list.get(5).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully updated library order into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with updating library order into database");
    	} 
	}
	
	
}
