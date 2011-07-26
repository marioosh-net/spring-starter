<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<h2>Page 2</h2>
	<span> ${msg}</span>
	
	<h2>Wizard 2/3</h2>
	<form:form modelAttribute="user" method="post">
		<t:input name="firstname"/>
		<t:input name="lastname"/>
	
		<%-- eventId od ktorego zalezy tranzycja przekazywany przez name, tutaj 'one' --%>
		<input type="submit" value="<spring:message code="button.prev"/>" name="_eventId_one"/>
		
		<%-- eventId od ktorego zalezy tranzycja przekazywany przez name, tutaj 'three' --%>
		<input type="submit" value="<spring:message code="button.next"/>" name="_eventId_three"/>
	</form:form>
	<br/>
	
	<a href="${flowExecutionUrl}&_eventId=home">&raquo;&#160;redirect (to MVC)</a><br/>
