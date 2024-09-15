/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;
class AgeNotWithinTheRange extends Exception {
    public AgeNotWithinTheRange(String message) {
        super(message);
    }
}
public class Prg16 {
    private String vehicleNo;
    private String name;
    private int age;
    public Prg16(String vehicleNo, String name, int age) throws AgeNotWithinTheRange {
        this.vehicleNo = vehicleNo;
        this.name = name;
        if (age < 18) {
            throw new AgeNotWithinTheRange("Age not within the range. Must be 18 or older.");
        }
        this.age = age;
    }
    public String getVehicleNo() {
        return vehicleNo;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter vehicle number: ");
            String vehicleNo = scanner.nextLine();
            
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            
            Prg16 prg = new Prg16(vehicleNo, name, age);
            
            System.out.println("Driver created successfully:");
            System.out.println("Vehicle No: " + prg.getVehicleNo());
            System.out.println("Name: " + prg.getName());
            System.out.println("Age: " + prg.getAge());
        }
        catch (AgeNotWithinTheRange e) {
            System.out.println(e.getMessage());
        }
    }
}

