package com.klu.JdbcApp;

import java.sql.*;
public class App {
	public static void main(String[] args)throws Exception{
		// Step-1 - Loading the Driver Class
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Step-2 - Connecting to the DB
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sec2","root","#Sudheer@2007");
        if(con!=null)
           System.out.println("Connected Successfully");
        else 
           System.out.println("Not connected...");
       String query = "insert into Student values (109,'Mahesh','mahesh@gmail.com')";
       Statement stmt = con.createStatement();
       int n=stmt.executeUpdate(query);
       System.out.println(n);                                                                                                                                                                                                                                                                                                                                                                                                                
       



}
}  
   



