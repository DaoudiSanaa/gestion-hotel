package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.models.Reservation;



public interface ReservationDao {
	public boolean insert(Reservation a);
	public List<Reservation> selectAll();
	public Reservation selectId(int id);
	public Reservation selectCin(String cin);
	public Boolean update(Reservation a1 ,Reservation a2);
	public Boolean delete(Reservation r);

}
