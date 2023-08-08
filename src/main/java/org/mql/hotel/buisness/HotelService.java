package org.mql.hotel.buisness;

import java.util.List;

import org.mql.hotel.models.Admin;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Reservation;
import org.mql.hotel.models.Room;

public interface HotelService {
	public boolean add(Room a);
	public List<Room> rooms();
	public Room room(int id);
	
	public boolean add(Client a);
	public List<Client> clients();
	public Client client(String cin);
	
	public boolean authentication(Admin a);
	
	public boolean add(Reservation a);
	public List<Reservation> reservations();
	public Reservation reservation(String cin);
	public Reservation change(String cin);
	
	
}
