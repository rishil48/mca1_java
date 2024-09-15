/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
package TYBCA;

import java.util.Scanner;

class Subject {
    String sub1, sub2;
    Scanner s = new Scanner(System.in);

    void getSub() {
        System.out.println("Enter Subject 1:");
        sub1 = s.nextLine();
        System.out.println("Enter Subject 2:");
        sub2 = s.nextLine();
    }

    void disData() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
    }
}

class Marks {
    int m1, m2;
    Scanner s = new Scanner(System.in);

    void getMarks() {
        System.out.println("Enter marks for Subject 1:");
        m1 = s.nextInt();
        System.out.println("Enter marks for Subject 2:");
        m2 = s.nextInt();
    }

    void disMarks() {
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        int total = m1 + m2;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + (total / 2.0) + "%");
    }
}

class Student {
    Subject subject = new Subject();
    Marks marks = new Marks();

    void getData() {
        subject.getSub();
        marks.getMarks();
    }

    void displayData() {
        subject.disData();
        marks.disMarks();
    }
}

public class Prg12 {
    public static void main(String[] args) {
        Student student = new Student();
        student.getData();
        student.displayData();
    }
}

