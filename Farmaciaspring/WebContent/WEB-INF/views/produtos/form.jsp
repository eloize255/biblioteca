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
	margin-top:70px;
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
	<h1>Adicionar Produtos</h1>
	<form action="/Farmaciaspring/produtos" method="post">
		<input type="hidden" name="comando" value="AdicionarProdutos">
		<div>
			<label>Nome: </label> 
			<input type="text" name="nome">
		</div>
		<div>
			<label>Data de Validade: </label> 
			<input type="text" name="dataValidade">
		</div>
		<div>
			<label>Preço: </label> 
			<input type="text" name="preco">
		</div>
		<div>
			<label>Marca: </label>
			<input type="text" name="marca">
		</div>
		<div>
			<button type="submit">Adicionar</button>
		</div>
	</form>

</article>
</body>
</html>