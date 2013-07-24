<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
	
<h2>
	Home Page
</h2>
context: ${context}
<div style="margin: 20px;">
	<spring:message code="hello"/>
	<c:if test="${not empty msg}"><br/>msg: ${msg}</c:if>
</div>

<a href="<c:url value="/secured"/>">Secured Area</a><br/>
<a href="<c:url value="/image"/>"/>HttpServletResponse</a><br/>
<a href="<c:url value="/exception"/>"/>Exception</a><br/>
<a href="<c:url value="/exception2"/>"/>Exception 2</a><br/>
<a href="<c:url value="/users"/>"/>Users</a><br/>
<a href="<c:url value="/users2"/>"/>Users (Java only)</a><br/>
<a href="<c:url value="/responseBody"/>"/>@ResponseBody</a><br/>
<a href="<c:url value="/testowa"/>"/>Test Page</a><br/>
<a href="<c:url value="/asyncTest"/>"/>Async method test</a><br/>
<a href="<c:url value="/asyncTest2"/>"/>Async method on request bean</a><br/>
<a href="<c:url value="/testRMI"/>"/>test RMI</a><br/>
<a href="<c:url value="/testWS"/>"/>test WS</a><c:if test="${acc != null}"> ${acc}</c:if>