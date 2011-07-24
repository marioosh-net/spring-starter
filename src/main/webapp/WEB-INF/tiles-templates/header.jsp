<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

<%-- <tiles:insertDefinition name="debug"/> --%>

<div class="left">
	<!-- dodanie definicji bezposrednio -->
	<tiles:insertDefinition name="logo"/>
</div>
<div class="right">
	<a href="<c:url value="/home?lang=pl"/>">PL</a>
	<a href="<c:url value="/home?lang=en"/>">EN</a>
</div>