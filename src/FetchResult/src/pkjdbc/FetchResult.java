/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkjdbc;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class FetchResult {
            public static void main(String[]args){
              Connection con=null;  
                
                try
                {
                  Class.forName("oracle.jdbc.OracleDriver");
                  
                    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
                    
                    String query = "select * from Student1 order by sno";
                    Statement stmt = con.createStatement();
                    
                    ResultSet rs = stmt.executeQuery(query);
                    
                    while(rs.next()){
                        System.out.println(rs.getShort("Sno")+ " "+ rs.getString("Sname") +" "+rs.getString("Sage")); 
                    }
                        rs.close();
                        stmt.close();
                        con.close();
                }
                catch(Exception e){
                   System.out.println(e);
                }
            }
}
