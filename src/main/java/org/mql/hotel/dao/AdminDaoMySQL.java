package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.dao.mapper.hotelMapper;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin upDete(Admin a1, Admin a2) {
		// TODO Auto-generated method stub
		return null;
	}


}
