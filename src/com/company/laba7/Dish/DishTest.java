package com.company.laba7.Dish;

public class DishTest {
    public static void main(String[] args) {
        SoupDish sd = new SoupDish("Мрамор", "Белый", 6, 10);
        DessertDish dh = new DessertDish("Чугун", "Чёрный", 8);
        DessertDish dd = new DessertDish("Мрамор", "Белый", 4);

        sd.makeSoup();
        System.out.println(dh.getRadius());
        System.out.println(sd.getVolume());
    }
}
