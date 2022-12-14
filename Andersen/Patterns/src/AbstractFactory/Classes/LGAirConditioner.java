package AbstractFactory.Classes;

import AbstractFactory.Interfaces.AirConditioner;

public class LGAirConditioner implements AirConditioner {
    @Override //Abstract factory
    public void cooling() {
        System.out.println("Через 30 минут будет холодно");
    }

    @Override //Abstract factory
    public void ionization() {
        System.out.println("Воздух очищен для вас");
    }
}
