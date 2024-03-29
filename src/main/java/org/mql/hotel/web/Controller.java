package org.mql.hotel.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.mql.hotel.web.actions.AdminAction;
import org.mql.hotel.web.actions.ClientAction;
import org.mql.hotel.web.actions.RoomAction;

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

	private static final long serialVersionUID = 1L;

	
	public void init() throws ServletException {
		super.init();
		clientAction =  new ClientAction();
		roomAction = new RoomAction();
		//adminAction = new AdminAction();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getRequestURL()+"";
		if(path.endsWith("/clients")) {
			PrintWriter out = response.getWriter();
			out.println(clientAction.getAllClients());
			
		}else if (path.endsWith("/client")) {
			String cin = request.getParameter("cin");
			PrintWriter out = response.getWriter();
			out.println(clientAction.getClientById(cin));
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
