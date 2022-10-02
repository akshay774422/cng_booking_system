package com.akshay.works;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CNGPumpsLoginFail
 */
public class CNGPumpsLoginFail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CNGPumpsLoginFail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String mobile,pass;
		mobile = request.getParameter("mob");
		pass = request.getParameter("psv");
		
		try
		{
			Connection con=ConnectDB.getConnect();
			PreparedStatement ps1=con.prepareStatement("select * from cngpumps_tbl where contact=? and password=?");
			ps1.setString(1, mobile);
			ps1.setString(2, pass);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next())
			{
				Usersource.setMob(mobile);
				Usersource.setPassword(pass);
				response.sendRedirect("updatedata.html");
			}
			else
			{
				response.sendRedirect("cngpumpsloginfail.html");
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
