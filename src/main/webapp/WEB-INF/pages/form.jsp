<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	NAME:${photo.name}<br/>
	ID:${photo.id}
	
	<form:form modelAttribute="photo">
		<form:input path="id"/><form:errors path="id"/><br/>
		<form:input path="name"/><form:errors path="name"/><br/>
		<input type="submit" value="Submit"/>
	</form:form>
