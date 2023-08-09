package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.dao.mapper.HotelMapper;
import org.mql.hotel.models.Room;
import org.mql.java.jdbc.Database;

public class RoomDaoMySQL implements RoomDao {
	
	private String tableName = "room";
	private Database db;

	public RoomDaoMySQL(Database db) {
		this.db = db;
	}

	@Override
	public boolean insert(Room a) {
		db.insert(tableName, a);
		return true;
	}

	@Override
	public List<Room> selectAll() {
	
		return HotelMapper.getRooms(db.select(tableName));
	}

	@Override
	public Room select(int id) {
		
		List<Room> rooms=selectAll();
		for (Room room : rooms) {
			if(room.getId()==id) {
				return room;
			}
			
		}
		return null;		
	}

	
	@Override
	public Boolean delete(Room r) {
		return db.delete(tableName, r);
	}

	@Override
	public Boolean update(Room r1, Room r2) {
		return db.update(tableName, r1, r2);
	}

}
