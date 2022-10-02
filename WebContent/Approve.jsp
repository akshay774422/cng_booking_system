
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
	    String pos = "approved";
	    PreparedStatement ps2 = con.prepareStatement("update cngpumps_tbl set position=? where id=?");
	    ps2.setString(1, pos);
	    ps2.setInt(2, no);
	    int i=ps2.executeUpdate();
	    if(i>0)
	    {
	    	response.sendRedirect("ApprovecngPumps.jsp");
	    }
	    else
	    {
	    	response.sendRedirect("ApprovecngPumps.jsp");
	    }
	%>
</body>
</html>