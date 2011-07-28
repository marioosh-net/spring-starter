<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<h2>Page 1</h2>
	<span> ${msg}</span>

	<h2>Wizard 1/3</h2>
	<form:form modelAttribute="user" method="post" id="form1">
		<t:input name="login"/>
		<t:input name="email"/>
		
		<a href="#" onclick="jQuery('#form1').submit();"><spring:message code="button.next"/></a>
		
		<%-- eventId przekazywany w polu ukrytym --%>
		<input type="hidden" name="_eventId" value="two"/>
	</form:form>
	<br/>

	<%-- eventId przekazywany w url --%>
	<a href="${flowExecutionUrl}&_eventId=end">End State</a><br/>
	<a href="${flowExecutionUrl}&_eventId=home">&laquo;&#160;back to MVC</a><br/>
	