<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>Nome</td>
				<td>Descrição</td>
				<td>Preço</td>
				<td>Ações</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${produtoList}" var="produto">
				<tr>
					<td>${produto.nome}</td>
					<td>${produto.descricao}</td>
					<td>${produto.preco}</td>
					<td><a href="edita?id=${produto.id}">Editar</a> | <a href="remove?id=${produto.id}">Remover</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>