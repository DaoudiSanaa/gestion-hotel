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
	
	public HotelServiceDefault() {
	}
	

	public HotelServiceDefault(RoomDao roomDao, ClientDao clientDao, AdminDao adminDao, ReservationDao reservationDao) {
		super();
		this.roomDao = roomDao;
		this.clientDao = clientDao;
		this.adminDao = adminDao;
		this.reservationDao = reservationDao;
	}


	@Override
	public boolean addRoom(Room a) {
		return roomDao.insert(a);
	}


	@Override
	public List<Room> rooms() {
		return roomDao.selectAll();
	}


	@Override
	public Room room(int id) {
		return roomDao.select(id);
	}


	@Override
	public boolean removeRoom(Room r) {
		return roomDao.delete(r);
	}


	@Override
	public boolean modifyRoom(Room r1, Room r2) {
		return roomDao.update(r1, r2);
	}


	@Override
	public boolean addClient(Client a) {
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
	public boolean removeClient(Client c) {
		return clientDao.delete(c);
	}


	@Override
	public boolean modifyClient(Client oldClient, Client newClient) {
		return clientDao.update(oldClient, newClient);
	}


	@Override
	public boolean addReservation(Reservation a) {
		return reservationDao.insert(a);
	}


	@Override
	public List<Reservation> reservations() {
		return reservationDao.selectAll();
	}


	@Override
	public Reservation reservationByRoom(int id) {
		return reservationDao.selectId(id);
	}
	@Override
	public Reservation reservationByClient(String cin) {
		return reservationDao.selectCin(cin);
	}


	@Override
	public boolean changeReserv(Reservation r1, Reservation r2) {
		return reservationDao.update(r1, r2);
	}


	@Override
	public boolean removeReservation(Reservation r) {
		return reservationDao.delete(r);
	}


	@Override
	public Reservation reservation(int id, String cin) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Admin login(String email, String pwd) {
		Admin user  = getUserByEmail(email);
		if(user !=  null && user.getPwd().equals(pwd)) {
			return user;
		}
		return null;
	}


	public Admin getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return adminDao.select(email);
	}


	@Override
	public List<Admin> getAllUsers() {
		// TODO Auto-generated method stub
		return adminDao.selectAll();
	}

	@Override
	public boolean authentication(Admin a) {
		return adminDao.exist(a);
	}


	@Override
	public boolean addAdmin(Admin a) {
		// TODO Auto-generated method stub
		return adminDao.insert(a);
	}



	
}
