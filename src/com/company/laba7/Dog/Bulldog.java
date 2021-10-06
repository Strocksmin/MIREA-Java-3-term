package com.company.laba7.Dog;

public class Bulldog extends Dog {
    protected String breed = "Bulldog";

    public String getBreed() {
        return breed;
    }

    public Bulldog(int years, int IQ) {
        super(years, IQ);
    }

    void bulldog() {
        System.out.println("Вьетнамские флэшбэки...");
        mood = mood - 30;
    }

    @Override
    public String toString() {
        return "Bulldog{" +
                "breed='" + breed + '\'' +
                ", years=" + years +
                ", IQ=" + IQ +
                ", mood=" + mood +
                '}';
    }

    @Override
    int yearsToAge() {
        return years * 8;
    }
}
