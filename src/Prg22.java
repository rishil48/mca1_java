/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.Vector;

public class Prg22 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList Elements:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("Element at index  in ArrayList: " + arrayList.get(1));
        arrayList.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + arrayList);

        System.out.println();

        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Cat");
        vector.add("Horse");

        System.out.println("Vector Elements:");
        for (String item : vector) {
            System.out.println(item);
        }

        System.out.println("Element at index  in Vector: " + vector.get(1));
        vector.remove("Cat");
        System.out.println("Vector after removing 'Cat': " + vector);
    }
}
