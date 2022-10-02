package com.akshay.works;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistration
 */
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistration() {
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
		
		
		String u_name = request.getParameter("name");
		String u_email = request.getParameter("email");
		String u_mobile = request.getParameter("mob");
		String u_city = request.getParameter("city");
		String u_password = request.getParameter("psv");
		
		try
		{
			Connection con = ConnectDB.getConnect();
			PreparedStatement ps1 = con.prepareStatement("insert into user_tbl values(?,?,?,?,?)");
			ps1.setString(1, u_name);
			ps1.setString(2, u_email);
			ps1.setString(3, u_mobile);
			ps1.setString(4, u_password);
			ps1.setString(5, u_city);
			
			int i = ps1.executeUpdate();
			
			if(i>0)
			{
				response.sendRedirect("userregi.html");
			}
			else
				response.sendRedirect("userregi.html");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
