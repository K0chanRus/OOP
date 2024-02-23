package org.example.Lison1.Task01;

public class HotDrink extends BottleOfWater{

    private static int temperature;

    public HotDrink(String name, int cost, int temperature) {
        super(name, cost, temperature);
        this.temperature = temperature;
    }

    public static int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", temperature=" + temperature +
                '}';
    }
}
