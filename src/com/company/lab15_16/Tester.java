package com.company.lab15_16;

public class Tester {

    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Account account = new Account("Ivan Ivanov", 100);

        Transaction transaction = new Transaction(object, 100, 350, account);
        transaction.start();
        //transaction.interrupt();
        //transaction.join();


        Transaction transaction1 = new Transaction(object, 300, 0, account);
        transaction1.start();
        //transaction1.interrupt();
        //transaction1.join();

        Transaction transaction2 = new Transaction(object, 400, 0, account);
        transaction2.start();
        //transaction2.interrupt();
        //transaction2.join();

        System.out.println("Баланс на счету " + account.getBalance());
    }
}
