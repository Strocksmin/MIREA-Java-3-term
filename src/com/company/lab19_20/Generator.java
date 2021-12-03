package com.company.lab19_20;

import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Generator {

    public static void main(String[] args) {

        String[] letter = {"A","B","E","K","M","H","O","P","C","T","Y","X"};
        Arrays.sort(letter);
        HashSet<String> arrNumber = new HashSet<>();
        //одинаковые буквы
        for(String a123: letter) {
            for(int reg = 1; reg <= 199; reg++) {
                for(int j = 1; j <= 999; j++) {
                    arrNumber.add(String.format("%s%03d%s%s%d",a123,j,a123,a123,reg));
                }
            }
        }

        ArrayList<String> arrNum = new ArrayList<>(arrNumber);
        TreeSet<String> arrNum2 = new TreeSet<>(arrNumber);

        System.out.println("K802KK33");
        System.out.println(arrNum.size());
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();


        long m = System.nanoTime();
        System.out.println("Поиск перебором: номер " + s + " " + arrNum.contains(s) + ", поиск занял " + (long) (System.nanoTime() - m) + " нс ");

        Collections.sort(arrNum);
        long m1 = System.nanoTime();
        System.out.println("Бинарный поиск: номер " + s + " " + Collections.binarySearch(arrNum, s) + ", поиск занял " + (long) (System.nanoTime() - m1) + " нс");

        long m2 = System.nanoTime();
        System.out.println("Поиск в HashSet: номер " + s + " " + arrNumber.contains(s) + ", поиск занял " + (long) (System.nanoTime() - m2) + " нс");

        long m3 = System.nanoTime();
        System.out.println("Поиск в TreeSet: номер " + s + " " + arrNum2.contains(s) + ", поиск занял " + (long) (System.nanoTime() - m3) + " нс");
    }
}
