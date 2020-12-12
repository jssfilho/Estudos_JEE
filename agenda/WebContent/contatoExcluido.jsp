<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contato Excluido!</title>
</head>
<body>

	<c:if test="${not empty name}">
		<h3>Contato de ${name} excluido com sucesso!</h3>
	</c:if>

	<c:if test="${empty name}">
		<h3>Contato nao cadastrado!</h3>
	</c:if>
		<br/>
		<a href='/agenda/'>Voltar</a>
</body>
</html>