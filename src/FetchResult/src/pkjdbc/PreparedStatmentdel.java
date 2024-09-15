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
public class PreparedStatmentdel {
     public static void main(String []args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        Connection con = null;
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
        PreparedStatement pstmt = con.prepareStatement("delete from Student1 where Sno=?");
        
        while(true)
        {
            System.out.println("Enter Sno for deletion");
            int sno = Integer.parseInt(dis.readLine());
            pstmt.setInt(1,sno);
            int i= pstmt.executeUpdate();
            
            System.out.println(i + ": Record Deleted");
            System.out.println("Do You want to Continue:(Y/N)");
            String option = dis.readLine();
            if(option.equals("N")){
                break;
            }
        }
            con.close();
            pstmt.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Record Deleted Succesfully ");
    }
    
}
