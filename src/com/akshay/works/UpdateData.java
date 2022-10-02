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
 * Servlet implementation class UpdateData
 */
public class UpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateData() {
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
		
		String mobile = Usersource.getMob();
		String pass = Usersource.getPassword();
		int p_availcng =Integer.parseInt(request.getParameter("newavailcng"));
		try
		{
			Connection con=ConnectDB.getConnect();
			PreparedStatement ps1=con.prepareStatement("update cngpumps_tbl set avail_cng=? where contact=? and password=?");
			ps1.setInt(1, p_availcng);
			ps1.setString(2, mobile);
			ps1.setString(3, pass);
			int i=ps1.executeUpdate();
			if(i>0)
			{
				Usersource.setMob(mobile);
				Usersource.setPassword(pass);
				response.sendRedirect("DataUpdatedSuccessfuly.html");
			}
			else
			{
				response.sendRedirect("updatedata.html");
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
