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
	<h1>Cadastre-se</h1>
	<form action="/Farmaciaspring/clientes" method="post">
		<input type="hidden" name="comando" value="AdicionarCliente">
		<div>
			<label>Nome: </label> 
			<input type="text" name="nome">
		</div>
		<div>
			<label>Cpf: </label> 
			<input type="text" name="cpf">
		</div>
		<div>
			<label>Idade: </label> 
			<input type="text" name="idade">
		</div>
		<div>
			<label>Endereço: </label>
			<input type="text" name="endereco">
		</div>
		<label>Email: </label>
			<input type="text" name="email">
		</div>
		<div>
			<button type="submit">Adicionar</button>
		</div>
	</form>
</article>
</body>
</html>