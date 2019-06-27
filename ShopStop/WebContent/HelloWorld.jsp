<%@page import="org.apache.naming.java.javaURLContextFactory"%> //directive
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1>My first jsp</h1>
<p>Today's date:
<%=(new java.util.Date()).toLocaleString() %>  //exp
</p>
<font size="3" color="blue"></font>
<%
for(int num=1;num<=10;num++)
{out.println("welcome to jsp" +num+  "<br>"); }
%>  //scriplets
current time: <%= java.util.Calendar.getInstance().getTime() %>  //exp
<%! int data=50,data2=60; %> //declaration
<h2>value of the variable is : <%= data %> </h2>
<h2>value of the variable is : <%= data2 %> </h2>
<h2>sum of 2 nos is : <%=data +data2%> </h2>
<h2>diff of 2 nos is : <%=data2 -data%> </h2>
<%! 
int cube(int n)
{
return n*n*n;
}
%>
<h2> The cube of 3 is : <%=cube(3) %> </h2>
</body>
</html>