<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<t:layout>
	<img src="<c:url value="/r/images/ajax.gif"/>"/>	
	<div>
		<spring:message code="hello"/>
	</div>
	
	<a href="<c:url value="/test"/>">&raquo;&#160;WebFlow</a>
	
</t:layout>
