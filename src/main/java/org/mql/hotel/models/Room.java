package org.mql.hotel.models;

public class Room {
	private int id;
	private int beds;
	private String stat;
	private double price;
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Room(int id,  int beds,String stat, double price) {
		super();
		this.id = id;
		this.stat = stat;
		this.beds = beds;
		this.price = price;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Room [id=" + id + ", stat=" + stat + ", beds=" + beds + ", price=" + price + "]";
	}
	
	
	
	

}
