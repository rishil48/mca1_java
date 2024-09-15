/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkjdbc;
import java.io.DataInputStream;
import java.io.IOException;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class StudentDatabaseManager {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        StudentDatabaseManager manager = new StudentDatabaseManager();

        System.out.println("Choose Operation: ");
        System.out.println("1: Insert Record");
        System.out.println("2: Fetch Records");
        System.out.println("3: Update Record");
        System.out.println("4: Delete Record");
        int choice = Integer.parseInt(dis.readLine());

        switch (choice) {
            case 1:
                manager.insertData();
                break;
            case 2:
                manager.fetchResult();
                break;
            case 3:
                manager.updateRecords();
                break;
            case 4:
                manager.deleteRecords();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void insertData() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Sno:");
        int sno = Integer.parseInt(dis.readLine());
        System.out.println("Enter Sname:");
        String sname = dis.readLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(dis.readLine());

        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");

            String query = "Insert into student1 Values (" + sno + ",'" + sname + "'," + age + ")";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

            stmt.close();
            con.close();
            System.out.println("Record Inserted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchResult() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");

            String query = "select * from Student1 order by sno";
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getShort("Sno") + " " + rs.getString("Sname") + " " + rs.getString("Sage"));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void updateRecords() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Sno for Updation:");
        int sno = Integer.parseInt(dis.readLine());
        System.out.println("Enter Sname for Updation:");
        String sname = dis.readLine();
        System.out.println("Enter Sage for Updation:");
        int sage = Integer.parseInt(dis.readLine());

        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");

            String query = "update Student1 set Sname='" + sname + "', Sage=" + sage + " where Sno=" + sno;
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

            stmt.close();
            con.close();
            System.out.println("Record Updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void deleteRecords() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Sno for Deletion:");
        int sno = Integer.parseInt(dis.readLine());

        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");

            String query = "DELETE FROM Student1 WHERE Sno = " + sno;
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

            stmt.close();
            con.close();
            System.out.println("Record Deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

