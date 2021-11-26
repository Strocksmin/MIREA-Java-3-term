package com.company.laba8;

public class FurnitureShop {
    private Furniture[] goods;
    private int currentCountGoods, maxcountGoods;

    public FurnitureShop(int countGoods) {
        this.maxcountGoods = countGoods;
        goods = new Furniture[countGoods];

        goods[0] = new Table(2, 6, 1, 300, 4, "Депутатский", "Дуб");
        currentCountGoods++;
        goods[1] = new Bed(2, 6, 1, 500, "Премиум", 2 ,"Береза");
        currentCountGoods++;
        goods[2] = new Chair(2, 6, 1, 15000, "Армянский","Кожа гиппопотама");
        currentCountGoods++;

    }

    public int getCurrentCountGoods() {
        return currentCountGoods;
    }

    public Furniture[] getGoods() {
        return goods;
    }

    public void addFurniture(Furniture f) {
        if (currentCountGoods < maxcountGoods) {
            goods[currentCountGoods] = f;
            currentCountGoods++;
        }
        else System.out.println("Магазин ещё ничего не продал");
    }

    public String getPrices() {
        String rez = "Товары и их цена: \n";
        for (Furniture f : goods) {
            if (f != null) rez += f.toString() + "\n";
        }
        return rez;
    }

    public void buyFurniture(String name) {
        Furniture[] tmp = new Furniture[currentCountGoods-1];
        for (int i = 0; i < currentCountGoods; i++) {
            if (goods[i].getName().equals(name)) {
                goods[i] = null;
                currentCountGoods--;
            }
        }
        for (int i = 0,j = 0 ; i < currentCountGoods + 1; i++) {
            if (goods[i] != null) {
                tmp[j] = goods[i];
                j++;
            }
        }
        goods = tmp;
    }
}
