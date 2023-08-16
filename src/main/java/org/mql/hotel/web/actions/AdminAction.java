package org.mql.hotel.web.actions;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;
import org.mql.hotel.models.Admin;

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
	public String getAllAdmin() {
		model = service.getAllUsers();
		Gson gson = new Gson();
		return gson.toJson(model);
	}
	
	
	public String getAdminById(String userName) {
		model = service.getUserByEmail(userName);

		Gson gson = new Gson();
		return gson.toJson(model);
	}
	public String login(String email, String pwd) {
		model = service.login(email, pwd);

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
