<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<h2>Page 1</h2>
	<span> ${msg}</span><br/>
	flow variable:${user.login}<br/>
	<a href="${flowExecutionUrl}&_eventId=two">Page 2</a><br/><br/>

	<a href="${flowExecutionUrl}&_eventId=end">End State</a><br/>
	<a href="${flowExecutionUrl}&_eventId=home">&raquo;&#160;redirect (to MVC)</a><br/>
	