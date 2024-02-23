package org.example.Lison1.Task01;

import java.util.ArrayList;
import java.util.List;

public class BottelOfWaterVhendingMahine implements VhendingMahine{

   List<Product> productList = new ArrayList<>();

   public void addBottleOfWater(BottleOfWater bottle){
       productList.add(bottle);
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
}
