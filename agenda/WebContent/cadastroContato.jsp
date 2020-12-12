<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoContato" var="linkServletNovoContato"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Contato</title>
</head>
<body>
	<form action="${linkServletNovoContato}" method="post">
		<h3>Novo Contato</h3>
		<div>
			Nome: <input type="text" name="name" />
		</div>
		<br />
		<div>
			Telefone: <input type="text" name="phone" />
		</div>
		<br />
		<button type="submit"> Salvar</button>
		<a href='/agenda/'>Voltar</a>
	</form>
</body>
</html>