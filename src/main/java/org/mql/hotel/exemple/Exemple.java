package org.mql.hotel.exemple;

import java.sql.Date;
import java.util.Calendar;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Room;

public class Exemple {
	private  HotelService services;
	
	
	public Exemple() {
		services = ServiceFactory.getService();
		exp01();
	}
	

	private void exp01() {
		Client c = new Client("A187", "med", "karim","070440755" , "2020-03-15", "F");
		services.addClient(c);
		//System.out.println(services.removeClient(services.client("cin")));
		//System.out.println(services.client(c.getCin()));
		//Client b = services.client(c.getCin());
		//System.out.println(b.getBrithDate());
		
		Room r1 = new Room(1, 2,"double", 2000);
		Room r2 = new Room(5, 1,"double", 3000);
		Room r3 = new Room(6, 3,"double", 11000);
		Room r4 = new Room(7, 2,"double", 2000);
		services.addRoom(r4);
		services.addRoom(r2);
		services.addRoom(r3);
		services.addRoom(r1);
		
		
		
	}


	public static void main(String[] args) {
		new Exemple();

	}

}
