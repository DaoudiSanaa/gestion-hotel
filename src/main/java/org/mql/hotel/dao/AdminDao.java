package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.models.Admin;
import org.mql.hotel.models.Client;


public interface AdminDao {	
	public boolean exist(Admin a);
	public boolean update(Admin a1,Admin a2);
	List<Admin> selectAll();
	Admin select(String email);
	public boolean insert(Admin c);
	
}
