package org.mql.hotel.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.mql.hotel.models.Client;
import org.mql.hotel.web.actions.AdminAction;
import org.mql.hotel.web.actions.ClientAction;
import org.mql.hotel.web.actions.ReservationAction;
import org.mql.hotel.web.actions.RoomAction;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet({"/hotel/*"})
public class Controller extends HttpServlet{
	
	private ClientAction clientAction;
	private RoomAction roomAction;
	private AdminAction adminAction;
	private ReservationAction reservationAction;

	private static final long serialVersionUID = 1L;

	
	public void init() throws ServletException {
		super.init();
		clientAction =  new ClientAction();
		roomAction = new RoomAction();
		adminAction = new AdminAction();
		reservationAction = new ReservationAction();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getRequestURL()+"";
		if(path.endsWith("/clients")) {
			//http://localhost:8080/gestion-hotel/hotel/clients
			PrintWriter out = response.getWriter();
			out.println(clientAction.getAllClients());
			
		}else if (path.endsWith("/client")) {
			//http://localhost:8080/gestion-hotel/hotel/client?cin=cin
			String cin = request.getParameter("cin");
			PrintWriter out = response.getWriter();
			out.println(clientAction.getClientById(cin));
		}
		else if(path.endsWith("/add-client")){
			
		    try {
		        System.out.println("Nb. de paramètres : " + request.getParameterMap().size());

		        BufferedReader in = request.getReader();
		        StringBuilder data = new StringBuilder();
		        String row = "";
		        while ((row = in.readLine()) != null) {
		            data.append(row);
		        }
		        System.out.println("data : " + data);
		        
		        Gson gson = new Gson();
		        Client client = gson.fromJson(data.toString(), Client.class);
		        System.out.println(client);
		        
		        String responseJson = "{\"status\" : \"OK\","
		                + "\"model\" : " + gson.toJson(client)
		                + "}";
		        
		        response.setContentType("application/json");
		        response.setCharacterEncoding("UTF-8");
		        response.getWriter().write(responseJson);
		    } catch (IOException e) {
		        e.printStackTrace();
		        String errorResponseJson = "{\"status\" : \"Error\","
		                + "\"message\" : \"An error occurred while processing the request\""
		                + "}";
		        
		        response.setContentType("application/json");
		        response.setCharacterEncoding("UTF-8");
		        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		        response.getWriter().write(errorResponseJson);
		    }
		}
			
		else if(path.endsWith("/rooms")) {
			PrintWriter out = response.getWriter();
			out.println(roomAction.getAllRooms());
			
		}else if (path.endsWith("/room")) {
			//http://localhost:8080/gestion-hotel/hotel/client?cin=cin
			String id = request.getParameter("id");
			PrintWriter out = response.getWriter();
			out.println(roomAction.getRoomById(Integer.parseInt(id)));
		}else if(path.endsWith("/reservations")) {
			PrintWriter out = response.getWriter();
			out.println(reservationAction.getAllReservations());
			
		}else if (path.endsWith("/reservationId")) {
			//http://localhost:8080/gestion-hotel/hotel/client?cin=cin
			String id = request.getParameter("id");
			PrintWriter out = response.getWriter();
			out.println(reservationAction.getReservationByRoom(Integer.parseInt(id)));
		}else if (path.endsWith("/reservationCin")) {
			//http://localhost:8080/gestion-hotel/hotel/client?cin=cin
			String cin = request.getParameter("cin");
			PrintWriter out = response.getWriter();
			out.println(reservationAction.getReservationByClient(cin));
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
