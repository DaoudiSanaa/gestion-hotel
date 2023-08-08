package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.models.Client;



public interface ClientDao {	
	public boolean insert(Client c);
	public List<Client> selectAll();
	public Client select(String cin);
	public Boolean updete(Client c1 , Client c2);
	public Boolean delet(Client c);
}
