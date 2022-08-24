<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Using pi= <%=pi%>, the area of a circle<br>
with a radius of 3 is <%=area(3)%>
<%!
double area(double r)
{    return r*r*pi;    }
%>
<%! final double pi=3.14159; %>
<%=session.getId()%>
</body>
</html>