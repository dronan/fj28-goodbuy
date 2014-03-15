<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="adiciona">
		<fieldset>
			<legend>Adicionar Produto</legend>
			<label for="nome">Nome:</label> <input id="nome" type="text"
				name="produto.nome" /> <label for="descricao">Descricao:</label>
			<textarea id="descricao" name="produto.descricao"></textarea>
			<label for="preco">Preco:</label> <input id="preco"
				name="produto.preco" type="text" />
			<button type="submit">Enviar</button>
		</fieldset>
	</form>
</body>
</html>