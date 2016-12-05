
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri='/WEB-INF/tlds/template.tld' prefix='template' %>

<template:insert template='/shared/templates/baseTemplate.jsp'>

	<template:put name='title' content='Error 500' direct='true'/>
	
	<template:put name='header' content='/shared/header.jsp' />
	 
		<template:put name='content' >
			<h1>Erreur 500</h1>
			<br>
			<h2>Erreur interne au serveur</h2>
			<br>
			
			Come back another time
		</template:put>
	
	<template:put name='footer' content='/shared/footer.jsp' />
	
</template:insert>


	
