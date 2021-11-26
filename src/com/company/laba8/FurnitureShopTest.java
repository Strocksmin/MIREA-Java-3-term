package com.company.laba8;

import java.util.Scanner;

public class FurnitureShopTest {
    public static void main(String[] args) {
        System.out.println("В магазине уже имеется: ");
        FurnitureShop shop = new FurnitureShop(5);
        shop.addFurniture(new Table(2, 6, 1, 300, 4, "Стандарт", "Осина"));

        System.out.println(shop.getPrices());

        System.out.println("Наша мебель умеет делать всякое: ");
        for (Furniture f : shop.getGoods()) {
            if (f != null) f.doSomething();
        }
        System.out.println("Текущее количество товаров: ");
        System.out.println(shop.getCurrentCountGoods());
        System.out.println("Добавьте новый стул: <высота> <ширина> <глубина> <цена> <кол-во ножек> <название> <материал>");
        Scanner scanner = new Scanner(System.in);
        shop.addFurniture(new Table(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.next(), scanner.next()));
        //shop.addFurniture(new Table(2, 6, 1, 300, 4, "Брак", "Брак"));

        System.out.println(shop.getCurrentCountGoods());

        System.out.println("Купите мебель: <название>");
        Scanner scanner2 = new Scanner(System.in);
        shop.buyFurniture(scanner2.next());
        //shop.buyFurniture("Премиум Стандарт");

        System.out.println(shop.getPrices());
    }
}
