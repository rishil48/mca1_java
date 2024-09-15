/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Map;

public class Prg24 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Cherry", 15);

        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 15);

        System.out.println("LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Cherry", 15);

        System.out.println("TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 10);
        hashtable.put("Banana", 20);
        hashtable.put("Cherry", 15);

        System.out.println("Hashtable:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

