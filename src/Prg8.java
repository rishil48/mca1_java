/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

class Person{
    int pid;
    String name;
    Person(int personid,String personname)
    {
        pid=personid;
        name=personname;
    }
    void dispData()
    {
        System.out.println("Enter Person id:"+pid);
        System.out.println("Enter Person name:"+name);
    }
}
class Student extends Person{
    int fees;
    String course;
    Student(int pid,String name,int fesspaid,String coursename)
    {
        super(pid,name);
        fees=fesspaid;
        course=coursename;
    }
    
    void dispData()
    {
        super.dispData();
        System.out.println("Enter number of Paid Fess:"+fees);
        System.out.println("Enter Course name:"+course);
    }
    
}
class Faculty extends Person{
    int nyear;
    String sname;
    Faculty(int pid,String name,int numberofyears,String subjectname)
    {
        super(pid,name);
        nyear=numberofyears;
        sname=subjectname;
    }
    
    void dispData()
    {
        super.dispData();
        System.out.println("Enter Number of years:"+nyear);
        System.out.println("Enter Subject name:"+sname);
    }
}
public class Prg8 {
    public static void main(String[] args) {
        Student s=new Student(1,"RISHIL",75000,"MCA");
        Faculty f=new Faculty(2,"KrishnaKant",10,"COREJAVA");
        s.dispData();
        f.dispData();
    }
}

