<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

<h2>Login</h2>
<security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
	<security:authentication property="principal.username" />&#160;<a href="<c:url value="/logout"/>"><spring:message code="button.logout"/></a>
</security:authorize>
<security:authorize ifNotGranted="ROLE_USER,ROLE_ADMIN">
	<form class="sform" id="jf" name="f" action="<c:url value="/j_spring_security_check"/>" method="post">
		<c:if test="${!empty param.loginfail}">
			<div class="modal-message">
				<span class="errors"><spring:message code="text.loginError"/></span>
			</div>
		</c:if>				
		<input type="text" id="username" name="j_username" value="" size="5" title="login"/>
		<input type="password" name="j_password" value="" size="6" title="password" />
		<br/><input type="checkbox" name="_spring_security_remember_me" style="width: 15px; height: 10px;" alt="remember me" title="remember me"/><spring:message code="label.rememberme"/>
		<br/><a href="javascript:;" onclick="jQuery('#jf').submit();"><spring:message code="button.login"/></a>
		<input type="submit" class="hiddensubmit"/>
	</form>
</security:authorize>