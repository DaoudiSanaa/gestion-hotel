package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.models.Admin;


public interface AdminDao {	
	public boolean exist(Admin a);
	public boolean update(Admin a1,Admin a2);
	
}
