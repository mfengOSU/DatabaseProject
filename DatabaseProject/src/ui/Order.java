package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LibraryOrder;
import entities.LibraryStorage;

public class Order {
	private static String updateSQL = "UPDATE Item SET Status=? WHERE Item.ItemNo=?;";

	public static void orderItem(Connection conn, Scanner in, int recordNum) {
		List<Object> orderList = new ArrayList<>();
		List<Integer> nonOrdered = new ArrayList<>();
 		switch (recordNum) {
		case 1:
			nonOrdered = getNonOrderedItems(conn, "Album");
			if (nonOrdered.size() == 0) {
				System.out.println("All items already ordered");
			} else {
				System.out.println("Possible Item numbers: ");

				for (int item : nonOrdered) {
					System.out.print(item + ", ");
				}

				System.out.println();
				System.out.println();
				System.out.println("Possible Cities and States: ");
				Main.queryAllRows(conn, "Library");


				orderList = PromptInput.orderAttributes(in);
				LibraryOrder.insertIntoLibraryOrder(conn, orderList);
				updateItemStatus(conn, "ORDER", (int)orderList.get(0));
			}
			
			break;
		case 2:
			nonOrdered = getNonOrderedItems(conn, "Movie");
			if (nonOrdered.size() == 0) {
				System.out.println("All items already ordered");
			} else {
				System.out.println("Possible Item numbers: ");

				for (int item : nonOrdered) {
					System.out.print(item + ", ");
				}
				System.out.println();
				System.out.println();
				System.out.println("Possible Cities and States: ");
				Main.queryAllRows(conn, "Library");
			

				orderList = PromptInput.orderAttributes(in);
				LibraryOrder.insertIntoLibraryOrder(conn, orderList);
				updateItemStatus(conn, "ORDER", (int)orderList.get(0));
			}
			break;
		case 3:
			nonOrdered = getNonOrderedItems(conn, "Audiobook");
			if (nonOrdered.size() == 0) {
				System.out.println("All items already ordered");
			} else {
				System.out.println("Possible Item numbers: ");

				for (int item : nonOrdered) {
					System.out.print(item + ", ");
				}
				System.out.println();
				System.out.println();
				
				System.out.println("Possible Cities and States: ");
				Main.queryAllRows(conn, "Library");
		

				orderList = PromptInput.orderAttributes(in);
				LibraryOrder.insertIntoLibraryOrder(conn, orderList);
				updateItemStatus(conn, "ORDER", (int)orderList.get(0));
			}
			break;
		}
 		System.out.println("Activate an order? Enter 'Y' for yes");
 		String input = in.nextLine();
 		if (input.equalsIgnoreCase("Y")) {
 			Main.queryAllRows(conn, "Library_Order");
 			System.out.print("Enter Item Number to activate: ");
 			int activateItem = in.nextInt();
 			in.nextLine();
 			System.out.println();
 			
 			List<Object> storageList = getOrder(conn, activateItem);
 			LibraryStorage.insertIntoLibraryStorage(conn, storageList);
			updateItemStatus(conn, "INVENTORY", (int)storageList.get(0));

 		}
	}
	
	private static void updateItemStatus(Connection conn, String status, int itemNo) {
		try {
    		PreparedStatement stmt = conn.prepareStatement(updateSQL);		
    		stmt.setString(1, status);
    		stmt.setInt(2, itemNo);
    		
    		stmt.executeUpdate();
    		System.out.println("Successfully updated item status into database");  		
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    		System.out.println("Error with updating item status into database");
    	} 
	}
	
	private static List<Object> getOrder(Connection conn, int itemNo) {
		String sql = "SELECT * FROM LIBRARY_ORDER WHERE Library_Order.ItemNo=?;";
		List<Object> list = new ArrayList<>();
		try {
    		PreparedStatement stmt = conn.prepareStatement(sql);		
    		stmt.setInt(1, itemNo);
    		
    		ResultSet rSet = stmt.executeQuery();
    		while (rSet.next()) {
    			list.add(rSet.getInt("ItemNo"));
    			list.add(rSet.getString("City"));
    			list.add(rSet.getString("State"));
    		}
    		return list;
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    	}
		return null;
		
	}
	
	private static List<Integer> getNonOrderedItems(Connection conn, String tableName) {
		String sql = "";
		if (tableName.equalsIgnoreCase("Album")) {
    		sql = "SELECT * FROM Album, Item WHERE Item.ItemNo=Album.AlbumNo AND Item.Status is NULL;";
    	} else if (tableName.equalsIgnoreCase("Movie")) {
    		sql = "SELECT * FROM Movie, Item WHERE Item.ItemNo=Movie.MovieNo AND Item.Status is NULL;";
    	} else if (tableName.equalsIgnoreCase("Audiobook")) {
    		sql = "SELECT * FROM Audiobook, Item WHERE Item.ItemNo=Audiobook.BookNo AND Item.Status is NULL;";
    	}
		List<Integer> list = new ArrayList<>();
		try {
    		PreparedStatement stmt = conn.prepareStatement(sql);		
    		
    		ResultSet rSet = stmt.executeQuery();
    		while (rSet.next()) {
    			list.add(rSet.getInt("ItemNo"));
    		}
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    	}
		return list;
		
	}
}
