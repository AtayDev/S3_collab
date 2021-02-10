<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Donateur</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>
	
		<div class="header">
			<img class="logo" src="images/logoHero.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="#">Consulter mes dons</a></li>
					<li><a href="#">Mon profile</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Sign Out</button></a>
		</div>
		<div class="Voila"><h1>Toutes les contributions sont importantes, meme les petites parmi eux!</h1></div>
		
		<div class="login-form">
				<form  action="Yes.participation_servlet" method="post">
						
						<input type="text" name="reference" class="input-box" placeholder="Reference du Demande ">
						<input type="text" name="montant" class="input-box" placeholder="Montant">
						<button type="submit" class="login-btn">Sign In</button>
				</form>
				
		</div>
		<h1>Heeyyy</h1>
		<%@ include file="../Home/Footer.jsp" %> 
</body>
</html>