<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
					<li><a href="#">Consulter Mes Dons</a></li>
					<li><a href="#">Mon Profile</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Sign Out</button></a>
		</div>

		<div class="content"> <p>Vous �tes ${ sessionScope.dona_fname } ${ sessionScope.dona_id } !</p></div>
		<div class="footer">Footer</div>
	</div>	
</body>
</html>