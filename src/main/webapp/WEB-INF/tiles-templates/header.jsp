<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

<!-- dodanie definicji bezposrednio -->
<tiles:insertDefinition name="logo"/>

<div class="right">
	<a href="<c:url value="/home?lang=pl"/>">PL</a>
	<a href="<c:url value="/home?lang=en"/>">EN</a>
</div>