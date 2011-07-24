<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<h2>Page 2</h2>
	<span> ${msg}</span><br/>
	flow variable:${user.login}<br/>
	<a href="${flowExecutionUrl}&_eventId=one">Page 1</a><br/><br/>
	<a href="${flowExecutionUrl}&_eventId=home">&raquo;&#160;MVC</a>
