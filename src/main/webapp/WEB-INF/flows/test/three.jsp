<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<h2>Page 3</h2>
	<span> ${msg}</span>

	<h2>Wizard 3/3</h2>
	<spring:message code="label.login"/>: <span class="bold">${user.login}</span><br/>
	<spring:message code="label.email"/>: <span class="bold">${user.email}</span><br/>
	<spring:message code="label.firstname"/>: <span class="bold">${user.firstname}</span><br/>
	<spring:message code="label.lastname"/>: <span class="bold">${user.lastname}</span><br/>
	<a href="${flowExecutionUrl}&_eventId=two"><spring:message code="button.prev"/></a><br/><br/>
	

	<a href="${flowExecutionUrl}&_eventId=home">&laquo;&#160;back to MVC</a><br/>
