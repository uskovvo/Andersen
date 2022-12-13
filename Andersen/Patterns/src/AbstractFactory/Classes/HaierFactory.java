package AbstractFactory.Classes;

import AbstractFactory.Interfaces.AirConditioner;
import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Refrigerator;
import AbstractFactory.Interfaces.WashMachine;

public class HaierFactory implements Factory {
    @Override
    public Refrigerator getRefrigerator() {
        return new HaierRefrigerator();
    }

    @Override
    public WashMachine getWashMachine() {
        return new HaierWashMachine();
    }

    @Override
    public AirConditioner getAirConditioner() {
        return new HaierAirConditioner();
    }
}
