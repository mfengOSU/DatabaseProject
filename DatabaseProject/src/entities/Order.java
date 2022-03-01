package entities;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Order {
	private static final AtomicLong NEXT_ID = new AtomicLong(0); 
	private final long id;
	private Item orderType;
	private Date arrivalDate;
	private double price;
	private int copies;
	
	public Order(Item type, Date arrivalDate, double price, int copies) {
		this.id = NEXT_ID.getAndIncrement();
		this.setOrderType(type);
		this.setArrivalDate(arrivalDate);
		this.setPrice(price);
		this.setCopies(copies);
	}

	public long getId() {
		return id;
	}

	public Item getOrderType() {
		return orderType;
	}

	public void setOrderType(Item orderType) {
		this.orderType = orderType;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
}
