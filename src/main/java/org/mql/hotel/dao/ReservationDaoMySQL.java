package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.dao.mapper.hotelMapper;
import org.mql.hotel.models.Reservation;
import org.mql.hotel.models.Room;
import org.mql.java.jdbc.Database;

public class ReservationDaoMySQL implements ReservationDao {
	
	private String tableName = "reservation";
	private Database db;

	public ReservationDaoMySQL(Database db) {
		this.db = db;
	}


	@Override
	public boolean insert(Reservation a) {
		
		return db.insert(tableName, a);
	}
	

	@Override
	public List<Reservation> selectAll() {
		return hotelMapper.getReservations(db.select(tableName));
	}

	@Override
	public Reservation select(String cin) {
		List<Reservation> reservations=selectAll();
		for (Reservation reservation : reservations) {
			if(reservation.getCin()==cin) {
				return reservation;
			}
			
		}
		return null;		
		
	}


	@Override
	public Boolean updete(Reservation a1, Reservation a2) {
	
		return db.update(tableName, a1, a2);
	}


	@Override
	public Boolean delet(Reservation r) {
		
		return db.delete(tableName, r);
	}


}
