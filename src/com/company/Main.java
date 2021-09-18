package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Аргументы командной строки: ");

        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);

        System.out.println("\nПервые 10 чисел гармонического ряда:");

        for (int i = 1; i < 11; i++) {
            System.out.format("1/%d (%f) %n" , i ,1./i );
        }

        System.out.println("\nГенерируется массив целых чисел, вывести его на экран, отсортировать его, и снова вывести на экран (использовать два подхода – метод random() класса Math и класс Random):");

        int[] a = new int[10];

        System.out.println("Первый способ:");

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i]+ "\t");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ "\t");
        }

        System.out.println("\nВторой способ:");
        Random rndm = new Random();
        for (int i = 0; i < a.length; i++) {
            int rndNumber = rndm.nextInt(10);
            a[i] = rndNumber;
            System.out.print(a[i]+ "\t");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ "\t");
        }

        System.out.println();
        System.out.println("\nМетод вычисляет факториал числа: " + fact(5));
    }

    public static int fact(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
}
