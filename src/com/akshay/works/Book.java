package com.akshay.works;

import java.io.IOException;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Book
 */
public class Book extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Book() {
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
		int u_availcng = 0;
		String u_name, u_contact, u_city, u_add;
		int p_id=Integer.parseInt(request.getParameter("pid"));
		int u_quantity=Integer.parseInt(request.getParameter("quantity"));
		u_name = request.getParameter("name");
		u_city = request.getParameter("city");
		u_add = request.getParameter("add");
		u_contact = request.getParameter("contact");
		try
		{
			
			Connection con=ConnectDB.getConnect();
			PreparedStatement ps1=con.prepareStatement("select * from cngpumps_tbl where id=?");
			ps1.setInt(1, p_id);
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				u_availcng=rs.getInt("avail_cng");
			}
			if(u_availcng>=u_quantity)
			{
				PreparedStatement ps4=con.prepareStatement("insert into viewbooking_tbl values(?,?,?,?,?,?,?)");
				ps4.setInt(1, 0);
				ps4.setString(2, u_name);
				ps4.setString(3, u_contact);
				ps4.setString(4, u_city);
				ps4.setString(5, u_add);
				ps4.setInt(6, u_quantity);
				ps4.setInt(7, p_id);
				int j=ps4.executeUpdate();
				
				int temp = u_availcng - u_quantity;
				PreparedStatement ps2=con.prepareStatement("update cngpumps_tbl set avail_cng=? where id=?");
				ps2.setInt(1, temp);
				ps2.setInt(2, p_id);
			    int i=ps2.executeUpdate();
			
				
				if(i>0 && j>0)
				{
					response.sendRedirect("userrelated.html");
					
				}
				else
				{
					response.sendRedirect("index.html");
				}
				}
			else
			{
				response.sendRedirect("unsuccessfulbooking.html");
			}
			
			
				
			}
			
	
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
