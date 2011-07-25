<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

<div class="menu-item">
	<a href="<c:url value="/home" />">HOME</a>
</div>

<div class="menu-item">
	<a href="<c:url value="/form"/>">Form</a>
</div>

<div class="menu-item">
	<a href="<c:url value="/test?msg=Input Message to WebFlow!"/>">To WebFlow</a>
</div>

<div class="menu-item">
	<a href="<c:url value="/home" />">To MVC</a>
</div>

<div class=" right">
	<security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
		<security:authentication property="principal.username" />&#160;<a href="<c:url value="/logout"/>"><spring:message code="button.logout"/></a>
	</security:authorize>
	<security:authorize ifNotGranted="ROLE_USER,ROLE_ADMIN">
		<a href="<c:url value="/login"/>"><spring:message code="button.login"/></a>
	</security:authorize>
</div>
	
<div class="clear"></div>
