/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;
class MarksOutOfhundread extends Exception {
    public MarksOutOfhundread(String message) {
        super(message);
    }
}
public class Prg17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[4]; 
        String rollNo;
        try 
        {
            System.out.print("Enter roll number: ");
            rollNo = scanner.nextLine();
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new MarksOutOfhundread("Marks must be between 0 and 100.");
                }
            }
            System.out.println("Roll Number: " + rollNo);
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Marks for subject " + (i + 1) + ": " + marks[i]);
            }
        } catch (MarksOutOfhundread e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arra:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("error expectead : " + e.getMessage());
        }
    }
}

