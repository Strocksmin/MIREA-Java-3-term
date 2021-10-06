package com.company.laba7.Dog;

abstract public class Dog {
    protected int years, IQ, mood = 3;

    public Dog(int years, int IQ) {
        this.years = years;
        this.IQ = IQ;
    }

    public int getYears() {
        return years;
    }

    public int getIQ() {
        return IQ;
    }

    public int getMood() {
        return mood;
    }

    void cmdLay() {
        if (IQ > 70 && mood > 3) System.out.println("Собака легла");
    }

    void cmdSit() {
        if (IQ > 70 && mood > 3) System.out.println("Собака села");
    }

    void cmdVoice() {
        if (IQ > 70 && mood > 3) System.out.println("Собака гавкнула");
    }

    void goEatBigBeef() {
        mood++;
    }

    abstract int yearsToAge();
}
