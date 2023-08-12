package org.mql.hotel.models;

public class Date {
	
	private java.sql.Date date;
	private int year;
	private int month;
	private int day;
	
	public Date(java.sql.Date date) {
		this.date = date;
	}

	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.date = new java.sql.Date(year, month, day);
	}

	public java.sql.Date getDate() {
		return date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}

	public int getYear() {
		return year ;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
	
	
}
