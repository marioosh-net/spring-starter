<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<t:layout>
<h2>Error 500</h2>
<c:if test="${not empty exception.message}">${exception.message}</c:if>
</t:layout> 
