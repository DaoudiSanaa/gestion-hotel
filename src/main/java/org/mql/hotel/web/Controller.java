package org.mql.hotel.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.mql.hotel.models.Client;
import org.mql.hotel.models.Room;
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
			PrintWriter out = response.getWriter();
			
			System.out.println("Nb. de paramètres : " + request.getParameterMap().size());
			
			BufferedReader in = request.getReader();
			String data = "";
			String row ="";
			while ((row = in.readLine()) != null) {
				data += row;
			}
			System.out.println("data : " + data);
		        Gson gson = new Gson();
		        Client client = gson.fromJson(data, Client.class);
		        System.out.println(client);
		        out.print("{\"status\" : \"OK\","
						+ "\"model\" : " + gson.toJson(client)
								+ "}");
		        
		       
			
		}else if(path.endsWith("/add-room")){
			PrintWriter out = response.getWriter();
			
			System.out.println("Nb. de paramètres : " + request.getParameterMap().size());
			
			BufferedReader in = request.getReader();
			String data = "";
			String row ="";
			while ((row = in.readLine()) != null) {
				data += row;
			}
			System.out.println("data : " + data);
		        Gson gson = new Gson();
		        Room room = gson.fromJson(data, Room.class);
		        System.out.println(room);
		        out.print("{\"status\" : \"OK\","
						+ "\"model\" : " + gson.toJson(room)
								+ "}");
		        
		       
			
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
			//http://localhost:8080/gestion-hotel/hotel/reservations
			PrintWriter out = response.getWriter();
			out.println(reservationAction.getAllReservations());
		
			
			
		}else if (path.endsWith("/reservationId")) {
			
			String id = request.getParameter("id");
			PrintWriter out = response.getWriter();
			out.println(reservationAction.getReservationByRoom(Integer.parseInt(id)));
		
		
		
		}else if (path.endsWith("/reservationCin")) {
			
			String cin = request.getParameter("cin");
			PrintWriter out = response.getWriter();
			out.println(reservationAction.getReservationByClient(cin));
		}else if(path.endsWith("/get-clients-by-keyword")) {
			PrintWriter out = response.getWriter();
			String keyword = request.getParameter("keyword");
			clientAction.getClientById(keyword);
			List<Client> clients = (List<Client>) clientAction.getModel();	
			
			Gson gson = new Gson();
			
			out.print(gson.toJson(clients));
			
		
			
			
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
