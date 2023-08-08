package org.mql.hotel.buisness;


import org.mql.hotel.dao.AdminDao;
import org.mql.hotel.dao.AdminDaoMySQL;
import org.mql.hotel.dao.ClientDao;
import org.mql.hotel.dao.ClientDaoMySQL;
import org.mql.hotel.dao.ReservationDao;
import org.mql.hotel.dao.ReservationDaoMySQL;
import org.mql.hotel.dao.RoomDao;
import org.mql.hotel.dao.RoomDaoMySQL;
import org.mql.java.jdbc.DataSource;
import org.mql.java.jdbc.Database;
import org.mql.java.jdbc.MySQLDataSource;

public class ServiceFactory {
	private static HotelService service;
	
	static {
		//Wiring
		DataSource ds = new MySQLDataSource("hotel");
		Database db = new Database(ds);
		RoomDao roomDao = new RoomDaoMySQL(db);
		ClientDao clientDao = new ClientDaoMySQL(db);
		AdminDao adminDao = new AdminDaoMySQL(db);
		ReservationDao reservationDao = new ReservationDaoMySQL(db);
		service = new HotelServiceDefault(roomDao,clientDao,adminDao,reservationDao);
	}
	
	public static HotelService getService() {
		return service;
	}

}
