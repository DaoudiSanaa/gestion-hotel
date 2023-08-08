package org.mql.hotel.web.actions;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;

import com.google.gson.Gson;

public class AdminAction {

	private HotelService service;
	
	private Object model;
	private Gson gson;

	
	public AdminAction() {
		service = ServiceFactory.getService();
		gson = new Gson();
	}
	
	/*
	 * Méthod d'action
	 */
	public String getAdmin() {
		//model = service.
		return gson.toJson(model);
	}
	/*
	 * Méthod de récupération de modèls de données
	 */
	public Object getModel() {
		return model;
	}
	

}
