package org.mql.hotel.dao.mapper;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.mql.hotel.models.Admin;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Reservation;
import org.mql.hotel.models.Room;



public class HotelMapper {

	public HotelMapper() {
		// TODO Auto-generated constructor stub
	}
	
	//Methode de Mapping Object/Relationnel
	public static Room getRoom(String... row) {
		Room a = new Room();
		
		try {
			a.setId(Integer.parseInt(row[0]));
			a.setStat(row[1]);
			a.setBeds(Integer.parseInt(row[2]));
			a.setPrice(Double.parseDouble(row[3]));
			
		} catch (Exception e) {
			System.out.println("Erreur" + e.getMessage());
		}
		
		return a;
	}
	
	public static List<Room> getRooms(String data[][]){
		List<Room> list = new Vector<Room>();
		for (int i = 1; i<data.length; i++) {
			list.add(getRoom(data[i]));
		}
		return list;
	}

	
	
	public static Client getClient(String... row) {
		Client a = new Client();
		
		try {
			a.setCin(row[0]);
			a.setFirstName(row[1]);
			a.setLastName(row[2]);
			a.setNumber(row[3]);
			a.setSexe(row[4]);
			a.setBrithDate(row[5]);
			
			
		} catch (Exception e) {
			System.out.println("Erreur" + e.getMessage());
		}
		
		return a;
	}
	
	public static List<Client> getClients(String data[][]){
		List<Client> list = new Vector<Client>();
		for (int i = 1; i<data.length; i++) {
			list.add(getClient(data[i]));
		}
		return list;
	}
	
	public static Admin getAdmin(String... row) {
		Admin a = new Admin();
		
		try {
			a.setUserName(row[0]);
			a.setPwd(row[1]);
			
			
		} catch (Exception e) {
			System.out.println("Erreur" + e.getMessage());
		}
		
		return a;
	}
	
	public static List<Admin> getAdmins(String data[][]){
		List<Admin> list = new Vector<Admin>();
		for (int i = 1; i<data.length; i++) {
			list.add(getAdmin(data[i]));
		}
		return list;
	}
	
	public static Reservation getReservation(String... row) {
		Reservation a = new Reservation();
		
		try {
			a.setCin(row[0]);
			a.setId(Integer.parseInt(row[1]));
			a.setArrival(row[2]);
			a.setDeparture(row[3]);
			a.setTotalPrice(Double.parseDouble(row[4]));
			
			
		} catch (Exception e) {
			System.out.println("Erreur" + e.getMessage());
		}
		
		return a;
	}
	
	public static List<Reservation> getReservations(String data[][]){
		List<Reservation> list = new Vector<Reservation>();
		for (int i = 1; i<data.length; i++) {
			list.add(getReservation(data[i]));
		}
		return list;
	}
}
