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
 * Servlet implementation class UserRelated
 */
public class UserRelated extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRelated() {
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
		
		String u_email, u_pass;
		u_email = request.getParameter("email");
		u_pass = request.getParameter("psv");
		
		try
		{
			Connection con=ConnectDB.getConnect();
			PreparedStatement ps1=con.prepareStatement("select * from user_tbl where email=? and password=?");
			ps1.setString(1, u_email);
			ps1.setString(2, u_pass);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next())
			{
				Usersource.setEm("u_email");
				Usersource.setPassword("u_pass");
				response.sendRedirect("UserLoginSuccessful.html");
			}
			else
			{
				response.sendRedirect("userrelated.html");
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
