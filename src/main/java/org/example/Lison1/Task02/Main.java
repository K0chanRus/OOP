package org.example.Lison1.Task02;


public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Petr");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}