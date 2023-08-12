package org.mql.hotel.models;

import java.sql.Date;

public class Reservation {
	private String cin;
	private int id;
	private Date arrival;
	private Date departure;
	private Double totalPrice;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	
	//format date = 2001-15-03
	public Reservation(String cin, int id, String arrival, String departure, Double totalPrice) {
		super();
		this.cin = cin;
		this.id = id;
		this.arrival = Date.valueOf(arrival);
		this.departure = Date.valueOf(departure);
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
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
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
