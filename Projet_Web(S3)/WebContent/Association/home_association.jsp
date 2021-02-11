<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Association</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style_sans_slider.css">
</head>
<body>
	<div class="container">
		<div class="header">
			<img class="logo" src="images/logoHero.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="hey.create_demande_ass">Créer Une Demande</a></li>
					<li><a href="hey.consult_demande_ass">Consulter Mes Demandes</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Sign Out</button></a>
		</div>

		<div class="content"> <p>Vous êtes ${ sessionScope.ass_name } ${ sessionScope.ass_id } !</p></div>
		<c:set var="age" value="26"/>
		<c:if test="${age >= 18}">
		 <c:out value="You are eligible for voting!"/>
		</c:if>
		<c:if test="${age < 18}">
		 <c:out value="You are not eligible for voting!"/>
		</c:if>
		<div class="footer">Footer</div>
	</div>	
</body>
</html>