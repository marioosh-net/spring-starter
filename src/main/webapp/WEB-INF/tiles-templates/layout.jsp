<%@ include file="/WEB-INF/templates/taglibs.jsp" %>
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="description" content="" />
	<meta name="Keywords" lang="pl" content="">
	<meta name="Keywords" lang="en" content="">
	<script type="text/javascript">	
		var context = '<c:url value="/"/>'; 
		if(context == '/') {
			context = '';
		}
	</script>
	<%-- jQuery Library + ALL jQuery Tools --%>
	<script type="text/javascript" src="<c:url value="/r/js/jquery.tools.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/r/js/jquery.maskedinput-1.3.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/r/js/jquery.atmosphere.js"/>"></script>
	<script type="text/javascript">jQuery.noConflict();</script>
	<script type="text/javascript" src="<c:url value="/r/js/main.js"/>"></script>
	<link rel="stylesheet" type="text/css" href="<c:url value="/r/css/main.css"/>" media="screen">
	<title><spring:message code="label.appname"/><tiles:getAsString name="subtitle" /></title>
</head>
<body id="body">
	
	<div id="wrapper"> 
		<div id="header"> 
			<div class="fixedwidth"> 
				<tiles:insertAttribute name="header" />
			</div>		
		</div> 
	
		<div id="main"> 
			<div id="menu"> 
				<div class="fixedwidth"> 
					<tiles:insertAttribute name="menu" />
				</div> 
			</div> 
			
			<div id="content">		
				<div class="fixedwidth"> 
					<tiles:insertAttribute name="body" />
				</div> 
			</div> 
		</div> 
        <div id="push"></div> 
	</div> 
	
	<div id="footer"> 
		<div class="fixedwidth"> 
			<tiles:insertAttribute name="footer" />
		</div> 
	</div>
		
</body>
</html>