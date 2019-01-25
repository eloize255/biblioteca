<%@page import="farmacia.models.Compra"%>
<%@page import="java.util.List"%>
<%@page import="farmacia.daos.CompraDAO"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="../menu.jsp"></c:import>
	<h1>Compras Realizadas:</h1>

	<table border="2">
		<thead>
			<tr>
				<th>Cliente</th>
				<th>Produto</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="compra" items="${compras}">
				<tr>
					<td>${compra.cliente.nome}</td>
					<td>${compra.produtos.nome}</td>
					<td><a href="/Farmaciaspring/compras/remover?id=${compra.id }">Remover</a></td>
					<td><a href="https://www2.correios.com.br/sistemas/rastreamento/">Acompanhamento de Compra!</a></td>
					
				</tr>
			</c:forEach>

		</tbody>
		</table>

</body>
</html>