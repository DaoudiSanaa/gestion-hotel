package org.mql.hotel.exemple;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Reservation;
import org.mql.hotel.models.Room;

public class Exemple {
	private  HotelService services;
	
	
	public Exemple() {
		services = ServiceFactory.getService();
		exp01();
	}
	

	private void exp01() {
		Client c = new Client("A187", "med", "karim","070440755" , "2020-03-15", "F");
		Client c1 = new Client("A18768", "med", "karim","070440755" , "2020-03-15", "F");
		services.addClient(c1);
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
		//DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//dateFormat.parse("1989-03-14")
		Reservation r = new Reservation(c.getCin(), r4.getId(),"1989-03-14", "1989-03-14",1058.20);
		Reservation rs1 = new Reservation(c1.getCin(), r2.getId(),"1989-03-14", "1989-03-14",1058.20);
		Reservation rs2 = new Reservation(c1.getCin(), r3.getId(),"1989-03-14", "1989-03-14",1058.20);
		Reservation rs3 = new Reservation(c.getCin(), r1.getId(),"1989-03-14", "1989-03-14",1058.20);
		

		services.addReservation(r);
		services.addReservation(rs1);
		services.addReservation(rs2);
		services.addReservation(rs3);
		
		
		
	}


	public static void main(String[] args) {
		new Exemple();

	}

}
