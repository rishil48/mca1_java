/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;

class NotEligibleForVotingException extends Exception {
    public NotEligibleForVotingException(String message) {
        super(message);
    }
}

public class Prg15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            checkEligibility(age);
            System.out.println("You are eligible for voting.");
        }
        catch (NotEligibleForVotingException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void checkEligibility(int age) throws NotEligibleForVotingException {
        if (age < 18) {
            throw new NotEligibleForVotingException("Not Eligible for Voting.");
        }
    }
}
