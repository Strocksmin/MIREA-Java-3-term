package com.company.laba7.Dog;

public class ShibaInu extends Dog {
    protected String breed = "ShibaInu";

    public ShibaInu(int years, int IQ) {
        super(years, IQ);
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "ShibaInu{" +
                "years=" + years +
                ", IQ=" + IQ +
                ", mood=" + mood +
                ", breed='" + breed + '\'' +
                '}';
    }

    void shibaMethod() {
        System.out.println("Собачье харакири");
    }

    @Override
    int yearsToAge() {
        return years * 5;
    }
}
