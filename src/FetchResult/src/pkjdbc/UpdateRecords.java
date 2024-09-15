/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkjdbc;
import java.io.*;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class UpdateRecords {
    public static void main(String[]args)throws IOException{
        DataInputStream dis = new DataInputStream(System.in);
        System .out.println("Enter Sno for Updation");
        int sno = Integer.parseInt(dis.readLine());
        System.out.println("Enter Sname for Updation");
        String sname = dis.readLine();
        System.out.println("Enter Sage for Updation");
        int sage= Integer.parseInt(dis.readLine());
        Connection con = null;
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
            String query= "update Student1 set Sname='"+sname+"',Sage="+sage+" where Sno="+sno+"" ;
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            con.close();
            System.out.println("Record Updated");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
