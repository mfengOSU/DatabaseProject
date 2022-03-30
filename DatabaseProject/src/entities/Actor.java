package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Actor {
	private static String INSERT = "INSERT INTO Actor VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Actor WHERE ActorId=?;";
	private static String UPDATE = "UPDATE Actor SET Name=? WHERE ActorId=?;";

	public static void insertIntoActor(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setString(2, list.get(1).toString());
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted new actor into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting new actor into database");
    	} 
	}
	
	public static void deleteFromActor(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted actor from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting actor from database");
    	} 
	}
	
	public static void updateFromActor(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(UPDATE);
    		stmt.setString(1, list.get(0).toString());
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully updated actor in database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with updated actor in database");
    	} 
	}
	
}
