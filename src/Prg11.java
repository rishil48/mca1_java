/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
interface Shape { 
    void drawShape(); 
} 

class Circle implements Shape { 
    public void drawShape() { 
        System.out.println("Draw Circle"); 
    } 
} 

class Rectangle implements Shape { 
    public void drawShape() { 
        System.out.println("Draw Rectangle"); 
    } 
} 

class Triangle implements Shape { 
    public void drawShape() { 
        System.out.println("Draw Triangle"); 
    } 
} 

public class Prg11 { 
    public static void main(String[] a) { 
        Circle c = new Circle(); 
        Rectangle r = new Rectangle(); 
        Triangle t = new Triangle(); 
        c.drawShape(); 
        r.drawShape(); 
        t.drawShape(); 
    } 
}
