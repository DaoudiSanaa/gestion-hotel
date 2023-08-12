package org.mql.hotel.web.actions;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;

import com.google.gson.Gson;

public class AdminAction {

	private HotelService service;
	
	private Object model;

	
	public AdminAction() {
		service = ServiceFactory.getService();
		
	}
	
	/*
	 * Méthod d'action
	 */
	public String getAdmin() {
		//model = service.
		Gson gson = new Gson();
		return gson.toJson(model);
	}
	/*
	 * Méthod de récupération de modèls de données
	 */
	public Object getModel() {
		return model;
	}
	

}
