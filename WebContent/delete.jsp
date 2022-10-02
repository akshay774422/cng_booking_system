<%@ page import="com.akshay.works.*" %>
<%@ page import="java.sql.*" %>
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
		int no = Integer.parseInt(request.getParameter("id"));
	    Connection con = ConnectDB.getConnect();
	    PreparedStatement ps2 = con.prepareStatement("delete from cngpumps_tbl where id=?");
	    ps2.setInt(1, no);
	    int i=ps2.executeUpdate();
	    if(i>0)
	    {
	    	response.sendRedirect("deletecngpumps.jsp");
	    }
	    else
	    {
	    	response.sendRedirect("ApprovecngPumps.jsp");
	    }
	%>
</body>
</html>