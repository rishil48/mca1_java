/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
    class AreaCalculator{ 
        public double calculateArea(double radius) { 
        return Math.PI * radius * radius; 
        } 
        public double calculateArea(int side) { 
        return side * side; 
        } 
        public double calculateArea(int length, int width) { 
        return length * width; 
        } 
        public double calculateArea(double base, double height) { 
        return 0.5 * base * height; 
        } 
} 
    public class Prg6 { 
        public static void main(String[] args) { 
            AreaCalculator calculator = new AreaCalculator(); 
            System.out.println("Area of Circle: " + calculator.calculateArea(5.0)); 
            System.out.println("Area of Square: " + calculator.calculateArea(4)); 
            System.out.println("Area of Rectangle: " + calculator.calculateArea(5, 3)); 
            System.out.println("Area of Triangle: " + calculator.calculateArea(6.0, 4.0)); 
            } 
} 