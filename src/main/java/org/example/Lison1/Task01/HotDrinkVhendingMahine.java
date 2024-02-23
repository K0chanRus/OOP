package org.example.Lison1.Task01;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVhendingMahine implements VhendingMahine {
    List<Product> productList = new ArrayList<>();

    public void addHotDrink(HotDrink hotDrink){
        productList.add(hotDrink);
    }

    @Override
    public void initProducts(List<Product> list) {
        productList = list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product i : productList){
            if (i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature){
        for (Product i : productList){
            if (i.getName().equals(name) && i.getCost() == volume && HotDrink.getTemperature() == temperature){
                return i;
            }
        }
        return null;
    }
}
