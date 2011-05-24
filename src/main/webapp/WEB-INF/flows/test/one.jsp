<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<t:layout>
	Page 1<span> ${helloMessage}</span><br/>
	<a href="${flowExecutionUrl}&_eventId=two">Two</a><br/>
	<a href="${flowExecutionUrl}&_eventId=home">&raquo;&#160;MVC</a>
	<a href="${flowExecutionUrl}&_eventId=home2">&raquo;&#160;MVC2</a>	
</t:layout> 