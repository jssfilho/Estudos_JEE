<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List, br.com.ifpb.servlet.Contato" %>
<c:url value="/excluirContato" var="linkServletExcluirContato"/>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Deletar Contato</title>
</head>
<body>
	<form action="${linkServletExcluirContato}" method="post">
			<h2>Excluir Contato</h2>
			<c:forEach items="${lista}" var="contato">
				<input type="checkbox" name="name" value='${contato.getName()}'/>
				<li>Name: ${ contato.getName() }</li>
				<li>Phone: ${ contato.getPhone() }</li>
				</br>
			</c:forEach>
			
			<button type="submit"> Excluir Contato </button>
			<a href='/agenda/'>Voltar</a>
	</form>
</body>
</html>