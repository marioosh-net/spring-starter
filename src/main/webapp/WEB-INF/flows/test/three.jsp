<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<h2>Page 2</h2>
	<span> ${msg}</span>

	<h2>Wizard 3/3</h2>
	<spring:message code="label.login"/>: <span class="bold">${user.login}</span><br/>
	<spring:message code="label.email"/>: <span class="bold">${user.email}</span><br/>
	<spring:message code="label.firstname"/>: <span class="bold">${user.firstname}</span><br/>
	<spring:message code="label.lastname"/>: <span class="bold">${user.lastname}</span><br/>
	<a href="${flowExecutionUrl}&_eventId=two">Back</a><br/><br/>
	

	<a href="${flowExecutionUrl}&_eventId=home">&raquo;&#160;redirect (to MVC)</a><br/>
