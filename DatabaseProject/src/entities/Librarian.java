package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Librarian {
	private static String INSERT = "INSERT INTO Librarian VALUES (?, ?, ?, ?, ?);";
	private static String DELETE = "DELETE FROM Librarian WHERE LibrarianId=?;";
	private static String UPDATE = "UPDATE Librarian SET City=?, State=?, Name=?, Salary=? WHERE LibrarianId=?;";

	public static void insertIntoLibrarian(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.setString(3, list.get(2).toString());
    		stmt.setString(4, list.get(3).toString());
    		stmt.setDouble(5, Double.parseDouble(list.get(4).toString()));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new Librarian into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new Librarian into database");
    	} 
	}
	
	public static void deleteFromLibrarian(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted Librarian from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting librarian from database");
    	} 
	}
	
	public static void updateFromLibrarian(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(UPDATE);
    		stmt.setString(1, list.get(0).toString());
    		stmt.setString(2, list.get(1).toString());
    		stmt.setString(3, list.get(2).toString());
    		stmt.setDouble(4, (double) list.get(3));
    		stmt.setInt(5, (int) list.get(4));
    		stmt.executeUpdate();
    		System.out.println("Successfully updated librarian in database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with updated librarian in database");
    	} 
	}
	

}