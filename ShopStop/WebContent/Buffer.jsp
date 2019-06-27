<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buffer size of Implicit object</title>
</head>
<body>
<h1>Buffer size of Implicit Object</h1>
<%
    int size=out.getBufferSize();
	int availsize=out.getRemaining();
	int usedsize=size-availsize;
%>
<b>Buffering status :</b><br>
<b>Total Size: </b><%=size  %><br/>
<b>Available Size:</b><%=availsize %></br>
<b>Used Size: </b><%=usedsize %></br>


</body>
</html>