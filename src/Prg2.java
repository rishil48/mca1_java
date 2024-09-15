/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

class Computer{  
    String name,color;  
    double price;  
    Computer(String name,String color,double price){  
        this.name=name;  
        this.color=color;  
        this.price=price;  
    }  
    void disData(){  
        System.out.println("Computer Name :"+name);  
        System.out.println("Computer Color :"+color);  
        System.out.println("Computer Price :"+price);        
    }  
}  
class Laptop{  
    String name,color;  
    double price;  
    Laptop(String name,String color,double price){  
        this.name=name;  
        this.color=color;  
        this.price=price;  
    }  
    void disData(){  
        System.out.println("Laptop Name :"+name);  
        System.out.println("Laptop Color :"+color);  
        System.out.println("Laptop Price :"+price);        
    }  
}  
public class Prg2 {  
    public static void main(String[] a){  
      Computer c1=new Computer("Hp","Black",50000);  
      Laptop l1=new Laptop("Dell","Silver",60000);  
      c1.disData();  
      l1.disData();  
    }  
}  
