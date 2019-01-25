<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
		margin:0px;
		padding:0px;
	}
	
	article{
	float:left;
	width:30%;
	height:;
	margin-top:80px;
	margin-left:35%;
	background-color:rgda(0,0,0,0.2);
	border-radius:10px;
	padding:20px;
	
	}
</style>
</head>
<body>

<c:import url="../menu.jsp"></c:import>
<article>
	<h1>Realizar Compra</h1>
	<form action="/Farmaciaspring/compras/comprar" method="post">
		
			Clientes <select name="cliente.id">
				<c:forEach var="cliente" items="${clientes}">
					<option value="${cliente.id}">${cliente.nome }</option>
				</c:forEach>
			</select>
		

		
			Produtos <select name="produtos.id">
				<c:forEach var="produto" items="${produtos}">
					<option value="${produto.id}">${produto.nome}</option>
				</c:forEach>
			</select>
			
			<button type="submit">Comprar!</button>
		

	</form>
</article>
</body>
</html>