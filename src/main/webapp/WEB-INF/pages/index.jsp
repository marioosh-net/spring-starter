<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
	
<h2>
	Home Page
</h2>
<div style="margin: 20px;">
	<spring:message code="hello"/>
	<c:if test="${not empty msg}"><br/>msg: ${msg}</c:if>
</div>

