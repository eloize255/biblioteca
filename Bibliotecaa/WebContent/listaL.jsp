<%@page import="java.text.SimpleDateFormat"%>
<%@page import="agenda.models.Livro"%>
<%@page import="java.util.List"%>
<%@page import="agenda.daos.LivroDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Lista de Livros:</h1>

	<table border="2">
		<thead>
			<tr>
				<th>Titulo</th>
				<th>Autor</th>
				<th>Editora</th>
				<th>Ano de Publicação</th>
				<th>Ano de Edição</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="livro" items="${livros }">
				<tr>
					<td>${livro.titulo }</td>
					<td>${livro.autor }</td>
					<td>${livro.editora }</td>
					<td>${livro.anoPublicacao.time }</td>
					<td>${livro.anoEdicao.time }</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>
</body>
</html>