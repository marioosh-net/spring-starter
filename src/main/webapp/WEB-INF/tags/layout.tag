<%@tag description="Body Wrapper" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="description" content="" />
	<meta name="Keywords" lang="pl" content="">
	<meta name="Keywords" lang="en" content="">
	<script type="text/javascript">	var context = '<c:url value="/"/>'; if(context == '/') {context = '';}</script>
	<%-- jQuery Library + ALL jQuery Tools --%>
	<script type="text/javascript" src="<c:url value="/r/js/jquery.tools.min.js"/>"></script>
	<script type="text/javascript">jQuery.noConflict();</script>
		
	<script type="text/javascript" src="<c:url value="/r/js/main.js"/>"></script>
	<link rel="stylesheet" type="text/css" href="<c:url value="/r/css/main.css"/>" media="screen">
	<title><spring:message code="label.appname"/></title>
</head>
<body id="body">
	<%-- <%@include file="/WEB-INF/templates/debug.jsp" %> --%>
	<div id="wrapper">	
		<div id="main">
			<div id="content">		
				<div class="fixedwidth">
					<div class="left"><a href="<c:url value="/home" />">HOME</a></div>
					<div class="right">
						<a href="?lang=pl">PL</a>
						<a href="?lang=en">EN</a>
					</div>
					<div class="clear"></div>
					
					<jsp:doBody/>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
