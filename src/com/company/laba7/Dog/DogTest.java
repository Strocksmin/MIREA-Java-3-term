package com.company.laba7.Dog;

public class DogTest {
    public static void main(String[] args) {
       ShibaInu si = new ShibaInu(3, 100);
        System.out.println(si);
        si.shibaMethod();
        si.goEatBigBeef();
        si.cmdVoice();
        Bulldog bd = new Bulldog(7, 52);
        System.out.println(bd.yearsToAge());
        bd.cmdLay();
        bd.bulldog();
    }
}
