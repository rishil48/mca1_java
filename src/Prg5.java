/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
class Sport{ 
String name="Cricket"; 
void disData(){ 
System.out.println("Sport Name :"+name); 
} 
} 
class Cricket extends Sport{ 
String name="Virat Kohli"; 
void disData(){ 
System.out.println("Crickter Name :"+name); 
} 
void printName(){ 
System.out.println("Super class name :"+super.name); 
System.out.println("Sub class name :"+this.name); 
} 
void printDis(){ 
super.disData(); 
this.disData(); 
} 
} 
public class Prg5 { 
public static void main(String[] a){ 
Cricket c=new Cricket(); 
c.printDis(); 
c.printName(); 
} 
}