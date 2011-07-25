<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<div class="left" style="width: 300px;">
		<h2>Add User</h2>
		<form:form modelAttribute="user">
			<t:input name="login"/>
			<div class="fcell">
				<div class="clabel"><spring:message code="label.password"/></div>
				<div class="cdata"><form:password path="password"/></div>
				<div class="cmsgs"><form:errors path="password"/></div>
			</div>							
			<t:input name="email"/>
			<t:input name="firstname"/>
			<t:input name="lastname"/>
			<t:input name="telephone"/>
			<t:input name="date"/>
			<input type="submit" value='<spring:message code="button.ok"/>'/>
		</form:form>
		
		<script>
		jQuery("#telephone").mask("999 999 999", {placeholder:" "});
		jQuery("#date").mask("99.99.9999");
		</script>
	</div>
	
	<div class="right" style="width: 400px;">
		<h2>Users</h2>
		<ul>
		<c:forEach items="${users}" var="user">
			<li>${user.login}: ${user.firstname}: ${user.lastname}: ${user.email}: <fmt:formatDate value="${user.date}" pattern="dd.MM.yyyy"/>: <a href="<c:url value="json?id=${user.id}"/>">json</a></li>
		</c:forEach>
		</ul>
	</div>
	<div class="clear"></div>
