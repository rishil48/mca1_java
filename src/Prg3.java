/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
  
class Student{  
  int sRno;  
  String sName, sAddress;  
  int sMarks1, sMarks2, sMarks3;  
  Student(int sRno, String sName, String sAddress, int sMarks1, int sMarks2, int sMarks3) {  
  
    this.sRno = sRno;  
    this.sName = sName;  
    this.sAddress = sAddress;  
    this.sMarks1 = sMarks1;  
    this.sMarks2 = sMarks2;  
    this.sMarks3 = sMarks3;  
  
  }  
  void fetchStudentInfo() {  
  
    System.out.println("STUDENT INFORMATION");  
    System.out.println("STUDENT ROLL-NUMBER: " + sRno);  
    System.out.println("STUDENT NAME: " + sName);  
    System.out.println("STUDENT ADDRESS: " + sAddress);  
  
  }  
  
  void fetchStudentResult() {  
    fetchStudentInfo();  
    int total;  
    float percentage, average;  
    total = (sMarks1 + sMarks2 + sMarks3);  
    percentage = (total / 300 * 100);  
    average = (total / 3);  
    System.out.println("STUDENT RESULT");  
    System.out.println("TOTAL MARKS: " + total);  
    System.out.println("PERCENTAGE: " + percentage);  
    System.out.println("AVERAGE: " + average);  
  
  }  
}  
public class Prg3 {  
    public static void main(String val[]) {  
    Student S = new Student(94, "RISHIL", "ANAND", 90, 85, 90);  
    S.fetchStudentResult();  
  }  
}    