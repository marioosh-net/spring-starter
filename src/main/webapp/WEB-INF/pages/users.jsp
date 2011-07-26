<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<ul>
<c:forEach items="${users}" var="user">
	<li>${user.login}: ${user.firstname}: ${user.lastname}: ${user.email}: <fmt:formatDate value="${user.date}" pattern="dd.MM.yyyy"/>: <a href="<c:url value="json?id=${user.id}"/>">json</a>
	<a href="#" onclick="openModal(this); return false;" class="modalInput modalInputHref" rel="#yesno" rev="<c:url value="/delete?id=${user.id}"/>"><spring:message code="button.delete"/></a>
	</li>
</c:forEach>
</ul>