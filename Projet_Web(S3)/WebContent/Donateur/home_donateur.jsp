<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Association</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>
	
		<div class="header">
			<img class="logo" src="https://ihelp.group/wp-content/uploads/2020/06/ihelp-icon-.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="hey.consult_part_financement">Mes Financements</a></li>
					<li><a href="hey.consult_part_benevolat">Mes Benevolats</a></li>
					<li><a href="#">Mon profile</a></li>
				</ul>
			</nav>
			<a class="contact-link" href="Yes.auth_dona">Sign Out</a>
		</div>
		
		
		<div class="content"> <p>Vous �tes ${ sessionScope.dona_fname } ${ sessionScope.dona_id } !</p></div>
			<div class="Voila"><h1>Voila quelques projets que vous pouvez soutenir!</h1></div>
			<ul class="cards">
			<c:forEach items="${demandesList}" var="d">
				<li class="cards__item">
				    <div class="card">
				      <img class="card__image card__image--fence" src="${d.filename}">
				      <div class="card__content">
				       <div class="card__title">Reference:${d.dem_id}</div>
				        <div class="card__title">Statut:${d.dem_statut}</div>
				        <div class="card__title" >Type: ${d.dem_type}</div>
				        <c:set var = "salary" scope = "session" value = "${d.dem_type}"/>
				        <div class="card__title">Ville:${d.dem_ville}</div>
				        <div class="card__title">Montant:${d.montant_but} </div>
				        <p class="card__text">This is the shorthand for flex-grow, flex-shrink and flex-basis combined. The second and third parameters (flex-shrink and flex-basis) are optional. Default is 0 1 auto. </p>
				        
				         <c:choose>
							 <c:when test="${d.dem_type=='Financement'}">
							    <button class="btn btn--block card__btn"><a href="hey.participer_financement_servlet">Participer</a></button>
							 </c:when>
							 <c:when test="${d.dem_type=='Benevolat'}">
							     <button class="btn btn--block card__btn"><a href="hey.participer_benevolat_servlet">Participer</a></button>
							 </c:when>
						</c:choose> 
				        
				      	 
				      </div>
				    </div>
	  			</li>	  
			
			
			</c:forEach>
			</ul>
		
		
		
		<%@ include file="../Home/Footer.jsp" %> 
		
	
</body>
</html>