/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
class BankAccount {
    private int balance = 85000;
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + "  withdraw $" + amount);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "  balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " withdraw $" + amount + " but insufficient balance: $" + balance);
        }
    }
}
class WithdrawalTask implements Runnable {
    private BankAccount account;
    private int amount;
    public WithdrawalTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }
    public void run() {
        account.withdraw(amount);
    }
}
public class Prg19 {
    public static void main(String[] args) {       
        BankAccount account = new BankAccount();
        Thread user1 = new Thread(new WithdrawalTask(account, 15000), "User 1");
        Thread user2 = new Thread(new WithdrawalTask(account, 30000), "User 2");
        user1.start();
        user2.start();
    }
}

