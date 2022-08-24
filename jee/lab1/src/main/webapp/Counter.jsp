<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%! int count=0;    %>
<%count++;    %>
Welcome! You are visitor number
<%= count    %> --%>
<%! int count=0;    %>
<%   
    out.print("<html><body>");
    count++;
    out.print("Welcome! You are visitor number " +count);
    out.print("</body></html>");
%>
</body>
</html>