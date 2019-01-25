<%@page import="java.text.SimpleDateFormat"%>
<%@page import="farmacia.models.Produtos"%>
<%@page import="java.util.List"%>
<%@page import="farmacia.daos.ProdutoDAO"%>
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
	<h1>Produtos Disponíveis:</h1>

	<table border="2">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Data de Validade</th>
				<th>Preço</th>
				<th>Marca</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="produto" items="${produtos }">
				<tr>
					<td>${produto.nome }</td>
					<td><fmt:formatDate value="${produto.dataValidade.time}"
						pattern="dd/MM/yyyy" /></td>
					<td>${produto.preco }</td>
					<td>${produto.marca }</td>
					<td><a href="/Farmaciaspring/produtos/remover?id=${produto.id }">Remover</a></td>
				</tr>
			</c:forEach>

		</tbody>

	</table>


</body>
</html>