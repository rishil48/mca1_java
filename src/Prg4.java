/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
class Emp{  
    String name,dept;  
    int id,sal;  
    Emp(int id,String name,String dept,int sal){  
        this.name=name;  
        this.dept=dept;  
        this.id=id;  
        this.sal=sal;  
    }  
    void disData(){  
        System.out.println("Employee Id :"+id);  
        System.out.println("Employee Name :"+name);  
        System.out.println("Employee Department :"+dept);  
        System.out.println("Employee Salary :"+sal);  
    }  
}  
public class Prg4 {  
    public static void main(String[] a){  
        Emp e1=new Emp(94,"RISHIL","developer",50000);  
        e1.disData();  
    }  
}  
