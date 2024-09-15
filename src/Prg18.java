/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
// Main Class
public class Prg18 {
    public static void main(String[] args) {
      
        Thread highThread = new Thread(new Task(), "High Priority Thread");
        Thread lowThread = new Thread(new Task(), "Low Priority Thread");
        highThread.setPriority(Thread.MAX_PRIORITY); 
        lowThread.setPriority(Thread.MIN_PRIORITY);  
        lowThread.start();
        highThread.start();
        try {
            lowThread.join();
            highThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Both threads.");
    }
}
class Task implements Runnable { 
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " executed in " + (endTime - startTime) + " ms.");
    }
}

