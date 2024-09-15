/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ebook;

/**
 *
 * @author Dell
 */


class Book { 
    String name, a_nm; 
    double price; 

    Book(String name, String a_nm, double price) { 
        this.name = name; 
        this.a_nm = a_nm; 
        this.price = price; 
    } 

    void disData() { 
        System.out.println("Book Name is: " + name); 
        System.out.println("Book Author Name: " + a_nm); 
        System.out.println("Book Price: " + price); 
    } 
}

