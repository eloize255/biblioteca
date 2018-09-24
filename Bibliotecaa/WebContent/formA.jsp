<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Adicionar Aluno</h1>
	<form action="sistema" method="post">
		<input type="hidden" name="comando" value="AdicionarAluno">
		<div>
			<label>Matricula: </label> 
			<input type="text" name="matricula">
		</div>
		<div>
			<label>nome: </label> 
			<input type="text" name="nome">
		</div>
		<div>
			<label>Endereço: </label> 
			<input type="text" name="endereco">
		</div>
		<div>
			<label>Data de Nascimento: </label>
			<input type="text" name="dataNascimento">
		</div>
		<div>
			<button type="submit">Adicionar</button>
		</div>
	</form>

</body>
</html>