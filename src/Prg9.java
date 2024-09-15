/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
class Shape{ 
double area(){ 
return 0; 
} 
} 
class Circle extends Shape{ 
double r; 
Circle(double r){ 
this.r=r; 
} 
double area(){ 
return 3.14*r*r; 
} 
} 
class Rectangle extends Shape{ 
double l,w; 
Rectangle(double l,double w){ 
this.l=l; 
this.w=w; 
} 
double area(){ 
return l*w; 
} 
} 
class Square extends Shape{ 
double s; 
Square(double s){ 
this.s=s; 
} 
double area(){ 
return s*s; 
} 
} 
public class Prg9 { 
public static void main(String[] a){ 
Shape c=new Circle(10); 
Shape r=new Rectangle(10,20); 
Shape s=new Square(20); 
System.out.println("Area of Circle is :"+c.area()); 
System.out.println("Area of Rectangle is :"+r.area()); 
System.out.println("Area of Square is :"+s.area()); 
} 
} 