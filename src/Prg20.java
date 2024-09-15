/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
class Employee {
    private String name;
    private int employeeId;
    protected double basicSalary;
    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }
    public double getSalary() {
        return basicSalary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
    }
}
class Manager extends Employee {
    private double travelAllowance;
    private double houseRentAllowance;
    public Manager(String name, int employeeId, double basicSalary, double travelAllowance, double houseRentAllowance) {
        super(name, employeeId, basicSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }
    public double getSalary() {
        return basicSalary + travelAllowance + houseRentAllowance;
    }
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Travel Allowance: $" + travelAllowance);
        System.out.println("House Rent Allowance: $" + houseRentAllowance);
        System.out.println("Total Salary: $" + getSalary());
    }
}
public class Prg20 {
    public static void main(String[] args) {
        Employee emp = new Employee("Akshat", 101, 50000);
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();
        System.out.println("Salary Withdrawn: $" + emp.getSalary());
        System.out.println();
        Manager mgr = new Manager("Rishil", 102, 80000, 5000, 10000);
        System.out.println("Manager Details:");
        mgr.displayEmployeeDetails();
        System.out.println("Salary Withdrawn: $" + mgr.getSalary());
    }
}
