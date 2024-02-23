package org.example.Lison1.Task01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
        //initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
        BottelOfWaterVhendingMahine mahine = new BottelOfWaterVhendingMahine();
        mahine.addBottleOfWater(new BottleOfWater("Вода1", 100, 50));
        mahine.addBottleOfWater(new BottleOfWater("Вода2", 1000, 1));
        mahine.addBottleOfWater(new BottleOfWater("Вода3", 1, 0.5));
        mahine.addBottleOfWater(new BottleOfWater("Вода4", 10, 5));
        System.out.println(mahine.getProduct("Вода3"));
        HotDrinkVhendingMahine hotMahine = new HotDrinkVhendingMahine();
        hotMahine.addHotDrink(new HotDrink("Капучино", 20, 95));
        hotMahine.addHotDrink(new HotDrink("Чай черный", 40, 70));
        hotMahine.addHotDrink(new HotDrink("Экспрессо", 10, 100));
        hotMahine.addHotDrink(new HotDrink("Чай зеленый", 50, 60));
        System.out.println(hotMahine.getProduct("Чай зеленый", 50, 60));
        System.out.println(hotMahine.getProduct("Чай черный", 30, 70));
        System.out.println(hotMahine.getProduct("Капучино", 20, 100));
    }

    public static void printGetProduct(VhendingMahine vhendingMahine) {
        System.out.println(vhendingMahine.getProduct("wsew"));
    }
}