<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List,br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
	<header>
	<title>Java Standar Taglib</title>
	</header>
	<body>
		<c:if test="${not empty empresa}">
			<p>Empresa ${empresa} cadastrada com sucesso!</p>
		</c:if>
		<c:if test="${empty empresa}">
			<p>Nenhuma empresa cadastrada!</p>
		</c:if>
		
		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>${empresa.getNome()} - <fmt:formatDate value="${empresa.getDataAbertura()}" pattern="dd/mm/yyyy"/>
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}">Remover</a>
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">Editar</a>
				</li>
			</c:forEach>
			
		</ul>
	</body>
</html>