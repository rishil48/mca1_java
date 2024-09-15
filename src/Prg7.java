/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

class Vehicle {
    String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called: Brand = " + brand);
    }
    
    void display() {
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle {
    String model;
    
   
    Car(String brand, String model) {
        
        super(brand);
        this.model = model;
        System.out.println("Car constructor called: Model = " + model);
    }
    
    
    void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}


public class Prg7 {
    public static void main(String[] args) {
       
        Car myCar = new Car("Toyota", "Audi");
        
       
        myCar.display();
    }
}
