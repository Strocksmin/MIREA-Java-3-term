package com.company.lab15_16;

public class Account extends Person {
    private int balance;

    public Account(String name, int balance) {
        super(name);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    void addBalance(int balance) {
        this.balance += balance;
        System.out.println("Запрос на ввод: " + Thread.currentThread().getName() + "\t" + balance + ". Сейчас на счету: " + this.balance);
    }

    void withdraw(int value) {
        if (value > this.balance) {
            System.out.println("Запрос на вывод: " + Thread.currentThread().getName() + "\t" + value + ". На счёту нет столько денег, всего: " + this.balance);
            return;
        }
        this.balance -= value;
        System.out.println("Запрос на вывод: " + Thread.currentThread().getName() + "\t" + value + ". Сейчас на счету: " + this.balance);
    }
}
