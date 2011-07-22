<%@ tag description="standard input" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<%@ attribute name="name" required="true" type="java.lang.String" %>
<%-- label/input/errors --%>
<div class="fcell">
	<div class="clabel"><spring:message code="label.${name}"/></div>
	<div class="cdata"><form:input path="${name}"/></div>
	<div class="cmsgs"><form:errors path="${name}"/></div>
</div>	
