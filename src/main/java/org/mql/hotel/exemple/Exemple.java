package org.mql.hotel.exemple;

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
		Client c = new Client("kh235", "sanaa", "daoudi","0654875" , "F", "2001-10-03");
		//services.add(c);
		System.out.println(services.client(c.getCin()));
		
	}


	public static void main(String[] args) {
		new Exemple();

	}

}
