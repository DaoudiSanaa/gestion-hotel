package org.mql.hotel.dao;

import java.util.List;

import org.mql.hotel.dao.mapper.hotelMapper;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Room;
import org.mql.java.jdbc.Database;

public class ClientDaoMySQL implements ClientDao {
	
	private String tableName = "client";
	private Database db;

	public ClientDaoMySQL(Database db) {
		this.db = db;
	}

	@Override
	public boolean insert(Client a) {
		
		return db.insert(tableName,a);
	}

	@Override
	public List<Client> selectAll() {
	
		return hotelMapper.getClients(db.select(tableName));
	}

	@Override
	public Client select(String id) {
		
		List<Client> clients=selectAll();
		for (Client client : clients) {
			if(client.getCin().equals(id)) {
				return client;
			}
		}
		
		return null;		
	}

	@Override
	public Boolean updete( Client c1, Client c2) {
	
		return db.update(tableName, c1,c2);
	}

	@Override
	public Boolean delet(Client c) {
		// TODO Auto-generated method stub
		return db.delete(tableName, c);
	}

	

	
}
