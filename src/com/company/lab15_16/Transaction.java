package com.company.lab15_16;

public class Transaction extends Thread {
    private final Object object;
    private final int value1;
    private final int value2;
    private final Account from;

    public Transaction(Object object, int minus, int plus, Account from) {
        this.object = object;
        this.value1 = minus;
        this.value2 = plus;
        this.from = from;
    }

    @Override
    public void run() {
        synchronized (object) {
            System.out.println(Thread.currentThread().getName());
            from.withdraw(value1);
            from.addBalance(value2);
        }
    }
}
