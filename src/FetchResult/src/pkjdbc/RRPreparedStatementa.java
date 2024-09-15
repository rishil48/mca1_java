/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkjdbc;
import java.sql.*;
import java.io.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Dell
 */
public class RRPreparedStatementa {
    public static void main(String []args) throws IOException{
        DataInputStream dis = new DataInputStream (System.in);
        Connection con=null;
        

        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
            PreparedStatement pstmt = con.prepareStatement("insert into Student1 values(?,?,?)");
            
            while (true){
                System.out.println("Enter Sno ");
                int sno = Integer.parseInt(dis.readLine());
                System.out.println("Enter Sname ");
                String sname =dis.readLine();
                System.out.println("Enter age");
                 int sage = Integer.parseInt(dis.readLine());
                 pstmt.setInt(1, sno);
                 pstmt.setString(2, sname);
                 pstmt.setInt(3, sage);
                 
                 int i =pstmt.executeUpdate();
                 
                 System.out.println(i + "Recored Inserted");
                 System.out.println("Do You Want to Continue: Y/N");
                 String option = dis.readLine();
                 if(option.equals("N")){
                     break;
                 }
            }
            con.close();
        }
        catch(Exception e){
            
        }
        System.out.println("Record Added Successfully");
}
}
