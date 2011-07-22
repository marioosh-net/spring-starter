<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	NAME:${user.login}<br/>
	ID:${user.id}
	
	<form:form modelAttribute="user">
		<form:input path="id"/><form:errors path="id"/><br/>
		<form:input path="login"/><form:errors path="login"/><br/>
		<input type="submit" value="Submit"/>
	</form:form>
	
	<script>
	jQuery("#id").mask("9?99999")
	</script>
