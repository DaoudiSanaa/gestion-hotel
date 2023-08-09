package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.models.Room;


public interface RoomDao {	
	public boolean insert(Room a);
	public List<Room> selectAll();
	public Room select(int id);
	public Boolean update(Room r1,Room r2);
	public Boolean delete(Room r);
}
