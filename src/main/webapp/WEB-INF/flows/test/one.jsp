<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<t:layout>
	Page 1<span> ${helloMessage}</span><br/>
	<a href="${flowExecutionUrl}&_eventId=two">Two</a><br/>
	<a href="${flowExecutionUrl}&_eventId=data">Data</a><br/>
	<a href="${flowExecutionUrl}&_eventId=custom-handler">Custom Flow Handler</a><br/>
	<a href="${flowExecutionUrl}&_eventId=home">&raquo;&#160;MVC</a>
	<a href="${flowExecutionUrl}&_eventId=home2">&raquo;&#160;MVC2</a>
	
	<a href="${flowExecutionUrl}&_eventId=test2">WebFlow - test2</a>

</t:layout> 