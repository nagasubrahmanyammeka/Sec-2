import java.sql.*;
class Hai{
     public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sec2","root","#Sudheer@2007");
        if(con!=null)
           System.out.println("Connected Successfully");
        else 
           System.out.println("Not connected...");
       
       Statement stmt = con.createStatement();
       int n=stmt.executeUpdate("create table student(id int primary key, name varchar(25), email varchar(25)");
       System.out.println(n);



}

}