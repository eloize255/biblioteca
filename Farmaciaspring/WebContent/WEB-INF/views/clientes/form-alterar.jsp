<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="../menu.jsp"></c:import>
	<h1>Alterar Cliente</h1>
	<form action="/Farmaciaspring/clientes/alterar" method="post">
		<input type="hidden" name="comando" >
		<div>
			<label>ID: </label> 
			<input type="hidden" readonly="readonly" name="id" value="${cliente.id }">
		</div>
		
		<div>
			<label>Nome: </label> 
			<input type="text" name="nome" value="${cliente.nome }">
		</div>
		<div>
			<label>Cpf: </label> 
			<input type="text" name="cpf" value="${cliente.cpf }">
		</div>
		<div>
			<label>Idade: </label> 
			<input type="text" name="idade" value="${cliente.idade }">
		</div>
		<div>
			<label>Endereço: </label> 
			<input type="text" name="endereco" value="${cliente.endereco }">
		</div>
		<div>
			<label>Email: </label> 
			<input type="text" name="email" value="${cliente.email }">
		</div>
		<div>
			<button type="submit">Alterar</button>
		</div>
	</form>

</body>
</html>