<%@page import="org.mql.hotel.models.Client"%>
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
			List<Client> clients = (List<Client>)request.getAttribute("model");
		%>
	<table class="data-table">
		<tr><th>CIN</th><th>Prénom</th><th>nom de famille</th><th>sexe</th><th>Numéro de téléphone</th><th>Date de naissance</th></tr>
		<% for (Client a : clients){ %>
			<tr>
				<td> <%= a.getCin() %></td>
				<td> <%= a.getFirstName() %></td>
				<td> <%= a.getLastName() %></td>
				<td> <%= a.getSexe() %></td>
				<td> <%= a.getNumber() %></td>
				<td> <%= a.getBrithDate() %></td>
				
			</tr>
		<%}%>
	</table>
</body>
</html>