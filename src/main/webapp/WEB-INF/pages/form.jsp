<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<h2>Add User</h2>
	<form:form modelAttribute="user">
		<spring:message code="label.login"/><form:input path="login"/><form:errors path="login"/><br/>
		<spring:message code="label.password"/><form:password path="password"/><form:errors path="password"/><br/>
		<spring:message code="label.email"/><form:input path="email" /><form:errors path="email"/><br/>
		<spring:message code="label.firstname"/><form:input path="firstname" /><form:errors path="firstname"/><br/>
		<spring:message code="label.lastname"/><form:input path="lastname" /><form:errors path="lastname"/><br/>
		<spring:message code="label.telephone"/><form:input path="telephone" /><form:errors path="telephone"/><br/>
		<spring:message code="label.date"/><form:input path="date" /><form:errors path="date"/><br/>
		<input type="submit" value="Submit"/>
	</form:form>
	
	<script>
	jQuery("#id").mask("9?99999");
	jQuery("#date").mask("9999-99-99");
	</script>
	
	<h2>Users</h2>
	<ul>
	<c:forEach items="${users}" var="user">
		<li>${user.login}</li>
	</c:forEach>
	</ul>
