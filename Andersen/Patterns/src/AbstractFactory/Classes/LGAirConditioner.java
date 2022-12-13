package AbstractFactory.Classes;

import AbstractFactory.Interfaces.AirConditioner;

public class LGAirConditioner implements AirConditioner {
    @Override
    public void cooling() {
        System.out.println("Через 30 минут будет холодно");
    }

    @Override
    public void ionization() {
        System.out.println("Воздух очищен для вас");
    }
}
