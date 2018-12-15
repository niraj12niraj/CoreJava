<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String bn=request.getParameter("branch");
if(bn.equals("MKR")){
%>
<jsp:forward page="mkr.jsp">
<jsp:param name="bn"value="MKR"/>
<jsp:param name="email"value="mkr@jlc.com"/>
</jsp:forward>
<%}
else if(bn.equals("BTM")){
%>
<jsp:forward page="btm.jsp">
<jsp:param name="bn"value="BTM"/>
<jsp:param name="email"value="btm@jlc.com"/>
</jsp:forward>
<%
}
%>
</body>
</html>

