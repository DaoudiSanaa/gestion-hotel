package org.mql.hotel.exemple;

import java.sql.Date;
import java.util.Calendar;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;
import org.mql.hotel.models.Client;

public class Exemple {
	private  HotelService services;
	
	
	public Exemple() {
		services = ServiceFactory.getService();
		exp01();
	}
	

	private void exp01() {
		Client c = new Client("eekjhsrrj235", "sanaa", "daoudi","0654875" , "2001-10-03", "F");
		services.addClient(c);
		System.out.println(services.client(c.getCin()));
		//Client b = services.client(c.getCin());
		//System.out.println(b.getBrithDate());
		
		
		
	}


	public static void main(String[] args) {
		new Exemple();

	}

}
