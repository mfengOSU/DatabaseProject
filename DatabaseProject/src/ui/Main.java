package ui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;

public class Main {
	/**
	 *  Database file name
	 */
	private static String DATABASE = "libraryMedia.db";
		
	 /**
     * Connects to the database if it exists, creates it if it does not, and returns the connection object.
     * 
     * @param databaseFileName the database file name
     * @return a connection object to the designated database
     */
    public static Connection initializeDB(String databaseFileName) {
    	/**
    	 * The "Connection String" or "Connection URL".
    	 * 
    	 * "jdbc:sqlite:" is the "subprotocol".
    	 * (If this were a SQL Server database it would be "jdbc:sqlserver:".)
    	 */
        String url = "jdbc:sqlite:" + databaseFileName;
        Connection conn = null; // If you create this variable inside the Try block it will be out of scope
        try {
            conn = DriverManager.getConnection(url);
            if (conn != null) {
            	// Provides some positive assurance the connection and/or creation was successful.
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("The connection to the database was successful.");
            } else {
            	// Provides some feedback in case the connection failed but did not throw an exception.
            	System.out.println("Null Connection");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("There was a problem connecting to the database.");
        }
        return conn;
    }
    
    public static void queryAllRows(Connection conn, String tableName) {
		String sql = "SELECT * FROM " + tableName + ";";
    	if (tableName.equalsIgnoreCase("Album")) {
    		sql = "SELECT * FROM Album, Item WHERE Item.ItemNo=Album.AlbumNo;";
    	} else if (tableName.equalsIgnoreCase("Movie")) {
    		sql = "SELECT * FROM Movie, Item WHERE Item.ItemNo=Movie.MovieNo;";
    	} else if (tableName.equalsIgnoreCase("Audiobook")) {
    		sql = "SELECT * FROM Audiobook, Item WHERE Item.ItemNo=Audiobook.BookNo;";
    	}
    	try {
    		PreparedStatement stmt = conn.prepareStatement(sql);
    		ResultSet rSet = stmt.executeQuery();
    		ResultSetMetaData rsmd = rSet.getMetaData();
        	int columnCount = rsmd.getColumnCount();
        	for (int i = 1; i <= columnCount; i++) {
        		String value = rsmd.getColumnName(i);
        		System.out.print(value);
        		if (i < columnCount) System.out.print(",  ");
        	}
			System.out.print("\n");
    		while (rSet.next()) {
    			for (int i = 1; i <= columnCount; i++) {
        			String columnValue = rSet.getString(i);
            		System.out.print(columnValue);
            		if (i < columnCount) System.out.print(",  ");
        		}
    			System.out.println("\n");
    		}
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    	}
    }
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
	
		boolean quit = false;
		int recordNum;
		Connection conn = initializeDB(DATABASE);

		while (!quit) {
			System.out.println("Library Application");
			System.out.println("Choose an option");
			System.out.println("0 - Exit");
			System.out.println("1 - Add a record");
			System.out.println("2 - Delete a record");
			System.out.println("3 - Update a record");
			System.out.println("4 - Search for a record");
			System.out.println("5 - Order an item");
			System.out.println("6 - Generate reports");
			
			int input = in.nextInt();
			in.nextLine();
			
			switch (input) {
			case 0:
				 quit = true;
				 break;
			case 1: 
				recordNum = PromptInput.recordInputOptions(in, "Please choose a record to add: ");
				AddRecords.addARecord(conn, in, recordNum);
				break;
			case 2:
				recordNum = PromptInput.recordInputOptions(in, "Please choose a record to delete: ");
				DeleteRecords.deleteARecord(conn, in, recordNum);
				break;
			case 3:
				recordNum = PromptInput.recordUpdateOptions(in, "Please choose a record to update: ");
				EditRecords.editARecord(conn, in, recordNum);
				break;
			case 4:
				recordNum = PromptInput.recordInputOptions(in, "Please choose a record to search for: ");
			
				break;
			case 5:
				recordNum = PromptInput.orderOptions(in, "Choose an item to order from library: ");
				break;
			case 6:
				recordNum = PromptInput.reportOptions(in, "Choose report to print: ");
				Report.getReport(conn, in, recordNum);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}	
		
		in.close();

		try {
			if(conn !=null) {
				conn.close();
				System.out.println("Database connection closed successfully");
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

}
