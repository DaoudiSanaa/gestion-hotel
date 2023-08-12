package org.mql.hotel.models;

import java.sql.Date;

public class Client {
	private String cin;
	private String firstName;
	private String lastName;
	private String number;
	private String sexe;
	private Date brithDate;
	
	public Client() {
	}
	//format date = 2001-15-03
	public Client(String cin, String firstName, String lastName, String number, String sexe, String brithDate) {
		super();
		this.cin = cin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.sexe = sexe;
		this.brithDate = Date.valueOf(brithDate);
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getBrithDate() {
		return brithDate;
	}
	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}

	@Override
	public String toString() {
		return "Client [cin=" + cin + ", firstName=" + firstName + ", lastName=" + lastName + ", number=" + number
				+ ", sexe=" + sexe + ", brithDate=" + brithDate + "]";
	}
	
	
	
	

}
