/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkjdbc;
import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class InsertData {
   public static void main(String[]args) throws IOException{
      DataInputStream dis = new DataInputStream(System.in); 
      
      System.out.println("Enter Sno:");
      int sno = Integer.parseInt(dis.readLine());
      System.out.println("Enter Sname:");
      String sname = dis.readLine();
      System.out.println("Enter age:");
      int age = Integer.parseInt(dis.readLine());
       Connection con=null;
      try
      {
          Class.forName("oracle.jdbc.OracleDriver");
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
         
         String query = "Insert into student1 Values ("+sno+",'"+sname +"',"+age+")";
         
         Statement stmt = con.createStatement();
         stmt.executeUpdate(query);
         
         stmt.close();
         con.close();
         System.out.println("Record Inserted");
       
      }
      catch(Exception e){
          System.out.println(e);
      }
      
   }
}
