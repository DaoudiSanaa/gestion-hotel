package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.dao.mapper.hotelMapper;
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
		//db.insert(tableName, a.getId(),a.getStat(),a.getStat(),a.getStat());
		return true;
	}

	@Override
	public List<Room> selectAll() {
	
		return hotelMapper.getRooms(db.select(tableName));
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
	public Boolean delet(Room r) {
		// TODO Auto-generated method stub
		return db.delete(tableName, r);
	}

	@Override
	public Boolean updete(Room r1, Room r2) {
		// TODO Auto-generated method stub
		return db.update(tableName, r1, r2);
	}

}
