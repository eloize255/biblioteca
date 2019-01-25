<%@page import="java.text.SimpleDateFormat"%>
<%@page import="farmacia.models.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="farmacia.daos.ClienteDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="../menu.jsp"></c:import>
	<h1>Clientes Cadastrados:</h1>

	<table border="2">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Cpf</th>
				<th>Idade</th>
				<th>Endereço</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cliente" items="${clientes }">
				<tr>
					<td>${cliente.nome }</td>
					<td>${cliente.cpf }</td>
					<td>${cliente.idade }</td>
					<td>${cliente.endereco }</td>
					<td>${cliente.email }</td>
				<td><a href="/Farmaciaspring/clientes/remover?id=${cliente.id }">Remover</a></td>
				<td><a href="/Farmaciaspring/clientes/selecionar?id=${cliente.id }">Alterar</a></td>
				</tr>
			</c:forEach>

		</tbody>

	</table>

</body>
</html>