package org.mql.hotel.buisness;

import java.util.List;

import org.mql.hotel.dao.AdminDao;
import org.mql.hotel.dao.ClientDao;
import org.mql.hotel.dao.ReservationDao;
import org.mql.hotel.dao.RoomDao;
import org.mql.hotel.models.Admin;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Reservation;
import org.mql.hotel.models.Room;


public class HotelServiceDefault implements HotelService{

	private RoomDao roomDao;
	private ClientDao clientDao;
	private AdminDao adminDao;
	private ReservationDao reservationDao;
	
	HotelServiceDefault() {
	}
	

	public HotelServiceDefault(RoomDao roomDao, ClientDao clientDao, AdminDao adminDao, ReservationDao reservationDao) {
		super();
		this.roomDao = roomDao;
		this.clientDao = clientDao;
		this.adminDao = adminDao;
		this.reservationDao = reservationDao;
	}






	public boolean add(Room a) {
		return roomDao.insert(a);
	}

	public List<Room> rooms() {
		return roomDao.selectAll();
	}

	public Room room(int id) {
		return roomDao.select(id);
	}

	
	
	@Override
	public boolean add(Client a) {
		return clientDao.insert(a);
	}

	@Override
	public List<Client> clients() {
	
		return clientDao.selectAll();
	}

	@Override
	public Client client(String cin) {
		
		return clientDao.select(cin);
	}


	@Override
	public boolean authentication(Admin a) {
		
		return false;
	}


	@Override
	public boolean add(Reservation a) {
	
		return false;
	}


	@Override
	public List<Reservation> reservations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Reservation reservation(String cin) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Reservation change(String cin) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
