package org.mql.hotel.web.actions;

import org.mql.hotel.buisness.HotelService;
import org.mql.hotel.buisness.ServiceFactory;
import org.mql.hotel.models.Client;
import org.mql.hotel.models.Reservation;

import com.google.gson.Gson;

public class ReservationAction {
private HotelService service;
	
	private Object model;
	private Gson gson;
	

	public ReservationAction() {
		service = ServiceFactory.getService();
	}
	
	/*
	 * Méthod d'action
	 */
	public String getAllReservations() {
		model = service.reservations();
		Gson gson = new Gson();
		return gson.toJson(model);
	}
	
	public String getReservationByClient(String cin) {
		model = service.reservationByClient(cin);

		Gson gson = new Gson();
		return gson.toJson(model);
	}
	public String getReservationByRoom(int id) {
		model = service.reservationByRoom(id);

		Gson gson = new Gson();
		return gson.toJson(model);
	}

	
	public boolean removeReservation(Reservation r) {
		return service.removeReservation(r);
	}
	
	public boolean modifyReservation(Reservation oldR, Reservation newR) {
		return service.changeReserv(oldR, newR);
		
	}
	
	/*
	 * Méthod de récupération de modèls de données
	 */
	public Object getModel() {
		return model;
	}

}
