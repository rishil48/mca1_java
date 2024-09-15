
class Student
{
    int rno,fess;
    String name,course;
    void getData(int rollnumber,String nm,String c,int fees)
    {
        rno=rollnumber;
        name=nm;
        course=c;
        fess=fees;
    }
    void dispData()
    {
        System.out.println("Enter Student Roll Number:"+rno);
        System.out.println("Enter Student Name:"+name);
        System.out.println("Enter Student Course:"+course);
        System.out.println("Enter Student Paid Fees:"+fess);
    }
}
public class Prg1 {
     public static void main(String[] args) 
    {
        Student s1=new Student();
        s1.getData(1,"RISHIL","MCA",75000);
        s1.dispData();
    }
}
