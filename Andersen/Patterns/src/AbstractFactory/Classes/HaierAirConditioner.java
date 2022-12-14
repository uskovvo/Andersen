package AbstractFactory.Classes;

import AbstractFactory.Interfaces.AirConditioner;

public class HaierAirConditioner implements AirConditioner {

    @Override //Abstract factory
    public void cooling() {
        System.out.println("Охлаждаю до замерзания воды");
    }

    @Override //Abstract factory
    public void ionization() {
        System.out.println("Воздух чистый и приятный");
    }
}
