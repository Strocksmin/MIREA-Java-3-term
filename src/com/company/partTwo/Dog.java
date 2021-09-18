package com.company.partTwo;

import java.util.ArrayList;

class KennelDog {
    ArrayList<Dog> dogs = new ArrayList<>();

    void addDog(int age, String name) {
        Dog d = new Dog(age, name);
        dogs.add(d);
    }
}

public class Dog {

    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age; this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int ageTr() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        KennelDog ken = new KennelDog();
        ken.addDog(12, "Tommy");
        ken.addDog(10, "Lanka");
        System.out.println(ken.dogs.get(1).ageTr());
    }
}
