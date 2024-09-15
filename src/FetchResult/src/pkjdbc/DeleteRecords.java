/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkjdbc;
import java.sql.*;
import java.io.*;
/**
 *
 * @author Dell
 */
public class DeleteRecords {
    public static void main(String[] args) throws IOException {
         DataInputStream dis = new DataInputStream(System.in); 
         System.out.println("Enter Sno for Deletion");
         
         int sno= Integer.parseInt(dis.readLine());
         Connection con = null;
         try
         {
            Class.forName("oracle.jdbc.OracleDriver");
            
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
            
            String query = "DELETE FROM Student1 WHERE Sno = " + sno;

            
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate(query);
            
            stmt.close();
            con.close();
         }
         catch(Exception e){
             System.out.println(e);
         }
         System.out.println("Record Deleted");
    }

    
}
