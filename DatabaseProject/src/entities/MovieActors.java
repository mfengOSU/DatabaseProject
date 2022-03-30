package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MovieActors {
	private static String INSERT = "INSERT INTO Movie_Actors VALUES (?, ?);";
	private static String DELETE = "DELETE FROM Movie_Actors WHERE ActorId=? AND MovieNo=?;";
	private static String UPDATE = "UPDATE Movie_Actors SET ActorId=?, MovieNo=? WHERE ActorId=? AND MovieNo=?;";

	public static void insertIntoMovieActors(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(INSERT);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully inserted actors with movies into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with inserting actors with movies into database");
    	} 
	}
	
	public static void deleteFromMovieActors(Connection conn, List<Object> list) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(DELETE);
    		stmt.setInt(1, (int) list.get(0));
    		stmt.setInt(2, (int) list.get(1));
    		stmt.executeUpdate();
    		System.out.println("Successfully deleted actor from movie from database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with deleting actor from movie from database");
    	} 
	}
}
