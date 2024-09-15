/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
abstract class Vehicle { 
    abstract void numwheels(); 
} 

class twoWheeler extends Vehicle { 
    void numwheels() { 
        System.out.println("Two Wheeler wheels is : 2"); 
    } 
} 

class fourWheeler extends Vehicle { 
    void numwheels() { 
        System.out.println("Two Wheeler wheels is : 4"); 
    } 
} 

public class Prg10 { 
    public static void main(String[] s) { 
        Vehicle t = new twoWheeler(); 
        Vehicle f = new fourWheeler(); 
        t.numwheels(); 
        f.numwheels(); 
    } 
}
