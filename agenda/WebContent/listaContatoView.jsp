<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.ifpb.servlet.Contato" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Contatos</title>
</head>
<body>
		<c:if test="${not empty name}">
			Contato ${ name } modificado com sucesso!
		</c:if>
		<c:forEach items="${lista}" var="contato">
			<li>Nome: ${contato.name} </li>	
			<li>Data de Cadastro <fmt:formatDate value="${contato.dataDeCadastro}" pattern="dd/MM/yyyy"/></li>		
			<li>Phone: ${ contato.phone }</li>
			<br />
		</c:forEach>
		
	
	<a href='/agenda/'>Voltar</a>

</body>
</html>