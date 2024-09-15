/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Prg23 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        System.out.println();

        System.out.println("Using ListIterator:");
        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        System.out.println("Backward Traversal:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println("Modifying elements using ListIterator:");
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry");
            }
        }

        System.out.println("Modified List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
