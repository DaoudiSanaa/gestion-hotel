package org.mql.hotel.models;

public class Reservation {
	private String cin;
	private int id;
	private String arrival;
	private String departure;
	private Double totalPrice;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	
	public Reservation(String cin, int id, String arrival, String departure, Double totalPrice) {
		super();
		this.cin = cin;
		this.id = id;
		this.arrival = arrival;
		this.departure = departure;
		this.totalPrice = totalPrice;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Reservation [cin=" + cin + ", id=" + id + ", arrival=" + arrival + ", departure=" + departure
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	
	

}
