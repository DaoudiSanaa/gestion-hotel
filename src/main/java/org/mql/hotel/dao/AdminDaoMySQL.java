package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;
import org.mql.hotel.dao.mapper.HotelMapper;
import org.mql.hotel.models.Admin;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Room;
import org.mql.java.jdbc.Database;

public class AdminDaoMySQL implements AdminDao {
	
	private String tableName = "admin";
	private Database db;

	public AdminDaoMySQL(Database db) {
		this.db = db;
	}

	@Override
	public boolean exist(Admin a) {
		if(HotelMapper.getAdmins(db.select(tableName)).size() == 0) return false;
		return true;
	}
	@Override
	public boolean update(Admin a1, Admin a2) {
		return db.update(tableName, a1, a2);
	}


}
