package org.mql.hotel.web.actions;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;
import org.mql.hotel.models.Client;

import com.google.gson.Gson;

/*
 * Classe d'action
 * */

public class ClientAction {
	
	private HotelService service;
	
	private Object model;
	private Gson gson;

	
	public ClientAction() {
		service = ServiceFactory.getService();
		gson = new Gson();
	}
	
	/*
	 * Méthod d'action
	 */
	public String getAllClients() {
		model = service.clients();
		return gson.toJson(model);
	}
	
	public String getClientById(String id) {
		model = service.client(id);
		return gson.toJson(model);
	}
	
	public boolean removeClinet(Client c) {
		return service.removeClient(c);
	}
	
	public boolean modifyClient(Client oldClient, Client newClient) {
		return service.modifyClient(oldClient, newClient);
		
	}
	
	/*
	 * Méthod de récupération de modèls de données
	 */
	public Object getModel() {
		return model;
	}
	
}
