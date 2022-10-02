package com.akshay.works;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectDB 
{
	static Connection con = null;
	public static Connection getConnect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cngdb", "root", "");
			System.out.println("Done");
		}
		catch(Exception e)
		{    
			e.printStackTrace();
		}
		return con;
	}
}

