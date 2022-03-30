package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Item {
	private static String INSERT = "INSERT INTO Item VALUES (?, ?, ?, ?, ?, ?, NULL, NULL);";
	private static String DELETE = "DELETE FROM Item WHERE ItemNo=?;";
	private static String UPDATE = "UPDATE Item SET ItemNo=?, Type=?, Rating=?, Title=?, Year=?, Genre=?, Location=?, Status=? WHERE ItemNo=?;";

	public static int insertIntoItem(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, String.valueOf(list.get(1)));
    		stmt.setInt(3, (int) list.get(2));
    		stmt.setString(4, String.valueOf(list.get(3)));
    		stmt.setInt(5, (int) list.get(4));
    		stmt.setString(6, String.valueOf(list.get(5)));
    		
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new item into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new item into database");
    		return -1;
    	} 
		return 0;
	}
	
	public static void deleteFromItem(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted item from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting item from database");
    	} 
	}
}
