<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">

<!-- Delimitor (SCRIPTLET < % % > this goes to service in servlet -->
<!--  Tomcat is a servlet container and while running JSP converts to servlet -->
<!-- Impilicit objects in jsp  - given by tomcat-->
<!--< %@page import="java.util.Scanner" %> 
DIRECTIVE imports-->

<%!
	int k =0;
%>
<!-- DECLARATION This not goes to service but go to declaration part outside service in servlet -->

<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	
	pageContext.setAttribute("name","Ganapriya",PageContext.SESSION_SCOPE);
	
	int k=i+j;
	out.println("Output"+k);
%>

<%= "Hello" %>
<!-- EXPRESSION Go into out.print -->

</body>
</html>