package org.mql.hotel.web.actions;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;

import com.google.gson.Gson;

/*
 * Classe d'action
 * */

public class RoomAction {
	
	private HotelService service;
	
	private Object model;
	private Gson gson;

	
	public RoomAction() {
		service = ServiceFactory.getService();
		gson =new Gson();
	}
	
	/*
	 * Méthod d'action
	 */
	public String getAllRooms() {
		model = service.rooms();
		return gson.toJson(model);
	}
	
	public String getRoomByKeyword(int id) {
		model = service.room(id);
		return gson.toJson(model);
	}
	
	/*
	 * Méthod de récupération de modèls de données
	 */
	public Object getModel() {
		return model;
	}
	
}
