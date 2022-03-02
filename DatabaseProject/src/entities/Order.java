package entities;

import java.util.List;

public class Order {

	public int orderNum;
	public String mediaType;
	public int copies;
	public String date;
	public double price;
	
    public Order(List<Object> list)
    {
    	orderNum = (int) list.get(0);
    	mediaType = list.get(1).toString();
    	copies = (int) list.get(2);
    	date = list.get(3).toString();
    	price = (double) list.get(4);
    }

}