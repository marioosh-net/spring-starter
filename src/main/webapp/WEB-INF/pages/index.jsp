<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<t:layout>
	<img src="<c:url value="/images/ajax.gif"/>"/>	
	<div>
		<spring:message code="hello"/><br/>${msg}
	</div>
	
	<a href="<c:url value="/app/test?msg=Hello Flow!"/>">&raquo;&#160;WebFlow</a>
	<a href="<c:url value="/app/form"/>">&raquo;&#160;Form</a><br/>
	<a href="<c:url value="/app/tiles"/>">Tiles2 EXAMPLE</a>
	
</t:layout>
