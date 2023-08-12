package org.mql.hotel.buisness;

import java.util.List;

import org.mql.hotel.models.Admin;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Reservation;
import org.mql.hotel.models.Room;

public interface HotelService {
	public boolean addRoom(Room a);
	public List<Room> rooms();
	public Room room(int id);
	public boolean removeRoom(Room r);
	public boolean modifyRoom(Room r1,Room r2);
	
	public boolean addClient(Client a);
	public List<Client> clients();
	public Client client(String cin);
	public boolean removeClient(Client c);
	public boolean modifyClient(Client oldClient, Client newClient);
	
	public boolean authentication(Admin a);
	
	public boolean addReservation(Reservation a);
	public List<Reservation> reservations();
	public Reservation reservation(int id, String cin);
	public boolean changeReserv(Reservation oldReservation, Reservation newReservation);
	public boolean removeReservation(Reservation r);
	
	
}
