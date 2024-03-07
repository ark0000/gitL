<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>    
<a href="Helloworld">HelloWorld</a>

<%=  new java.util.Date() %>
<%=  "Hello HE" %>
<%! 
String name=" HELL " ;
int a=10;
int[] a1={12,3,4,5};

String add(){
int sum=0;
	for(int i:a1){
sum=sum+i;
		
	}
	return ""+sum;
}

%>
name is <%= add()+" "+name %>


</body>


</html>