<%@page import="org.mql.hotel.models.Room"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="../css/style.css">
</head>
<body>
	<h1>Liste des chambres</h1>
	<!-- Scriptlet -->
		<%
			List<Room> rooms = (List<Room>)request.getAttribute("model");
		%>
	<table class="data-table">
		<tr><th>numéro de chambre</th><th>nombre des lits</th><th>le prix</th><th>le statut de la chambre</th></tr>
		<% for (Room a : rooms){ %>
			<tr>
				<td> <%= a.getId() %></td>
				<td> <%= a.getBeds() %></td>
				<td> <%= a.getPrice() %></td>
				<td> <%= a.getStat() %></td>
				
			</tr>
		<%}%>
	</table>
</body>
</html>