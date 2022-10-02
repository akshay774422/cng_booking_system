package com.akshay.works;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.akshay.works.ConnectDB;

/**
 * Servlet implementation class CNGPumpRegistration
 */
public class CNGPumpRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CNGPumpRegistration() {
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
		
		String p_name = request.getParameter("pn");
		String p_addre = request.getParameter("add");
		String p_city = request.getParameter("city");
		String p_taluka = request.getParameter("taluka");
		String p_district = request.getParameter("district");
		String p_opentime = request.getParameter("opentime");
		String p_closetime = request.getParameter("closetime");
		String p_mobileno = request.getParameter("mob");
		Float p_latitude = Float.parseFloat(request.getParameter("latitude"));
		Float p_longitude = Float.parseFloat(request.getParameter("longitude"));
		String p_password = request.getParameter("psv");
		Float p_availcng = Float.parseFloat(request.getParameter("availcng"));
		String pos = "pending";
		try
		{
			Connection con = ConnectDB.getConnect();
			PreparedStatement ps1 = con.prepareStatement("insert into cngpumps_tbl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps1.setInt(1, 0);
			ps1.setString(2, p_name);
			ps1.setString(3, p_addre);
			ps1.setString(4, p_mobileno);
			ps1.setString(5, p_city);
			ps1.setString(6, p_taluka);
			ps1.setString(7, p_district);
			ps1.setString(8, p_opentime);
			ps1.setString(9, p_closetime);
			ps1.setDouble(10, p_latitude);
			ps1.setDouble(11, p_longitude);
			ps1.setString(12, p_password);
			ps1.setDouble(13, p_availcng);
			ps1.setString(14, pos);
			int i = ps1.executeUpdate();
			
			if(i>0)
			{
				response.sendRedirect("CNGPumpRegistrationSuccessfuly.html");
			}
			else
				response.sendRedirect("cngpumpregi.html");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
