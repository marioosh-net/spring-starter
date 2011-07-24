<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>

	<h2>Page 1</h2>
	<span> ${msg}</span><br/>
	flow variable:${user.login}<br/>
	<a href="${flowExecutionUrl}&_eventId=two">Page 2</a><br/><br/>
	<a href="${flowExecutionUrl}&_eventId=data">Data</a><br/>
	<a href="${flowExecutionUrl}&_eventId=custom-handler">Custom Flow Handler</a><br/>
	<a href="${flowExecutionUrl}&_eventId=home">&raquo;&#160;MVC</a>
	<a href="${flowExecutionUrl}&_eventId=home2">&raquo;&#160;MVC2</a>
	
	<a href="${flowExecutionUrl}&_eventId=test2">WebFlow - test2</a>
