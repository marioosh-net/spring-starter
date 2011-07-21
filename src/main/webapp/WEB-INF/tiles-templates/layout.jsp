<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
    <title><tiles:getAsString name="title" /></title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>" />
</head>
<body>
	<a href="<c:url value="/app/home" />">HOME</a>
    <div id="header">
       <div id="headerTitle"><tiles:insertAttribute name="header" /></div>
    </div>
    <div id="menu">
       <tiles:insertAttribute name="menu" />
    </div>    
    <div id="content">
       <tiles:insertAttribute name="body" />
    </div>
    <div id="footer">
       <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>
